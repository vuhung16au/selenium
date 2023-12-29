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

```
vhmac:selenium20231220 vuhung$ mvn eclipse:eclipse 
[INFO] Scanning for projects...
[INFO] 
[INFO] ------------< com.vuhung.selenium20231220:selenium20231220 >------------
[INFO] Building Serenity project with JUnit and WebDriver 1.0-SNAPSHOT
[INFO]   from pom.xml
[INFO] --------------------------------[ jar ]---------------------------------
[INFO] 
[INFO] >>> eclipse:2.10:eclipse (default-cli) > generate-resources @ selenium20231220 >>>
[INFO] 
[INFO] <<< eclipse:2.10:eclipse (default-cli) < generate-resources @ selenium20231220 <<<
[INFO] 
[INFO] 
[INFO] --- eclipse:2.10:eclipse (default-cli) @ selenium20231220 ---
[INFO] Using Eclipse Workspace: /Users/vuhung/eclipse-workspace
[WARNING] Workspace defines a VM that does not contain a valid jre/lib/rt.jar: /Library/Java/JavaVirtualMachines/temurin-17.jdk/Contents/Home
[INFO] Adding default classpath container: org.eclipse.jdt.launching.JRE_CONTAINER/org.eclipse.jdt.internal.debug.ui.launcher.StandardVMType/JavaSE-1.8
[INFO] Wrote settings to /Users/vuhung/eclipse-workspace/selenium20231220/.settings/org.eclipse.jdt.core.prefs
[INFO] Wrote Eclipse project for "selenium20231220" to /Users/vuhung/eclipse-workspace/selenium20231220.
[INFO] 
[INFO] ------------------------------------------------------------------------
[INFO] BUILD SUCCESS
[INFO] ------------------------------------------------------------------------
[INFO] Total time:  3.020 s
[INFO] Finished at: 2023-12-20T13:59:53+11:00
[INFO] ------------------------------------------------------------------------
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

The output ooks like this 

```
vhmac:selenium-itnews vuhung$ mvn verify 
[INFO] Scanning for projects...
[INFO] 
[INFO] ----------------< com.vuhung.seleniium:selenium-itnews >----------------
[INFO] Building Serenity project with JUnit and WebDriver 1.0-SNAPSHOT
[INFO]   from pom.xml
[INFO] --------------------------------[ jar ]---------------------------------
[INFO] 
[INFO] --- resources:3.3.1:resources (default-resources) @ selenium-itnews ---
[INFO] skip non existing resourceDirectory /Users/vuhung/eclipse-workspace/selenium-itnews/src/main/resources
[INFO] 
[INFO] --- compiler:3.2:compile (default-compile) @ selenium-itnews ---
[INFO] No sources to compile
[INFO] 
[INFO] --- resources:3.3.1:testResources (default-testResources) @ selenium-itnews ---
[INFO] Copying 1 resource from src/test/resources to target/test-classes
[INFO] 
[INFO] --- compiler:3.2:testCompile (default-testCompile) @ selenium-itnews ---
[INFO] Changes detected - recompiling the module!
[INFO] Compiling 3 source files to /Users/vuhung/eclipse-workspace/selenium-itnews/target/test-classes
[INFO] 
[INFO] --- surefire:3.0.0-M5:test (default-test) @ selenium-itnews ---
[INFO] Tests are skipped.
[INFO] 
[INFO] --- jar:3.3.0:jar (default-jar) @ selenium-itnews ---
[WARNING] JAR will be empty - no content was marked for inclusion!
[INFO] Building jar: /Users/vuhung/eclipse-workspace/selenium-itnews/target/selenium-itnews-1.0-SNAPSHOT.jar
[INFO] 
[INFO] --- failsafe:3.0.0-M5:integration-test (default) @ selenium-itnews ---
[INFO] 
[INFO] -------------------------------------------------------
[INFO]  T E S T S
[INFO] -------------------------------------------------------
[INFO] Running com.vuhung.seleniium.features.login.AuthorizationStory
[main] INFO  - 

-------------------------------------------------------------------------------------
     _______. _______ .______       _______ .__   __.  __  .___________.____    ____ 
    /       ||   ____||   _  \     |   ____||  \ |  | |  | |           |\   \  /   / 
   |   (----`|  |__   |  |_)  |    |  |__   |   \|  | |  | `---|  |----` \   \/   /  
    \   \    |   __|  |      /     |   __|  |  . `  | |  |     |  |       \_    _/   
.----)   |   |  |____ |  |\  \----.|  |____ |  |\   | |  |     |  |         |  |     
|_______/    |_______|| _| `._____||_______||__| \__| |__|     |__|         |__|    
                                                                                     
 News and tutorials at https://serenity-bdd.info                                     
 Documentation at https://serenity-bdd.github.io                                     
 Test Automation Training and Coaching: https://www.serenity-dojo.com                
 Commercial Support: https://www.serenity-dojo.com/serenity-bdd-enterprise-support   
 Join the Serenity Community on Gitter: https://gitter.im/serenity-bdd/serenity-core 
-------------------------------------------------------------------------------------

[main] INFO  - Test Suite Started: Authorization story
[main] INFO  - 
  _____   ___   ___   _____     ___   _____     _     ___   _____   ___   ___  
 |_   _| | __| / __| |_   _|   / __| |_   _|   /_\   | _ \ |_   _| | __| |   \ 
   | |   | _|  \__ \   | |     \__ \   | |    / _ \  |   /   | |   | _|  | |) |
   |_|   |___| |___/   |_|     |___/   |_|   /_/ \_\ |_|_\   |_|   |___| |___/ 

publishNewBlogSpot
--------------------------------------------------------------------------------
[main] INFO  - 
  _____   ___   ___   _____     ___     _     ___   ___   ___   ___  
 |_   _| | __| / __| |_   _|   | _ \   /_\   / __| / __| | __| |   \ 
   | |   | _|  \__ \   | |     |  _/  / _ \  \__ \ \__ \ | _|  | |) |
   |_|   |___| |___/   |_|     |_|   /_/ \_\ |___/ |___/ |___| |___/ 

Publish new blog spot
----------------------------------------------------------------------
[INFO] Tests run: 1, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 12.869 s - in com.vuhung.seleniium.features.login.AuthorizationStory
[INFO] 
[INFO] Results:
[INFO] 
[INFO] Tests run: 1, Failures: 0, Errors: 0, Skipped: 0
[INFO] 
[INFO] 
[INFO] --- serenity:4.0.29:aggregate (serenity-reports) @ selenium-itnews ---
[INFO] GENERATING REPORTS FOR: /Users/vuhung/eclipse-workspace/selenium-itnews
[INFO] GENERATING REPORTS USING 32 THREADS
[INFO] GENERATING SUMMARY REPORTS...
[INFO] GENERATING REQUIREMENTS REPORTS...
[INFO] GENERATING RESULT REPORTS...
[INFO] GENERATING ERROR REPORTS...
[INFO] Test results for 1 tests generated in 2.7 secs in directory: file:/Users/vuhung/eclipse-workspace/selenium-itnews/target/site/serenity/
[INFO] ------------------------------------------------
[INFO] | SERENITY TESTS:               | SUCCESS
[INFO] ------------------------------------------------
[INFO] | Test scenarios executed       | 1
[INFO] | Total Test cases executed     | 1
[INFO] | Tests passed                  | 1
[INFO] | Tests failed                  | 0
[INFO] | Tests with errors             | 0
[INFO] | Tests compromised             | 0
[INFO] | Tests aborted                 | 0
[INFO] | Tests pending                 | 0
[INFO] | Tests ignored/skipped         | 0
[INFO] ------------------------------- | --------------
[INFO] | Total Duration| 11s 127ms
[INFO] | Fastest test took| 11s 127ms
[INFO] | Slowest test took| 11s 127ms
[INFO] ------------------------------------------------
[INFO] 
[INFO] SERENITY REPORTS
[INFO]   - Full Report: file:///Users/vuhung/eclipse-workspace/selenium-itnews/target/site/serenity/index.html
[INFO] 
[INFO] --- failsafe:3.0.0-M5:verify (default) @ selenium-itnews ---
[INFO] ------------------------------------------------------------------------
[INFO] BUILD SUCCESS
[INFO] ------------------------------------------------------------------------
[INFO] Total time:  24.128 s
[INFO] Finished at: 2023-12-20T14:49:40+11:00
[INFO] ------------------------------------------------------------------------
```

Full Report: file:///Users/vuhung/eclipse-workspace/selenium-itnews/target/site/serenity/index.html

# Run maven test

```bash
mvn clean verify site
```
- `clean`: Removes the target directory, ensuring a clean build environment.
- `verify`: Executes tasks to verify the integrity and quality of the project, often including running integration tests.
- `site`: Generates project documentation and reports, placing them in the target/site directory.


