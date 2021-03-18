package com.wipro.qa.stepDefinitions;

import com.wipro.qa.base.TestBase;
import com.wipro.qa.util.WBSInformationOBJ;
import com.wipro.qa.util.ProjectInfoOBJ;
import com.wipro.qa.util.StepCommonMethod;
import com.wipro.qa.util.TestUtilDemo;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

/**
 * @authorID Rat105478
 * @authorName RameshRathod
 */

public class WBSInformationStep extends TestBase {

	@Then("validate WBSInformationHeader is Display and click on header")
	public void validate_wbs_information_header_is_display() throws Throwable {
		StepCommonMethod.validate_top_header_is_Display_and_click("wbsInformation",
				WBSInformationOBJ.WBSInformationHeader, WBSInformationOBJ.WBSInformationHeaderLink, "WBSInformation");
	}

	@Then("validate CWAList section text is Display")
	public void validate_cwa_list_section_text_is_display() {
		TestUtilDemo.isElementPresent(WBSInformationOBJ.CWAListSection, "CWAListSection Text");
	}

	@Then("validate ModuleList section text is Display")
	public void validate_module_list_section_text_is_display() {
		TestUtilDemo.isElementPresent(WBSInformationOBJ.moduleListSection, "moduleListSection Text");
	}

	@Then("validate PurchaseSpecificationList Section text is Display")
	public void validate_purchase_specification_list_section_text_is_display() {
		TestUtilDemo.isElementPresent(WBSInformationOBJ.purchaseListSection, "purchaseListSection Text");
	}

	@Then("validate MechanicalEquipmentList Section text is Display")
	public void validate_mechanical_equipment_list_section_text_is_display() {
		TestUtilDemo.isElementPresent(WBSInformationOBJ.mechanicalListSection, "mechanicalListSection Text");
	}

	@When("^user click on CWAList SubSection$")
	public void user_click_on_cwa_list_sub_section() {

		TestUtilDemo.clickElement(WBSInformationOBJ.CWAListSection, "CWAListSection Link");

	}

	@Then("validate CWAList HeaderTitle is Display")
	public void validate_cwa_list_header_title_is_display() {
		TestUtilDemo.isElementPresent(WBSInformationOBJ.CWAListTopText, "CWAListTopText");
	}

	@Then("validate ExportList Template is Display")
	public void validate_cwa_export_list_template_is_display() {
		TestUtilDemo.isElementPresent(WBSInformationOBJ.exportListTemplate, "exportListTemplate");
	}

	@Then("validate importButton is Display")
	public void validate_import_button_is_display() {
		TestUtilDemo.isElementPresent(WBSInformationOBJ.importButton, "importButton link");
	}

	@Then("validate searchIcon is Display")
	public void validate_search_icon_is_display() {
		TestUtilDemo.isElementPresent(WBSInformationOBJ.searchIcon, "searchIcon ");
	}

	@Then("validate CWA number column is display")
	public void validate_cwa_number_column_is_display() {
		TestUtilDemo.isElementPresent(WBSInformationOBJ.CWANumberColumn, "CWANumber Column Text");
	}

	@Then("validate CWA name column is display")
	public void validate_cwa_name_column_is_display() {
		TestUtilDemo.isElementPresent(WBSInformationOBJ.CWANameColumn, "CWAName Column  Text");
	}

	@Then("validate addRow Icon is Display at bottom")
	public void validate_add_row_icon_is_display_at_bottom() {
		TestUtilDemo.isElementPresent(WBSInformationOBJ.addRowButton, "addRowButton");
	}

	@Then("Validate user click on CWAList SubSection")
	public void Validate_user_click_on_CWAList_SubSection() {
		TestUtilDemo.clickElement(WBSInformationOBJ.CWAListSection, "CWAListSection  Link");
	}

	@Then("validate user click on add row button and user enter the CWA Number and CWA Name {string},{string}")
	public void validate_user_enter_the_cwa_number_and_cwa_name(String CWANumberTextBox, String CWANameTextBox) throws Throwable {

		TestUtilDemo.clickElement(WBSInformationOBJ.addRowButton, "addRowButton  Link");
		Thread.sleep(2000);
		TestUtilDemo.doSendKeys(WBSInformationOBJ.CWANumberTextBox, CWANumberTextBox);
		Thread.sleep(1000);
		TestUtilDemo.doSendKeys(WBSInformationOBJ.CWANameTextBox, CWANameTextBox);
		Thread.sleep(1000);
	}

	@Then("Validate save button is enabled")
	public void validate_save_button_is_enabled() throws Throwable {
		TestUtilDemo.isEnabled(WBSInformationOBJ.SAVE_BUTTON, "save button");
		Thread.sleep(2000);
	}

	@Then("Validate user click on the save button")
	public void validate_user_click_on_the_save_button() throws Throwable {
		TestUtilDemo.clickElement(WBSInformationOBJ.SAVE_BUTTON, "save button click");
		Thread.sleep(2000);
	}

	@Then("validate user delete the newly added row")
	public void deleting_the_row() throws Throwable {
		TestUtilDemo.clickElement(WBSInformationOBJ.deleteIconSecondRow, "Delete second icon");
		Thread.sleep(2000);
	}

	@Then("validate save button is disabled")
	public void validate_save_button_is_disabled() {
		System.out.println("soonnnnnnnn");
	}

	@Then("validate complete button is enabled")
	public void validate_complete_button_is_enabled() throws Throwable {
		TestUtilDemo.isEnabled(WBSInformationOBJ.COMPLETE_BUTTON, "Complete button");
		Thread.sleep(2000);
	}

	@Then("validate user click on complete button")
	public void validate_user_click_on_complete_button() throws Throwable {
		TestUtilDemo.clickElement(WBSInformationOBJ.COMPLETE_BUTTON, "COMPLETE_BUTTON  click ");
		Thread.sleep(5000);

	}

	@Then("validate when user click on the complete button, edit button is display instead of reset, save and complete button")
	public void validate_edit_button_is_display() throws Throwable {
		TestUtilDemo.isElementPresent(WBSInformationOBJ.EDIT_BUTTON, "EDIT_BUTTON  click ");
		Thread.sleep(5000);

	}

	/******************************
	 * Below code for the Module List Section
	 *******************************/

	@When("user click on ModuleList SubSection")
	public void user_click_on_ModuleList_sub_section() throws Throwable {
		TestUtilDemo.clickElement(WBSInformationOBJ.moduleListSection, "ModuleListSection Link");
		Thread.sleep(1000);

	}

	@Then("validate ModuleList HeaderTitle is Display")
	public void validate_ModuleList_header_title_is_display() {
		TestUtilDemo.isElementPresent(WBSInformationOBJ.moduleListTopText, "ModuleListTopText");
	}

	@Then("validate Module number column is display")
	public void validate_Module_number_column_is_display() {
		TestUtilDemo.isElementPresent(WBSInformationOBJ.moduleNumberColumn, "moduleNumberColumn Text");
	}

	@Then("validate module name column is display")
	public void validate_module_name_column_is_display() {
		TestUtilDemo.isElementPresent(WBSInformationOBJ.moduleNameColumn, "moduleNameColumn  Text");
	}

	@Then("validate CWA Numbersname column is display")
	public void validate_cwa_numbers_name_column_is_display() {
		TestUtilDemo.isElementPresent(WBSInformationOBJ.CWANumberNameColumn, "CWANumberNameColumn   Text");
	}

	@Then("Validate user click on ModuleList SubSection")
	public void Validate_user_click_on_ModuleList_SubSection() {
		TestUtilDemo.clickElement(WBSInformationOBJ.moduleListSection, "CWAListSection  Link");
	}

	@Then("validate user click on add row button and user enter the Modulenumber and modulename and CWA Numbername {string},{string}")
	public void Validate_user_enter_the_Modulenumber_and_modulename_and_CWANumbername(String moduleNumberColumnTextBox,
			String moduleNameColumnTextBox)
			throws Throwable {
		TestUtilDemo.clickElement(WBSInformationOBJ.addRowButton, "addRowButton  Link");
		Thread.sleep(2000);
		TestUtilDemo.doSendKeys(WBSInformationOBJ.moduleNumberColumnTextBox, moduleNumberColumnTextBox);
		Thread.sleep(1000);
		TestUtilDemo.doSendKeys(WBSInformationOBJ.moduleNameColumnTextBox, moduleNameColumnTextBox);
		Thread.sleep(1000);
		TestUtilDemo.dropDownSelectByIndex(WBSInformationOBJ.cwaNumberNameDropDown, 1, moduleNameColumnTextBox);
		Thread.sleep(1000);
		}

	

	/*************************
	 * Below code for the PurchaseSpecificationList Section
	 *********************************/

	@When("user click on PurchaseSpecificationList SubSection")
	public void user_click_on_PurchaseSpecificationList_sub_section() throws Throwable {
		TestUtilDemo.clickElement(WBSInformationOBJ.moduleListSection, "ModuleListSection Link");
		TestUtilDemo.scrollDownForShort();
		TestUtilDemo.clickElement(WBSInformationOBJ.purchaseListSection, "PurchaseSpecificationListSection Link");
		Thread.sleep(1000);

	}

	@Then("validate PurchaseSpecificationList HeaderTitle is Display")
	public void validate_PurchaseSpecificationList_header_title_is_display() {
		TestUtilDemo.isElementPresent(WBSInformationOBJ.purchaseSpecificationTopText,
				"PurchaseSpecificationListTopText");
	}

	@Then("validate PurchaseSpecificationNumber column is display")
	public void validate_PurchaseSpecificationNumber_column_is_display() {
		TestUtilDemo.isElementPresent(WBSInformationOBJ.purchaseSpecificationNumberColumn,
				"PurchaseSpecificationNumber DropDown");
	}

	@Then("validate PurchaseSpecificationName column is display")
	public void validate_PurchaseSpecificationName_column_is_display() {
		TestUtilDemo.isElementPresent(WBSInformationOBJ.purchaseSpecificationNameColumn,
				"purchaseSpecificationNameColumn  Text");
	}

	@Then("validate Discipline column is display")
	public void validate_Discipline_column_is_display() {
		TestUtilDemo.isElementPresent(WBSInformationOBJ.disciplineColumn, "disciplineColumn Text");
	}

	@Then("Validate user click on PurchaseSpecificationList SubSection")
	public void Validate_user_click_on_PurchaseSpecificationList_SubSection() {
		TestUtilDemo.clickElement(WBSInformationOBJ.purchaseListSection, "CWAListSection  Link");
	}

	@Then("validate user click on addRow button and user enter the value in PurchaseSpecificationNumber and PurchaseSpecificationName and Discipline column")
	public void Validate_user_enter_the_value_in_PurchaseSpecificationNumber_and_PurchaseSpecificationName_and_Discipline()
			throws Throwable {

		TestUtilDemo.clickElement(WBSInformationOBJ.addRowButton, "addRowButton  Link");
		Thread.sleep(2000);
		TestUtilDemo.dropDownSelect(WBSInformationOBJ.purchaseSpecificationNumberColumnDropDown, "61",
				"purchaseSpecificationNumberColumnDropDown ");
		Thread.sleep(2000);

		TestUtilDemo.clickElement(WBSInformationOBJ.rowClick, "rowClick");
		Thread.sleep(2000);
		TestUtilDemo.doSendKeys(WBSInformationOBJ.disciplineColumnTextBox, "l");
		Thread.sleep(3000);

		}

	@Then("Validate user click on ProcessArea List SubSection")
	public void validate_user_click_on_processArea_list() throws Throwable {
		TestUtilDemo.clickElement(WBSInformationOBJ.purchaseListSection, "PurchaseSpecificationListSection Link");
		TestUtilDemo.scrollDownForShort();
		TestUtilDemo.clickElement(WBSInformationOBJ.processAreaList, "section clicked");
		Thread.sleep(1000);
	}

	@Then("validate user click on addRow button and user enter the value in Process Area ID and Process Area Name {string},{string}")
	public void validate_user_add_new_row(String processAreaID, String processAreaName) throws Throwable {
		TestUtilDemo.clickElement(WBSInformationOBJ.addRowButton, "button clicked");
		Thread.sleep(1000);
		TestUtilDemo.doSendKeys(WBSInformationOBJ.processAreaId, processAreaID);
		TestUtilDemo.doSendKeys(WBSInformationOBJ.processAreaName, processAreaName);
	}

	@Then("validate a check next to the ProcessArea List Section label will display in left panel")
	public void validate_check_is_display() {
		TestUtilDemo.isElementPresent(WBSInformationOBJ.ProcessAreaListCheckedMark, "checkedMark");
	}

	@Then("validate Top header is completed with cheked mark")
	public void validate_topHeader_check_is_display() {
		TestUtilDemo.isElementPresent(WBSInformationOBJ.completeWBSHeader, "complete Header icon");

	}

	/****************** Below code for Piping DPS Role **********************/

	
	@When("validate WBSInformationHeader is Display and click on header as a Piping DPS")
	public void click_on_WBSInformationHeader_Link() throws Throwable {
		StepCommonMethod.validate_top_header_is_Display_and_click("wbsInformation",
				WBSInformationOBJ.WBSInformationHeader, WBSInformationOBJ.WBSInformationHeaderLink, "WBSInformation");
	}

	@When("validate As a DPS assigned to Piping discipline I will see sections:  Pipe Specification List, Tie-in Priority List")
	public void validate_PipeSpecificationList_and_TieinPriorityList_display() {
		TestUtilDemo.isElementPresent(WBSInformationOBJ.PipeSpecificationList, "PipeSpecificationList Section");
		TestUtilDemo.isElementPresent(WBSInformationOBJ.TieinPriorityList, "TieinPriorityList Section");
	}

	@Then("validate viewing data that needs to be updated, I can click on Pipe Specification List, Tie-in Priority List to addOrupdate the data and changes have been made on the screen the Save button enable. {string},{string},{string},{string},{string},{string},{string},{string}")
	public void validate_DataAdding_for_PipeSpecificationList_and_TieinPriorityList(String pipeSpecificationNumber,
			String pipeSpecificationMaterial, String pipeSpecificationClass, String tieInPriority,
			String pipeSpecificationNumber1, String pipeSpecificationMaterial1, String pipeSpecificationClass1,
			String tieInPriority1) throws Throwable {
		TestUtilDemo.clickElement(WBSInformationOBJ.PipeSpecificationList, "PipeSpecificationList Section");
		TestUtilDemo.clickElement(WBSInformationOBJ.addRowButton, "addRowButton");
		TestUtilDemo.doSendKeys(WBSInformationOBJ.pipeSpecificationNumber, pipeSpecificationNumber);
		TestUtilDemo.doSendKeys(WBSInformationOBJ.pipeSpecificationMaterial, pipeSpecificationMaterial);
		TestUtilDemo.doSendKeys(WBSInformationOBJ.pipeSpecificationClass, pipeSpecificationClass);
		TestUtilDemo.isEnabled(WBSInformationOBJ.SAVE_BUTTON, "SAVE_BUTTON");
		TestUtilDemo.clickElement(WBSInformationOBJ.SAVE_BUTTON, "SAVE_BUTTON");
		Thread.sleep(2000);
		
		TestUtilDemo.clickElement(WBSInformationOBJ.addRowButton, "addRowButton");
		TestUtilDemo.doSendKeys(WBSInformationOBJ.pipeSpecificationNumber1, pipeSpecificationNumber1);
		TestUtilDemo.doSendKeys(WBSInformationOBJ.pipeSpecificationMaterial1, pipeSpecificationMaterial1);
		TestUtilDemo.doSendKeys(WBSInformationOBJ.pipeSpecificationClass1, pipeSpecificationClass1);
		TestUtilDemo.isEnabled(WBSInformationOBJ.SAVE_BUTTON, "SAVE_BUTTON");
		TestUtilDemo.clickElement(WBSInformationOBJ.SAVE_BUTTON, "SAVE_BUTTON");
		Thread.sleep(2000);

		TestUtilDemo.clickElement(WBSInformationOBJ.TieinPriorityList, "TieinPriorityList Section");
		TestUtilDemo.clickElement(WBSInformationOBJ.addRowButton, "addRowButton");
		TestUtilDemo.doSendKeys(WBSInformationOBJ.tieInPriority, tieInPriority);
		TestUtilDemo.isEnabled(WBSInformationOBJ.SAVE_BUTTON, "SAVE_BUTTON");
		TestUtilDemo.clickElement(WBSInformationOBJ.SAVE_BUTTON, "SAVE_BUTTON");
		Thread.sleep(2000);
		
		TestUtilDemo.clickElement(WBSInformationOBJ.addRowButton, "addRowButton");
		TestUtilDemo.doSendKeys(WBSInformationOBJ.tieInPriority1, tieInPriority1);
		TestUtilDemo.isEnabled(WBSInformationOBJ.SAVE_BUTTON, "SAVE_BUTTON");
		TestUtilDemo.clickElement(WBSInformationOBJ.SAVE_BUTTON, "SAVE_BUTTON");
		Thread.sleep(2000);
	}

	@Then("validate user delete the newly added row in both section")
	public void deleting_the_newly_added_row() throws Throwable {
		TestUtilDemo.clickElement(WBSInformationOBJ.PipeSpecificationList, "PipeSpecificationList Section");
		TestUtilDemo.clickElement(WBSInformationOBJ.deleteIconSecondRowM, "deleting second row");
		Thread.sleep(2000);
		TestUtilDemo.clickElement(WBSInformationOBJ.SAVE_BUTTON, "SAVE_BUTTON");
		Thread.sleep(2000);
		TestUtilDemo.clickElement(WBSInformationOBJ.TieinPriorityList, "TieinPriorityList Section");
		Thread.sleep(1000);
		TestUtilDemo.clickElement(WBSInformationOBJ.deleteIconSecondRowT, "deleting second row");
		Thread.sleep(2000);
		TestUtilDemo.clickElement(WBSInformationOBJ.SAVE_BUTTON, "SAVE_BUTTON");
		Thread.sleep(2000);
	}

	@Then("validate saving the changed data I will see the updated data and the Save button will be disabled and complete button Enabled")
	public void validate_complete_button_is_enable() {
		TestUtilDemo.clickElement(WBSInformationOBJ.PipeSpecificationList, "PipeSpecificationList Section");
		TestUtilDemo.isEnabled(WBSInformationOBJ.COMPLETE_BUTTON, "COMPLETE_BUTTON");
		TestUtilDemo.clickElement(WBSInformationOBJ.TieinPriorityList, "TieinPriorityList Section");
		TestUtilDemo.isEnabled(WBSInformationOBJ.COMPLETE_BUTTON, "COMPLETE_BUTTON");
	}

	@When("validate once complete button clicked then Reset, Save and Complete buttons will be replaced with an Edit button and validate Section is completed, a check next to the Section label will display in left panel side")
	public void validate_complete_button_clicked_and_edit_button_display() throws Throwable {
		TestUtilDemo.clickElement(WBSInformationOBJ.PipeSpecificationList, "PipeSpecificationList Section");
		Thread.sleep(1000);
		TestUtilDemo.clickElement(WBSInformationOBJ.COMPLETE_BUTTON, "COMPLETE_BUTTON");
		Thread.sleep(2000);
		TestUtilDemo.isElementPresent(WBSInformationOBJ.PipeSpecificationListCheckedMark,
				"PipeSpecificationListCheckedMark");
		TestUtilDemo.clickElement(WBSInformationOBJ.TieinPriorityList, "TieinPriorityList Section");
		Thread.sleep(1000);
		TestUtilDemo.clickElement(WBSInformationOBJ.COMPLETE_BUTTON, "COMPLETE_BUTTON");
		Thread.sleep(2000);

	}

	/************
	 * Structural Discipline
	 * 
	 * @throws Throwable
	 **************/

	@Then("validate viewing data that needs to be updated, I can click on Foundation List to addOrupdate the data and changes have been made on the screen the Save button enable {string},{string}")
	public void validate_DataAdding_for_FoundationList(String foundationTag, String foundationName)
			throws Throwable {
		TestUtilDemo.clickElement(WBSInformationOBJ.FoundationList, "FoundationList Section");
		TestUtilDemo.clickElement(WBSInformationOBJ.addRowButton, "addRowButton");
		TestUtilDemo.doSendKeys(WBSInformationOBJ.foundationTag, foundationTag);
		TestUtilDemo.doSendKeys(WBSInformationOBJ.foundationName, foundationName);
		TestUtilDemo.dropDownSelectByIndex(WBSInformationOBJ.foundationType, 1, "foundationType");
		TestUtilDemo.dropDownSelectByIndex(WBSInformationOBJ.cwaNumberNameDropDown1, 1, "cwaNumberNameDropDown1");

		Thread.sleep(1000);
	}

	@Then("validate viewing data that needs to be updated, I can click on Structural List to addOrupdate the data and changes have been made on the screen the Save button enable {string},{string}")
	public void validate_DataAdding_for_StructureList(String structureTag, String structureName) throws Throwable {
		TestUtilDemo.clickElement(WBSInformationOBJ.FoundationList, "FoundationList Section");
		TestUtilDemo.scrollDownForShort();
		Thread.sleep(1000);
		TestUtilDemo.clickElement(WBSInformationOBJ.StructureList, "StructureList Section");
		Thread.sleep(2000);
		TestUtilDemo.clickElement(WBSInformationOBJ.addRowButton, "addRowButton");
		Thread.sleep(1000);
		TestUtilDemo.doSendKeys(WBSInformationOBJ.structureTag, structureTag);
		TestUtilDemo.doSendKeys(WBSInformationOBJ.structureName, structureName);
		TestUtilDemo.dropDownSelectByIndex(WBSInformationOBJ.structureType, 1, "structureType");
		TestUtilDemo.dropDownSelectByIndex(WBSInformationOBJ.cwaNumberNameDropDown2, 1, "cwaNumberNameDropDown2");

		Thread.sleep(1000);
	}

	@When("validate a check next to the Foundation List Section label will display in left panel")
	public void validate_checkedMark_nextTo_foundationList_section_is_display() throws Throwable {

		TestUtilDemo.isElementPresent(WBSInformationOBJ.FoundationListCheckedMark, "FoundationListCheckedMark");

	}

	@When("validate a check next to the Structural List Section label will display in left panel")
	public void validate_checkedMark_nextTo_structuralList_section_is_display() throws Throwable {
		TestUtilDemo.isElementPresent(WBSInformationOBJ.StructureListCheckedMark, "StructureListCheckedMark");

	}

//Process DPS
	@Then("validate viewing data that needs to be updated, I can click on Philosophy Document List and clicking on addOrupdate button to add the data and changes have been made on the screen the Save button enable {string},{string}")
	public void validate_user_add_information_in_philosophy_section(String philosophyDocumentNumber,
			String philosophyDocumentName) throws Throwable {
		TestUtilDemo.clickElement(WBSInformationOBJ.philosophyDocumentList, "philosophyDocumentList Section");
		Thread.sleep(2000);
		TestUtilDemo.clickElement(WBSInformationOBJ.addRowButton, "addRowButton");
		Thread.sleep(1000);
		TestUtilDemo.doSendKeys(WBSInformationOBJ.philosophyDocumentNumber, philosophyDocumentNumber);
		TestUtilDemo.doSendKeys(WBSInformationOBJ.philosophyDocumentName, philosophyDocumentName);
		Thread.sleep(1000);
	}

	@When("validate once complete button clicked then Reset, Save and Complete buttons will be replaced with an Edit button and validate Section is completed")
	public void validate_edit_button_display() throws Throwable {
		TestUtilDemo.isElementPresent(WBSInformationOBJ.EDIT_BUTTON, "");

	}

	@When("validate a check next to the Philosophy Document List Section label will display in left panel")
	public void validate_checkMark_next_to_philosophy_section_isDisplay() throws Throwable {

		TestUtilDemo.isElementPresent(WBSInformationOBJ.PhilosophyDocumentListCheckedMark, "");
	}

	@Then("validate viewing data that needs to be updated, I can click on Study List and clicking on addOrupdate button to add the data and changes have been made on the screen the Save button enable {string},{string}")
	public void validate_user_add_information_in_studyList_section(String studyNumber, String studyName)
			throws Throwable {
		TestUtilDemo.clickElement(WBSInformationOBJ.studyList, "StudyList Section");
		Thread.sleep(2000);
		TestUtilDemo.clickElement(WBSInformationOBJ.addRowButton, "addRowButton");
		Thread.sleep(1000);
		TestUtilDemo.doSendKeys(WBSInformationOBJ.studyNumber, studyNumber);
		TestUtilDemo.doSendKeys(WBSInformationOBJ.studyName, studyName);
		Thread.sleep(1000);
	}

	@When("validate a check next to the Study List Section label will display in left panel")
	public void validate_checkMark_next_to_studyList_section_isDisplay() throws Throwable {

		TestUtilDemo.isElementPresent(WBSInformationOBJ.StudyListCheckedMark, "");
	}

	@Then("validate viewing data that needs to be updated, I can click on SystemFluid List and clicking on addOrupdate button to add the data and changes have been made on the screen the Save button enable {string}")
	public void validate_user_add_information_in_systemFluidList_section(String studyNumber) throws Throwable {
		TestUtilDemo.clickElement(WBSInformationOBJ.studyList, "StudyList Section");
		TestUtilDemo.scrollDownForShort();
		TestUtilDemo.clickElement(WBSInformationOBJ.SystemFluidList, "SystemFluidList Section");
		Thread.sleep(2000);
		TestUtilDemo.clickElement(WBSInformationOBJ.addRowButton, "addRowButton");
		Thread.sleep(1000);
		TestUtilDemo.doSendKeys(WBSInformationOBJ.fluidName, studyNumber);
		Thread.sleep(1000);
	}

	@Then("validate a check next to the SystemFluid List Section label will display in left panel")
	public void validate_checkMark_next_to_systemFluidList_section_isDisplay() throws Throwable {

		TestUtilDemo.isElementPresent(WBSInformationOBJ.SystemFluidListCheckedMark, "");
	}

	@Then("The last section within the last header area with dependencies is being marked Complete, and it IS the LAST section of the LAST of two header areas to be marked complete, a popup will be displayed identifying the process that will be initiated if they continue")
	public void validate_confirmation_modal_is_display() throws Throwable {

		TestUtilDemo.clickElement(WBSInformationOBJ.continueButton, "button clicked");
		Thread.sleep(3000);
	}

//Equipment
	@Then("validate viewing data that needs to be updated, I can click on Mechenical Equipment List and clicking on addOrupdate button to add the data and changes have been made on the screen the Save button enable {string},{string}")
	public void validate_cliking_on_addButton(String equipmentTag, String equipmentName) throws Throwable {
		TestUtilDemo.clickElement(WBSInformationOBJ.mechanicalListSection, "section clicked");
		Thread.sleep(2000);
		TestUtilDemo.clickElement(WBSInformationOBJ.addRowButton, "button clicked");
		TestUtilDemo.doSendKeys(WBSInformationOBJ.EquipmentTagColumnTextBox, equipmentTag);
		TestUtilDemo.doSendKeys(WBSInformationOBJ.EquipmentNameColumnTextBox, equipmentName);
		TestUtilDemo.dropDownSelectByIndex(WBSInformationOBJ.equipmentTypedropDown, 1, "equipmentType value");
		TestUtilDemo.dropDownSelectByIndex(WBSInformationOBJ.purchaseSpecificationNumberNamedropDown, 1,
				"purchaseSpecificationNumberName value");
		TestUtilDemo.dropDownSelectByIndex(WBSInformationOBJ.processAreaIdNamedropDown, 1, "processAreaIdName value");
		TestUtilDemo.dropDownSelectByIndex(WBSInformationOBJ.cwaNumberNameDropDown, 1, "cwaNumberName value");

	}

	@Then("validate a check next to the Mechenical Equipment List Section label will display in left panel")
	public void validate_checkMarkNextTo_section() throws Throwable {
		TestUtilDemo.isElementPresent(WBSInformationOBJ.mechanicalListSection, "checked icon");
	}
	
	//IandC DPS
	@Then("validate viewing data that needs to be updated, I can click on Instrument Type List to select the data and changes have been made on the screen")
	public void validate_DataAdding_for_instrumentTypeList() throws Throwable {
		TestUtilDemo.clickElement(WBSInformationOBJ.instrumentTypeListSection, "instrumentTypeList Section");
		TestUtilDemo.clickElement(WBSInformationOBJ.addRowButton, "addRowButton");
		TestUtilDemo.dropDownSelectByIndex(WBSInformationOBJ.instrumentTypeDD, 1, "instrumentTypeDD");
		Thread.sleep(1000);
	}
		
	@When("validate a check next to the Instrument Type List Section label will display in left panel")
	public void validate_checkedMark_nextTo_instrumentTypeList_section_is_display() throws Throwable {
		TestUtilDemo.isElementPresent(WBSInformationOBJ.instrumentTypeListCheckedMark, "instrumentTypeListCheckedMark");
	}
	
	@Then("validate viewing data that needs to be updated, I can click on Control System List to select the data and changes have been made on the screen")
	public void validate_DataAdding_for_controlSystemList() throws Throwable {
		/*
		 * TestUtilDemo.clickElement(WBSInformationOBJ.instrumentTypeListSection,
		 * "instrumentTypeList Section"); TestUtilDemo.scrollDownForShort();
		 */
		TestUtilDemo.clickElement(WBSInformationOBJ.controlSystemListSection, "controlSystemList Section");
		TestUtilDemo.clickElement(WBSInformationOBJ.addRowButton, "addRowButton");
		TestUtilDemo.dropDownSelectByIndex(WBSInformationOBJ.controlSystemTypeWBSDD, 1, "instrumentTypeDDCS");
		Thread.sleep(1000);
	}
		
	@When("validate a check next to the Control System List Section label will display in left panel")
	public void validate_checkedMark_nextTo_controlSystemList_section_is_display() throws Throwable {
		TestUtilDemo.isElementPresent(WBSInformationOBJ.controlSystemListCheckedMark, "controlSystemListCheckedMark");
	}
	
	@Then("validate viewing data that needs to be updated, I can click on Control Panel List to select the data and changes have been made on the screen {string},{string}")
	public void validate_DataAdding_for_controlPanelList(String controlPanelNumber, String controlPanelName) throws Throwable {
		TestUtilDemo.clickElement(WBSInformationOBJ.controlSystemListSection, "controlSystemList Section");
		TestUtilDemo.scrollDownForShort();
		TestUtilDemo.clickElement(WBSInformationOBJ.controlPanelListSection, "controlPanelList Section");
		Thread.sleep(2000);
		TestUtilDemo.clickElement(WBSInformationOBJ.addRowButton, "addRowButton");
		TestUtilDemo.doSendKeys(WBSInformationOBJ.controlPanelNumberTB,controlPanelNumber );
		TestUtilDemo.doSendKeys(WBSInformationOBJ.controlPanelNameTB, controlPanelName);
		TestUtilDemo.dropDownSelectByIndex(WBSInformationOBJ.controlSystemTypeDD, 1, "controlSystemTypeDD");
		TestUtilDemo.dropDownSelectByIndex(WBSInformationOBJ.cwaNumberNameDD, 1, "cwaNumberNameDD");
		Thread.sleep(1000);
	}
		
	@When("validate a check next to the Control Panel List Section label will display in left panel")
	public void validate_checkedMark_nextTo_controlPanelList_section_is_display() throws Throwable {
		TestUtilDemo.isElementPresent(WBSInformationOBJ.controlPanelListCheckedMark, "controlPanelListCheckedMark");
	}
	
	@Then("validate viewing data that needs to be updated, I can click on Control Room List to select the data and changes have been made on the screen {string},{string}")
	public void validate_DataAdding_for_controlRoomList(String controlRoomNumber, String controlRoomName) throws Throwable {
		TestUtilDemo.clickElement(WBSInformationOBJ.controlPanelListSection, "controlPanelList Section");
		TestUtilDemo.scrollDownForShort();
		TestUtilDemo.clickElement(WBSInformationOBJ.controlRoomListSection, "controlRoomListSection Section");
		Thread.sleep(2000);
		TestUtilDemo.clickElement(WBSInformationOBJ.addRowButton, "addRowButton");
		TestUtilDemo.doSendKeys(WBSInformationOBJ.controlRoomNumberTB,controlRoomNumber );
		TestUtilDemo.doSendKeys(WBSInformationOBJ.controlRoomNameTB, controlRoomName);
		TestUtilDemo.dropDownSelectByIndex(WBSInformationOBJ.cwaNumberNameDD, 1, "cwaNumberNameDropDown1");
		Thread.sleep(1000);
	}
		
	@When("validate a check next to the Control Room List Section label will display in left panel")
	public void validate_checkedMark_nextTo_controlRoomList_section_is_display() throws Throwable {
		TestUtilDemo.isElementPresent(WBSInformationOBJ.controlRoomListCheckedMark, "controlRoomListCheckedMark");
	}
	
	//Electrical DPS
	@Then("validate viewing data that needs to be updated, I can click on Electrical Equipment List to select the data and changes have been made on the screen {string},{string},{string},{string}")
	public void validate_DataAdding_for_electricalEquipmentList(String electricalEquipmentNumber, String electricalEquipmentName,String electricalEquipmentType, String voltage) throws Throwable {
		TestUtilDemo.clickElement(WBSInformationOBJ.electricalEquipmentList, "electricalEquipmentList Section");
		Thread.sleep(2000);
		TestUtilDemo.clickElement(WBSInformationOBJ.addRowButton, "addRowButton");
		TestUtilDemo.doSendKeys(WBSInformationOBJ.electricalEquipmentNumber,electricalEquipmentNumber );
		TestUtilDemo.doSendKeys(WBSInformationOBJ.electricalEquipmentName, electricalEquipmentName);
		TestUtilDemo.doSendKeys(WBSInformationOBJ.electricalEquipmentType,electricalEquipmentType );
		TestUtilDemo.doSendKeys(WBSInformationOBJ.voltage, voltage);
		TestUtilDemo.dropDownSelectByIndex(WBSInformationOBJ.cwaNumberNameDD, 1, "cwaNumberNameDD");
		Thread.sleep(1000);
	}
		
	@When("validate a check next to the Electrical Equipment List Section label will display in left panel")
	public void validate_checkedMark_nextTo_electricalEquipmentList_section_is_display() throws Throwable {
		TestUtilDemo.isElementPresent(WBSInformationOBJ.electricalEquipmentListCheckedMark, "electricalEquipmentListCheckedMark");
	}
	
	@Then("validate viewing data that needs to be updated, I can click on Powerhouse List to select the data and changes have been made on the screen {string},{string}")
	public void validate_DataAdding_for_powerhouseList(String powerhouseTag, String powerhouseName) throws Throwable {
		TestUtilDemo.clickElement(WBSInformationOBJ.PowerhouseList, "PowerhouseList Section");
		Thread.sleep(2000);
		TestUtilDemo.clickElement(WBSInformationOBJ.addRowButton, "addRowButton");
		TestUtilDemo.doSendKeys(WBSInformationOBJ.powerhouseTag,powerhouseTag );
		TestUtilDemo.doSendKeys(WBSInformationOBJ.powerhouseName, powerhouseName);
		TestUtilDemo.dropDownSelectByIndex(WBSInformationOBJ.cwaNumberNameDD, 1, "cwaNumberNameDD");
		Thread.sleep(1000);
	}
		
	@When("validate a check next to the Powerhouse List Section label will display in left panel")
	public void validate_checkedMark_nextTo_powerhouseList_section_is_display() throws Throwable {
		TestUtilDemo.isElementPresent(WBSInformationOBJ.powerhouseListCheckedMark, "powerhouseListCheckedMark");
	}
	
	@Then("validate viewing data that needs to be updated, I can click on Electrical Systems List to select the data and changes have been made on the screen {string}")
	public void validate_DataAdding_for_electricalSystemsList(String electricalSystemsName) throws Throwable {
		TestUtilDemo.clickElement(WBSInformationOBJ.PowerhouseList, "PowerhouseList Section");
		TestUtilDemo.scrollDownForShort();
		TestUtilDemo.clickElement(WBSInformationOBJ.electricalSystemsList, "electricalSystemsList Section");
		Thread.sleep(2000);
		TestUtilDemo.clickElement(WBSInformationOBJ.addRowButton, "addRowButton");
		TestUtilDemo.doSendKeys(WBSInformationOBJ.electricalSystemsName,electricalSystemsName  );
		}
		
	@When("validate a check next to the Electrical Systems List Section label will display in left panel")
	public void validate_checkedMark_nextTo_electricalSystemsList_section_is_display() throws Throwable {
		TestUtilDemo.isElementPresent(WBSInformationOBJ.electricalSystemsListCheckedMark, "electricalSystemsListCheckedMark");
	}
}
