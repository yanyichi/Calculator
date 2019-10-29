package hw.calculator.calculator;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class CalculatorApplicationTests {

	@Test
	void contextLoads() {
	}
	Operator operator =new Operator();

	@Test
	public void testAdd() {
        assertEquals(5, operator.add(2,3));
	}







}
