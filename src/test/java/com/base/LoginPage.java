package com.base;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends BaseClass {
	public LoginPage() {
		PageFactory.initElements(driver, this);
		}
	//@FindBy(id="email")
	@FindBys({@FindBy(id="email"),@FindBy(xpath="//input[@name='email']")})
	private WebElement userName;
	//@FindBy(name="pass")
	@FindBys({@FindBy(name="pass"),@FindBy(xpath="//input[@name='pass']")})
	private WebElement pwd;
	//@FindBy(xpath="//button[@name='login']")
	@FindBys({@FindBy(name="login"),@FindBy(xpath="//button[@type='submit']")})
	private WebElement login;
	public WebElement getUserName() {
		return userName;
	}
	public WebElement getPwd() {
		return pwd;
	}
	public WebElement getLogin() {
		return login;
	}
	
}
