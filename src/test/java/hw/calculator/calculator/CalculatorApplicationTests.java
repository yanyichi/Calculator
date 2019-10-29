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

	@Test
	public void testNegAdd() {
		assertEquals(-5, operator.add(-2,-3));
	}

	@Test
	public void testSub() {
		assertEquals(1, operator.sub(3,2));
	}

	@Test
	public void testNegSub() {
		assertEquals(-2, operator.sub(3,5));
	}

	@Test
	public void testMul() {
		assertEquals(6, operator.mul(2,3));
	}

	@Test
	public void testFractionMul() {
		assertEquals(7.5, operator.mul(2.5,3));
	}

	@Test
	public void testDiv() {
		assertEquals(2, operator.div(6,3));
	}

	@Test
	public void testFractionDiv() {
		assertEquals(3.5, operator.div(7,2));
	}

	@Test
	public void testMod() {
		assertEquals(5, operator.mod(23,6));
	}
}
