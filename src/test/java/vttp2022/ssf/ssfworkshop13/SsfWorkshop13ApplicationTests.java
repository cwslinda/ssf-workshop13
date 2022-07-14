package vttp2022.ssf.ssfworkshop13;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import vttp2022.ssf.ssfworkshop13.models.Contact;

// autowired cannot be used in testcase

@SpringBootTest
class SsfWorkshop13ApplicationTests {

	@Test
	void contextLoads() {
	}

	@Test
	public void testContact() throws Exception{
		Contact c = new Contact();
		c.setEmail("apple@gmail.com");
		c.setName("apple");
		c.setPhoneNumber(123123123);
		assertEquals(c.getEmail(), "apple@gmail.com");
	}

	// @Test
	// public void testContactsSaveContact() throws Exception{
	// 	Contact ctc = new Contact();
	// 	ctc.setName("Grace");
	// 	ctc.setEmail("grace@gmail.com");
	// 	ctc.setPhoneNumber(123123123);
	// 	ctcz.saveContact(ctc, mdl, appArgs);
	//}

}

