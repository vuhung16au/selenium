# Overview 
assertJ (fluent assertions java library) is an open source asserting library, rich feature, easy to read easy to use.
Useful for verifying with selenium. 
This file gives some example uses of assertJ Core. 

# assertJ configuration with maven 

Add the following configurations to pom.xml 



```xml 
		<!-- https://mvnrepository.com/artifact/org.assertj/assertj-core -->
		<dependency>
		    <groupId>org.assertj</groupId>
		    <artifactId>assertj-core</artifactId>
		    <version>3.24.2</version>
		    <scope>test</scope>
		</dependency>
```

# Library imports 

```java
import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.entry;
import static org.assertj.core.api.Assertions.withPrecision;
import static org.junit.Assert.assertEquals;
```

# "Hello world" assertj

```java
	@Test 
	public void compareTwoInts () { 
		
		// Hello assertJ
		int x = 1;
		int y = 1; 
				
		// (value) 1 is 1
		assertEquals(x, y);
	}
```

# Assert Lists 

```java
	@Test 
	public void checkForElements() { 
		List<String> list = Arrays.asList("1", "2", "3");
		
		assertThat(list).isNotEmpty();
		assertThat(list).startsWith("1");
		assertThat(list).doesNotContain("4");
		assertThat(list).isNotEmpty()
		.contains("1")
		.startsWith("1")
		.doesNotContainNull()
		.containsSequence("2", "3");
		
	}
```

# Assert Objects 

```java
	@Test 
	public void assertObjects() { 
		
		WordpressUser userA = new WordpressUser("u", "p");
		WordpressUser userB = new WordpressUser("u", "p");
		
		// this works, but isEqualToComparingFieldByField is deprecated
		assertThat(userA).isEqualToComparingFieldByField(userB);
	}
```

# Assert Characters 

```java
	@Test 
	public void assertCharacters() { 
		char charZ = 'Z';

		assertThat(charZ)
		.isNotEqualTo('a')
		.isUpperCase()
		.isGreaterThanOrEqualTo('A');

	}
```

# Assert Files 

```java
	@Test 
	public void assertFile() { 
		String fileName = "/etc/passwd";
		
		File testFile = new File(fileName);
		
		assertThat(testFile)
			.exists()
			.isFile()
			.canRead();
	}

```

# Assert numbers with precision

Can be used with double, float, integer 

```java
	@Test 
	public void asssertNumberWithPrecision() { 
		Double num1 = 11d;
		Double num2 = 11.1d;
		
		// true, as 11.1 - 11 <= 0.1
		assertThat(num1).isEqualTo(num2, withPrecision(0.1));	
	}
``` 

# Assert maps 

```java
	@Test 
	public void assertMap() { 
		Map<String, String> countryCapital = new HashMap<String, String>();
		
		countryCapital.put("Vietnam","Hanoi");
		countryCapital.put("England", "London");
		countryCapital.put("Japan", "Tokyo");
		countryCapital.put("China", "Beijing");
		
		assertThat(countryCapital)
		.isNotEmpty()
		.containsKey("Vietnam")
		.doesNotContainKey("Australia")
		.contains(entry("Japan", "Tokyo"));
	}
```

# References 
- https://assertj.github.io/doc/


