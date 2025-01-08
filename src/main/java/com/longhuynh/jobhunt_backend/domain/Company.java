package com.longhuynh.jobhunt_backend.domain;

import io.micrometer.common.lang.NonNull;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.SuperBuilder;

@Data
@SuperBuilder
@EqualsAndHashCode(callSuper = true)
@Entity
@Table(name = "company")
public class Company extends com.longhuynh.jobhunt_backend.domain.Entity {
    public static final long serialVersionUID = 1L;

    @NonNull
    private String companyName;
    private String companyDomain;
    private String companyLocation;
    private String companyFoundedYear;

}
