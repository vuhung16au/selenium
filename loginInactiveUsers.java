@Test 
	public void loginInactiveUsers() throws InterruptedException { 
        String csvFile = "/Users/vuhung/eclipse-workspace/selenium-itnews/testData/WordpressUsers.csv";
        
        List<WordpressUser> usersList = CSVLoader.loadCSV(csvFile);
        
        for (WordpressUser user : usersList) {
        	
        	// open the login form 
        	
        	driver.get("http://localhost:8000/wp-login.php");
        	
        	WebElement userLoginInput = driver.findElement(By.id("user_login"));
    		WebElement userPasswordInput = driver.findElement(By.id("user_pass"));
    		WebElement loginButton = driver.findElement(By.id("wp-submit"));
        	
    		
    		// clear the input before entering the new login/password
    		userLoginInput.clear();
    		userLoginInput.sendKeys(user.getUserName());
    		userPasswordInput.clear();
    		userPasswordInput.sendKeys(user.getPassword());
    		loginButton.click();
    		
    		// logout before login the next user
    		driver.get("http://localhost:8000/wp-login.php?loggedout=true&wp_lang=en_US");

    		// driver.wait(2000);
        }
		
	}
