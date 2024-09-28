package com.teit;

import org.testng.Assert;
import org.testng.annotations.Test;

public class AppTest {

		@Test
		public void testloginl() {
			App myapp = new App();
			Assert.assertEquals(0, myapp.userLogin("Shubham@185", "12345678"));
		}

		@Test 	
		public void testlogin2() {
			App myapp = new App();
			Assert.assertEquals(1, myapp.userLogin("Shubham185", "12345678"));
		}

	}

