package com.alok.springboot_aws_deploy;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AWSHelloController {

	@GetMapping("/test")
	public String getMethodName() {
		return "Test AWS Alok and Pranshi";
	}
}
