package com.assignment.api.controller;

import com.assignment.api.entity.PriorityEntity;
import com.assignment.api.entity.UserEntity;
import com.assignment.api.entity.messaging.UpdateSatisfactionRatingRequest;
import com.assignment.api.services.PriorityMaintenanceService;
import com.assignment.api.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

import javax.validation.Valid;
import javax.validation.constraints.NotBlank;
import java.util.List;

@Controller
@RequestMapping("api/")
@Validated
public class PriorityMaintenanceController {

    @Autowired
    private PriorityMaintenanceService priorityMaintenanceService;

    @Autowired
    private UserService userService;


    @GetMapping("getAllPriorities")
    public ResponseEntity<List<String>> getAllPriorities()
    {
        return new ResponseEntity<List<String>>(priorityMaintenanceService.getAllPriorities(), HttpStatus.OK);
    }
    @GetMapping("getUserRating")
    public ResponseEntity<List<PriorityEntity>> getUserRating(@RequestHeader(value = "userName",required = true) String userName)
    {
        return new ResponseEntity<List<PriorityEntity>>(priorityMaintenanceService.getUserRating(userName), HttpStatus.OK);
    }
    @PostMapping("addPriority")
    public ResponseEntity<String> addPriority(@RequestHeader(value = "userName",required = true) String userName,@NotBlank @RequestParam("priority") String priority)
    {
        UserEntity user = userService.findUserByUserName(userName);
       if(user!=null && user.getRole()!=null && user.getRole().equals("admin"))
       {
           priorityMaintenanceService.addPriority(priority);
           return new ResponseEntity<String>("Priority is successFully added",HttpStatus.CREATED);

       }
        return new ResponseEntity<String>("User doesn't permission to add priority",HttpStatus.CREATED);
    }
    @PostMapping("/updateSatisfactionRating")
    public ResponseEntity<String> updateSatisfactionRating(@RequestHeader(value = "userName",required = true) String userName,@Valid @RequestBody UpdateSatisfactionRatingRequest request)
    {
        priorityMaintenanceService.updateSatisfactionRating(request,userName);
        return new ResponseEntity<>("successfully updated",HttpStatus.CREATED);
    }
}
