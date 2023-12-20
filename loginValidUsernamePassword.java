	@Test 
	public void loginValidUsernamePassword() {
				
		WebElement userLoginInput = driver.findElement(By.id("user_login"));
		WebElement userPasswordInput = driver.findElement(By.id("user_pass"));
		WebElement loginButton = driver.findElement(By.id("wp-submit"));
		
		userLoginInput.sendKeys("vuhung");
		userPasswordInput.sendKeys("vuhung");
		loginButton.click();
		
		String expectedAfterLoginURL = "http://localhost:8000/wp-admin/";
		String actualAfterLoginURL = driver.getCurrentUrl();
		
		// Assert.assertEquals(expectedAfterLoginURL, actualAfterLoginURL);
		
		assertThat(expectedAfterLoginURL, equalTo(actualAfterLoginURL));
		
		
		try { 
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
	}
