package com.plateer.ec1.claim;

import com.plateer.ec1.claim.dao.ClaimDao;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class Ec1ApplicationTests {

	@Autowired
	ClaimDao dao;

	@Test
	void contextLoads() {
		dao.selectTest();
	}

}
