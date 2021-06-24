package com.assignment.api.services;

import com.assignment.api.persistence.UserMaintenanceDao;
import com.assignment.api.entity.UserEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
    @Autowired
    private UserMaintenanceDao userMaintenanceDao;

    /**
     * list out the all users
     * @return
     */
    public List<UserEntity> getUsers() {
        return userMaintenanceDao.getUsers();
    }

    /**
     * get user by userName
     * @param userName
     * @return
     */
    public UserEntity findUserByUserName(String userName)
    {
        return userMaintenanceDao.findUserByUserName(userName);
    }
}
