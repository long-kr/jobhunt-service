package com.longhuynh.jobhunt_backend.entity;

import java.io.Serializable;
import java.util.Date;
import java.util.UUID;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;
import jakarta.validation.constraints.NotNull;
import lombok.Data;

@Data
@Entity
@Table(name = "job")
public class Job implements Serializable {
    public static final long serialVersionUID = 1L;

    @Id
    private UUID id;

    @NotNull
    @Column(length = 50)
    private ActionType actionType;

    @Column
    @Temporal(TemporalType.TIMESTAMP)
    private Date date;

    @Column
    @Temporal(TemporalType.TIMESTAMP)
    private Date createdAt;

    private Boolean createdByWorkflow;
    private String jobTitle;
    private String jobLocation;
    private String jobSalary;
    private String jobUrl;
    private String boardId;
    private String boardName;

    // Company related fields
    private String companyId;
    private String companyName;
    private String companyDomain;
    private String companyLocation;
    private String companyFoundedYear;

    // Activity related fields
    private String activityId;
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
    private ListNameType fromListName;

    @Enumerated(EnumType.STRING)
    private ListNameType toListName;

    private String activityCategoryId;

    @Enumerated(EnumType.STRING)
    private ActivityCategoryNameType activityCategoryName;

    // Note related fields
    private String noteId;
    private String noteText;

    // Contact related fields
    private String contactId;
    private String contactFirstName;
    private String contactLastName;
    private String contactEmail;
    private String contactTitle;
    private String contactEmployerId;

    // Creator related fields
    private String creatorUserId;
    private String creatorUserFirstName;
    private String creatorUserLastName;
    private String creatorUserEmail;

    // Getters and Setters
    // Add standard getters and setters for all fields

    // Default constructor
    public Job() {
        this.id = UUID.randomUUID();
    }

    // You might want to add a builder or additional constructors based on your
    // needs
}
