Selenium + BDD Cucumber + Java + Web Driver manager + Allure reporting + POM

Steps to generate allure reports:

1. Add the necessary dependencies in POM.xml --> Dependencies added for Junit 5 , Junit 4 dependencies will be added and tested in develop branch
2. run the allure generate allure-results --clean -o allure-report after running the testrunner file


Reference docs:

1. https://allurereport.org/docs/cucumberjvm/
2. https://qaautomation.expert/2023/09/27/allure-report-for-cucumber7-selenium-and-junit5/
3. https://www.youtube.com/watch?v=kPhpJzlnUTs&t=3302s


@RunWith(Cucumber.class)
@CucumberOptions(
features = "src/test/java/features",
glue = {"utility", "stepDefinition"},
plugin = {"pretty","html:target/cucumber-html-report", "json:cucumber.json"}
)

Add below dependencies for Junit 4 --> Need to edit few things here. Will work on it after few days.

 <properties>
        <maven.compiler.source>21</maven.compiler.source>
        <maven.compiler.target>21</maven.compiler.target>
        <project.build.sourceEncoding>UTF-8</project.build.sourceEncoding>
    </properties>

    <dependencies>
        <!-- https://mvnrepository.com/artifact/io.cucumber/cucumber-java -->
        <dependency>
            <groupId>io.cucumber</groupId>
            <artifactId>cucumber-java</artifactId>
            <version>7.18.0</version>
        </dependency>

        <!-- https://mvnrepository.com/artifact/io.cucumber/cucumber-core -->
        <dependency>
            <groupId>io.cucumber</groupId>
            <artifactId>cucumber-core</artifactId>
            <version>7.18.0</version>
        </dependency>

        <!-- https://mvnrepository.com/artifact/io.cucumber/cucumber-junit -->
        <dependency>
            <groupId>io.cucumber</groupId>
            <artifactId>cucumber-junit</artifactId>
            <version>7.18.0</version>
            <scope>test</scope>
        </dependency>



        <!-- https://mvnrepository.com/artifact/org.seleniumhq.selenium/selenium-java -->
        <dependency>
            <groupId>org.seleniumhq.selenium</groupId>
            <artifactId>selenium-java</artifactId>
            <version>4.18.1</version>
        </dependency>






        <!-- https://mvnrepository.com/artifact/io.github.bonigarcia/webdrivermanager -->
        <dependency>
            <groupId>io.github.bonigarcia</groupId>
            <artifactId>webdrivermanager</artifactId>
            <version>5.8.0</version>
        </dependency>





    </dependencies>
