package com.stepdefinition;

import java.util.List;
import java.util.Map;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import com.base.BaseClass;
import com.base.LoginPage;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class StepDefinition extends BaseClass{
	public static LoginPage loginPage; 
	@Given("User is on facebook page")
	public void user_is_on_facebook_page() {
	//getBrowser("edge");
	//url("https://www.facebook.com/");
	System.out.println("browser launched successfully");
	}

	@When("User enters userName and pwds")
	public void user_enters_userName_and_pwds(io.cucumber.datatable.DataTable dataTable) {
	    loginPage=new LoginPage();
	    List<Map<String,String>> asMaps=dataTable.asMaps();
	    WebElement userName=loginPage.getUserName();
	    //List<String> list=asLists.get(2);
	    String userName1=asMaps.get(1).get("userName");
	    textSend(userName,userName1);
	    WebElement pwd=loginPage.getPwd();
	    String pwd1=asMaps.get(1).get("pwd");
	    textSend(pwd,pwd1);
	}
	@And("User clicks the login button")
	public void user_clicks_the_login_button() {
	WebElement login=loginPage.getLogin();
	login.click();
	}
	@Then("User login success message diplayed")
	public void user_login_success_message_diplayed() {
	System.out.println("Success message is displayed");   
	}
	@When("Users enters userName {string} and pwd {string}")
	public void users_enters_userName_and_pwd(String userName, String pwd) {
		loginPage=new LoginPage();
		WebElement userName1=loginPage.getUserName();
		textSend(userName1,userName);
		WebElement pwd1=loginPage.getPwd();
		textSend(pwd1,pwd);
	}
	@When("User enters userName and pwd")
	public void user_enters_userName_and_pwd() {
		loginPage=new LoginPage();
		WebElement userName1=loginPage.getUserName();
		textSend(userName1,"Java@gmail.com");
		WebElement pwd1=loginPage.getPwd();
		textSend(pwd1,"9429032");
	}

}
