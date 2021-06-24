package com.assignment.api.entity;

import org.hibernate.validator.constraints.Range;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;

public class PriorityEntity {

    private String priority;
    @Min(0)
    @Max(value = 5,message = "Rating should be between 1-5")
    private int satisfactionRating;

    public String getPriority() {
        return priority;
    }

    public void setPriority(String priority) {
        this.priority = priority;
    }

    public int getSatisfactionRating() {
        return satisfactionRating;
    }

    public void setSatisfactionRating(int satisfactionRating) {
        this.satisfactionRating = satisfactionRating;
    }
}
