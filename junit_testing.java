import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class junit_testing {

	testing t1;
	
	@BeforeEach
	void setUp() throws Exception {
		t1 = new testing();
		
	}

//	@Test
//	void test() {
//		assertEquals(101, t1.gererateNumber(1));
//	}
	
//	@Test
//	void test2() {
//		assertEquals(102, t1.gererateNumber(1));
//	}
	
//	@Test
//	void test3() {
//		assertEquals("Back", t1.selectOption());
//	}
	
//	@Test
//	void test4() {
//		assertEquals(201, t1.gererateNumber2(2));
//	}
	
	@Test
	void test5() {
		assertEquals(301, t1.gererateNumber3(3));
	}


}
