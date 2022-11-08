package com.browserstack.cucumber;

import net.serenitybdd.junit5.SerenityJUnit5Extension;
import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.platform.suite.api.ConfigurationParameter;
import org.junit.platform.suite.api.IncludeEngines;
import org.junit.platform.suite.api.SelectClasspathResource;
import org.junit.platform.suite.api.Suite;

import static io.cucumber.junit.platform.engine.Constants.GLUE_PROPERTY_NAME;

@Suite
@IncludeEngines("cucumber")
@SelectClasspathResource("parallelFeatures")
@ConfigurationParameter(key = GLUE_PROPERTY_NAME, value = "com.browserstack.cucumber")
@ExtendWith(SerenityJUnit5Extension.class)
public class ParallelTest {
}
