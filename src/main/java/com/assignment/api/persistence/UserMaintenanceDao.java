package com.assignment.api.persistence;

import com.assignment.api.entity.UserEntity;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;


import java.util.List;
@Mapper
public interface UserMaintenanceDao {

    public List<UserEntity> getUsers();
    public UserEntity findUserByUserName(@Param("userName") String userName);
}
