package com.longhuynh.jobhunt_backend.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.longhuynh.jobhunt_backend.entity.dto.JobDto;
import com.longhuynh.jobhunt_backend.service.JobServiceImp;

@RestController
public class JobController {
    public static final String JOB = "jobs";
    public static final String JOB_ID = JOB + "/{id}";

    private JobServiceImp jobService;

    @GetMapping(JOB)
    public List<JobDto> getAll() {
        return jobService.getAll();
    }
}
