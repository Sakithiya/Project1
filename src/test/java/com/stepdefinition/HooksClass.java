package com.stepdefinition;

import com.base.BaseClass;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class HooksClass extends BaseClass {
@Before("@Login")
public void beforeScenario() {
	getBrowser("edge");
	url("https://www.facebook.com/");
}
//@Before(order=3)
//public void beforeScenario1() {
//	getBrowser("chrome");
//	url("https://www.facebook.com/");
//}
//@Before(order=1)
//public void beforeScenario2() {
//	getBrowser("firefox");
//	url("https://www.facebook.com/");
//}

@After("@Login")
public void afterScenario() {
	quitBrowser();
}
}
