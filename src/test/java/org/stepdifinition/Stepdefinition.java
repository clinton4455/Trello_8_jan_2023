package org.stepdifinition;

import org.utility.BaseClass;
import org.utility.PageLocators;

import io.cucumber.java.en.*;

public class Stepdefinition extends BaseClass{
	public PageLocators p=new PageLocators();
	
	

	@Given("Login into the trello and create board")
	public void login_into_the_trello_and_create_board() {
		
		browserLanch("chrome");
		urlLanch("https://trello.com/en/login");
		timeImplycity(10);
		sendKeys(p.getUsername(), "jeromeclinton650@gmail.com");
		click(p.getBtn());
		timeImplycity(10);
		sendKeys(p.getPassword(), "MECH4046tester");
		click(p.getBtn2());
		timeImplycity(10);
		
	}

	@When("Create a list and name it as List A and  List B")
	public void create_a_list_and_name_it_as_List_A_and_List_B() {
		click(p.getNewBoard());
		sendKeys(p.getBoardTitle(), "Login module");
		click(p.getCreate());
		timeImplycity(10);
		sendKeys(p.getList1(), "List A");
		click(p.getAddBtn());
		click(p.getAddCard());
		sendKeys(p.getText(), "Bug found");
		click(p.getAddCardBtn());

	}

	@When("Add a card in list A and using drag and drop in List B")
	public void add_a_card_in_list_A_and_using_drag_and_drop_in_List_B() {

		sendKeys(p.getList2(), "List B");
		click(p.getAddBt());
		dragAndDrop(p.getSrc(), p.getDse());
		
	}

	@Then("Logout")
	public void logout() {
		 System.out.println(p.getSrc().getLocation().toString()+" "+p.getDse().getLocation().toString());
		quit();
	}


		
		
		
		
	

	
}
