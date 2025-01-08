package com.longhuynh.jobhunt_backend.domain;

import java.io.Serializable;
import java.util.Date;
import java.util.UUID;

import jakarta.persistence.Id;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;
import jakarta.validation.constraints.NotNull;
import lombok.Builder;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

@SuperBuilder
@NoArgsConstructor
public class Entity implements Serializable {
    @Builder.Default
    @Id
    private UUID id = UUID.randomUUID();

    @Builder.Default
    @NotNull
    @Temporal(TemporalType.TIMESTAMP)
    private Date createdAt = new Date();

    @Builder.Default
    @NotNull
    private Date updatedAt = new Date();
}
