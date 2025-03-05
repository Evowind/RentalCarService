package com.example.essai;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import static org.junit.jupiter.api.Assertions.assertEquals;

import com.example.essai.data.Car;

@SpringBootTest
class EssaiApplicationTests {

	@Test
	void contextLoads() {
		Car car = new Car("1234", false);
		assertEquals("1234", car.getPlateNumber());
		assertEquals(false, car.getRent());
		assertEquals(null, car.getDatesRent());
	}

}
