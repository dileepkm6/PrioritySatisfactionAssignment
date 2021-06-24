package com.assignment.api.persistence;

import com.assignment.api.entity.PriorityEntity;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * PriorityMaintenanceDao mapper
 */
@Mapper
public interface PriorityMaintenanceDao {


    /**
     * @return list out all existing priorities
     */
    public List<String> getAllPriorities();

    /**
     * add new priorities with admin users
     * @param priority
     */
    public void addPriority(@Param("priority") String priority);

    /**
     * get user satisfaction rating with priority
     * @param userName
     * @return
     */
    public List<PriorityEntity> getUserRating(@Param("userName") String userName);

    /**
     * updating satisfaction rating for different priority
     * @param satisfactionRating
     * @param userName
     * @param priority
     */
    public void updateSatisfactionRating(@Param("satisfactionRating") int satisfactionRating,@Param("userName") String userName,@Param("priority") String priority);
}
