package com.assignment.api.persistence;

import com.assignment.api.entity.PriorityEntity;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface PriorityMaintenanceDao {

    public List<String> getAllPriorities();
    public void addPriority(@Param("priority") String priority);
    public List<PriorityEntity> getUserRating(@Param("userName") String userName);
    public void updateSatisfactionRating(@Param("satisfactionRating") int satisfactionRating,@Param("userName") String userName,@Param("priority") String priority);
}
