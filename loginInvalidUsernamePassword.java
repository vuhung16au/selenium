// @Test 
	public void loginInvalidUsernamePassword() {
		
		WebElement userLogin = driver.findElement(By.id("user_login"));
		WebElement userPass = driver.findElement(By.id("user_pass"));
		WebElement loginButton = driver.findElement(By.id("wp-submit"));
		
		userLogin.sendKeys("vuhung");
		userPass.sendKeys("vuhung-wrong-password");
		loginButton.click();
		
		WebElement login_error = driver.findElement(By.id("login_error"));
		
		String loginErrorMsg = login_error.getText();
		
		assertThat(loginErrorMsg, equalTo("Error: The password you entered for the username vuhung is incorrect. Lost your password?"));
				
		try { 
			Thread.sleep(5000);
		} catch (InterruptedException e ) {
			e.printStackTrace();
		}				
		
	
	}
