package com.wipro.qa.stepDefinitions;

import static org.junit.Assert.assertArrayEquals;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import com.wipro.qa.base.TestBase;
import com.wipro.qa.util.TestUtilDemo;
import com.wipro.qa.util.ViewApproveFullProjectPlanOBJ;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

/**
 * @authorID Rat105478
 * @authorName RameshRathod
 */

public class ViewApproveProjectPlanStep extends TestBase {

	@Then("^Verify View/Approve Project Plan header is display and click$")
	public void validate_viewApproveProjectPlanHeader_is_display_and_click() throws Throwable {
		Thread.sleep(3000);
		TestUtilDemo.clickElement(ViewApproveFullProjectPlanOBJ.viewApproveProjectLink, "");
	}

	@Then("^Verify the Preliminary Discipline task Plan and click on dropdown$")
	public void validate_preliminaryDisciplinePlanDD_is_click() throws Throwable {
		Thread.sleep(2000);
		TestUtilDemo.clickElement(ViewApproveFullProjectPlanOBJ.preliminaryDisciplinePlanDD, "");
		TestUtilDemo.clickElement(ViewApproveFullProjectPlanOBJ.preliminaryDisciplinePlanDDValue, "");
		Thread.sleep(2000);

	}

	@Then("^Verify the Day Scale in Preliminary Discipline Plan$")
	public void click_and_select_dayScale_value() throws Throwable {
		TestUtilDemo.clickElement(ViewApproveFullProjectPlanOBJ.dayScaleDD, "");
		TestUtilDemo.clickElement(ViewApproveFullProjectPlanOBJ.dayScaleDay, "");
		Thread.sleep(2000);

		TestUtilDemo.clickElement(ViewApproveFullProjectPlanOBJ.dayScaleDD, "");
		TestUtilDemo.clickElement(ViewApproveFullProjectPlanOBJ.dayScaleWeek, "");
		Thread.sleep(3000);
	}

	@Then("^validate click on Day zoom to fit option$")
	public void validate_click_on_zoomFitOption() throws Throwable {
		TestUtilDemo.clickElement(ViewApproveFullProjectPlanOBJ.zoomToFit, "");
		Thread.sleep(2000);
	}

	@Then("^Verify the pagination functionality when viewing Preliminary Discipline Plan$")
	public void validate_paginations() throws Throwable {
		TestUtilDemo.clickElement(ViewApproveFullProjectPlanOBJ.formclick, "");
		TestUtilDemo.scrollDownToElementPresent(ViewApproveFullProjectPlanOBJ.farwardPagination);
		TestUtilDemo.clickElement(ViewApproveFullProjectPlanOBJ.farwardPagination, "");
		Thread.sleep(3000);
		TestUtilDemo.clickElement(ViewApproveFullProjectPlanOBJ.formclick, "");
		TestUtilDemo.scrollDownTillBottum();
		TestUtilDemo.clickElement(ViewApproveFullProjectPlanOBJ.previousPagination, "");
		Thread.sleep(3000);
	}

	@Then("^Verify user apply the filter by clicking on the filter icon$")
	public void validate_filteration() throws Throwable {
		TestUtilDemo.clickElement(ViewApproveFullProjectPlanOBJ.filterIcon, "");
		TestUtilDemo.clickElement(ViewApproveFullProjectPlanOBJ.dateRadioButton, "");
		Thread.sleep(2000);
		TestUtilDemo.clickElement(ViewApproveFullProjectPlanOBJ.planStartRange, "");
		Thread.sleep(1000);
		TestUtilDemo.clickElement(ViewApproveFullProjectPlanOBJ.cancelButtonDate, "");
		Thread.sleep(3000);
		TestUtilDemo.clickElement(ViewApproveFullProjectPlanOBJ.dateRadioButton, "");
		TestUtilDemo.scrollDownForShort();
		TestUtilDemo.clickElement(ViewApproveFullProjectPlanOBJ.filterApplyButton, "");
		Thread.sleep(3000);

	}

	@Then("verify when user clear the filter")
	public void validate_clear_the_filter() throws Throwable {
		TestUtilDemo.clickElement(ViewApproveFullProjectPlanOBJ.formclick, "");
		TestUtilDemo.scrollUp();
		TestUtilDemo.clickElement(ViewApproveFullProjectPlanOBJ.clearFilter, "");

	}

	@Then("verify when user select the gigActivity TaskName")
	public void validate_select_TaskName() throws Throwable {
		TestUtilDemo.clickElement(ViewApproveFullProjectPlanOBJ.firstTaskName, "");
		Thread.sleep(1000);
	}

	@Then("verify when user select the gigActivity TaskName as a electrical DPS")
	public void validate_select_taskName_electrical() throws Throwable {
		((JavascriptExecutor) driver).executeScript(
				"arguments[0].scrollIntoView({behavior: 'smooth', block: 'center', inline: 'nearest'})",
				driver.findElement(ViewApproveFullProjectPlanOBJ.electricalTaskName));
		TestUtilDemo.clickElement(ViewApproveFullProjectPlanOBJ.electricalTaskName, "");
		Thread.sleep(1000);

	}

	@Then("verify when user select the gigActivity TaskName as a process DPS")
	public void validate_select_taskName_process() throws Throwable {
		((JavascriptExecutor) driver).executeScript(
				"arguments[0].scrollIntoView({behavior: 'smooth', block: 'center', inline: 'nearest'})",
				driver.findElement(ViewApproveFullProjectPlanOBJ.processTaskName));
		TestUtilDemo.clickElement(ViewApproveFullProjectPlanOBJ.processTaskName, "");
		Thread.sleep(1000);
	}

	@Then("verify when user select the gigActivity TaskName as a IandC DPS")
	public void validate_select_taskName_iandc() throws Throwable {
		((JavascriptExecutor) driver).executeScript(
				"arguments[0].scrollIntoView({behavior: 'smooth', block: 'center', inline: 'nearest'})",
				driver.findElement(ViewApproveFullProjectPlanOBJ.iandcTaskName));

		// TestUtilDemo.clickElement(ViewApproveFullProjectPlanOBJ.iandcTaskName, "");
		Thread.sleep(1000);
	}

	@Then("Verify the Project Activity details when clicking ViewEdit Full Information")
	public void validate_clicking_ViewEditFullInformation() throws Throwable {

		TestUtilDemo.clickElement(ViewApproveFullProjectPlanOBJ.inprogressIcons, "");
		TestUtilDemo.scrollDownForShort();
		TestUtilDemo.clickElement(ViewApproveFullProjectPlanOBJ.viewEditFullInformationLink, "");
		Thread.sleep(2000);
		TestUtilDemo.clickElement(ViewApproveFullProjectPlanOBJ.editFormLink, "");
		Thread.sleep(2000);
		TestUtilDemo.clickElement(ViewApproveFullProjectPlanOBJ.edit_general_budgetManhoursHrs, "");
		WebElement wb = driver.findElement(ViewApproveFullProjectPlanOBJ.edit_general_budgetManhoursHrs);
		JavascriptExecutor jse = (JavascriptExecutor) driver;
		jse.executeScript("arguments[0].value='55';", wb);

		((JavascriptExecutor) driver).executeScript(
				"arguments[0].scrollIntoView({behavior: 'smooth', block: 'center', inline: 'nearest'})",
				driver.findElement(ViewApproveFullProjectPlanOBJ.moduleNumberNameDD));

		TestUtilDemo.clickElement(ViewApproveFullProjectPlanOBJ.moduleNumberNameDD, "");
		TestUtilDemo.clickElement(ViewApproveFullProjectPlanOBJ.moduleNumberNameDDValue, "");
	}

	@Then("Verify the Project Activity details when clicking ViewEdit Full Information in Piping {string}")
	public void validate_clicking_ViewEditFullInformation(String budgetManhoursHrs) throws Throwable {
		TestUtilDemo.clickElement(ViewApproveFullProjectPlanOBJ.inprogressIcons, "");
		TestUtilDemo.scrollDownForShort();
		TestUtilDemo.clickElement(ViewApproveFullProjectPlanOBJ.viewEditFullInformationLink, "");
		Thread.sleep(2000);
		TestUtilDemo.clickElement(ViewApproveFullProjectPlanOBJ.editFormLink, "");
		Thread.sleep(1000);
		TestUtilDemo.clickElement(ViewApproveFullProjectPlanOBJ.edit_general_budgetManhoursHrs, "");
		TestUtilDemo.clearAnddoSendKeys(ViewApproveFullProjectPlanOBJ.edit_general_budgetManhoursHrs,
				budgetManhoursHrs);
		TestUtilDemo.scrollDownTillBottum();
		Thread.sleep(2000);

		TestUtilDemo.doSendKeys(ViewApproveFullProjectPlanOBJ.edit_disciplineSubjectSpecificOnModule,
				budgetManhoursHrs);
		Thread.sleep(4000);

	}

	@Then("^verify user click on the saveEdit button$")
	public void validate_clicking_on_saveEditbutton() throws Throwable {
		TestUtilDemo.clickElement(ViewApproveFullProjectPlanOBJ.saveEditsButton, "");
		Thread.sleep(2000);
	}

	@Then("^Verify when user clicks on Back label$")
	public void validate_clicking_on_Backbutton() throws Throwable {
		TestUtilDemo.clickElement(ViewApproveFullProjectPlanOBJ.backButton, "");
		Thread.sleep(2000);
	}

	@Then("Verify the functionality of Save Edits button, Cancel button and Discard Edits button")
	public void validate_clicking_discardbutton() throws Throwable {

		TestUtilDemo.clickElement(ViewApproveFullProjectPlanOBJ.backButton, "");
		Thread.sleep(2000);
		TestUtilDemo.isElementPresent(ViewApproveFullProjectPlanOBJ.cancelEditsButton, "");
		TestUtilDemo.isElementPresent(ViewApproveFullProjectPlanOBJ.saveEditsButton1, "");
		TestUtilDemo.clickElement(ViewApproveFullProjectPlanOBJ.discardEditsButton, "");

	}

	// Electrical DPs
	@Then("Verify the Project Activity details when clicking on ViewEdit Full Information Link")
	public void validate_clicking_on_ViewEditFullInformation() throws Throwable {
		TestUtilDemo.clickElement(ViewApproveFullProjectPlanOBJ.inprogressIcons, "");
		TestUtilDemo.scrollDownForShort();
		TestUtilDemo.clickElement(ViewApproveFullProjectPlanOBJ.viewEditFullInformationLink, "");
		Thread.sleep(2000);

	}

	@Then("verify user click on the complete button")
	public void validate_clicking_on_completeButton() throws Throwable {
		TestUtilDemo.clickElement(ViewApproveFullProjectPlanOBJ.completeButton, "");
		Thread.sleep(2000);

	}
	@Then("^validate click on continue button$")
	public void validate_clicking_on_continuetbutton() throws Throwable {
		TestUtilDemo.clickElement(ViewApproveFullProjectPlanOBJ.continuebtn, "");
		Thread.sleep(2000);
	}

	// Structural
	@Then("verify when user select the gigActivity TaskName as a Structural DPS")
	public void validate_select_taskName_structural() throws Throwable {

		((JavascriptExecutor) driver).executeScript(
				"arguments[0].scrollIntoView({behavior: 'smooth', block: 'center', inline: 'nearest'})",
				driver.findElement(ViewApproveFullProjectPlanOBJ.structuralTaskName));

		TestUtilDemo.clickElement(ViewApproveFullProjectPlanOBJ.structuralTaskName, "");
		Thread.sleep(1000);
	}

	@Then("Verify the Project Activity details when clicking ViewEdit Full Information in structural {string}")
	public void validate_clicking_viewEditFullInformation_structural(String budgetManhoursHrs) throws Throwable {
		TestUtilDemo.clickElement(ViewApproveFullProjectPlanOBJ.inprogressIcons, "");
		TestUtilDemo.scrollDownForShort();
		TestUtilDemo.clickElement(ViewApproveFullProjectPlanOBJ.viewEditFullInformationLink, "");
		Thread.sleep(2000);
		TestUtilDemo.clickElement(ViewApproveFullProjectPlanOBJ.editFormLink, "");
		Thread.sleep(1000);
		TestUtilDemo.clickElement(ViewApproveFullProjectPlanOBJ.edit_general_budgetManhoursHrs, "");
		TestUtilDemo.clearAnddoSendKeys(ViewApproveFullProjectPlanOBJ.edit_general_budgetManhoursHrs,
				budgetManhoursHrs);
		Thread.sleep(2000);

	}

	// Equipment
	@Then("verify when user select the gigActivity TaskName as a Equipment DPS")
	public void validate_select_taskName_equipment() throws Throwable {

		((JavascriptExecutor) driver).executeScript(
				"arguments[0].scrollIntoView({behavior: 'smooth', block: 'center', inline: 'nearest'})",
				driver.findElement(ViewApproveFullProjectPlanOBJ.equipmentTaskName));

		TestUtilDemo.clickElement(ViewApproveFullProjectPlanOBJ.equipmentTaskName, "");
		Thread.sleep(1000);
	}

}
