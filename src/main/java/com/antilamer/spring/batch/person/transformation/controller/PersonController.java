package com.antilamer.spring.batch.person.transformation.controller;

import com.antilamer.spring.batch.person.transformation.model.Person;
import com.antilamer.spring.batch.person.transformation.repository.PersonRepo;
import org.springframework.batch.core.Job;
import org.springframework.batch.core.JobParameters;
import org.springframework.batch.core.JobParametersBuilder;
import org.springframework.batch.core.launch.JobLauncher;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("person")
public class PersonController {

    private final PersonRepo personRepo;
    private final JobLauncher jobLauncher;
    private final Job job;

    public PersonController(PersonRepo personRepo, JobLauncher jobLauncher, Job job) {
        this.personRepo = personRepo;
        this.jobLauncher = jobLauncher;
        this.job = job;
    }


    @GetMapping
    public List<Person> getAllPersons() {
        return personRepo.findAll();
    }

    @GetMapping("process")
    public void processPersons() throws Exception {
        JobParameters jobParameters = new JobParametersBuilder().addLong("time", System.currentTimeMillis()).toJobParameters();
        jobLauncher.run(job, jobParameters);
    }

}
