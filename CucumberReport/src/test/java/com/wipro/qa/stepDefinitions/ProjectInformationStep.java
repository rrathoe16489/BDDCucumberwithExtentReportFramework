package com.wipro.qa.stepDefinitions;

import io.cucumber.java.After;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.junit.Assert;
import org.openqa.selenium.By;

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
public class ProjectInformationStep extends TestBase {

	public static By PROJECTSELECTION;
	public static String date = "hhmmss";
	static SimpleDateFormat sdf = new SimpleDateFormat(date);
	public static String date1 = sdf.format(new Date());

	@Given("^valildate user create new project card$")
	public void validate_user_create_new_project() throws Throwable {
		Thread.sleep(10000);
		TestUtilDemo.clickElement(ProjectInfoOBJ.createNewProject, "");
		Thread.sleep(2000);
		TestUtilDemo.doSendKeys(ProjectInfoOBJ.projectNumberTextBox, date1);
		Thread.sleep(1000);
		TestUtilDemo.doSendKeys(ProjectInfoOBJ.projectNameTextBox, "Automation Project");
		Thread.sleep(1000);
		TestUtilDemo.clickElement(ProjectInfoOBJ.createButton, "");
		Thread.sleep(6000);
	}

	@Given("^validate user select newly created project card$")
	public void validate_user_select_project() throws Throwable {
		PROJECTSELECTION = By.xpath("//div[@class='card-body']/p[text()='" + date1 + "']");
		TestUtilDemo.clickElement(PROJECTSELECTION, "selecting newly created project");
		Thread.sleep(2000);
	}

	@Given("^validate when user login as a PLI role$")
	public void login_as_PLI_in_projectInformation() throws Throwable {

		/*
		 * TestBase.initialization();
		 * TestUtilDemo.doSendKeys(WBSInformationOBJ.userName,
		 * prop.getProperty("superuser_username")); Thread.sleep(3000);
		 * TestUtilDemo.clickElement(ProjectInfoOBJ.SIGNINBUTTON, "");
		 * Thread.sleep(5000);
		 */

		TestBase.initialization();
		TestUtilDemo.doSendKeys(WBSInformationOBJ.userName, prop.getProperty("superuser_username"));
		Thread.sleep(2000);
		TestUtilDemo.clickElement(ProjectInfoOBJ.SIGNINBUTTON, "");
		Thread.sleep(2000);
		TestUtilDemo.clickElement(ProjectInfoOBJ.PROJECTSELECTIONTesting, "Project Selection");

	}

	// Piping Loging
	@Given("^validate when user login as a Piping Role$")
	public void login_as_a_piping_role() throws Throwable {

		/*
		 * TestBase.initialization();
		 * TestUtilDemo.doSendKeys(WBSInformationOBJ.userName,
		 * prop.getProperty("piping_username")); Thread.sleep(2000);
		 * TestUtilDemo.clickElement(ProjectInfoOBJ.SIGNINBUTTON, "");
		 * Thread.sleep(5000);
		 */

		TestBase.initialization();
		TestUtilDemo.doSendKeys(WBSInformationOBJ.userName, "piping@bv.com");
		Thread.sleep(2000);
		TestUtilDemo.clickElement(ProjectInfoOBJ.SIGNINBUTTON, "");
		Thread.sleep(2000);
		TestUtilDemo.clickElement(ProjectInfoOBJ.PROJECTSELECTIONTesting, "Project Selection");

	}

	// Process Loging
	@Given("^validate user login as a Process Role$")
	public void login_as_a_process_role() throws Throwable {
		/*
		 * TestBase.initialization();
		 * TestUtilDemo.doSendKeys(WBSInformationOBJ.userName, "process@bv.com");
		 * Thread.sleep(2000); TestUtilDemo.clickElement(ProjectInfoOBJ.SIGNINBUTTON,
		 * ""); Thread.sleep(5000);
		 */

		TestBase.initialization();
		TestUtilDemo.doSendKeys(WBSInformationOBJ.userName, "process@bv.com");
		Thread.sleep(2000);
		TestUtilDemo.clickElement(ProjectInfoOBJ.SIGNINBUTTON, "");
		Thread.sleep(2000);
		TestUtilDemo.clickElement(ProjectInfoOBJ.PROJECTSELECTIONTesting, "Project Selection");

	}

	// Equipment Loging
	@Given("^validate user login as a Equipment Role$")
	public void login_as_a_equipment_role() throws Throwable {

		/*
		 * TestBase.initialization();
		 * TestUtilDemo.doSendKeys(WBSInformationOBJ.userName, "equipment@bv.com");
		 * Thread.sleep(2000); TestUtilDemo.clickElement(ProjectInfoOBJ.SIGNINBUTTON,
		 * ""); Thread.sleep(5000);
		 */

		TestBase.initialization();
		TestUtilDemo.doSendKeys(WBSInformationOBJ.userName, "equipment@bv.com");
		Thread.sleep(2000);
		TestUtilDemo.clickElement(ProjectInfoOBJ.SIGNINBUTTON, "");
		Thread.sleep(2000);
		TestUtilDemo.clickElement(ProjectInfoOBJ.PROJECTSELECTIONTesting, "Project Selection");

	}

	// Electrical Loging
	@Given("^validate user login as a Electrical Role$")
	public void login_as_a_electrical_role() throws Throwable {

		/*
		 * TestBase.initialization();
		 * TestUtilDemo.doSendKeys(WBSInformationOBJ.userName, "equipment@bv.com");
		 * Thread.sleep(2000); TestUtilDemo.clickElement(ProjectInfoOBJ.SIGNINBUTTON,
		 * ""); Thread.sleep(5000);
		 */
		TestBase.initialization();
		TestUtilDemo.doSendKeys(WBSInformationOBJ.userName, "electrical@bv.com");
		Thread.sleep(2000);
		TestUtilDemo.clickElement(ProjectInfoOBJ.SIGNINBUTTON, "");
		Thread.sleep(2000);
		TestUtilDemo.clickElement(ProjectInfoOBJ.PROJECTSELECTIONTesting, "Project Selection");

	}

	// IandC Loging
	@Given("^validate user login as a IandC Role$")
	public void login_as_a_IandC_role() throws Throwable {

		/*
		 * TestBase.initialization();
		 * TestUtilDemo.doSendKeys(WBSInformationOBJ.userName, "equipment@bv.com");
		 * Thread.sleep(2000); TestUtilDemo.clickElement(ProjectInfoOBJ.SIGNINBUTTON,
		 * ""); Thread.sleep(5000);
		 */

		TestBase.initialization();
		TestUtilDemo.doSendKeys(WBSInformationOBJ.userName, "iandc@bv.com");
		Thread.sleep(2000);
		TestUtilDemo.clickElement(ProjectInfoOBJ.SIGNINBUTTON, "");
		Thread.sleep(2000);
		TestUtilDemo.clickElement(ProjectInfoOBJ.PROJECTSELECTIONTesting, "Project Selection");

	}

	// Structural Loging
	@Given("^validate user login as a Structural Role$")
	public void login_as_a_structural_role() throws Throwable {

		/*
		 * TestBase.initialization();
		 * TestUtilDemo.doSendKeys(WBSInformationOBJ.userName, "equipment@bv.com");
		 * Thread.sleep(2000); TestUtilDemo.clickElement(ProjectInfoOBJ.SIGNINBUTTON,
		 * ""); Thread.sleep(5000);
		 */

		TestBase.initialization();
		TestUtilDemo.doSendKeys(WBSInformationOBJ.userName, "structural@bv.com");
		Thread.sleep(2000);
		TestUtilDemo.clickElement(ProjectInfoOBJ.SIGNINBUTTON, "");
		Thread.sleep(2000);
		TestUtilDemo.clickElement(ProjectInfoOBJ.PROJECTSELECTIONTesting, "Project Selection");

	}

	@Then("^validate ProjectInformation Headeris Display$")
	public void validate_project_information_headeris_display() throws Throwable {
		Thread.sleep(3000);
		TestUtilDemo.clickElement(ProjectInfoOBJ.PROJECTINFORMATION_HEADER, "ProjectInformation Header Link");
		String informationHeaderEX = prop.getProperty("projectInformation");
		String informationHeaderAC = TestUtilDemo.getTex(ProjectInfoOBJ.projectInformation_headerName);
		Assert.assertEquals(informationHeaderAC, informationHeaderEX);
		Thread.sleep(1000);
	}

	@Then("^validate WBSInformation Header is Display$")
	public void validate_wbs_information_header_is_display() {
		String wbsInformationHeaderEX = prop.getProperty("wbsInformation");
		String wbsInformationHeaderAC = TestUtilDemo.getTex(ProjectInfoOBJ.wbsInformation_headerName);
		Assert.assertEquals(wbsInformationHeaderAC, wbsInformationHeaderEX);

	}

	@Then("^validate ImportManhours Header is Display$")
	public void validate_import_manhours_header_is_display() {
		String manhourBudgetsHeaderEX = prop.getProperty("manhourBudgets");
		String manhourBudgetsHeaderAC = TestUtilDemo.getTex(ProjectInfoOBJ.manHourBudgets_headerName);
		Assert.assertEquals(manhourBudgetsHeaderAC, manhourBudgetsHeaderEX);

	}

	@Then("^valdiate ReferenceLibrary Header is Display$")
	public void valdiate_reference_library_header_is_display() {
		String referenceLibraryHeaderEX = prop.getProperty("referenceLibrary");
		String referenceLibraryHeaderAC = TestUtilDemo.getTex(ProjectInfoOBJ.referenceLibrary_headerName);
		Assert.assertEquals(referenceLibraryHeaderAC, referenceLibraryHeaderEX);

	}

	@Then("^valdiate WorkFlowRules Header is Display$")
	public void valdiate_work_flow_rules_header_is_display() {
		String workflowRulesHeaderEX = prop.getProperty("workflowRules");
		String workflowRulesHeaderAC = TestUtilDemo.getTex(ProjectInfoOBJ.workFlowRule_headerName);
		Assert.assertEquals(workflowRulesHeaderAC, workflowRulesHeaderEX);
	}

	@Then("^valdiate AssignProjectLeads Header is Display$")
	public void valdiate_assign_project_leads_header_is_display() {
		String assignTeamHeaderEX = prop.getProperty("assignTeam");
		String assignTeamHeaderAC = TestUtilDemo.getTex(ProjectInfoOBJ.assignTeam_headerName);
		Assert.assertEquals(assignTeamHeaderAC, assignTeamHeaderEX);
	}

	@Then("^validate BreadCrumbText is Display$")
	public void validate_bread_crumb_text_is_display() throws Throwable {
		boolean flag = TestUtilDemo.isElementPresent(ProjectInfoOBJ.BREADCRUMB_TEXT, "breadCrumb text");
		Assert.assertTrue(flag);
	}

	@Then("^validate ProjectInformationSection is Display$")
	public void validate_project_information_section_is_display() {
		boolean flag = TestUtilDemo.isElementPresent(ProjectInfoOBJ.PROJECTINFORMATION_SECTION,
				"Project Information Section text");
		Assert.assertTrue(flag);
	}

	@Then("^validate GeneralProjectInformationSection is Display$")
	public void validate_general_project_information_section_is_display() {
		boolean flag = TestUtilDemo.isElementPresent(ProjectInfoOBJ.GENERALPROJECTINFORMATION_SECTION,
				"General Project Information Section text");
		Assert.assertTrue(flag);
	}

	@Then("^validate ProjectScopeSection is Display$")
	public void validate_project_scope_section_is_display() {
		boolean flag = TestUtilDemo.isElementPresent(ProjectInfoOBJ.PROJECTSCOPE_SECTION, "Project scope Section text");
		Assert.assertTrue(flag);
	}

	@Then("^validate TechnicalRequirementsSection is Display$")
	public void validate_technical_requirements_section_is_display() {
		boolean flag = TestUtilDemo.isElementPresent(ProjectInfoOBJ.TECHNICALREQUIREMENT_SECTION,
				" Technical Requirement Section text");
		Assert.assertTrue(flag);
	}

	@Then("^validate laminarLogo1 is Display$")
	public void validate_laminar_logo1_is_display() {
		boolean flag = TestUtilDemo.isElementPresent(ProjectInfoOBJ.LAMINAR_LOGO1, "Laminar Logo1");
		Assert.assertTrue(flag);
	}

	@Then("^validate laminarLogo2 is Display$")
	public void validate_laminar_logo2_is_display() {
		boolean flag = TestUtilDemo.isElementPresent(ProjectInfoOBJ.LAMINAR_LOGO2, "Laminar Logo2");
		Assert.assertTrue(flag);
	}

	@Then("^validate ResetBtn is Display$")
	public void validate_reset_btn_is_display() {
		boolean flag = TestUtilDemo.isElementPresent(ProjectInfoOBJ.RESET_BUTTON, " Reset Button");
		Assert.assertTrue(flag);
	}

	@Then("^validate SaveBtn is Display$")
	public void validate_save_btn_is_display() {
		boolean flag = TestUtilDemo.isElementPresent(ProjectInfoOBJ.SAVE_BUTTON, " Save Button");
		Assert.assertTrue(flag);
	}

	@Then("^validate CompleteBtn is Display$")
	public void validate_complete_btn_is_display() {
		boolean flag = TestUtilDemo.isElementPresent(ProjectInfoOBJ.COMPLETE_BUTTON, " Complete Button");
		Assert.assertTrue(flag);
	}

	/* Below is new added code for functional and UI */

	@When("User click on the GeneralProjectInformation SubSection First Time")
	public void user_click_on_the_general_project_information_sub_section_first_time() throws Throwable {
		TestUtilDemo.clickElement(ProjectInfoOBJ.GENERALPROJECTINFORMATION_SECTION,
				"GeneralProjectInformation Section Link");
	}

	@Then("Validate BaiscProjectData Ttile is display at top")
	public void validate_baisc_project_data_ttile_is_display_at_top() {
		boolean flag = TestUtilDemo.isElementPresent(ProjectInfoOBJ.generalPISubsectionTitle,
				" BaiscProjectData Ttile Text");
		Assert.assertTrue(flag);

	}

	@Then("validate ResetBtn SaveBtn and CompleteBttn is Disable")
	public void validate_ResetBtn_SaveBtn_and_CompleteBttn_is_disable() {
		System.out
				.println("Disable logic remain cause of development done in nodeJs/react so disable not working here");
	}

	@When("Verify user can select value from the Project Type dropdown")
	public void verify_user_can_select_value_from_the_project_type_dropdown() throws Throwable {
		Thread.sleep(3000);
		TestUtilDemo.clickElement(ProjectInfoOBJ.projectTypeDropDown, "projectType Dropdown");
		TestUtilDemo.clickElement(ProjectInfoOBJ.projectTypeDropDownValue, "EPC Dropdown value");
		Thread.sleep(2000);
	}

	@Then("validate ResetBtn is Enable")
	public void validate_reset_btn_is_enable() {
		boolean flag = TestUtilDemo.isEnabled(ProjectInfoOBJ.RESET_BUTTON, " Reset Button");
		Assert.assertTrue(flag);
	}

	@Then("validate SaveBtn is Enable")
	public void validate_save_btn_is_enable() {
		System.out.println("Developement is under progress from Dev Team logic not implemented from Dev Team");
		// boolean flag = TestUtilDemo.isEnabled(ProjectInfoOBJ.SAVE_BUTTON, " Save
		// Button");
		// Assert.assertTrue(flag);

	}

	@Then("validate CompleteBtn is Disable")
	public void validate_complete_btn_is_disable() {
		System.out
				.println("Disable logic remain cause of development done in nodeJs/react so disable not working here");
		/*
		 * boolean flag = TestUtilDemo.isEnabled(ProjectInfoOBJ.COMPLETE_BUTTON,
		 * " Complete Button"); Assert.assertFalse(flag);
		 */

	}

	@When("Validate user click on ResetButton")
	public void validate_user_click_on_reset_button() throws Throwable {
		TestUtilDemo.clickElement(ProjectInfoOBJ.RESET_BUTTON, " Reset Button Link");
		Thread.sleep(2000);
	}

	@Then("Validate ResetPage modal is popUp")
	public void validate_reset_page_modal_is_pop_up() throws Throwable {
		boolean flag = TestUtilDemo.isElementPresent(ProjectInfoOBJ.resetPageModal, " ResetPage modal");
		Assert.assertTrue(flag);
		Thread.sleep(5000);
	}

	@Then("^validate Reset message is display under pop Modal$")
	public void validate_reset_message_is_display_under_pop_modal() throws Throwable {
		String resetMessageEX = prop.getProperty("resetMessage");
		String resetMessageAC = TestUtilDemo.getTex(ProjectInfoOBJ.resetMessage);
		Assert.assertEquals(resetMessageAC, resetMessageEX);
		Thread.sleep(2000);
	}

	@Then("validate click on cancel button modal is disapear")
	public void validate_click_on_cancel_button_modal_is_disapear() throws Throwable {
		TestUtilDemo.clickElement(ProjectInfoOBJ.cancelButton, " Cancel button click");
		Thread.sleep(5000);
	}

	@Then("validate again user click on reset button")
	public void validate_again_user_click_on_reset_button() throws Throwable {
		TestUtilDemo.clickElement(ProjectInfoOBJ.RESET_BUTTON, " Again Reset Button click");
		Thread.sleep(2000);
	}

	@Then("validate user click on continue button")
	public void validate_user_click_on_continue_button() throws Throwable {
		TestUtilDemo.clickElement(ProjectInfoOBJ.continueButton, "continue Button click");
		Thread.sleep(2000);
	}

	@When("Verify user can select value from the TypeOfFacility dropdown")
	public void verify_user_can_select_value_from_the_type_of_facility_dropdown() throws Throwable {
		TestUtilDemo.clickElement(ProjectInfoOBJ.typeofFacilityDropDown, "TypeOfFacility Dropdown");
		TestUtilDemo.clickElement(ProjectInfoOBJ.typeofFacilityDropDownValue, "Fertilizer Dropdown value");
		Thread.sleep(2000);
	}

	@Then("Verify user can select value from the SupportingOffices dropdown")
	public void verify_user_can_select_value_from_the_supporting_offices_dropdown() throws Throwable {
		TestUtilDemo.clickElement(ProjectInfoOBJ.supportingOfficesDropDown, "SupportingOffices Dropdown");
		TestUtilDemo.clickElement(ProjectInfoOBJ.supportingOfficesDropDownValue, "Mumbai Dropdown value");
		Thread.sleep(2000);
	}

	@Then("Verify user can select radio button in RiskAssessmentCompleted field")
	public void verify_user_can_select_radio_button_in_risk_assessment_completed_field() throws Throwable {
		TestUtilDemo.clickElement(ProjectInfoOBJ.riskAssessmentCompletedYRB, "RiskAssessmentCompleted radio button");
		Thread.sleep(2000);
	}

	@Then("Verify user can enter value in ProposalProjectRiskScore Textbox {string}")
	public void verify_user_can_enter_value_in_proposal_project_risk_score_textbox(String riskscore) throws Throwable {
		TestUtilDemo.clickElement(ProjectInfoOBJ.proposalProjectRiskScoreTF, "ProposalProjectRiskScore Textbox");
		TestUtilDemo.clearAnddoSendKeys(ProjectInfoOBJ.proposalProjectRiskScoreTF, riskscore);
		Thread.sleep(2000);
	}

	@Then("Verify user can enter value in ProposalProjectRiskLevel Textbox {string}")
	public void verify_user_can_enter_value_in_proposal_project_risk_level_textbox(String risklevel) throws Throwable {
		TestUtilDemo.clickElement(ProjectInfoOBJ.proposalProjectRiskLevelTF, "ProposalProjectRiskLevel Textbox");
		TestUtilDemo.clearAnddoSendKeys(ProjectInfoOBJ.proposalProjectRiskLevelTF, risklevel);
		Thread.sleep(2000);
	}

	@Then("Verify user can select value from the LeadOffice dropdown")
	public void verify_user_can_select_value_from_the_lead_office_dropdown() throws Throwable {
		TestUtilDemo.clickElement(ProjectInfoOBJ.leadOfficeDropDown, "LeadOffice Dropdown");
		TestUtilDemo.clickElement(ProjectInfoOBJ.leadOfficeDropDownValue, "Mumbai Dropdown value");
		Thread.sleep(2000);
	}

	@Then("Verify user can enter the value in FacilityTechnology textBox {string}")
	public void verify_user_can_enter_the_value_in_facility_technology_text_box(String FacilityTechnology)
			throws Throwable {
		TestUtilDemo.clickElement(ProjectInfoOBJ.facilityTechnologyTF, "FacilityTechnology Textbox");
		TestUtilDemo.clearAnddoSendKeys(ProjectInfoOBJ.facilityTechnologyTF, FacilityTechnology);
		Thread.sleep(5000);
	}

	@Then("Verify user can select value from the ConstructionContractType dropdown")
	public void verify_user_can_select_value_from_the_construction_contract_type_dropdown() throws Throwable {
		TestUtilDemo.clickElement(ProjectInfoOBJ.constructionContractTypeDropDown, "ConstructionContractType Dropdown");
		TestUtilDemo.clickElement(ProjectInfoOBJ.constructionContractTypeDropDownValue, "Subcontract Dropdown value");
		Thread.sleep(5000);
		TestUtilDemo.scrollDownToElementPresent(ProjectInfoOBJ.clientNameFN);
	}

	@Then("Verify user can enter value in ClientName Textbox {string}")
	public void verify_user_can_enter_value_in_client_name_textbox(String clientname) throws Throwable {
		String clientName = driver.findElement(ProjectInfoOBJ.clientNameTF).getAttribute("value");
		if (clientName.equals("Client Name Testing")) {
			TestUtilDemo.clickElement(ProjectInfoOBJ.clientNameTF, "FacilityTechnology Textbox");
			TestUtilDemo.clearAnddoSendKeys(ProjectInfoOBJ.clientNameTF, clientname);
			Thread.sleep(2000);
		} else {
			TestUtilDemo.doSendKeys(ProjectInfoOBJ.clientNameTF, clientname);
		}

	}

	@Then("^Verify user can select radio button from BrownAndGreen field$")
	public void verify_user_can_select_radio_button_from_brown_and_green_field() throws Throwable {
		TestUtilDemo.clickElement(ProjectInfoOBJ.brownFieldBFRB, "BrownAndGreen field radioButton");
		Thread.sleep(5000);
	}

	@Then("Verify user can select radio button from IsBlackAndVeatch field")
	public void verify_user_can_select_radio_button_from_IsBlackAndVeatch_field() throws Throwable {
		TestUtilDemo.clickElement(ProjectInfoOBJ.isBlackAndVeatchYRB, "IsBlackAndVeatch field radioButton");
		Thread.sleep(5000);
		TestUtilDemo.scrollDown();
	}

	@Then("Verify user can select radio button from AreThereForiegnContract field")
	public void verify_user_can_select_radio_button_from_are_there_foriegn_contract_field() throws Throwable {
		TestUtilDemo.clickElement(ProjectInfoOBJ.areTheresForiegnContractYRB,
				"AreThereForiegnContract field radioButton");
		Thread.sleep(2000);
	}

	@Then("Validate ProjectLocation Ttile is display")
	public void validate_project_location_ttile_is_display() {
		TestUtilDemo.isElementPresent(ProjectInfoOBJ.projectLocationSubSectionTitle, "ProjectLocation Ttile ");

	}

	@Then("Validate AddField IconText is display")
	public void validate_add_field_icon_text_is_display() {
		TestUtilDemo.isElementPresent(ProjectInfoOBJ.addFieldIcon2, "AddField IconText ");

	}

	@Then("Verify user can enter value in ProjectLocationState Textbox {string}")
	public void verify_user_can_enter_value_in_project_location_state_textbox(String locationstate) throws Throwable {
		TestUtilDemo.clickElement(ProjectInfoOBJ.projectLocationStateTF, "ProjectLocationState Textbox");
		TestUtilDemo.clearAnddoSendKeys(ProjectInfoOBJ.projectLocationStateTF, locationstate);
		Thread.sleep(2000);
	}

	@Then("Verify user can enter value in ProjectLocationCountry Textbox {string}")
	public void verify_user_can_enter_value_in_project_location_country_textbox(String projectLocationcountry)
			throws Throwable {
		TestUtilDemo.clickElement(ProjectInfoOBJ.projectLocationCountryTF, "ProjectLocationCountry Textbox");
		TestUtilDemo.clearAnddoSendKeys(ProjectInfoOBJ.projectLocationCountryTF, projectLocationcountry);
		Thread.sleep(2000);
	}

	@Then("Verify user can enter value in ProjectLocationCity Textbox {string}")
	public void verify_user_can_enter_value_in_project_location_city_textbox(String projectLocationCity)
			throws Throwable {
		TestUtilDemo.clickElement(ProjectInfoOBJ.projectLocationCityTF, "ProjectLocationCity Textbox");
		TestUtilDemo.clearAnddoSendKeys(ProjectInfoOBJ.projectLocationCityTF, projectLocationCity);
		Thread.sleep(2000);
	}

	@Then("Validate KeyScheduleDates Ttile is display")
	public void validate_key_schedule_dates_ttile_is_display() {
		TestUtilDemo.isElementPresent(ProjectInfoOBJ.keyScheduleDatesSubSectionTitle, "KeyScheduleDates Ttile");

	}

	@Then("Verify user can enter value in EstEngineeringTimeframe Textbox {string}")
	public void verify_user_can_enter_value_in_est_engineering_timeframe_textbox(String engineeringTimeFrame)
			throws InterruptedException {
		TestUtilDemo.clickElement(ProjectInfoOBJ.engineeringTimeframeTF, "EstEngineeringTimeframe Textbox");
		TestUtilDemo.clearAnddoSendKeys(ProjectInfoOBJ.engineeringTimeframeTF, engineeringTimeFrame);
		Thread.sleep(2000);
	}

	@Then("Verify user can enter value in EstConstructionTimeframe Textbox {string}")
	public void verify_user_can_enter_value_in_est_construction_timeframe_textbox(String EngineeringConstrTimeframe)
			throws Throwable {
		TestUtilDemo.clickElement(ProjectInfoOBJ.constructionTimeframeTF, "EstConstructionTimeframe Textbox");
		TestUtilDemo.clearAnddoSendKeys(ProjectInfoOBJ.constructionTimeframeTF, EngineeringConstrTimeframe);
		Thread.sleep(2000);
	}

	@When("Validate tab feature LeftToRight movement from current cell")
	public void validate_tab_feature_left_to_right_movement_from_current_cell() {

		System.out.println("Util Method not created as of now ");
	}

	@When("validate user select multiple values from the dropdown")
	public void validate_user_select_multiple_values_from_the_dropdown() {
		System.out.println(
				"select multiple values from the dropdown Development not done from Dev team once done, will automate that feature ");
	}

	@When("Validate user select OTHER from the dropDown")
	public void validate_user_select_other_from_the_drop_down() throws Throwable {
		TestUtilDemo.clickElement(ProjectInfoOBJ.typeofFacilityDropDown, "TypeOfFacility Dropdown");
		TestUtilDemo.clickElement(ProjectInfoOBJ.typeofFacilityDropDownOtherValue, "Other Dropdown value");
		Thread.sleep(2000);
	}

	@Then("Validate TextBox is display and user can enter custom value for Other option")
	public void Validate_TextBox_is_display_and_user_can_enter_custom_value_for_Other_option() {
		System.out.println(
				"select OTHER from the dropDown and enter manual value in textbox Development not done from Dev team once done, will automate that feature");

	}

	@When("Validate user click on the projectScope Section")
	public void validate_user_click_on_the_project_scope_section() throws Throwable {
		TestUtilDemo.clickElement(ProjectInfoOBJ.PROJECTSCOPE_SECTION, "projectScope Section");
		Thread.sleep(5000);
	}

	@When("Validate user can Save the information by clicking on Save button")
	public void validate_user_can_save_the_information_by_clicking_on_save_button() throws Throwable {
		TestUtilDemo.clickElement(ProjectInfoOBJ.SAVE_BUTTON, "Save the information");
		Thread.sleep(2000);
	}

	@Then("^Validate Saving information message is display$")
	public void validate_saving_information_message_is_display() throws Throwable {
		String savingMessageEX = prop.getProperty("savingMessage");
		String savingMessageAC = TestUtilDemo.getTex(ProjectInfoOBJ.saveMessage);
		Assert.assertEquals(savingMessageAC, savingMessageEX);
		Thread.sleep(2000);
	}

	@Then("validate ResetBtn is Disable")
	public void validate_ResetBtn_is_Disable() {
		System.out
				.println("Disable logic remain cause of development done in nodeJs/react so disable not working here");
	}

	@Then("validate SaveBtn is Disable")
	public void validate_SaveBtn_is_Disable() {
		System.out
				.println("Disable logic remain cause of development done in nodeJs/react so disable not working here");
	}

	@Then("validate CompleteBtn is Enable")
	public void validate_CompleteBtn_is_Enable() throws Throwable {
		TestUtilDemo.isEnabled(ProjectInfoOBJ.COMPLETE_BUTTON, "Complete Button Enable");
		Thread.sleep(2000);
	}

	@When("Validate user enter the value in clientName field textbox {string}")
	public void validate_user_enter_the_value_in_client_name_field_textbox(String client_name) throws Throwable {
		TestUtilDemo.clickElement(ProjectInfoOBJ.clientNameTF, "FacilityTechnology Textbox");
		TestUtilDemo.clearAnddoSendKeys(ProjectInfoOBJ.clientNameTF, client_name);
		Thread.sleep(2000);
	}

	@When("Validate user click on the complete button")
	public void validate_user_click_on_the_complete_button() throws Throwable {
		TestUtilDemo.clickElement(ProjectInfoOBJ.COMPLETE_BUTTON, "complete button");
		Thread.sleep(2000);
	}

	@Then("validate only Edit button is display")
	public void validate_only_edit_button_is_display() throws Throwable {
		TestUtilDemo.isElementPresent(ProjectInfoOBJ.EDIT_BUTTON, "Edit button");
		Thread.sleep(2000);
	}

	@Then("Vaidate the section have check next to the Section")
	public void vaidate_the_section_have_check_next_to_the_section() throws Throwable {
		TestUtilDemo.isElementPresent(ProjectInfoOBJ.GPICheckedMark, "GPICheckedMark");
		Thread.sleep(2000);
	}

	@Then("Validate user click on the Edit button")
	public void validate_user_click_on_the_edit_button() throws Throwable {
		TestUtilDemo.clickElement(ProjectInfoOBJ.EDIT_BUTTON, "Edit button click");
		Thread.sleep(2000);

	}

	@Then("Validate check next to the Section is removed")
	public void validate_check_next_to_the_section_is_removed() throws Throwable {
		TestUtilDemo.isElementPresent(ProjectInfoOBJ.GPIUnCheckedMark, "Edit button");
		Thread.sleep(2000);
	}

	@Then("validate CompleteBttn is Enable")
	public void validate_completeBttn_is_enable() throws Throwable {
		TestUtilDemo.isEnabled(ProjectInfoOBJ.COMPLETE_BUTTON, "COmplete button");
		Thread.sleep(2000);
	}

	@When("validate addField button is Display With BPD title")
	public void validate_add_field_button_is_display_with_bpd_title() {
		TestUtilDemo.scrollDownForLogPage();
		TestUtilDemo.isElementPresent(ProjectInfoOBJ.addFieldIcon2, "AddField1 IconText ");

	}

	@Then("validate user click on AddField button")
	public void validate_user_click_on_add_field_button() throws Throwable {
		TestUtilDemo.scrollDownForLogPage();
		TestUtilDemo.clickElement(ProjectInfoOBJ.addFieldIcon2, "AddField1 IconText ");
		Thread.sleep(2000);
	}

	@Then("validate user enter value in fieldName textBox {string}")
	public void validate_user_enter_value_in_field_name_text_box(String fieldname) throws Throwable {
		TestUtilDemo.clickElement(ProjectInfoOBJ.fieldNameTextBox, "fieldName Textbox");
		TestUtilDemo.doSendKeys(ProjectInfoOBJ.fieldNameTextBox, fieldname);
		Thread.sleep(2000);
	}

	@Then("Validate user select value from the valueType dropDown")
	public void validate_user_select_value_from_the_value_type_drop_down() throws Throwable {
		TestUtilDemo.dropDownSelectByIndex(ProjectInfoOBJ.valueTypeDropDown, 2, "ValueType dropdown value");
		Thread.sleep(2000);
	}

	@Then("Validate user click on the cancel button")
	public void validate_user_click_on_the_cancel_button() throws Throwable {
		TestUtilDemo.clickElement(ProjectInfoOBJ.addfieldCancelButton, "cancel button");
		Thread.sleep(2000);
	}

	@Then("validate PROJECTSETUP_TOPTEXT screen display")
	public void validate_PROJECTSETUP_TOPTEXT_screen_display() {
		TestUtilDemo.isElementPresent(ProjectInfoOBJ.PROJECTSETUP_TOPTEXT, "PROJECTSETUP_TOPTEXT screen");
	}

	@Then("validate user again click on AddField Btn")
	public void validate_user_again_click_on_add_field_btn() throws Throwable {
		TestUtilDemo.scrollDownForLogPage();
		TestUtilDemo.clickElement(ProjectInfoOBJ.addFieldIcon2, "AddField1 IconText ");
		Thread.sleep(2000);

	}

	@Then("validate user click on cross icon")
	public void validate_user_click_on_cross_icon() throws Throwable {
		TestUtilDemo.clickElement(ProjectInfoOBJ.addFieldCrossIcon, "click on cross icon");
		Thread.sleep(2000);
	}

	@Then("Validate PROJECTSETUP_TOPTEXT screen is display")
	public void validate_PROJECTSETUP_TOPTEXT_screen_is_display() {
		TestUtilDemo.isElementPresent(ProjectInfoOBJ.PROJECTSETUP_TOPTEXT, "PROJECTSETUP_TOPTEXT screen");

	}

	@When("validate user click on AddField icon")
	public void validate_user_click_on_add_field_icon() throws Throwable {
		TestUtilDemo.scrollDownForLogPage();
		TestUtilDemo.clickElement(ProjectInfoOBJ.addFieldIcon2, "addFieldIcon2 IconText ");
		Thread.sleep(2000);
	}

	@Then("validate user click on the save button")
	public void validate_user_click_on_the_save_button() throws Throwable {
		TestUtilDemo.clickElement(ProjectInfoOBJ.addfieldSaveButton, "click on the save button ");
		Thread.sleep(2000);
	}

	@Then("^validate filed validation eror message is display$")
	public void validate_filed_validation_eror_message_is_display() throws Throwable {
		String requiredMessageHeaderEX = prop.getProperty("requiredMessage");
		String requiredMessageHeaderAC = TestUtilDemo.getTex(ProjectInfoOBJ.validationError1);
		Assert.assertEquals(requiredMessageHeaderAC, requiredMessageHeaderEX);

		String requiredMessageHeaderEX1 = prop.getProperty("requiredMessage");
		String requiredMessageHeaderAC1 = TestUtilDemo.getTex(ProjectInfoOBJ.validationError2);
		Assert.assertEquals(requiredMessageHeaderAC1, requiredMessageHeaderEX1);
		Thread.sleep(2000);
	}

	@When("validate user enter duplicate field name {string}")
	public void validate_user_enter_duplicate_field_name(String duplicatefield) throws Throwable {
		TestUtilDemo.clickElement(ProjectInfoOBJ.fieldNameTextBox, "fieldName Textbox");
		TestUtilDemo.doSendKeys(ProjectInfoOBJ.fieldNameTextBox, duplicatefield);
		Thread.sleep(2000);

	}

	@Then("^validate validation error message is display$")
	public void validate_validation_error_message_is_display() throws Throwable {
		String nameExistsMessageHeaderEX1 = prop.getProperty("nameExistsMessage");
		String nameExistsMessageHeaderAC1 = TestUtilDemo.getTex(ProjectInfoOBJ.duplicateErrorMessage);
		Assert.assertEquals(nameExistsMessageHeaderAC1, nameExistsMessageHeaderEX1);
		Thread.sleep(2000);
	}

	@Then("Validate user select Numeric value from dropdown")
	public void validate_user_select_numeric_value_from_dropdown() throws Throwable {
		TestUtilDemo.dropDownSelect(ProjectInfoOBJ.valueTypeDropDown, "Numeric", "Numeric value from dropdown");
		Thread.sleep(2000);
	}

	@Then("validate UOMType and UOM option is display")
	public void validate_uom_type_and_uom_option_is_display() {
		TestUtilDemo.isElementPresent(ProjectInfoOBJ.UOMTypeText, "UOMType Text");
		TestUtilDemo.isElementPresent(ProjectInfoOBJ.UOMTText, "UOM Text");
	}

	@Then("validate select value from the UOMType and UOM dropDown field")
	public void validate_select_value_from_the_uom_type_and_uom_drop_down_field() throws Throwable {
		TestUtilDemo.dropDownSelect(ProjectInfoOBJ.UOMTypeDropDown, "Volume", "UOMType Text");
		TestUtilDemo.dropDownSelect(ProjectInfoOBJ.UOMDropDown, "gallons", "UOM Text");
		Thread.sleep(2000);
	}

	@Then("Validate user enter fieldName {string}")
	public void validate_user_enter_field_name(String fieldname) throws Throwable {
		TestUtilDemo.clickElement(ProjectInfoOBJ.fieldNameTextBox, "fieldName Textbox");
		TestUtilDemo.clearAnddoSendKeys(ProjectInfoOBJ.fieldNameTextBox, fieldname);
		Thread.sleep(2000);
	}

	@Then("Validate user click on the Save button")
	public void validate_user_click_on_the_Save_button() {
		TestUtilDemo.clickElement(ProjectInfoOBJ.addfieldSaveButton, "addfield Save Button");
	}

	@Then("validate added field is display under BasicProjectData section")
	public void validate_added_field_is_display_under_basic_project_data_section() throws Throwable {
		TestUtilDemo.isElementPresent(ProjectInfoOBJ.newlyAddedField, "Newly Added Field");
		TestUtilDemo.scrollDown();
		Thread.sleep(5000);

	}

	@Then("validate pencil icon for edit is display")
	public void validate_pencil_icon_for_edit_is_display() {
		TestUtilDemo.scrollDown();
		TestUtilDemo.isElementPresent(ProjectInfoOBJ.newlyAddedFieldEditIcon, "pencil icon for edit");
	}

	@Then("validate cross icon for delete is display")
	public void validate_cross_icon_for_delete_is_display() {
		TestUtilDemo.isElementPresent(ProjectInfoOBJ.newlyAddedCrossIcon, "cross icon for delete");
	}

	@When("validate user enter alphabet in numeric field {string}")
	public void validate_user_enter_alphabet_in_numeric_field(String alphabetinnumeric) throws Throwable {
		TestUtilDemo.clickElement(ProjectInfoOBJ.newlyAddedFieldTextBox, "newly AddedField TextBox");
		TestUtilDemo.doSendKeys(ProjectInfoOBJ.newlyAddedFieldTextBox, alphabetinnumeric);
		Thread.sleep(2000);
		TestUtilDemo.scrollDown();
	}

	@When("^Validate Validation error message is displays$")
	public void validate_validation_error_message_is_displays() throws Throwable {
		TestUtilDemo.scrollDown();
		String numericMessageHeaderEX = prop.getProperty("numericMessage");
		String numericMessageHeaderAC = TestUtilDemo.getTex(ProjectInfoOBJ.validationErrorMessageForNumeric);
		Assert.assertEquals(numericMessageHeaderAC, numericMessageHeaderEX);
		Thread.sleep(2000);
	}

	@Then("validate enter only numeric value {string}")
	public void validate_enter_only_numeric_value(String onlynumericvalue) throws Throwable {
		TestUtilDemo.clickElement(ProjectInfoOBJ.newlyAddedFieldTextBox, "Newly added Field TextBox");
		TestUtilDemo.clearAnddoSendKeys(ProjectInfoOBJ.newlyAddedFieldTextBox, onlynumericvalue);
		Thread.sleep(2000);
	}

	@Then("validate user click on save button")
	public void validate_user_click_on_save_button() throws Throwable {
		TestUtilDemo.clickElement(ProjectInfoOBJ.SAVE_BUTTON, "Click on save button");
		Thread.sleep(3000);

	}

	@Then("validate check mark next to General Project Infomration is display")
	public void validate_checkMark_is_display_GPI() throws Throwable {
		TestUtilDemo.isElementPresent(ProjectInfoOBJ.generalProjectInformationCheckedMark, "checked Mark");
		Thread.sleep(2000);

	}

	/*
	 * @When("validate user click on pencil icon for edit") public void
	 * validate_user_click_on_pencil_icon_for_edit() throws Throwable {
	 * 
	 * if(TestUtilDemo.isElementPresent(ProjectInfoOBJ.newlyAddedCrossIcon,
	 * "deleting exsiting field")) {
	 * TestUtilDemo.clickElement(ProjectInfoOBJ.newlyAddedCrossIcon,
	 * "deleting exsiting field"); }
	 * 
	 * TestUtilDemo.clickElement(ProjectInfoOBJ.newlyAddedFieldEditIcon,
	 * "pencil icon for edit"); Thread.sleep(2000); }
	 * 
	 * 
	 * @Then("validate user enter value in field name and click on save button and edited field display"
	 * ) public void validate_user_enter_value_in_field_name() throws Throwable {
	 * TestUtilDemo.clickElement(ProjectInfoOBJ.fieldNameTextBox,
	 * "fieldName TextBox");
	 * TestUtilDemo.clearAnddoSendKeys(ProjectInfoOBJ.fieldNameTextBox,
	 * "Automation Edit"); Thread.sleep(2000);
	 * TestUtilDemo.clickElement(ProjectInfoOBJ.addfieldSaveButton,
	 * "addfield Save Button"); Thread.sleep(4000); }
	 * 
	 */

	@When("Validate user click on the ProjectScope Subsection")
	public void validate_user_click_on_the_project_scope_Subsection() throws Throwable {
		// TestUtilDemo.clickElement(ProjectInfoOBJ.COMPLETE_BUTTON, "Click on complete
		// button");
		// Thread.sleep(2000);
		TestUtilDemo.clickElement(ProjectInfoOBJ.PROJECTSCOPE_SECTION, " click on the ProjectScope Subsection");
		Thread.sleep(2000);

	}

	@Then("validate user select and check all mendetory field in ProjectScope and click on save then complete {string}")
	public void validate_user_select_and_check_all_mendetory_field_in_project_scope(String PerformanceResponsibility)
			throws Throwable {
		TestUtilDemo.clickElement(ProjectInfoOBJ.frontEndEngineering1, " click on the ProjectScope Subsection Button");
		TestUtilDemo.clickElement(ProjectInfoOBJ.DetailedEngineering, " click on the ProjectScope Subsection Button");
		TestUtilDemo.clickElement(ProjectInfoOBJ.Procurementby, " click on the ProjectScope Subsection Button");
		TestUtilDemo.clickElement(ProjectInfoOBJ.ConstructionManagement,
				" click on the ProjectScope Subsection Button");
		TestUtilDemo.clickElement(ProjectInfoOBJ.ConstructionLiaison, " click on the ProjectScope Subsection Button");
		TestUtilDemo.clickElement(ProjectInfoOBJ.ConstructionbyBlack, " click on the ProjectScope Subsection Button");
		TestUtilDemo.clickElement(ProjectInfoOBJ.ConstructabilityCoordinator,
				" click on the ProjectScope Subsection Button");
		TestUtilDemo.clickElement(ProjectInfoOBJ.StartupbyBlack, " click on the ProjectScope Subsection Button");
		TestUtilDemo.clickElement(ProjectInfoOBJ.StartupSupport, " click on the ProjectScope Subsection Button");
		TestUtilDemo.clickElement(ProjectInfoOBJ.OperatorTraining, " click on the ProjectScope Subsection Button");

		if ((driver.findElement(ProjectInfoOBJ.PerformanceResponsibility).getAttribute("value"))
				.equals("Automation Testing")) {
			TestUtilDemo.clickElement(ProjectInfoOBJ.PerformanceResponsibility, "PerformanceResponsibility Textbox");
			TestUtilDemo.clearAnddoSendKeys(ProjectInfoOBJ.PerformanceResponsibility,
					PerformanceResponsibility + " new");
			Thread.sleep(2000);
		} else {
			TestUtilDemo.clearAnddoSendKeys(ProjectInfoOBJ.PerformanceResponsibility, PerformanceResponsibility);
		}

		TestUtilDemo.clickElement(ProjectInfoOBJ.SupplierInvoice, " click on the ProjectScope Subsection Button");
		TestUtilDemo.clickElement(ProjectInfoOBJ.MaterialsManagement, " click on the ProjectScope Subsection Button");
		TestUtilDemo.scrollDown();
		TestUtilDemo.clickElement(ProjectInfoOBJ.MarineScope, " click on the ProjectScope Subsection Button");
		TestUtilDemo.scrollDown();
		TestUtilDemo.clickElement(ProjectInfoOBJ.ProjectEngineering, " click on the ProjectScope Subsection Button");
		TestUtilDemo.clickElement(ProjectInfoOBJ.ProjectControls, " click on the ProjectScope Subsection Button");
		Thread.sleep(5000);

	}

	@Then("validate check mark next to ProjectScope is display")
	public void validate_checkMark_is_display_projectScope() throws Throwable {
		TestUtilDemo.isElementPresent(ProjectInfoOBJ.projectScopeCheckedMark, "checked Mark");
		Thread.sleep(2000);

	}

	@Then("validate check mark next to Technical Requirement section is display")
	public void validate_checkMark_is_display_technicalRequirement() throws Throwable {
		TestUtilDemo.isElementPresent(ProjectInfoOBJ.technicalRequirementsCheckedMark, "checked Mark");
		Thread.sleep(2000);

	}

	@Then("validate check mark next to project control section is display")
	public void validate_checkMark_is_display_projectControl() throws Throwable {
		TestUtilDemo.isElementPresent(ProjectInfoOBJ.projectControlsCheckedMark, "checked Mark");
		Thread.sleep(2000);

	}

	@Then("validate check mark next to procurement section is display")
	public void validate_checkMark_is_display_procurement() throws Throwable {
		TestUtilDemo.isElementPresent(ProjectInfoOBJ.procurementCheckedMark, "checked Mark");
		Thread.sleep(2000);

	}

	@When("Validate user click on the TechnicalRequirement section")
	public void validate_user_click_on_the_technical_requirement_section() throws Throwable {
		TestUtilDemo.clickElement(ProjectInfoOBJ.PROJECTSCOPE_SECTION, " click on the ProjectScope Subsection");
		TestUtilDemo.scrollDownForShort();
		TestUtilDemo.clickElement(ProjectInfoOBJ.TECHNICALREQUIREMENT_SECTION,
				" click on the TECHNICALREQUIREMENT_SECTION");
		Thread.sleep(2000);

	}

	@Then("validate user select and check all mendetory field in TechnicalRequirement and click on save then complete {string},{string}")
	public void validate_user_select_and_check_all_mendetory_field_in_technical_requirement(
			String PerformanceResponsibility, String stateRegCode) throws Throwable {

		TestUtilDemo.clickElement(ProjectInfoOBJ.unitSystemDropDown, " click on the unitSystemDropDown value");
		TestUtilDemo.clickElement(ProjectInfoOBJ.unitSystemDropDownValue, " click on the unitSystemDropDownValue");

		// String clientName =
		// driver.findElement(ProjectInfoOBJ.PerformanceResponsibility).getAttribute("value");
		if ((driver.findElement(ProjectInfoOBJ.authorityHaving).getAttribute("value")).equals("Automation Testing")) {
			TestUtilDemo.clearAnddoSendKeys(ProjectInfoOBJ.authorityHaving, PerformanceResponsibility + " new");
			Thread.sleep(2000);
		} else {
			TestUtilDemo.clearAnddoSendKeys(ProjectInfoOBJ.authorityHaving, PerformanceResponsibility);
		}

		TestUtilDemo.clickElement(ProjectInfoOBJ.CompanyLicenseRequired, " click on the CompanyLicenseRequired");
		TestUtilDemo.clearAnddoSendKeys(ProjectInfoOBJ.stateRegCode, stateRegCode);
		TestUtilDemo.clickElement(ProjectInfoOBJ.PhysicalDesignApproach, " click on the PhysicalDesignApproach");
		TestUtilDemo.clickElement(ProjectInfoOBJ.AWPusedonproject, " click on the AWPusedonproject");
		TestUtilDemo.scrollDown();
		TestUtilDemo.clickElement(ProjectInfoOBJ.Modulesonproject, " click on the Modulesonproject");
		Thread.sleep(2000);
		/*
		 * TestUtilDemo.clickElement(ProjectInfoOBJ.SAVE_BUTTON,
		 * " click on the SAVE_BUTTON Button"); Thread.sleep(5000);
		 * TestUtilDemo.clickElement(ProjectInfoOBJ.COMPLETE_BUTTON,
		 * " click on the COMPLETE_BUTTON  Button"); Thread.sleep(5000);
		 */
	}

	// project Control
	@When("Validate user click on the project control section")
	public void validate_user_click_on_projectControl() throws Throwable {
		TestUtilDemo.clickElement(ProjectInfoOBJ.TECHNICALREQUIREMENT_SECTION, " section click");
		TestUtilDemo.scrollDownForShort();
		TestUtilDemo.clickElement(ProjectInfoOBJ.projectControls_Section, " section click");
	}

	@Then("validate user select and check all mendetory field in projectControl {string},{string}")
	public void validate_user_fill_projectControl_softwareSection(String costTrackingSoftware, String staffingSoftware)
			throws Throwable {
		TestUtilDemo.doSendKeys(ProjectInfoOBJ.costTrackingSoftwareTB, costTrackingSoftware);
		TestUtilDemo.doSendKeys(ProjectInfoOBJ.staffingSoftware, staffingSoftware);
	}

	// procurement
	@When("Validate user click on the Procurement section")
	public void validate_user_click_on_procurement() throws Throwable {
		TestUtilDemo.clickElement(ProjectInfoOBJ.projectControls_Section, " section click");
		TestUtilDemo.scrollDownForShort();
		TestUtilDemo.clickElement(ProjectInfoOBJ.procurement_Section, " section click");
		Thread.sleep(2000);

	}

	@Then("validate user select and check all mendetory field in Procurement Software {string},{string}")
	public void validate_user_fill_procurement_softwareSection(String materialTracking, String procurementTracking)
			throws Throwable {
		TestUtilDemo.doSendKeys(ProjectInfoOBJ.materialTracking, materialTracking);
		TestUtilDemo.doSendKeys(ProjectInfoOBJ.procurementTracking, procurementTracking);
	}

	@Then("validate Top ProjectInformation header is completed with cheked mark")
	public void validate_ProjectInfoHeader_check_is_display() {
		TestUtilDemo.isElementPresent(ProjectInfoOBJ.completeHeaderIconProjectInfo, "complete Header icon");

	}

	// DPS Role
	@Then("^validate user click on piping section$")
	public void validate_piping_section_is_clicked() throws Throwable {
		Thread.sleep(1000);
		TestUtilDemo.clickElement(ProjectInfoOBJ.piping_Section, "piping_Section");
	}

	@Then("^validate piping section is Display$")
	public void validate_piping_section_is_display() throws Throwable {
		Thread.sleep(2000);
		TestUtilDemo.clickElement(ProjectInfoOBJ.piping_Section, "piping_Section");
		TestUtilDemo.scrollDownTillBottum();
		String wbsInformationHeaderEX = prop.getProperty("piping");
		String wbsInformationHeaderAC = TestUtilDemo.getTex(ProjectInfoOBJ.piping_Section);
		Assert.assertEquals(wbsInformationHeaderAC, wbsInformationHeaderEX);

	}

	@Then("^validate General Project Information section is Display$")
	public void validate_generalProjectInformation_section_is_display() throws Throwable {

		StepCommonMethod.validate_sections_is_Display("generalProjectInformation",
				ProjectInfoOBJ.GENERALPROJECTINFORMATION_SECTION, "GENERALPROJECTINFORMATION section");
	}

	@Then("^valdiate Project Scope section is Display$")
	public void valdiate_projectScope_section_is_display() throws Throwable {
		TestUtilDemo.scrollDownForShort();
		StepCommonMethod.validate_sections_is_Display("projectScope", ProjectInfoOBJ.PROJECTSCOPE_SECTION,
				"projectScope section");
	}

	@Then("^valdiate Technical Requirements section is Display$")
	public void valdiate_technicalRequirements_section_is_display() throws Throwable {
		TestUtilDemo.scrollDownForShort();
		StepCommonMethod.validate_sections_is_Display("technicalRequirements",
				ProjectInfoOBJ.TECHNICALREQUIREMENT_SECTION, "technicalRequirements section");
	}

	@Then("^valdiate Project Controls section is Display$")
	public void valdiate_projectControls_section_is_display() throws Throwable {
		TestUtilDemo.scrollDownForShort();
		StepCommonMethod.validate_sections_is_Display("projectControls", ProjectInfoOBJ.projectControls_Section,
				"projectControls section");
	}

	@Then("^validate Electrical esction is Display$")
	public void valdiate_electrical_section_is_display() throws Throwable {
		/// Thread.sleep(1000);
		TestUtilDemo.scrollDownForShort();
		StepCommonMethod.validate_sections_is_Display("electrical", ProjectInfoOBJ.electrical_Section,
				"electrical section");
	}

	@Then("^validate I&C section is Display$")
	public void valdiate_IandC_section_is_display() throws Throwable {
		// Thread.sleep(1000);
		TestUtilDemo.scrollDownForShort();
		StepCommonMethod.validate_sections_is_Display("I&C", ProjectInfoOBJ.IandC_Section, "I&C section");
	}

	@Then("^validate Process section is Display$")
	public void valdiate_process_section_is_display() throws Throwable {
		// Thread.sleep(1000);
		// TestUtilDemo.scrollDownForShort();
		StepCommonMethod.validate_sections_is_Display("process", ProjectInfoOBJ.process_Section, "process section");
	}

	@Then("^validate Procurement section is Display$")
	public void valdiate_Procurement_is_display() throws Throwable {
		// Thread.sleep(1000);
		// TestUtilDemo.scrollDownForShort();
		StepCommonMethod.validate_sections_is_Display("procurement", ProjectInfoOBJ.procurement_Section,
				"procurement section");
	}

	@Then("^validate Structural section is Display$")
	public void valdiate_structural_section_is_display() throws Throwable {
		// Thread.sleep(1000);
		// TestUtilDemo.scrollDownForShort();
		StepCommonMethod.validate_sections_is_Display("structural", ProjectInfoOBJ.structural_Section,
				"structural section");
	}

	@When("validate user updateORenter value in 2D Design Software Textbox {string} and then reset, save button is enable")
	public void valdiate_user_update_the_form(String designSoftware) throws Throwable {
		TestUtilDemo.clickElement(ProjectInfoOBJ.stressAnalysisSoftwareTextBox, "stressAnalysisSoftware TextBox ");
		Thread.sleep(4000);
		TestUtilDemo.clearAnddoSendKeys(ProjectInfoOBJ.stressAnalysisSoftwareTextBox, designSoftware);
		Thread.sleep(4000);
		TestUtilDemo.clickElement(ProjectInfoOBJ.formInfo, "threeDDesingTextBox click");
	}

	@When("validate reset and save button is disable and complete button is enabled")
	public void valdiate_reset_and_save_button_is_disable_and_complete_button_is_enabled() throws Throwable {
		TestUtilDemo.isEnabled(ProjectInfoOBJ.COMPLETE_BUTTON, "COMPLETE_BUTTON");

	}

	@When("validate user click on save button then reset and save button is disable and complete button is enabled")
	public void valdiate_save_click_and_complete_button_is_enabled() throws Throwable {
		TestUtilDemo.clickElement(ProjectInfoOBJ.SAVE_BUTTON, "SAVE_BUTTON");
		TestUtilDemo.isEnabled(ProjectInfoOBJ.COMPLETE_BUTTON, "COMPLETE_BUTTON");

	}

	@When("validate addField button is Display and click")
	public void validate_add_field_button_is_display_with_piping_title() throws Throwable {
		TestUtilDemo.isElementPresent(ProjectInfoOBJ.addFieldIcon, "AddField IconText ");
		TestUtilDemo.clickElement(ProjectInfoOBJ.addFieldIcon, "AddField IconText ");
		Thread.sleep(2000);
	}

	// Process DPS
	@When("validate user updateORenter value in Design Review Facilitation Textbox {string},{string}")
	public void valdiate_user_update_the_form1(String processDataSoftware, String plantCapacity) throws Throwable {
		TestUtilDemo.doSendKeys(ProjectInfoOBJ.processDataSoftwareTextBox, processDataSoftware);
		TestUtilDemo.doSendKeys(ProjectInfoOBJ.plantCapacityTextBox, plantCapacity);

	}

	@Given("^validate check mark next to process section is display$")
	public void validate_check_nextTo_section_is_display() throws Throwable {
		TestUtilDemo.isElementPresent(ProjectInfoOBJ.processCheckedMark, "processCheckedMark");
	}

	// Electrical DPS
	@When("validate user updateORenter value under ElectricalSoftware and Design Basis section {string},{string},{string}")
	public void valdiate_user_update_the_form_elecrical(String electricalSystems, String powerSupply,
			String mediumVoltage) throws Throwable {

		TestUtilDemo.doSendKeys(ProjectInfoOBJ.electricalSystemsAnalysisSoftwareTB, electricalSystems);
		TestUtilDemo.doSendKeys(ProjectInfoOBJ.powerSupplyRedundancyTB, powerSupply);
		TestUtilDemo.doSendKeys(ProjectInfoOBJ.mediumVoltageValueKVTB, mediumVoltage);
		Thread.sleep(1000);
	}

	@Given("^validate check mark next to Electrical section is display$")
	public void validate_check_nextTo_electrical_section_is_display() throws Throwable {
		TestUtilDemo.isElementPresent(ProjectInfoOBJ.electricalCheckedMark, "electricalCheckedMark");
	}

	// Electrical DPS
	@When("validate user updateORenter value under IandCSoftware and Design Basis section {string}")
	public void valdiate_user_update_the_form_iandc(String instrumentData) throws Throwable {

		TestUtilDemo.doSendKeys(ProjectInfoOBJ.instrumentDataTB, instrumentData);
		Thread.sleep(1000);
	}

	@Given("^validate check mark next to IandC section is display$")
	public void validate_check_nextTo_iandc_section_is_display() throws Throwable {
		TestUtilDemo.isElementPresent(ProjectInfoOBJ.IandCCheckedMark, "IandCCheckedMark");
	}

	// Structural DPS
	@When("validate user updateORenter value under Structural section {string},{string}")
	public void valdiate_user_update_the_form_structural(String structuralModeling, String seismicSds)
			throws Throwable {

		TestUtilDemo.clickElement(ProjectInfoOBJ.structuralSection, "");
		Thread.sleep(1000);
		TestUtilDemo.clickElement(ProjectInfoOBJ.buildingCodeDD, "");
		Thread.sleep(1000);
		TestUtilDemo.clickElement(ProjectInfoOBJ.buildingCodeDValue, "");
		Thread.sleep(1000);
		TestUtilDemo.doSendKeys(ProjectInfoOBJ.structuralModelingTB, structuralModeling);
		Thread.sleep(1000);

		TestUtilDemo.clickElement(ProjectInfoOBJ.generalFoundationDD, "projectType Dropdown");
		TestUtilDemo.clickElement(ProjectInfoOBJ.generalFoundationDValue, "EPC Dropdown value");
		TestUtilDemo.doSendKeys(ProjectInfoOBJ.seismicSdsTB, seismicSds);
	}

	@Given("^validate check mark next to Structural section is display$")
	public void validate_check_nextTo_structural_section_is_display() throws Throwable {
		TestUtilDemo.isElementPresent(ProjectInfoOBJ.structuralCheckedMark, "structuralCheckedMark");
	}

	@Then("^closing the browser$")
	public void closebrowser() throws Throwable {
		driver.close();
		driver.quit();
	}
}
