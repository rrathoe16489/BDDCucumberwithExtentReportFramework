package com.wipro.qa.stepDefinitions;

import com.wipro.qa.base.TestBase;
import com.wipro.qa.util.ProjectInfoOBJ;
import com.wipro.qa.util.ReferenceLibraryOBJ;
import com.wipro.qa.util.StepCommonMethod;
import com.wipro.qa.util.TestUtilDemo;
import com.wipro.qa.util.WBSInformationOBJ;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

/**
 * @authorID Rat105478
 * @authorName RameshRathod
 */

public class ReferenceLibraryStep extends TestBase {

	@Then("validate ReferenceLibraryHeader is display and click on header Link")
	public void validate_reference_library_header_is_display() throws Throwable {
		StepCommonMethod.validate_top_header_is_Display_and_click("referenceLibrary",
				ReferenceLibraryOBJ.referenceLibraryHeader, ReferenceLibraryOBJ.referenceLibraryHeaderLink,
				"AssignTeamHeader");
	}

	@Then("validate ProjectSpecificDocument section is Display and click")
	public void user_click_on_ProjectSpecificDocuments_link() throws Throwable {
		StepCommonMethod.validate_subSection_is_Display_and_click(
				ReferenceLibraryOBJ.ProjectSpecificDocumentsManagementSection,
				"ProjectSpecificDocumentsManagementSection");

	}

	@When("Validate user when moving the slider to on position")
	public void validate_user_when_moving_the_slider_to_on_position() {
		TestUtilDemo.clickElement(ReferenceLibraryOBJ.toggle, "toggle on");
	}

	@Then("validate moving the slider to on position only editing of name {string} and ID {string}, deletingorpasting of Link {string} allowed")
	public void validate_moving_the_slider_to_on_position_only_editing_of_name_and_id_deleting_pasting_of_link_allowed(
			String name, String id, String link) throws Throwable {
		Thread.sleep(3000);
		TestUtilDemo.clickElement(ReferenceLibraryOBJ.categoryTextLink, "categoryTextLink");
		Thread.sleep(1000);
		TestUtilDemo.clearAnddoSendKeys(ReferenceLibraryOBJ.nameTextBox, name);
		Thread.sleep(1000);
		TestUtilDemo.clearAnddoSendKeys(ReferenceLibraryOBJ.IDtextBox, id);
		Thread.sleep(1000);
		TestUtilDemo.clearAnddoSendKeys(ReferenceLibraryOBJ.linkTextBox, link);
		Thread.sleep(3000);
		TestUtilDemo.clickElement(ReferenceLibraryOBJ.SAVE_BUTTON, "Save Button ");
		Thread.sleep(2000);
	}

	@Then("Validate user can save the updated data and link will become a hyperlink to open the file or website")
	public void validate_user_can_save_the_updated_data_and_link_will_become_a_hyperlink_to_open_the_file_or_website()
			throws Throwable {
		TestUtilDemo.clickElement(ReferenceLibraryOBJ.googleLink, "googleLink");
		Thread.sleep(1000);
		// get current window
		String mainWindowHandle = driver.getWindowHandles().iterator().next();
		// switch back
		driver.switchTo().window(mainWindowHandle);
	}

	@Then("Validate Hovering over link cell will display entire link")
	public void validate_hovering_over_link_cell_will_display_entire_link() throws Throwable {
		TestUtilDemo.mouseHover(ReferenceLibraryOBJ.googleLink);
		Thread.sleep(4000);

	}

	@Then("Validate user can copy the existing row then Category copied and all other columns blank and Save Complete and Edit button click")
	public void validate_user_can_copy_the_existing_row_then_category_copied_and_all_other_columns_blank_and_Save_Complete_and_Edit_button_click()
			throws Throwable {
		TestUtilDemo.clickElement(ReferenceLibraryOBJ.copyIcon, "copyIcon Icon ");
		Thread.sleep(2000);
	}

	@When("Validate clicking in the link cell for a given row that already has a link populated the PLI can choose to delete the link by selecting X icon")
	public void deleting_existing_row() throws Throwable {
		TestUtilDemo.clickElement(ReferenceLibraryOBJ.categoryTextLink, "categoryTextLink");
		Thread.sleep(1000);
		TestUtilDemo.clickElement(ReferenceLibraryOBJ.linkTextBox, "linkTextBox only click");
		Thread.sleep(3000);
		TestUtilDemo.mouseHoverAndClick(ReferenceLibraryOBJ.crossIcon);
		Thread.sleep(3000);
		TestUtilDemo.clickElement(ReferenceLibraryOBJ.crossDeleteButton, "crossDeleteButton");
		Thread.sleep(2000);
	}

	@When("user click on AddReference button")
	public void user_click_on_add_reference_button() throws Throwable {
		TestUtilDemo.clickElement(ReferenceLibraryOBJ.categoryTextLink, "categoryTextLink");
		Thread.sleep(1000);
		TestUtilDemo.scrollDownTillBottum();
		TestUtilDemo.clickElement(ReferenceLibraryOBJ.addReferenceButton, "addReference Button ");
		Thread.sleep(2000);

	}

	@Then("validate Newly added row can be saved with categoryName and without ID or link {string}")
	public void validate_newly_added_row_can_be_saved_without_id_or_link_populated(String categoryTB) throws Throwable {
		TestUtilDemo.doSendKeys(ReferenceLibraryOBJ.categoryTB, categoryTB);
		Thread.sleep(1000);
		TestUtilDemo.clickElement(ReferenceLibraryOBJ.SAVE_BUTTON, "SAVE_BUTTON");
		Thread.sleep(1000);

	}

	@When("Validate user click on the save and complete button and then edit button and checked mark next to section is display")
	public void click_on_save_complete_button_and_edit_button_and_check_mark_display() throws Throwable {

		StepCommonMethod.save_complete_click_and_edit_display(ReferenceLibraryOBJ.SAVE_BUTTON,
				ReferenceLibraryOBJ.COMPLETE_BUTTON, ReferenceLibraryOBJ.EDIT_BUTTON,
				ReferenceLibraryOBJ.ProjectSpecificDocumentsManagementCheckedMark, "form completed");
	}

	/*************
	 * ProcedureManagement
	 * 
	 * @throws Throwable
	 ********/
	@When("validate ProcedureManagement section is Display and click")
	public void user_click_on_ProcedureManagement_sub_section() throws Throwable {
		TestUtilDemo.clickElement(ReferenceLibraryOBJ.ClientDocumentsManagementSection,
				"ClientDocumentsManagementSection Link");
		TestUtilDemo.scrollDownForShort();
		TestUtilDemo.clickElement(ReferenceLibraryOBJ.ProceduresManagementSection, "ProcedureManagement Section link");

	}

	@Then("validate moving the slider to on position only deletingorpasting of link allowed in ProcedureManagement {string}")
	public void editing_or_deleting_link_column(String link) throws Throwable {
		Thread.sleep(2000);
		TestUtilDemo.clickElement(ReferenceLibraryOBJ.categoryTextLink, "categoryTextLink");
		Thread.sleep(2000);
		TestUtilDemo.clearAnddoSendKeys(ReferenceLibraryOBJ.linkTextBox, link);
		Thread.sleep(1000);
		TestUtilDemo.clickElement(ReferenceLibraryOBJ.SAVE_BUTTON, "SAVE_BUTTON");
		Thread.sleep(1000);
	}

	@Then("validate Newly added row can be saved with name {string} only and without ID or link")
	public void validate_newly_added_row_can_be_saved_without_id_or_link_populated_in_ProcedureManagement(
			String nameTextbox) throws Throwable {

		TestUtilDemo.doSendKeys(ReferenceLibraryOBJ.nameTextBoxdocument, nameTextbox);
		Thread.sleep(2000);

	}

	@When("Validate user click on the save and complete button and then edit button and checked mark next to ProcedureManagementsection is display")
	public void click_on_save_complete_button_and_edit_button_display() throws Throwable {

		StepCommonMethod.save_complete_click_and_edit_display(ReferenceLibraryOBJ.SAVE_BUTTON,
				ReferenceLibraryOBJ.COMPLETE_BUTTON, ReferenceLibraryOBJ.EDIT_BUTTON,
				ReferenceLibraryOBJ.proceduresManagementCheckedMark, "form completed");
	}

	// ClientDocumentsManagement

	@When("validate user click on ClientDocumentsManagement SubSection")
	public void user_click_on_ClientDocumentsManagement_sub_section() {
		TestUtilDemo.clickElement(ReferenceLibraryOBJ.ClientDocumentsManagementSection,
				"ClientDocumentsManagementSection link");
	}

	@Then("validate only editing of name {string} and ID {string}, deletingorpasting of Link {string} allowed")
	public void validate_only_editing_of_name_and_id_deleting_pasting_of_link_allowed(String name, String id,
			String link) throws Throwable {
		Thread.sleep(3000);
		TestUtilDemo.clickElement(ReferenceLibraryOBJ.categoryTextLink, "categoryTextLink");
		Thread.sleep(1000);
		TestUtilDemo.clearAnddoSendKeys(ReferenceLibraryOBJ.nameTextBox, name);
		Thread.sleep(1000);
		TestUtilDemo.clearAnddoSendKeys(ReferenceLibraryOBJ.IDtextBox, id);
		Thread.sleep(1000);
		TestUtilDemo.clearAnddoSendKeys(ReferenceLibraryOBJ.linkTextBox, link);
		Thread.sleep(3000);
		TestUtilDemo.clickElement(ReferenceLibraryOBJ.SAVE_BUTTON, "Save Button ");
		Thread.sleep(2000);
	}

	@When("validate user click on AddReference Button")
	public void user_click_on_addreference_button() throws Throwable {
		TestUtilDemo.clickElement(ReferenceLibraryOBJ.addReferenceButton, "addReference Button ");
		Thread.sleep(2000);

	}

	@When("validate check mark next to ClientDocumentManagement Section is display")
	public void validate_checkedMark_display_nextTo_ClientSection() throws Throwable {
		TestUtilDemo.isElementPresent(ReferenceLibraryOBJ.clientDocumentsManagementCheckedMark, "checked mark");
	}

	// manualsHandbooksManagement
	@When("validate user click on manualsHandbooksManagement SubSection")
	public void user_click_on_manualsHandbooksManagement_sub_section() {
		TestUtilDemo.clickElement(ReferenceLibraryOBJ.ProceduresManagementSection, "ProceduresManagementSection Link");
		TestUtilDemo.scrollDownForShort();
		TestUtilDemo.clickElement(ReferenceLibraryOBJ.manualsHandbooksManagementSection,
				"manualsHandbooksManagementSection link");
	}

	@When("validate check mark next to manualsHandbooksManagement Section is display")
	public void validate_checkedMark_display_nextTo_manualsHandbooksSection() throws Throwable {
		TestUtilDemo.isElementPresent(ReferenceLibraryOBJ.manualsHandbooksManagementCheckedMark, "checked mark");
	}

	// OtherManagement
	@When("validate user click on OtherManagement SubSection")
	public void user_click_on_OtherManagement_subsection() {
		TestUtilDemo.clickElement(ReferenceLibraryOBJ.manualsHandbooksManagementSection,
				"manualsHandbooksManagementSection Link");
		TestUtilDemo.scrollDownForShort();
		TestUtilDemo.clickElement(ReferenceLibraryOBJ.OtherManagementSection, "OtherManagementSection link");
	}

	@When("validate check mark next to OtherManagement Section is display")
	public void validate_checkedMark_display_nextTo_OtherManagementSec() throws Throwable {
		TestUtilDemo.isElementPresent(ReferenceLibraryOBJ.OtherManagementCheckedMark, "checked mark");
	}

	// checklistsManagementSection
	@When("validate user click on checklistsManagement SubSection")
	public void user_click_on_checklistsManagement_subsection() {
		TestUtilDemo.clickElement(ReferenceLibraryOBJ.OtherManagementSection, "OtherManagementSection Link");
		TestUtilDemo.scrollDownForShort();
		TestUtilDemo.clickElement(ReferenceLibraryOBJ.checklistsManagementSection, "checklistsManagement link");
	}

	@When("validate check mark next to checklistsManagement Section is display")
	public void validate_checkedMark_display_nextTo_checklistsManagement() throws Throwable {
		TestUtilDemo.isElementPresent(ReferenceLibraryOBJ.checklistsManagementCheckedMark, "checked mark");
	}

	@When("validate Top ReferenceLibrary header is completed with cheked mark")
	public void validate_header_is_completed() throws Throwable {
		TestUtilDemo.isElementPresent(ReferenceLibraryOBJ.completeHeaderIconReferenceLib, "checked mark");
	}

	/*********** Below Code for piping Role *******************************/

	// ProjectSpecificDocumentsPiping

	@Then("validate ProjectSpecificDocumentsPiping section is Display and click")
	public void user_click_on_reference_library_header_link() throws Throwable {
		StepCommonMethod.validate_subSection_is_Display_and_click(ReferenceLibraryOBJ.projectSpecificDocumentsPiping,
				"projectSpecificDocumentsPiping");
	}

	@When("Validate user click on the save and complete button and then edit button and checked mark next to ProjectSpecificDocumentsPipingsection is display")
	public void click_on_save_complete_button_and_edit_button_display_in_piping() throws Throwable {

		StepCommonMethod.save_complete_click_and_edit_display(ReferenceLibraryOBJ.SAVE_BUTTON,
				ReferenceLibraryOBJ.COMPLETE_BUTTON, ReferenceLibraryOBJ.EDIT_BUTTON,
				ReferenceLibraryOBJ.projectSpecificDocumentsPipingCheckedMark, "form completed");
	}

	// ClientDocumentsPipingSection
	@When("validate user click on ClientDocumentsPiping SubSection")
	public void user_click_on_clientDocumentsPiping_subsection() {
		TestUtilDemo.clickElement(ReferenceLibraryOBJ.clientDocumentsPiping, "clientDocumentsPiping link");
	}

	@When("validate check mark next to ClientDocumentsPiping Section is display")
	public void validate_checkedMark_display_nextTo_clientDocumentsPiping() throws Throwable {
		TestUtilDemo.isElementPresent(ReferenceLibraryOBJ.clientDocumentsPipingCheckedMark, "checked mark");
	}

	// ProceduresPiping
	@When("validate ProceduresPiping section is Display and click")
	public void user_click_on_ProcedurePiping_sub_section() throws Throwable {
		TestUtilDemo.clickElement(ReferenceLibraryOBJ.clientDocumentsPiping, "clientDocumentsPiping Link");
		TestUtilDemo.scrollDownForShort();
		TestUtilDemo.clickElement(ReferenceLibraryOBJ.proceduresPiping, "proceduresPiping Section link");

	}

	@When("Validate user click on the save and complete button and then edit button and checked mark next to ProcedurePipingsection is display")
	public void click_on_save_complete_button_and_edit_button_display_in_procedure() throws Throwable {
		StepCommonMethod.save_complete_click_and_edit_display(ReferenceLibraryOBJ.SAVE_BUTTON,
				ReferenceLibraryOBJ.COMPLETE_BUTTON, ReferenceLibraryOBJ.EDIT_BUTTON,
				ReferenceLibraryOBJ.proceduresPipingCheckedMark, "form completed");
	}

	// calculationTemplatesPiping
	@When("validate user click on calculationTemplatesPiping SubSection")
	public void user_click_on_calculationTemplatesPiping_subsection() {
		TestUtilDemo.clickElement(ReferenceLibraryOBJ.proceduresPiping, "clientDocumentsPiping Link");
		TestUtilDemo.scrollDownForShort();
		TestUtilDemo.clickElement(ReferenceLibraryOBJ.calculationTemplatesPiping, "clientDocumentsPiping link");
	}

	@When("validate check mark next to calculationTemplatesPiping Section is display")
	public void validate_checkedMark_display_nextTo_calculationTemplatesPiping() throws Throwable {
		TestUtilDemo.isElementPresent(ReferenceLibraryOBJ.calculationTemplatesCheckedMark, "checked mark");
	}

	// typicalDetailsPiping
	@When("validate user click on typicalDetailsPiping SubSection")
	public void user_click_on_typicalDetailsPiping_subsection() {
		TestUtilDemo.clickElement(ReferenceLibraryOBJ.calculationTemplatesPiping, "calculationTemplatesPiping Link");
		TestUtilDemo.scrollDownForShort();
		TestUtilDemo.clickElement(ReferenceLibraryOBJ.typicalDetailsPiping, "typicalDetailsPiping link");
	}

	@When("validate check mark next to typicalDetailsPiping Section is display")
	public void validate_checkedMark_display_nextTo_typicalDetailsPiping() throws Throwable {
		TestUtilDemo.isElementPresent(ReferenceLibraryOBJ.typicalDetailsPipingCheckedMark, "checked mark");
	}

	// ManualsHandbooksPiping
	@When("validate user click on ManualsHandbooksPiping SubSection")
	public void user_click_on_manualsHandbooksPiping_subsection() {
		TestUtilDemo.clickElement(ReferenceLibraryOBJ.typicalDetailsPiping, "typicalDetailsPiping Link");
		TestUtilDemo.scrollDownForShort();
		TestUtilDemo.clickElement(ReferenceLibraryOBJ.manualsHandbooksPiping, "manualsHandbooksPiping link");
	}

	@When("validate check mark next to ManualsHandbooksPiping Section is display")
	public void validate_checkedMark_display_nextTo_manualsHandbooksPiping() throws Throwable {
		TestUtilDemo.isElementPresent(ReferenceLibraryOBJ.manualsHandbooksPipingCheckedMark, "checked mark");
	}

	// trainingPiping
	@When("validate user click on trainingPiping SubSection")
	public void user_click_on_trainingPiping_subsection() {
		TestUtilDemo.clickElement(ReferenceLibraryOBJ.manualsHandbooksPiping, "manualsHandbooksPiping Link");
		TestUtilDemo.scrollDownForShort();
		TestUtilDemo.clickElement(ReferenceLibraryOBJ.trainingPiping, "trainingPiping link");
	}

	@When("validate check mark next to trainingPiping Section is display")
	public void validate_checkedMark_display_next_TotrainingPiping() throws Throwable {
		TestUtilDemo.isElementPresent(ReferenceLibraryOBJ.trainingPipingCheckedMark, "checked mark");
	}

	// otherPipings
	@When("validate user click on otherPiping SubSection")
	public void user_click_on_otherPiping_subsection() {
		TestUtilDemo.clickElement(ReferenceLibraryOBJ.trainingPiping, "trainingPiping Link");
		TestUtilDemo.scrollDownForShort();
		TestUtilDemo.clickElement(ReferenceLibraryOBJ.otherPiping, "otherPiping link");
	}

	@When("validate check mark next to otherPiping Section is display")
	public void validate_checkedMark_display_nextTo_otherPiping() throws Throwable {
		TestUtilDemo.isElementPresent(ReferenceLibraryOBJ.otherPipingCheckedMark, "checked mark");
	}

	// checklistsPiping
	@When("validate user click on checklistsPiping SubSection")
	public void user_click_on_checklistsPiping_subsection() {
		TestUtilDemo.clickElement(ReferenceLibraryOBJ.otherPiping, "otherPiping Link");
		TestUtilDemo.scrollDownForShort();
		TestUtilDemo.clickElement(ReferenceLibraryOBJ.checklistsPiping, "checklistsPiping link");
	}

	@When("validate check mark next to checklistsPiping Section is display")
	public void validate_checkedMark_display_nextTo_checklistsPiping() throws Throwable {
		TestUtilDemo.isElementPresent(ReferenceLibraryOBJ.checklistsPipingCheckedMark, "checked mark");
	}

	/* DPS Role */
	// ProjectSpecificDocumentsProcess
	@Then("validate ProjectSpecificDocumentsProcess section is Display and click")
	public void user_click_on_ProjectSpecificDocumentsProcess_link() throws Throwable {
		StepCommonMethod.validate_subSection_is_Display_and_click(ReferenceLibraryOBJ.projectSpecificDocumentsProcess,
				"projectSpecificDocumentsPiping");
	}

	@When("Validate user click on the save and complete button and then edit button and checked mark next to ProjectSpecificDocumentsProcesssection is display")
	public void click_on_save_complete_button_and_edit_button_display_in_process() throws Throwable {

		StepCommonMethod.save_complete_click_and_edit_display(ReferenceLibraryOBJ.SAVE_BUTTON,
				ReferenceLibraryOBJ.COMPLETE_BUTTON, ReferenceLibraryOBJ.EDIT_BUTTON,
				ReferenceLibraryOBJ.projectSpecificDocumentsProcessCheckedMark, "form completed");
	}

	// clientDocumentsProcess
	@When("validate user click on clientDocumentsProcess SubSection")
	public void user_click_on_clientDocumentsProcess_subsection() {
		TestUtilDemo.clickElement(ReferenceLibraryOBJ.clientDocumentsProcess, "clientDocumentsProcess link");
	}

	@When("validate check mark next to clientDocumentsProcess Section is display")
	public void validate_checkedMark_display_nextTo_clientDocumentsProcess() throws Throwable {
		TestUtilDemo.isElementPresent(ReferenceLibraryOBJ.clientDocumentsProcessCheckedMark, "checked mark");
	}

	// ProceduresProcess
	@When("validate ProceduresProcess section is Display and click")
	public void user_click_on_ProcedureProcess_sub_section() throws Throwable {
		TestUtilDemo.clickElement(ReferenceLibraryOBJ.clientDocumentsProcess, "clientDocumentsProcess Link");
		TestUtilDemo.scrollDownForShort();
		TestUtilDemo.clickElement(ReferenceLibraryOBJ.proceduresProcess, "proceduresProcess Section link");

	}

	@When("Validate user click on the save and complete button and then edit button and checked mark next to ProcedureProcesssection is display")
	public void click_on_save_complete_button_and_edit_button_display_in_procedureProcess() throws Throwable {
		StepCommonMethod.save_complete_click_and_edit_display(ReferenceLibraryOBJ.SAVE_BUTTON,
				ReferenceLibraryOBJ.COMPLETE_BUTTON, ReferenceLibraryOBJ.EDIT_BUTTON,
				ReferenceLibraryOBJ.proceduresProcessCheckedMark, "form completed");
	}

	// calculationTemplatesProcess
	@When("validate user click on calculationTemplatesProcess SubSection")
	public void user_click_on_calculationTemplatesProcess_subsection() {
		TestUtilDemo.clickElement(ReferenceLibraryOBJ.proceduresProcess, "proceduresProcess Link");
		TestUtilDemo.scrollDownForShort();
		TestUtilDemo.clickElement(ReferenceLibraryOBJ.calculationTemplatesProcess, "calculationTemplatesProcess link");
	}

	@When("validate check mark next to calculationTemplatesProcess Section is display")
	public void validate_checkedMark_display_nextTo_calculationTemplatesProcess() throws Throwable {
		TestUtilDemo.isElementPresent(ReferenceLibraryOBJ.calculationTemplatesProcessCheckedMark, "checked mark");
	}

	// typicalDetailsPiping
	@When("validate user click on typicalDetailsProcess SubSection")
	public void user_click_on_typicalDetailsProcess_subsection() {
		TestUtilDemo.clickElement(ReferenceLibraryOBJ.calculationTemplatesProcess, "calculationTemplatesProcess Link");
		TestUtilDemo.scrollDownForShort();
		TestUtilDemo.clickElement(ReferenceLibraryOBJ.typicalDetailsProcess, "typicalDetailsProcess link");
	}

	@When("validate check mark next to typicalDetailsProcess Section is display")
	public void validate_checkedMark_display_nextTo_typicalDetailsProcess() throws Throwable {
		TestUtilDemo.isElementPresent(ReferenceLibraryOBJ.typicalDetailsProcessCheckedMark, "checked mark");
	}

	// ManualsHandbooksPiping
	@When("validate user click on manualsHandbooksProcess SubSection")
	public void user_click_on_manualsHandbooksProcess_subsection() {
		TestUtilDemo.clickElement(ReferenceLibraryOBJ.typicalDetailsProcess, "typicalDetailsProcess Link");
		TestUtilDemo.scrollDownForShort();
		TestUtilDemo.clickElement(ReferenceLibraryOBJ.manualsHandbooksProcess, "manualsHandbooksProcess link");
	}

	@When("validate check mark next to manualsHandbooksProcess Section is display")
	public void validate_checkedMark_display_nextTo_ManualsHandbooksProcess() throws Throwable {
		TestUtilDemo.isElementPresent(ReferenceLibraryOBJ.manualsHandbooksProcessCheckedMark, "checked mark");
	}

	// trainingProcess
	@When("validate user click on trainingProcess SubSection")
	public void user_click_on_trainingProcess_subsection() {
		TestUtilDemo.clickElement(ReferenceLibraryOBJ.manualsHandbooksProcess, "manualsHandbooksProcess Link");
		TestUtilDemo.scrollDownForShort();
		TestUtilDemo.clickElement(ReferenceLibraryOBJ.trainingProcess, "trainingProcess link");
	}

	@When("validate check mark next to trainingProcess Section is display")
	public void validate_checkedMark_display_nextTo_trainingProcess() throws Throwable {
		TestUtilDemo.isElementPresent(ReferenceLibraryOBJ.trainingProcessCheckedMark, "checked mark");
	}

	// otherProcess
	@When("validate user click on otherProcess SubSection")
	public void user_click_on_otherProcess_subsection() {
		TestUtilDemo.clickElement(ReferenceLibraryOBJ.trainingProcess, "trainingProcess Link");
		TestUtilDemo.scrollDownForShort();
		TestUtilDemo.clickElement(ReferenceLibraryOBJ.otherProcess, "otherProcess link");
	}

	@When("validate check mark next to otherProcess Section is display")
	public void validate_checkedMark_display_nextTo_otherProcess() throws Throwable {
		TestUtilDemo.isElementPresent(ReferenceLibraryOBJ.otherProcessCheckedMark, "checked mark");
	}

	// checklistsProcess
	@When("validate user click on checklistsProcess SubSection")
	public void user_click_on_checklistsProcess_subsection() {
		TestUtilDemo.clickElement(ReferenceLibraryOBJ.otherProcess, "otherProcess Link");
		TestUtilDemo.scrollDownForShort();
		TestUtilDemo.clickElement(ReferenceLibraryOBJ.checklistsProcess, "checklistsProcess link");
	}

	@When("validate check mark next to checklistsProcess Section is display")
	public void validate_checkedMark_display_nextTo_checklistsProcess() throws Throwable {
		TestUtilDemo.isElementPresent(ReferenceLibraryOBJ.checklistsProcessCheckedMark, "checked mark");
	}

	/*********** Below Code for Electrical Role *******************************/

	// ProjectSpecificDocumentsElectrical

	@Then("validate ProjectSpecificDocumentsElectrical section is Display and click")
	public void user_click_on_reference_library_header_link_electrical() throws Throwable {
		StepCommonMethod.validate_subSection_is_Display_and_click(
				ReferenceLibraryOBJ.projectSpecificDocumentsElectrical, "projectSpecificDocumentsElectrical");
	}

	@When("Validate user click on the save and complete button and then edit button and checked mark next to ProjectSpecificDocumentsElectricalsection is display")
	public void click_on_save_complete_button_and_edit_button_display_in_Electrical() throws Throwable {

		StepCommonMethod.save_complete_click_and_edit_display(ReferenceLibraryOBJ.SAVE_BUTTON,
				ReferenceLibraryOBJ.COMPLETE_BUTTON, ReferenceLibraryOBJ.EDIT_BUTTON,
				ReferenceLibraryOBJ.projectSpecificDocumentsElectricalCheckedMark, "form completed");
	}

	// ClientDocumentsElectricalSection
	@When("validate user click on ClientDocumentsElectrical SubSection")
	public void user_click_on_clientDocumentsElectrical_subsection() {
		TestUtilDemo.clickElement(ReferenceLibraryOBJ.clientDocumentsElectrical, "clientDocumentsElectrical link");
	}

	@When("validate check mark next to ClientDocumentsElectrical Section is display")
	public void validate_checkedMark_display_nextTo_clientDocumentsElectrical() throws Throwable {
		TestUtilDemo.isElementPresent(ReferenceLibraryOBJ.clientDocumentsElectricalCheckedMark, "checked mark");
	}

	// ProceduresElectrical
	@When("validate ProceduresElectrical section is Display and click")
	public void user_click_on_ProcedureElectrical_sub_section() throws Throwable {
		TestUtilDemo.clickElement(ReferenceLibraryOBJ.clientDocumentsElectrical, "clientDocumentsElectrical Link");
		TestUtilDemo.scrollDownForShort();
		TestUtilDemo.clickElement(ReferenceLibraryOBJ.proceduresElectrical, "proceduresElectrical Section link");

	}

	@When("Validate user click on the save and complete button and then edit button and checked mark next to ProcedureElectricalsection is display")
	public void click_on_save_complete_button_and_edit_button_display_in_electricals() throws Throwable {
		StepCommonMethod.save_complete_click_and_edit_display(ReferenceLibraryOBJ.SAVE_BUTTON,
				ReferenceLibraryOBJ.COMPLETE_BUTTON, ReferenceLibraryOBJ.EDIT_BUTTON,
				ReferenceLibraryOBJ.proceduresElectricalCheckedMark, "form completed");
	}

	// calculationTemplatesElectrical
	@When("validate user click on calculationTemplatesElectrical SubSection")
	public void user_click_on_calculationTemplatesElectrical_subsection() {
		TestUtilDemo.clickElement(ReferenceLibraryOBJ.proceduresElectrical, "clientDocumentsElectrical Link");
		TestUtilDemo.scrollDownForShort();
		TestUtilDemo.clickElement(ReferenceLibraryOBJ.calculationTemplatesElectrical, "clientDocumentsElectrical link");
	}

	@When("validate check mark next to calculationTemplatesElectrical Section is display")
	public void validate_checkedMark_display_nextTo_calculationTemplatesElectrical() throws Throwable {
		TestUtilDemo.isElementPresent(ReferenceLibraryOBJ.calculationTemplatesElectricalCheckedMark, "checked mark");
	}

	// typicalDetailsElectrical
	@When("validate user click on typicalDetailsElectrical SubSection")
	public void user_click_on_typicalDetailsElectrical_subsection() {
		TestUtilDemo.clickElement(ReferenceLibraryOBJ.calculationTemplatesElectrical,
				"calculationTemplatesElectrical Link");
		TestUtilDemo.scrollDownForShort();
		TestUtilDemo.clickElement(ReferenceLibraryOBJ.typicalDetailsElectrical, "typicalDetailsElectrical link");
	}

	@When("validate check mark next to typicalDetailsElectrical Section is display")
	public void validate_checkedMark_display_nextTo_typicalDetailsElectrical() throws Throwable {
		TestUtilDemo.isElementPresent(ReferenceLibraryOBJ.typicalDetailsElectricalCheckedMark, "checked mark");
	}

	// ManualsHandbooksElectrical
	@When("validate user click on ManualsHandbooksElectrical SubSection")
	public void user_click_on_manualsHandbooksElectrical_subsection() {
		TestUtilDemo.clickElement(ReferenceLibraryOBJ.typicalDetailsElectrical, "typicalDetailsElectrical Link");
		TestUtilDemo.scrollDownForShort();
		TestUtilDemo.clickElement(ReferenceLibraryOBJ.manualsHandbooksElectrical, "manualsHandbooksElectrical link");
	}

	@When("validate check mark next to ManualsHandbooksElectrical Section is display")
	public void validate_checkedMark_display_nextTo_manualsHandbooksElectrical() throws Throwable {
		TestUtilDemo.isElementPresent(ReferenceLibraryOBJ.manualsHandbooksElectricalCheckedMark, "checked mark");
	}

	// trainingElectrical
	@When("validate user click on trainingElectrical SubSection")
	public void user_click_on_trainingElectrical_subsection() {
		TestUtilDemo.clickElement(ReferenceLibraryOBJ.manualsHandbooksElectrical, "manualsHandbooksElectrical Link");
		TestUtilDemo.scrollDownForShort();
		TestUtilDemo.clickElement(ReferenceLibraryOBJ.trainingElectrical, "trainingElectrical link");
	}

	@When("validate check mark next to trainingElectrical Section is display")
	public void validate_checkedMark_display_next_TotrainingElectrical() throws Throwable {
		TestUtilDemo.isElementPresent(ReferenceLibraryOBJ.trainingElectricalCheckedMark, "checked mark");
	}

	// otherElectricals
	@When("validate user click on otherElectrical SubSection")
	public void user_click_on_otherElectrical_subsection() {
		TestUtilDemo.clickElement(ReferenceLibraryOBJ.trainingElectrical, "trainingElectrical Link");
		TestUtilDemo.scrollDownForShort();
		TestUtilDemo.clickElement(ReferenceLibraryOBJ.otherElectrical, "otherElectrical link");
	}

	@When("validate check mark next to otherElectrical Section is display")
	public void validate_checkedMark_display_nextTo_otherElectrical() throws Throwable {
		TestUtilDemo.isElementPresent(ReferenceLibraryOBJ.otherElectricalCheckedMark, "checked mark");
	}

	// checklistsElectrical
	@When("validate user click on checklistsElectrical SubSection")
	public void user_click_on_checklistsElectrical_subsection() {
		TestUtilDemo.clickElement(ReferenceLibraryOBJ.otherElectrical, "otherElectrical Link");
		TestUtilDemo.scrollDownForShort();
		TestUtilDemo.clickElement(ReferenceLibraryOBJ.checklistsElectrical, "checklistsElectrical link");
	}

	@When("validate check mark next to checklistsElectrical Section is display")
	public void validate_checkedMark_display_nextTo_checklistsElectrical() throws Throwable {
		TestUtilDemo.isElementPresent(ReferenceLibraryOBJ.checklistsElectricalCheckedMark, "checked mark");
	}

	/*********** Below Code for I&C Role *******************************/

	// ProjectSpecificDocumentsI&C

	@Then("validate ProjectSpecificDocumentsI&C section is Display and click")
	public void user_click_on_reference_library_header_link_IandC() throws Throwable {
		StepCommonMethod.validate_subSection_is_Display_and_click(ReferenceLibraryOBJ.projectSpecificDocumentsIandC,
				"projectSpecificDocumentsI&C");
	}

	@When("Validate user click on the save and complete button and then edit button and checked mark next to ProjectSpecificDocumentsI&Csection is display")
	public void click_on_save_complete_button_and_edit_button_display_in_IandC() throws Throwable {

		StepCommonMethod.save_complete_click_and_edit_display(ReferenceLibraryOBJ.SAVE_BUTTON,
				ReferenceLibraryOBJ.COMPLETE_BUTTON, ReferenceLibraryOBJ.EDIT_BUTTON,
				ReferenceLibraryOBJ.projectSpecificDocumentsIandCCheckedMark, "form completed");
	}

	// ClientDocumentsI&CSection
	@When("validate user click on ClientDocumentsI&C SubSection")
	public void user_click_on_clientDocumentsIandC_subsection() {
		TestUtilDemo.clickElement(ReferenceLibraryOBJ.clientDocumentsIandC, "clientDocumentsI&C link");
	}

	@When("validate check mark next to ClientDocumentsI&C Section is display")
	public void validate_checkedMark_display_nextTo_clientDocumentsIandC() throws Throwable {
		TestUtilDemo.isElementPresent(ReferenceLibraryOBJ.clientDocumentsIandCCheckedMark, "checked mark");
	}

	// ProceduresI&C
	@When("validate ProceduresI&C section is Display and click")
	public void user_click_on_procedureIandC_sub_section() throws Throwable {
		TestUtilDemo.clickElement(ReferenceLibraryOBJ.clientDocumentsIandC, "clientDocumentsI&C Link");
		TestUtilDemo.scrollDownForShort();
		TestUtilDemo.clickElement(ReferenceLibraryOBJ.proceduresIandC, "proceduresI&C Section link");

	}

	@When("Validate user click on the save and complete button and then edit button and checked mark next to ProcedureI&Csection is display")
	public void click_on_save_complete_button_and_edit_button_display_in_IandCs() throws Throwable {
		StepCommonMethod.save_complete_click_and_edit_display(ReferenceLibraryOBJ.SAVE_BUTTON,
				ReferenceLibraryOBJ.COMPLETE_BUTTON, ReferenceLibraryOBJ.EDIT_BUTTON,
				ReferenceLibraryOBJ.proceduresIandCCheckedMark, "form completed");
	}

	// calculationTemplatesI&C
	@When("validate user click on calculationTemplatesI&C SubSection")
	public void user_click_on_calculationTemplatesIandC_subsection() {
		TestUtilDemo.clickElement(ReferenceLibraryOBJ.proceduresIandC, "clientDocumentsI&C Link");
		TestUtilDemo.scrollDownForShort();
		TestUtilDemo.clickElement(ReferenceLibraryOBJ.calculationTemplatesIandC, "clientDocumentsI&C link");
	}

	@When("validate check mark next to calculationTemplatesI&C Section is display")
	public void validate_checkedMark_display_nextTo_calculationTemplatesIandC() throws Throwable {
		TestUtilDemo.isElementPresent(ReferenceLibraryOBJ.calculationTemplatesIandCCheckedMark, "checked mark");
	}

	// typicalDetailsI&C
	@When("validate user click on typicalDetailsI&C SubSection")
	public void user_click_on_typicalDetailsIandC_subsection() throws Throwable {
		Thread.sleep(1000);
		TestUtilDemo.clickElement(ReferenceLibraryOBJ.calculationTemplatesIandC, "calculationTemplatesI&C Link");
		TestUtilDemo.scrollDownForShort();
		TestUtilDemo.clickElement(ReferenceLibraryOBJ.typicalDetailsIandC, "typicalDetailsI&C link");
	}

	@When("validate check mark next to typicalDetailsI&C Section is display")
	public void validate_checkedMark_display_nextTo_typicalDetailsIandC() throws Throwable {
		TestUtilDemo.isElementPresent(ReferenceLibraryOBJ.typicalDetailsIandCCheckedMark, "checked mark");
	}

	// ManualsHandbooksI&C
	@When("validate user click on ManualsHandbooksI&C SubSection")
	public void user_click_on_manualsHandbooksIandC_subsection() {
		TestUtilDemo.clickElement(ReferenceLibraryOBJ.typicalDetailsIandC, "typicalDetailsI&C Link");
		TestUtilDemo.scrollDownForShort();
		TestUtilDemo.clickElement(ReferenceLibraryOBJ.manualsHandbooksIandC, "manualsHandbooksI&C link");
	}

	@When("validate check mark next to ManualsHandbooksI&C Section is display")
	public void validate_checkedMark_display_nextTo_manualsHandbooksIandC() throws Throwable {
		TestUtilDemo.isElementPresent(ReferenceLibraryOBJ.manualsHandbooksIandCCheckedMark, "checked mark");
	}

	// trainingI&C
	@When("validate user click on trainingI&C SubSection")
	public void user_click_on_trainingIandC_subsection() {
		TestUtilDemo.clickElement(ReferenceLibraryOBJ.manualsHandbooksIandC, "manualsHandbooksI&C Link");
		TestUtilDemo.scrollDownForShort();
		TestUtilDemo.clickElement(ReferenceLibraryOBJ.trainingIandC, "trainingI&C link");
	}

	@When("validate check mark next to trainingI&C Section is display")
	public void validate_checkedMark_display_nextTo_trainingIandC() throws Throwable {
		TestUtilDemo.isElementPresent(ReferenceLibraryOBJ.trainingIandCCheckedMark, "checked mark");
	}

	// otherI&Cs
	@When("validate user click on otherI&C SubSection")
	public void user_click_on_otherIandC_subsection() {
		TestUtilDemo.clickElement(ReferenceLibraryOBJ.trainingIandC, "trainingI&C Link");
		TestUtilDemo.scrollDownForShort();
		TestUtilDemo.clickElement(ReferenceLibraryOBJ.otherIandC, "otherIandC link");
	}

	@When("validate check mark next to otherI&C Section is display")
	public void validate_checkedMark_display_nextTo_otherIandC() throws Throwable {
		TestUtilDemo.isElementPresent(ReferenceLibraryOBJ.otherIandCCheckedMark, "checked mark");
	}

	// checklistsI&C
	@When("validate user click on checklistsI&C SubSection")
	public void user_click_on_checklistsIandC_subsection() {
		TestUtilDemo.clickElement(ReferenceLibraryOBJ.otherIandC, "otherI&C Link");
		TestUtilDemo.scrollDownForShort();
		TestUtilDemo.clickElement(ReferenceLibraryOBJ.checklistsIandC, "checklistsI&C link");
	}

	@When("validate check mark next to checklistsI&C Section is display")
	public void validate_checkedMark_display_nextTo_checklistsIandC() throws Throwable {
		TestUtilDemo.isElementPresent(ReferenceLibraryOBJ.checklistsIandCCheckedMark, "checked mark");
	}

	/*********** Below Code for Structural Role *******************************/

	// ProjectSpecificDocumentsStructural

	@Then("validate ProjectSpecificDocumentsStructural section is Display and click")
	public void user_click_on_ProjectSpecificDocumentsStructural() throws Throwable {
		StepCommonMethod.validate_subSection_is_Display_and_click(
				ReferenceLibraryOBJ.projectSpecificDocumentsStructural, "projectSpecificDocumentsStructural");
	}

	@When("Validate user click on the save and complete button and then edit button and checked mark next to ProjectSpecificDocumentsStructuralsection is display")
	public void click_on_save_complete_button_and_edit_button_display_in_Structural() throws Throwable {

		StepCommonMethod.save_complete_click_and_edit_display(ReferenceLibraryOBJ.SAVE_BUTTON,
				ReferenceLibraryOBJ.COMPLETE_BUTTON, ReferenceLibraryOBJ.EDIT_BUTTON,
				ReferenceLibraryOBJ.projectSpecificDocumentsStructuralCheckedMark, "form completed");
	}

	// ClientDocumentsStructuralSection
	@When("validate user click on ClientDocumentsStructural SubSection")
	public void user_click_on_clientDocumentsStructural_subsection() {
		TestUtilDemo.clickElement(ReferenceLibraryOBJ.clientDocumentsStructural, "clientDocumentsStructural link");
	}

	@When("validate check mark next to ClientDocumentsStructural Section is display")
	public void validate_checkedMark_display_nextTo_clientDocumentsStructural() throws Throwable {
		TestUtilDemo.isElementPresent(ReferenceLibraryOBJ.clientDocumentsStructuralCheckedMark, "checked mark");
	}

	// ProceduresStructural
	@When("validate ProceduresStructural section is Display and click")
	public void user_click_on_ProcedureStructural_sub_section() throws Throwable {
		TestUtilDemo.clickElement(ReferenceLibraryOBJ.clientDocumentsStructural, "clientDocumentsStructural Link");
		TestUtilDemo.scrollDownForShort();
		TestUtilDemo.clickElement(ReferenceLibraryOBJ.proceduresStructural, "proceduresStructural Section link");

	}

	@When("Validate user click on the save and complete button and then edit button and checked mark next to ProcedureStructuralsection is display")
	public void click_on_save_complete_button_and_edit_button_display_in_structural() throws Throwable {
		StepCommonMethod.save_complete_click_and_edit_display(ReferenceLibraryOBJ.SAVE_BUTTON,
				ReferenceLibraryOBJ.COMPLETE_BUTTON, ReferenceLibraryOBJ.EDIT_BUTTON,
				ReferenceLibraryOBJ.proceduresStructuralCheckedMark, "form completed");
	}

	// calculationTemplatesStructural
	@When("validate user click on calculationTemplatesStructural SubSection")
	public void user_click_on_calculationTemplatesStructural_subsection() {
		TestUtilDemo.clickElement(ReferenceLibraryOBJ.proceduresStructural, "clientDocumentsStructural Link");
		TestUtilDemo.scrollDownForShort();
		TestUtilDemo.clickElement(ReferenceLibraryOBJ.calculationTemplatesStructural, "clientDocumentsStructural link");
	}

	@When("validate check mark next to calculationTemplatesStructural Section is display")
	public void validate_checkedMark_display_nextTo_calculationTemplatesStructural() throws Throwable {
		TestUtilDemo.isElementPresent(ReferenceLibraryOBJ.calculationTemplatesStructuralCheckedMark, "checked mark");
	}

	// typicalDetailsStructural
	@When("validate user click on typicalDetailsStructural SubSection")
	public void user_click_on_typicalDetailsStructural_subsection() {
		TestUtilDemo.clickElement(ReferenceLibraryOBJ.calculationTemplatesStructural,
				"calculationTemplatesStructural Link");
		TestUtilDemo.scrollDownForShort();
		TestUtilDemo.clickElement(ReferenceLibraryOBJ.typicalDetailsStructural, "typicalDetailsStructural link");
	}

	@When("validate check mark next to typicalDetailsStructural Section is display")
	public void validate_checkedMark_display_nextTo_typicalDetailsStructural() throws Throwable {
		TestUtilDemo.isElementPresent(ReferenceLibraryOBJ.typicalDetailsStructuralCheckedMark, "checked mark");
	}

	// ManualsHandbooksStructural
	@When("validate user click on ManualsHandbooksStructural SubSection")
	public void user_click_on_manualsHandbooksStructural_subsection() {
		TestUtilDemo.clickElement(ReferenceLibraryOBJ.typicalDetailsStructural, "typicalDetailsStructural Link");
		TestUtilDemo.scrollDownForShort();
		TestUtilDemo.clickElement(ReferenceLibraryOBJ.manualsHandbooksStructural, "manualsHandbooksStructural link");
	}

	@When("validate check mark next to ManualsHandbooksStructural Section is display")
	public void validate_checkedMark_display_nextTo_manualsHandbooksStructural() throws Throwable {
		TestUtilDemo.isElementPresent(ReferenceLibraryOBJ.manualsHandbooksStructuralCheckedMark, "checked mark");
	}

	// trainingStructural
	@When("validate user click on trainingStructural SubSection")
	public void user_click_on_trainingStructural_subsection() {
		TestUtilDemo.clickElement(ReferenceLibraryOBJ.manualsHandbooksStructural, "manualsHandbooksStructural Link");
		TestUtilDemo.scrollDownForShort();
		TestUtilDemo.clickElement(ReferenceLibraryOBJ.trainingStructural, "trainingStructural link");
	}

	@When("validate check mark next to trainingStructural Section is display")
	public void validate_checkedMark_display_next_TotrainingStructural() throws Throwable {
		TestUtilDemo.isElementPresent(ReferenceLibraryOBJ.trainingStructuralCheckedMark, "checked mark");
	}

	// otherStructurals
	@When("validate user click on otherStructural SubSection")
	public void user_click_on_otherStructural_subsection() {
		TestUtilDemo.clickElement(ReferenceLibraryOBJ.trainingStructural, "trainingStructural Link");
		TestUtilDemo.scrollDownForShort();
		TestUtilDemo.clickElement(ReferenceLibraryOBJ.otherStructural, "otherStructural link");
	}

	@When("validate check mark next to otherStructural Section is display")
	public void validate_checkedMark_display_nextTo_otherStructural() throws Throwable {
		TestUtilDemo.isElementPresent(ReferenceLibraryOBJ.otherStructuralCheckedMark, "checked mark");
	}

	// checklistsStructural
	@When("validate user click on checklistsStructural SubSection")
	public void user_click_on_checklistsStructural_subsection() {
		TestUtilDemo.clickElement(ReferenceLibraryOBJ.otherStructural, "otherStructural Link");
		TestUtilDemo.scrollDownForShort();
		TestUtilDemo.clickElement(ReferenceLibraryOBJ.checklistsStructural, "checklistsStructural link");
	}

	@When("validate check mark next to checklistsStructural Section is display")
	public void validate_checkedMark_display_nextTo_checklistsStructural() throws Throwable {
		TestUtilDemo.isElementPresent(ReferenceLibraryOBJ.checklistsStructuralCheckedMark, "checked mark");
	}

	/*********** Below Code for Equipment Role *******************************/

	// ProjectSpecificDocumentsEquipment

	@Then("validate ProjectSpecificDocumentsEquipment section is Display and click")
	public void user_click_on_ProjectSpecificDocumentsEquipment() throws Throwable {
		StepCommonMethod.validate_subSection_is_Display_and_click(
				ReferenceLibraryOBJ.projectSpecificDocumentsEquipment, "projectSpecificDocumentsEquipment");
	}

	@When("Validate user click on the save and complete button and then edit button and checked mark next to ProjectSpecificDocumentsEquipmentsection is display")
	public void click_on_save_complete_button_and_edit_button_display_in_Equipment() throws Throwable {

		StepCommonMethod.save_complete_click_and_edit_display(ReferenceLibraryOBJ.SAVE_BUTTON,
				ReferenceLibraryOBJ.COMPLETE_BUTTON, ReferenceLibraryOBJ.EDIT_BUTTON,
				ReferenceLibraryOBJ.projectSpecificDocumentsEquipmentCheckedMark, "form completed");
	}

	// ClientDocumentsEquipmentSection
	@When("validate user click on ClientDocumentsEquipment SubSection")
	public void user_click_on_clientDocumentsEquipment_subsection() {
		TestUtilDemo.clickElement(ReferenceLibraryOBJ.clientDocumentsEquipment, "clientDocumentsEquipment link");
	}

	@When("validate check mark next to ClientDocumentsEquipment Section is display")
	public void validate_checkedMark_display_nextTo_clientDocumentsEquipment() throws Throwable {
		TestUtilDemo.isElementPresent(ReferenceLibraryOBJ.clientDocumentsEquipmentCheckedMark, "checked mark");
	}

	// ProceduresEquipment
	@When("validate ProceduresEquipment section is Display and click")
	public void user_click_on_ProcedureEquipment_sub_section() throws Throwable {
		TestUtilDemo.clickElement(ReferenceLibraryOBJ.clientDocumentsEquipment, "clientDocumentsEquipment Link");
		TestUtilDemo.scrollDownForShort();
		TestUtilDemo.clickElement(ReferenceLibraryOBJ.proceduresEquipment, "proceduresEquipment Section link");

	}

	@When("Validate user click on the save and complete button and then edit button and checked mark next to ProcedureEquipmentsection is display")
	public void click_on_save_complete_button_and_edit_button_display_in_Equipment1() throws Throwable {
		StepCommonMethod.save_complete_click_and_edit_display(ReferenceLibraryOBJ.SAVE_BUTTON,
				ReferenceLibraryOBJ.COMPLETE_BUTTON, ReferenceLibraryOBJ.EDIT_BUTTON,
				ReferenceLibraryOBJ.proceduresEquipmentCheckedMark, "form completed");
	}

	// calculationTemplatesEquipment
	@When("validate user click on calculationTemplatesEquipment SubSection")
	public void user_click_on_calculationTemplatesEquipment_subsection() {
		TestUtilDemo.clickElement(ReferenceLibraryOBJ.proceduresEquipment, "clientDocumentsEquipment Link");
		TestUtilDemo.scrollDownForShort();
		TestUtilDemo.clickElement(ReferenceLibraryOBJ.calculationTemplatesEquipment, "clientDocumentsEquipment link");
	}

	@When("validate check mark next to calculationTemplatesEquipment Section is display")
	public void validate_checkedMark_display_nextTo_calculationTemplatesEquipment() throws Throwable {
		TestUtilDemo.isElementPresent(ReferenceLibraryOBJ.calculationTemplatesEquipmentCheckedMark, "checked mark");
	}

	// typicalDetailsEquipment
	@When("validate user click on typicalDetailsEquipment SubSection")
	public void user_click_on_typicalDetailsEquipment_subsection() {
		TestUtilDemo.clickElement(ReferenceLibraryOBJ.calculationTemplatesEquipment,
				"calculationTemplatesEquipment Link");
		TestUtilDemo.scrollDownForShort();
		TestUtilDemo.clickElement(ReferenceLibraryOBJ.typicalDetailsEquipment, "typicalDetailsEquipment link");
	}

	@When("validate check mark next to typicalDetailsEquipment Section is display")
	public void validate_checkedMark_display_nextTo_typicalDetailsEquipment() throws Throwable {
		TestUtilDemo.isElementPresent(ReferenceLibraryOBJ.typicalDetailsEquipmentCheckedMark, "checked mark");
	}

	// ManualsHandbooksEquipment
	@When("validate user click on ManualsHandbooksEquipment SubSection")
	public void user_click_on_manualsHandbooksEquipment_subsection() {
		TestUtilDemo.clickElement(ReferenceLibraryOBJ.typicalDetailsEquipment, "typicalDetailsEquipment Link");
		TestUtilDemo.scrollDownForShort();
		TestUtilDemo.clickElement(ReferenceLibraryOBJ.manualsHandbooksEquipment, "manualsHandbooksEquipment link");
	}

	@When("validate check mark next to ManualsHandbooksEquipment Section is display")
	public void validate_checkedMark_display_nextTo_manualsHandbooksEquipment() throws Throwable {
		TestUtilDemo.isElementPresent(ReferenceLibraryOBJ.manualsHandbooksEquipmentCheckedMark, "checked mark");
	}

	// trainingEquipment
	@When("validate user click on trainingEquipment SubSection")
	public void user_click_on_trainingEquipment_subsection() {
		TestUtilDemo.clickElement(ReferenceLibraryOBJ.manualsHandbooksEquipment, "manualsHandbooksEquipment Link");
		TestUtilDemo.scrollDownForShort();
		TestUtilDemo.clickElement(ReferenceLibraryOBJ.trainingEquipment, "trainingEquipment link");
	}

	@When("validate check mark next to trainingEquipment Section is display")
	public void validate_checkedMark_display_next_TotrainingEquipment() throws Throwable {
		TestUtilDemo.isElementPresent(ReferenceLibraryOBJ.trainingEquipmentCheckedMark, "checked mark");
	}

	// otherEquipments
	@When("validate user click on otherEquipment SubSection")
	public void user_click_on_otherEquipment_subsection() {
		TestUtilDemo.clickElement(ReferenceLibraryOBJ.trainingEquipment, "trainingEquipment Link");
		TestUtilDemo.scrollDownForShort();
		TestUtilDemo.clickElement(ReferenceLibraryOBJ.otherEquipment, "otherEquipment link");
	}

	@When("validate check mark next to otherEquipment Section is display")
	public void validate_checkedMark_display_nextTo_otherEquipment() throws Throwable {
		TestUtilDemo.isElementPresent(ReferenceLibraryOBJ.otherEquipmentCheckedMark, "checked mark");
	}

	// checklistsEquipment
	@When("validate user click on checklistsEquipment SubSection")
	public void user_click_on_checklistsEquipment_subsection() {
		TestUtilDemo.clickElement(ReferenceLibraryOBJ.otherEquipment, "otherEquipment Link");
		TestUtilDemo.scrollDownForShort();
		TestUtilDemo.clickElement(ReferenceLibraryOBJ.checklistsEquipment, "checklistsEquipment link");
	}

	@When("validate check mark next to checklistsEquipment Section is display")
	public void validate_checkedMark_display_nextTo_checklistsEquipment() throws Throwable {
		TestUtilDemo.isElementPresent(ReferenceLibraryOBJ.checklistsEquipmentCheckedMark, "checked mark");
	}
}
