package com.example.jobApp.service;


import com.example.jobApp.model.JobPost;
import com.example.jobApp.repo.JobRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class JobService {

    @Autowired
    private JobRepo jobService;
    public void addJob(JobPost job) {
        jobService.addJob(job);
    }
    public List<JobPost> getAllJobs() {
        return jobService.getAllJobs();
    }

}
