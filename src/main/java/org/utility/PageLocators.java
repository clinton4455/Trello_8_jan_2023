package org.utility;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PageLocators extends BaseClass {
	public PageLocators() {
		PageFactory.initElements(driver,this);
	}

	@FindBy(id="user")
	private WebElement username;
	@FindBy(id="login")
	private WebElement btn;
	@FindBy(name="password")
	private WebElement password;
	@FindBy(id="login-submit")
	private WebElement btn2;
	@FindBy(xpath="//div[@class='board-tile mod-add']")
	private WebElement newBoard;
	@FindBy(xpath="//input[@type='text']")
	private WebElement boardTitle;
	@FindBy(xpath="//button[text()='Create']")
	private WebElement create;
	@FindBy(name="name")
	private WebElement list1;
	@FindBy(xpath="//input[@type='submit']")
	private WebElement addBtn;
	@FindBy(xpath="//span[text()='Add a card']")
	private WebElement addCard;
	@FindBy(xpath="//div[@class='js-react-root']/following::textarea[@dir='auto'][2]]")
	private WebElement text;
	@FindBy(xpath="//div[@class='cc-controls u-clearfix']/child::div[1]/input']")
	private WebElement addCardBtn;
	@FindBy(name="name")
	private WebElement list2;
	@FindBy(xpath="//input[@type='submit']")
	private WebElement addBt;
	@FindBy(xpath="//span[@class='list-card-title js-card-name']")
	private WebElement src;
	@FindBy(xpath="//a[@class='open-card-composer js-open-card-composer']/following::span[5]/following::span[text()='Add a card']")
	private WebElement dse;
	public WebElement getUsername() {
		return username;
	}
	public void setUsername(WebElement username) {
		this.username = username;
	}
	public WebElement getBtn() {
		return btn;
	}
	public void setBtn(WebElement btn) {
		this.btn = btn;
	}
	public WebElement getPassword() {
		return password;
	}
	public void setPassword(WebElement password) {
		this.password = password;
	}
	public WebElement getBtn2() {
		return btn2;
	}
	public void setBtn2(WebElement btn2) {
		this.btn2 = btn2;
	}
	public WebElement getNewBoard() {
		return newBoard;
	}
	public void setNewBoard(WebElement newBoard) {
		this.newBoard = newBoard;
	}
	public WebElement getBoardTitle() {
		return boardTitle;
	}
	public void setBoardTitle(WebElement boardTitle) {
		this.boardTitle = boardTitle;
	}
	public WebElement getCreate() {
		return create;
	}
	public void setCreate(WebElement create) {
		this.create = create;
	}
	public WebElement getList1() {
		return list1;
	}
	public void setList1(WebElement list1) {
		this.list1 = list1;
	}
	public WebElement getAddBtn() {
		return addBtn;
	}
	public void setAddBtn(WebElement addBtn) {
		this.addBtn = addBtn;
	}
	public WebElement getAddCard() {
		return addCard;
	}
	public void setAddCard(WebElement addCard) {
		this.addCard = addCard;
	}
	public WebElement getText() {
		return text;
	}
	public void setText(WebElement text) {
		this.text = text;
	}
	public WebElement getAddCardBtn() {
		return addCardBtn;
	}
	public void setAddCardBtn(WebElement addCardBtn) {
		this.addCardBtn = addCardBtn;
	}
	public WebElement getList2() {
		return list2;
	}
	public void setList2(WebElement list2) {
		this.list2 = list2;
	}
	public WebElement getAddBt() {
		return addBt;
	}
	public void setAddBt(WebElement addBt) {
		this.addBt = addBt;
	}
	public WebElement getSrc() {
		return src;
	}
	public void setSrc(WebElement src) {
		this.src = src;
	}
	public WebElement getDse() {
		return dse;
	}
	public void setDse(WebElement dse) {
		this.dse = dse;
	}
	
	
	
	
	
	
	
	
	
	
	
}
