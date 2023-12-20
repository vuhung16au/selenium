# Setup Selenium Development Environment on Mac OS X 

# Install brew 

Follow the guide on. 
https://brew.sh/
It is simple 

``` 
/bin/bash -c "$(curl -fsSL https://raw.githubusercontent.com/Homebrew/install/HEAD/install.sh)"
``` 

# Insall maven 

```
/bin/bash -c "$(curl -fsSL https://raw.githubusercontent.com/Homebrew/install/HEAD/install.sh)"
``` 

# Install Oracle JDK 

(Java 21) 
https://www.oracle.com/java/technologies/downloads/

# Install IDE 

https://www.eclipse.org/downloads/

# Create a project folder 
(The folder eclipse-workdspace is already pre-generated wit Eclipse installation) 

```
cd /Users/vuhung/eclipse-workspace/
``` 

# Initialize a Selenium project 

``` 
cd /Users/vuhung/eclipse-workspace/
``` 

``` 
mvn archetype:generate -Dfilter=serenity
```

``` 

vhmac:eclipse-workspace vuhung$ mvn archetype:generate -Dfilter=serenity 
[INFO] Scanning for projects...
[INFO] 
[INFO] ------------------< org.apache.maven:standalone-pom >-------------------
[INFO] Building Maven Stub Project (No POM) 1
[INFO] --------------------------------[ pom ]---------------------------------
[INFO] 
[INFO] >>> archetype:3.2.1:generate (default-cli) > generate-sources @ standalone-pom >>>
[INFO] 
[INFO] <<< archetype:3.2.1:generate (default-cli) < generate-sources @ standalone-pom <<<
[INFO] 
[INFO] 
[INFO] --- archetype:3.2.1:generate (default-cli) @ standalone-pom ---
[INFO] Generating project in Interactive mode
[INFO] No archetype defined. Using maven-archetype-quickstart (org.apache.maven.archetypes:maven-archetype-quickstart:1.0)
Choose archetype:
1: remote -> com.browserstack:serenity-archetype-setup (BrowserStack Serenity Archetype for Getting Started)
2: remote -> net.serenity-bdd:serenity-cucumber-archetype (Serenity BDD automated acceptance test suite)
3: remote -> net.serenity-bdd:serenity-cucumber4-archetype (Serenity automated acceptance testing project using Selenium 2, JUnit and Cucumber-JVM)
4: remote -> net.serenity-bdd:serenity-cucumber4-screenplay-archetype (Serenity automated acceptance testing project using Selenium 2, JUnit and Cucumber-JVM)
5: remote -> net.serenity-bdd:serenity-jbehave-archetype (Serenity automated acceptance testing project using Selenium 2, JUnit and JBehave)
6: remote -> net.serenity-bdd:serenity-junit-archetype (Serenity automated acceptance testing project using Selenium 2 and JUnit)
7: remote -> net.serenity-bdd:serenity-junit-screenplay-archetype (Serenity automated acceptance testing project using Screenplay, Selenium 2 and JUnit)
Choose a number or apply filter (format: [groupId:]artifactId, case sensitive contains): : 6
Choose net.serenity-bdd:serenity-junit-archetype version: 
1: 1.0.2
2: 1.0.6
3: 1.0.7
4: 1.0.8
5: 1.1.7
6: 1.1.17
7: 1.1.18
8: 1.1.19
9: 1.1.20
10: 1.1.36
11: 1.1.38
12: 1.2.0
13: 1.5.4
14: 1.6.9
15: 1.7.0
16: 1.8.4
17: 2.0.66
18: 2.0.75
19: 2.0.78
20: 2.0.80
21: 2.0.81
22: 2.3.2
Choose a number: 22:  
Define value for property 'groupId': com.vuhung.selenium20231220
Define value for property 'artifactId': selenium20231220
Define value for property 'version' 1.0-SNAPSHOT: : 
Define value for property 'package' com.vuhung.selenium20231220: : 
Confirm properties configuration:
groupId: com.vuhung.selenium20231220
artifactId: selenium20231220
version: 1.0-SNAPSHOT
package: com.vuhung.selenium20231220
 Y: : 
[INFO] ----------------------------------------------------------------------------
[INFO] Using following parameters for creating project from Archetype: serenity-junit-archetype:2.3.2
[INFO] ----------------------------------------------------------------------------
[INFO] Parameter: groupId, Value: com.vuhung.selenium20231220
[INFO] Parameter: artifactId, Value: selenium20231220
[INFO] Parameter: version, Value: 1.0-SNAPSHOT
[INFO] Parameter: package, Value: com.vuhung.selenium20231220
[INFO] Parameter: packageInPathFormat, Value: com/vuhung/selenium20231220
[INFO] Parameter: package, Value: com.vuhung.selenium20231220
[INFO] Parameter: groupId, Value: com.vuhung.selenium20231220
[INFO] Parameter: artifactId, Value: selenium20231220
[INFO] Parameter: version, Value: 1.0-SNAPSHOT
[INFO] Project created from Archetype in dir: /Users/vuhung/eclipse-workspace/selenium20231220
[INFO] ------------------------------------------------------------------------
[INFO] BUILD SUCCESS
[INFO] ------------------------------------------------------------------------
[INFO] Total time:  28.745 s
[INFO] Finished at: 2023-12-20T13:58:41+11:00
[INFO] ------------------------------------------------------------------------
```

`selenium20231220` is the artifact ID. 

## Tell Eclipse to regonize this directory as a maven project

```
cd selenium20231220
mvn eclipse:eclipse
``` 

# Open project with Eclipse 

# Clean source code 

# First run (no test cases) 

``` 
mvn verify
``` 

or clean build 

```
mvn clean verify
``` 


