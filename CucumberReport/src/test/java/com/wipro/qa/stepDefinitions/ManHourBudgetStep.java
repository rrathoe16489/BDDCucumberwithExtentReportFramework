package com.wipro.qa.stepDefinitions;

import org.openqa.selenium.JavascriptExecutor;

import com.wipro.qa.base.TestBase;
import com.wipro.qa.util.manHourBudgetOBJ;
import com.wipro.qa.util.Gig_WorkflowsOBJ;
import com.wipro.qa.util.StepCommonMethod;
import com.wipro.qa.util.TestUtilDemo;

import io.cucumber.java.en.Then;

/**
 * @authorID Rat105478
 * @authorName RameshRathod
 */

public class ManHourBudgetStep extends TestBase {

	@Then("validate manHourBudget is Display and click on manHourBudget Link")
	public void validate_manHourBudget_display_and_click() throws Throwable {
		StepCommonMethod.validate_top_header_is_Display_and_click("manhourBudgets",
				manHourBudgetOBJ.manHourBudgetHeader, manHourBudgetOBJ.manHourBudgetLink, "manhourBudgets Header");
	}

	@Then("validate user click on piping SubSection")
	public void validate_click_on_piping() throws Throwable {
		TestUtilDemo.clickElement(manHourBudgetOBJ.pipingManHour, "piping section");
		Thread.sleep(1000);
	}
	

	@Then("validate user click on SB Pipe Stress Activity {string}, {string},{string},{string}")
	public void validate_click_on_sbActivity_and_fill(String uSENGHours, String uSDSGNHours, String oUSENGHours,
			String oUSDSGNHours) throws Throwable {
		((JavascriptExecutor) driver).executeScript(
				"arguments[0].scrollIntoView({behavior: 'smooth', block: 'center', inline: 'nearest'})",
				driver.findElement(manHourBudgetOBJ.lbPipeStress));
		StepCommonMethod.check_fill_the_data_in_activities_field(manHourBudgetOBJ.uSENGHours21, "1111111",
				manHourBudgetOBJ.fieldValidationMessage, "validation Message", uSENGHours,
				manHourBudgetOBJ.usDsgnHours21, uSDSGNHours, manHourBudgetOBJ.ousEngHours21, oUSENGHours,
				manHourBudgetOBJ.ousDsgnHours21, oUSDSGNHours);
		Thread.sleep(1000);
		
	}

	@Then("validate user click on LB Pipe Stress Activity {string}, {string},{string},{string}")
	public void validate_click_on_lbActivity_and_fill(String uSENGHours, String uSDSGNHours, String oUSENGHours,
			String oUSDSGNHours) throws Throwable {
		((JavascriptExecutor) driver).executeScript(
				"arguments[0].scrollIntoView({behavior: 'smooth', block: 'center', inline: 'nearest'})",
				driver.findElement(manHourBudgetOBJ.sbPipeStress));
		StepCommonMethod.check_fill_the_data_in_activities_field(manHourBudgetOBJ.uSENGHours22, "1111111",
				manHourBudgetOBJ.fieldValidationMessage, "validation Message", uSENGHours,
				manHourBudgetOBJ.usDsgnHours22, uSDSGNHours, manHourBudgetOBJ.ousEngHours22, oUSENGHours,
				manHourBudgetOBJ.ousDsgnHours22, oUSDSGNHours);
		Thread.sleep(1000);
	}
	
	@Then("validate user fill the data in first activity and checking the field validation {string}, {string},{string},{string}")
	public void validate_fill_the_data_in_activity(String uSENGHours, String uSDSGNHours, String oUSENGHours,
			String oUSDSGNHours) throws Throwable {

		StepCommonMethod.check_fill_the_data_in_activities_field(manHourBudgetOBJ.uSENGHours0, "1111111",
				manHourBudgetOBJ.fieldValidationMessage, "validation Message", uSENGHours,
				manHourBudgetOBJ.usDsgnHours0, uSDSGNHours, manHourBudgetOBJ.ousEngHours0, oUSENGHours,
				manHourBudgetOBJ.ousDsgnHours0, oUSDSGNHours);
		Thread.sleep(3000);

	}

	@Then("validate user fill the data in second activity and save, complete the form {string}, {string},{string},{string}")
	public void validate_workflowRuleHeader_is_Display(String uSENGHours, String uSDSGNHours, String oUSENGHours,
			String oUSDSGNHours) throws Throwable {
		StepCommonMethod.check_fill_the_data_in_activities_field(manHourBudgetOBJ.uSENGHours1, "1111111",
				manHourBudgetOBJ.fieldValidationMessage, "validation Message", uSENGHours,
				manHourBudgetOBJ.usDsgnHours1, uSDSGNHours, manHourBudgetOBJ.ousEngHours1, oUSENGHours,
				manHourBudgetOBJ.ousDsgnHours1, oUSDSGNHours);

	}
	@Then("validate user click on electrical SubSection")
	public void validate_click_on_electrical() throws Throwable {
		TestUtilDemo.clickElement(manHourBudgetOBJ.electricalManHour, "electrical section");
		Thread.sleep(2000);
	}

	@Then("validate user click on IandC SubSection")
	public void validate_click_on_iandc() throws Throwable {
		TestUtilDemo.clickElement(manHourBudgetOBJ.electricalManHour, "electrical section");
		TestUtilDemo.scrollDownForShort();
		TestUtilDemo.clickElement(manHourBudgetOBJ.iandCManHour, "iandCManHour section");
		Thread.sleep(2000);
	}

	@Then("validate user click on Structural SubSection")
	public void validate_click_on_structural() throws Throwable {
		TestUtilDemo.clickElement(manHourBudgetOBJ.iandCManHour, "iandCManHour section");
		TestUtilDemo.scrollDownForShort();
		TestUtilDemo.clickElement(manHourBudgetOBJ.StructuralManHour, "StructuralManHour section");
		Thread.sleep(2000);
	}

	@Then("validate user click on Process SubSection")
	public void validate_click_on_process() throws Throwable {
		TestUtilDemo.clickElement(manHourBudgetOBJ.StructuralManHour, "StructuralManHour section");
		TestUtilDemo.scrollDownForShort();
		TestUtilDemo.clickElement(manHourBudgetOBJ.ProcessManHour, "ProcessManHour section");
		Thread.sleep(2000);
	}

	@Then("validate user click on Equipment SubSection")
	public void validate_click_on_equipment() throws Throwable {
		TestUtilDemo.clickElement(manHourBudgetOBJ.ProcessManHour, "ProcessManHour section");
		TestUtilDemo.scrollDownForShort();
		TestUtilDemo.clickElement(manHourBudgetOBJ.EquipmentManHour, "EquipmentManHour section");
		Thread.sleep(2000);
	}

	@Then("validate manHourBudget header is completed with cheked mark")
	public void validate_topHeader_check_is_display_manHourBudget() {
		TestUtilDemo.isElementPresent(manHourBudgetOBJ.completeHeaderManHour, "complete Header icon");

	}
}
