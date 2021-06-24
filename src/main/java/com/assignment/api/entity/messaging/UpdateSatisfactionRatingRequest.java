package com.assignment.api.entity.messaging;

import com.assignment.api.entity.PriorityEntity;

import java.util.List;

public class UpdateSatisfactionRatingRequest {
    List<PriorityEntity> priorityEntityList;

    public List<PriorityEntity> getPriorityEntityList() {
        return priorityEntityList;
    }

    public void setPriorityEntityList(List<PriorityEntity> priorityEntityList) {
        this.priorityEntityList = priorityEntityList;
    }
}
