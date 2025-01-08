package com.longhuynh.jobhunt_backend.domain;

import com.longhuynh.jobhunt_backend.domain.constant.ActionType;

import jakarta.persistence.Entity;
import jakarta.validation.constraints.NotNull;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.SuperBuilder;

@Data
@SuperBuilder
@EqualsAndHashCode(callSuper = true)
@Entity
public class Action extends com.longhuynh.jobhunt_backend.domain.Entity {
    public static final long serialVersionUID = 1L;

    @NotNull
    private ActionType actionType;
}
