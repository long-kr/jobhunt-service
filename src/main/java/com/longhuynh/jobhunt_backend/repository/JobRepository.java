package com.longhuynh.jobhunt_backend.repository;

import java.util.List;

import org.springframework.boot.autoconfigure.batch.BatchProperties.Job;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface JobRepository extends JpaRepository<Job, String> {
    @Query(value = "SELECT * FROM job WHERE user_id = :id", nativeQuery = true)
    List<Job> findAllByUserId(@Param("id") String id);
}
