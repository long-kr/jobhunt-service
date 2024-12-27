package com.longhuynh.jobhunt_backend.service;

import java.util.List;

import org.springframework.boot.autoconfigure.batch.BatchProperties.Job;
import org.springframework.stereotype.Service;

import com.longhuynh.jobhunt_backend.entity.dto.JobResponseDTO;
import com.longhuynh.jobhunt_backend.repository.JobRepository;

@Service
public class JobServiceImp implements JobService {
    private JobRepository jobRepository;

    @Override
    public List<JobResponseDTO> findAllById(String id) {
        List<Job> jobs = jobRepository.findAllByUserId(id);

        return jobs.stream().map(job -> new JobResponseDTO.JobResponseDtoBuilder().build()).toList();
    }
}
