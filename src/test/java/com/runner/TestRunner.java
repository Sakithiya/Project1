package com.runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features= {"C:\\Users\\Admin\\Desktop\\Project1\\src\\test\\resources\\Login.feature"},glue= {"com.stepdefinition"},tags= {"@Login"},plugin= {"junit:src\\test\\resources\\Reports\\login.xml"})
public class TestRunner {

}
