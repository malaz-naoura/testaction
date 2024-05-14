package org.startup.testactiongithub;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class TestActionGithubApplication {

	public static void main(String[] args) {
		SpringApplication.run(TestActionGithubApplication.class, args);
	}

	void doit() {
		System.out.println("doit");
	}

}
