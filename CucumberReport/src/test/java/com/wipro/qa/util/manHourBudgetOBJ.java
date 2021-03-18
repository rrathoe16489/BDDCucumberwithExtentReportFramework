package com.wipro.qa.util;

import org.openqa.selenium.By;
import com.wipro.qa.base.TestBase;

/**
 * @authorID Rat105478
 * @authorName RameshRathod
 */

public class manHourBudgetOBJ extends TestBase {

	public static By manHourBudgetLink = By.xpath("//a[@href='/projectSetup/manhourBudgets']");
	public static By manHourBudgetHeader = By.xpath("//div[text()='Manhour Budgets']");
	
	//Piping
	public static By pipingManHour = By.xpath("//p[text()='Piping']");
	
	  public static By lbPipeStress = By.xpath("//td[text()='LB Pipe Stress']");
	  public static By sbPipeStress = By.xpath("//td[text()='SB Pipe stress']");
	 
	
	public static By pipingCheckedMark = By.xpath("//p[text()='Piping']//parent::li//span[@class='sideMenuIcon']");
	public static By pipingUnCheckedMark = By.xpath("//p[text()='Piping']//parent::li//span[@class='sideMenuIcon circle-white']");
	
	//LB Pipe Stress
	public static By uSENGHours21 = By.name("manhrsTable[21].usEngHours");
	public static By usDsgnHours21 = By.name("manhrsTable[21].usDsgnHours");
	public static By ousEngHours21 = By.name("manhrsTable[21].ousEngHours");
	public static By ousDsgnHours21 = By.name("manhrsTable[21].ousDsgnHours");
	public static By fieldValidationMessage = By.xpath("//span[text()='Value length should be less than 6']");
	public static By totalENGHours = By.xpath("//input[@value='222']");
	public static By totalDSGNHours = By.name("manhrsTable[21].totalDSGNHours");
	
	
	//SB Pipe stress
	public static By uSENGHours22 = By.name("manhrsTable[22].usEngHours");
	public static By usDsgnHours22 = By.name("manhrsTable[22].usDsgnHours");
	public static By ousEngHours22 = By.name("manhrsTable[22].ousEngHours");
	public static By ousDsgnHours22 = By.name("manhrsTable[22].ousDsgnHours");
	public static By totalENGHours22 = By.name("manhrsTable[22].totalENGHours");
	public static By totalDSGNHours22 = By.name("manhrsTable[22].totalDSGNHours");
	
	//LB Pipe Stress
		public static By uSENGHours0 = By.name("manhrsTable[0].usEngHours");
		public static By usDsgnHours0 = By.name("manhrsTable[0].usDsgnHours");
		public static By ousEngHours0 = By.name("manhrsTable[0].ousEngHours");
		public static By ousDsgnHours0 = By.name("manhrsTable[0].ousDsgnHours");
		
		
		//SB Pipe stress
		public static By uSENGHours1 = By.name("manhrsTable[1].usEngHours");
		public static By usDsgnHours1 = By.name("manhrsTable[1].usDsgnHours");
		public static By ousEngHours1 = By.name("manhrsTable[1].ousEngHours");
		public static By ousDsgnHours1 = By.name("manhrsTable[1].ousDsgnHours");
		public static By totalENGHours1 = By.name("manhrsTable[1].totalENGHours");
		public static By totalDSGNHours1 = By.name("manhrsTable[1].totalDSGNHours");
		
	//Electrical
	public static By electricalManHour = By.xpath("//p[text()='Electrical']");
	public static By electricalCheckedMark = By.xpath("//p[text()='Electrical']//parent::li//span[@class='sideMenuIcon']");
	public static By electricalUnCheckedMark = By.xpath("//p[text()='Electrical']//parent::li//span[@class='sideMenuIcon circle-white']");
	
	public static By iandCManHour = By.xpath("//p[text()='I&C']");
	public static By iandCCheckedMark = By.xpath("//p[text()='I&C']//parent::li//span[@class='sideMenuIcon']");
	public static By StructuralManHour = By.xpath("//p[text()='Structural']");
	public static By StructuralCheckedMark = By.xpath("//p[text()='Structural']//parent::li//span[@class='sideMenuIcon']");
	public static By ProcessManHour = By.xpath("//p[text()='Process']");
	public static By ProcessCheckedMark = By.xpath("//p[text()='Process']//parent::li//span[@class='sideMenuIcon']");
	public static By EquipmentManHour = By.xpath("//p[text()='Equipment']");
	public static By EquipmentCheckedMark = By.xpath("//p[text()='Equipment']//parent::li//span[@class='sideMenuIcon']");
	
	
	public static By RESET_BUTTON = By.xpath("//button[text()='Save']//parent::div//button[text()='Reset']");
	public static By SAVE_BUTTON = By.xpath("//button[text()='Reset']//parent::div//button[text()='Save']");
	public static By COMPLETE_BUTTON = By.xpath("//button[text()='Reset']//parent::div//button[text()='Complete']");
	public static By EDIT_BUTTON = By.xpath("//button[text()='Edit']");
	public static By completeHeaderManHour = By.xpath("//div[text()='WBS Information']//parent::a//img[@src='/static/media/completed.0bc5e4c8.svg']");
	
}
