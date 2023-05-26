package com.training.module1;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class CarTest {

	@Test
	void test() {
		Car car = new Car("Ceva");

		assertEquals("Ceva", car.getModel());
	}
}
