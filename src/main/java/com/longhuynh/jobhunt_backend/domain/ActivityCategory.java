package com.longhuynh.jobhunt_backend.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.SuperBuilder;

@Data
@SuperBuilder
@EqualsAndHashCode(callSuper = true)
@Entity
public class ActivityCategory extends com.longhuynh.jobhunt_backend.domain.Entity {
    public static final long serialVersionUID = 1L;

    @Enumerated(EnumType.STRING)
    private ActivityCategoryNameType activityCategoryName;
}
