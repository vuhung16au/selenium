// @Test
	public void publishNewBlogSpot() {
		
		WebElement userLogin = driver.findElement(By.id("user_login"));
		WebElement userPass = driver.findElement(By.id("user_pass"));
		WebElement loginButton = driver.findElement(By.id("wp-submit"));
		
		userLogin.sendKeys("vuhung");
		userPass.sendKeys("vuhung");
		loginButton.click();
		
		// find "add new post"
		WebElement menuPost = driver.findElement(By.xpath("//div[normalize-space()='Posts']"));
		menuPost.click();
		
		// Click "Post" on the menu
		WebElement menuAddNewPost = driver.findElement(By.xpath("//a[@class='page-title-action']"));
		menuAddNewPost.click();
		
		// write a blog, it is in a frame 
		driver.switchTo().frame(0);
		
		WebElement blogTitle = driver.findElement(By.xpath("//h1[@aria-label='Add title']"));
		blogTitle.sendKeys("Selenium title " + java.time.LocalDateTime.now());
		WebElement blogContent = driver.findElement(By.xpath("//p[@aria-label='Add default block']"));
		blogContent.sendKeys("Selenium content");
		
		// switch back to parent page 
		driver.switchTo().defaultContent();
		
		/*
		 * // Click draft WebElement saveBlogDraft =
		 * driver.findElement(By.xpath("//button[normalize-space()='Save draft']"));
		 * saveBlogDraft .click();
		 */
		
		/*
		 * // TODO // Get blog URL driver.findElement(By.xpath(
		 * "//button[@aria-label='Preview']//*[name()='svg']")).click(); WebElement
		 * blogPostURL = driver.findElement(By.linkText("Preview in new tab")); String
		 * blogPostURLHref = blogPostURL.getAttribute("href");
		 * System.out.println(blogPostURLHref);
		 * 
		 * // TODO // Verify that blog is publicly accessible
		 * driver.get(blogPostURLHref);
		 */
		
		// click "Publish" 
		WebElement blogPublish = driver.findElement(By.xpath("//button[normalize-space()='Publish']"));
		blogPublish.click();
		
		// click "Publish" button on the confirmation page 
		WebElement blogPublishConfirm = driver.findElement(By.xpath("//button[@class='components-button editor-post-publish-button editor-post-publish-button__button is-primary']"));
		blogPublishConfirm.click();
		
		// TODO 
		// Delete the blog post just created 
		
		
		
	}
	
