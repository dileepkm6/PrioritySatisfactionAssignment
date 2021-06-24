package com.assignment.api.services;

import com.assignment.api.entity.PriorityEntity;
import com.assignment.api.entity.messaging.UpdateSatisfactionRatingRequest;
import com.assignment.api.persistence.PriorityMaintenanceDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PriorityMaintenanceService {
    @Autowired
    private PriorityMaintenanceDao priorityMaintenanceDao;
    public List<PriorityEntity> getUserRating(String userName)
    {
        return priorityMaintenanceDao.getUserRating(userName);
    }
    public List<String> getAllPriorities()
    {
        return priorityMaintenanceDao.getAllPriorities();
    }
    public void addPriority(String priority)
    {
        priorityMaintenanceDao.addPriority(priority);
    }
    public void updateSatisfactionRating(UpdateSatisfactionRatingRequest request,String userName)
    {
        for(PriorityEntity pe:request.getPriorityEntityList()) {
            priorityMaintenanceDao.updateSatisfactionRating(pe.getSatisfactionRating(),userName,pe.getPriority());
        }
    }
}
