package com.plateer.ec1;

import com.plateer.ec1.claim.dao.ClaimDao;
import com.plateer.ec1.claim.validator.ClaimValidator;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Repository;

@SpringBootApplication
public class Ec1Application {

	public static void main(String[] args) {
		SpringApplication.run(Ec1Application.class, args);
	}

}
