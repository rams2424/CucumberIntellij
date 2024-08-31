package runner;

import io.cucumber.junit.platform.engine.Constants;
import org.junit.platform.suite.api.ConfigurationParameter;
import org.junit.platform.suite.api.IncludeEngines;
import org.junit.platform.suite.api.SelectClasspathResource;
import org.junit.platform.suite.api.Suite;

@Suite
@IncludeEngines("cucumber")
@SelectClasspathResource("stepDefinition")
@ConfigurationParameter(key = Constants.FEATURES_PROPERTY_NAME,value = "src/test/java/features")
@ConfigurationParameter(key = Constants.PLUGIN_PROPERTY_NAME,value = "pretty, io.qameta.allure.cucumber7jvm.AllureCucumber7Jvm")

public class TestRunner {


}
