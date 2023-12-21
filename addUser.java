@Test
	public void addUser() { 
		
		// login to Wordpress 
		driver.findElement(By.id("user_login")).sendKeys("vuhung");
		driver.findElement(By.id("user_pass")).sendKeys("vuhung");
		driver.findElement(By.id("wp-submit")).click();
		
		// Browse directly to "Add New User" page 
		driver.get("http://localhost:8000/wp-admin/user-new.php");
		
		// TODO add unique username
		driver.findElement(By.xpath("//input[@id='user_login']")).sendKeys("selenium-user");
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("selenium-oz@gmail.com");
		driver.findElement(By.xpath("//input[@id='first_name']")).sendKeys("Selenium");
		driver.findElement(By.xpath("//input[@id='last_name']")).sendKeys("Teser");
		driver.findElement(By.xpath("//input[@id='url']")).sendKeys("https://google.com");
		
		//TODO if needed: Set password instead using pre-generated password 
		System.out.println("Password is: " + driver.findElement(By.xpath("//input[@id='pass1']")).getText());
		
		// TODO Set user role 
		// driver.findElement(By.xpath("//select[@id='role']")).
		Select userRole = new Select(driver.findElement(By.id("role")));
		
		// TODO try selectByVisibleText, selectByValue
		userRole.selectByIndex(2);
		
		driver.findElement(By.xpath("//input[@id='createusersub']")).click();
		
		
	}
