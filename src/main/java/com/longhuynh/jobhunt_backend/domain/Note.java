package com.longhuynh.jobhunt_backend.domain;

import jakarta.persistence.Entity;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.SuperBuilder;

@Data
@SuperBuilder
@EqualsAndHashCode(callSuper = true)
@Entity
public class Note extends com.longhuynh.jobhunt_backend.domain.Entity {
    public static final long serialVersionUID = 1L;

    private String noteText;
}
