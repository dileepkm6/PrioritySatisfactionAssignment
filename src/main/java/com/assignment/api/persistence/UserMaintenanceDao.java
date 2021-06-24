package com.assignment.api.persistence;

import com.assignment.api.entity.UserEntity;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;


import java.util.List;

/**
 * UserMaintenanceDao Mapper
 */
@Mapper
public interface UserMaintenanceDao {

    /**
     * get users
     * @return
     */
    public List<UserEntity> getUsers();

    /**
     * get user by username
     * @param userName
     * @return
     */
    public UserEntity findUserByUserName(@Param("userName") String userName);
}
