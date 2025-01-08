package com.longhuynh.jobhunt_backend.domain;

import java.util.Date;

import com.longhuynh.jobhunt_backend.domain.constant.ListnameType;

import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.SuperBuilder;

@Data
@SuperBuilder
@EqualsAndHashCode(callSuper = true)
@Entity
public class Activity extends com.longhuynh.jobhunt_backend.domain.Entity {
    public static final long serialVersionUID = 1L;

    private String activityTitle;
    private String activityNote;
    private Boolean activityCompleted;

    @Temporal(TemporalType.TIMESTAMP)
    private Date activityCompletedAt;

    @Temporal(TemporalType.TIMESTAMP)
    private Date activityStartAt;

    @Temporal(TemporalType.TIMESTAMP)
    private Date activityEndAt;

    @Enumerated(EnumType.STRING)
    private ListnameType fromListName;

    @Enumerated(EnumType.STRING)
    private ListnameType toListName;
}
