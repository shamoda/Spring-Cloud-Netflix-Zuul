package com.zuul.diagnoseservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class DiagnoseServiceApplication {

	@GetMapping("/getdiagnosis")
	public String getDiagnosis() {
		return "Diagnosis microservice called...";
	}

	public static void main(String[] args) {
		SpringApplication.run(DiagnoseServiceApplication.class, args);
	}

}
