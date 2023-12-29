# Overview
This guides how to use three types of waits in Selenium

- Implicit Wait
- Explicit Wait
- Fluent Wait

# Sample code 

```java

	@SuppressWarnings("deprecation")
	@Test 
	public void loginInactiveUsersImplicitWait() throws InterruptedException { 
        String csvFile = "/Users/vuhung/eclipse-workspace/selenium-itnews/testData/WordpressUsers.csv";
        
        List<WordpressUser> usersList = CSVLoader.loadCSV(csvFile);
        
        for (WordpressUser user : usersList) {
        	
        	// open the login form 
        	
        	driver.get("http://localhost:8000/wp-login.php");
        	
        	WebElement userLoginInput = driver.findElement(By.id("user_login"));
    		WebElement userPasswordInput = driver.findElement(By.id("user_pass"));
    		WebElement loginButton = driver.findElement(By.id("wp-submit"));
        	
    		Wait<WebDriver> wait = new WebDriverWait(driver, Duration.ofSeconds(2));

    		// clear the input before entering the new login/password
    		userLoginInput.clear();
    
    		// Implicit wait for 2 seconds 
    		// deprecated 
    		driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS); 
    
    		userLoginInput.sendKeys(user.getUserName());
    		
    		userPasswordInput.clear();

    		// Implicit wait for 2 seconds 
    		driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS); 

    		userPasswordInput.sendKeys(user.getPassword());
    	
    		loginButton.click();
    		
    		// logout before login the next user
    		driver.get("http://localhost:8000/wp-login.php?loggedout=true&wp_lang=en_US");
        }
		
	}

	@Test 
	public void loginInactiveUsersExplictWait() throws InterruptedException { 
        String csvFile = "/Users/vuhung/eclipse-workspace/selenium-itnews/testData/WordpressUsers.csv";
        
        List<WordpressUser> usersList = CSVLoader.loadCSV(csvFile);
        
        for (WordpressUser user : usersList) {
        	
        	// open the login form 
        	
        	driver.get("http://localhost:8000/wp-login.php");
        	
        	WebElement userLoginInput = driver.findElement(By.id("user_login"));
    		WebElement userPasswordInput = driver.findElement(By.id("user_pass"));
    		WebElement loginButton = driver.findElement(By.id("wp-submit"));
        	
    		Wait<WebDriver> wait = new WebDriverWait(driver, Duration.ofSeconds(2));
    		
    		// explicit wait until user login and password fields are displayed. 
    		wait.until(d -> userLoginInput.isDisplayed());
    		wait.until(d -> userPasswordInput.isDisplayed());

    		// clear the input before entering the new login/password
    		userLoginInput.clear();
    		userPasswordInput.clear();

    		userLoginInput.sendKeys(user.getUserName());
    		userPasswordInput.sendKeys(user.getPassword());
    		loginButton.click();
    		
    		// logout before login the next user
    		driver.get("http://localhost:8000/wp-login.php?loggedout=true&wp_lang=en_US");
        }
	}


	@Test 
	public void loginInactiveUsersExplictWaitWithOptions() throws InterruptedException { 
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
    		userPasswordInput.clear();

    		Wait<WebDriver> wait = 
    				new FluentWait<>(driver)
    				.withTimeout(Duration.ofSeconds(2))
    				.pollingEvery(Duration.ofMillis(300))
    				.ignoring(ElementNotInteractableException.class);
    					
    		wait.until(
    				d -> {
    		    		userLoginInput.sendKeys(user.getUserName());
    		    		return true;
    				}); 
    		
    		wait.until(
    				d -> { 
    		    		userPasswordInput.sendKeys(user.getPassword());
    		    		return true; 
    				}); 
    		
    		loginButton.click();
    		
    		// logout before login the next user
    		driver.get("http://localhost:8000/wp-login.php?loggedout=true&wp_lang=en_US");
        }
		
	}

```
