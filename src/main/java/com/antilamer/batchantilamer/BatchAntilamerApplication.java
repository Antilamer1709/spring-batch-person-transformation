package com.antilamer.batchantilamer;

import org.springframework.batch.core.configuration.annotation.EnableBatchProcessing;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@EnableBatchProcessing
@SpringBootApplication
public class BatchAntilamerApplication {

	public static void main(String[] args) {
		SpringApplication.run(BatchAntilamerApplication.class, args);
	}

}
