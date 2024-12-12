package com.longhuynh.jobhunt_backend.service;

import java.util.List;

import com.longhuynh.jobhunt_backend.entity.dto.JobDto;

public interface JobService {
    List<JobDto> getAll();

}