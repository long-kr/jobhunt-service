package com.longhuynh.jobhunt_backend.service;

import java.util.List;

import com.longhuynh.jobhunt_backend.entity.dto.JobResponseDto;

public interface JobService {
    List<JobResponseDto> findAllById(String id);

}