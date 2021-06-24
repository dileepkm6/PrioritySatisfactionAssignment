package com.assignment.api.entity.messaging;

import com.assignment.api.entity.PriorityEntity;

import javax.validation.Valid;
import java.util.List;

public class UpdateSatisfactionRatingRequest {
    @Valid
    List<PriorityEntity> priorityEntityList;

    public List<PriorityEntity> getPriorityEntityList() {
        return priorityEntityList;
    }

    public void setPriorityEntityList(List<PriorityEntity> priorityEntityList) {
        this.priorityEntityList = priorityEntityList;
    }
}
