package org.springframework.samples.petclinic.sample;

//import org.junit.Test;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.context.ApplicationContext;

import static org.junit.jupiter.api.Assertions.*;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SampleControllerTest {

	@Autowired
	ApplicationContext applicationContext;

	@Test
	public void testDI()
	{
		applicationContext.getBean(SampleController.class);
	}
}
