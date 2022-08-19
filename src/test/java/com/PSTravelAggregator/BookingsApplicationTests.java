package com.PSTravelAggregator;

import com.PSTravelAggregator.controllers.transportation.TransportationController;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.junit.Assert;

@SpringBootTest
class BookingsApplicationTests {

	@Autowired
	TransportationController transportationController;

	@Test
	void contextLoads() {
		Assert.assertNotNull(transportationController);
	}

}
