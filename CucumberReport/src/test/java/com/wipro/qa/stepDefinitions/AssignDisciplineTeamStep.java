package com.wipro.qa.stepDefinitions;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

import org.openqa.selenium.By;

import com.aventstack.extentreports.util.Assert;
import com.wipro.qa.base.TestBase;
import com.wipro.qa.util.AssignTeamOBJ;
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

public class AssignDisciplineTeamStep extends TestBase {

	@Then("^validate AssignTeamHeader is Display and click on AssignTeamHeader Link$")
	public void validate_assignTeamHeader_is_display_and_click() throws Throwable {
		StepCommonMethod.validate_top_header_is_Display_and_click("assignTeam", AssignTeamOBJ.AssignTeamHeader,
				AssignTeamOBJ.AssignTeamLink, "AssignTeamHeader");
	}

	/**
	 * @role PLI
	 * @section PipingLeads
	 */
	@When("validate user click on Piping Leads section")
	public void click_on_Piping_Leads_section() throws Throwable {
		TestUtilDemo.clickElement(AssignTeamOBJ.pipingLeads, "ElectricalLeads Section ");
	}

	@When("validate Section is NOT completed, an empty circle next to the PipingLeadsSection label will display in left panel")
	public void validate_empty_circle_next_to_the_PipingLeadsSection_will_display() throws Throwable {
		StepCommonMethod.validate_empty_circle_next_to_the_Section_label_will_display(
				AssignTeamOBJ.pipingLeadsUnCheckedMark, "UnCheckedMark ");
	}

	@When("validate toggle is on, the name field will enable in PipingLeadsSection.")
	public void validate_toggle_on_the_name_field_will_enable_in_PipingLeadsSection() throws Throwable {
		StepCommonMethod.validate_toggle_is_on_the_name_field_will_enable(AssignTeamOBJ.form,
				AssignTeamOBJ.togglepipingLeads, "toggle On");
	}

	@When("validate System will prompt user to save record if user is moving away from PipingLeadsSection without saving data")
	public void leaving_page_without_saving_in_PipingLeadsSection() throws Throwable {
		TestUtilDemo.clickElement(AssignTeamOBJ.pipingLeads, "pipingLeads");
		TestUtilDemo.scrollDownForShort();
		StepCommonMethod.leaving_page_without_saving(AssignTeamOBJ.ElectricalLeadsSection,
				"leaving page without save ");
	}

	@When("validate toggling off a role with a name populated the name will clear and field will disable in PipingLeadsSection.")
	public void toggling_off_and_field_will_disable_in_pipingLeadsSection() throws Throwable {
		TestUtilDemo.scrollUpTop();
		StepCommonMethod.toggling_off_and_field_will_disable(AssignTeamOBJ.togglepipingLeads, AssignTeamOBJ.SAVE_BUTTON,
				"clicked on toggle off and save ");
	}

	@When("validate Section is completed, a check next to the PipingLeadsSection label will display in left panel")
	public void checkMark_is_display_next_to_PipingLeadsSection() throws Throwable {
		StepCommonMethod.checkMark_is_display_next_to_section(AssignTeamOBJ.pipingLeadsCheckedMark,
				AssignTeamOBJ.EDIT_BUTTON, "CheckedMark displayed ");
		TestUtilDemo.scrollUpTop();

	}

	@When("validate clicking on Define User Permissions displays a list of user permissions that I can assign an individual in PipingLeadsSection.")
	public void clicking_on_DefineUserPermissions_in_PipingLeadsSection() throws Throwable {
		StepCommonMethod.clicking_on_DefineUserPermissions(AssignTeamOBJ.form, AssignTeamOBJ.togglepipingLeads,
				AssignTeamOBJ.dropDownBox, AssignTeamOBJ.dropDownValueP, AssignTeamOBJ.defineUserPermissions,
				"clicked_on_DefineUserPermissions");

	}

	@When("verify that user is able add new role and view added Role {string},{string}")
	public void verify_user_add_newRole(String roleTitle, String roleDiscription) throws Throwable {
		TestUtilDemo.clickElement(AssignTeamOBJ.addRoleButton, "addRoleButton");
		Thread.sleep(2000);
		TestUtilDemo.doSendKeys(AssignTeamOBJ.roleTitle, roleTitle);
		Thread.sleep(1000);
		TestUtilDemo.doSendKeys(AssignTeamOBJ.roleDescription, roleDiscription);
		TestUtilDemo.clickElement(AssignTeamOBJ.saveButtonAddRole, "click on save ");
		Thread.sleep(2000);
	}

	@When("validate check the duplicate validation by adding duplicate row {string}")
	public void verify_user_add_duplicate_role(String duplicateRole) throws Throwable {
		TestUtilDemo.clickElement(AssignTeamOBJ.addRoleButton, "addRoleButton");
		Thread.sleep(2000);
		TestUtilDemo.doSendKeys(AssignTeamOBJ.roleTitle, duplicateRole);
		TestUtilDemo.clickElement(AssignTeamOBJ.saveButtonAddRole, "click on save ");

		String duplicateAlert = TestUtilDemo.getTex(AssignTeamOBJ.addRoleAlertMessage);
		Thread.sleep(2000);
		String roleExists = prop.getProperty("roleExists");
		// Assert.assertEquals(duplicateAlert , roleExists );
	}

	/**
	 * @role PLI
	 * @section ElectricalLeads
	 */
	@Given("^validate user click on Electrical Leads section$")
	public void click_on_Electrical_Leads_section() throws Throwable {
		TestUtilDemo.clickElement(AssignTeamOBJ.pipingLeads, "pipingLeads");
		TestUtilDemo.scrollDownForShort();
		TestUtilDemo.clickElement(AssignTeamOBJ.ElectricalLeadsSection, "ElectricalLeads Section ");
	}

	@When("validate validate Section is NOT completed, an empty circle next to the ElectricalLeadsSection is display")
	public void validate_empty_circle_next_to_the_ElectricalLeadsSection_will_display() throws Throwable {
		StepCommonMethod.validate_empty_circle_next_to_the_Section_label_will_display(
				AssignTeamOBJ.electricalUnCheckedMark, "UnCheckedMark ");
	}

	@When("validate toggle is on, the name field will enable in ElectricalLeadsSection")
	public void validate_toggle_on_the_name_field_will_enable_in_ElectricalLeadsSection() throws Throwable {
		StepCommonMethod.validate_toggle_is_on_the_name_field_will_enable(AssignTeamOBJ.form,
				AssignTeamOBJ.toggleElectrical, "toggle On");
	}

	@When("validate System will prompt user to save record if user is moving away from ElectricalLeadsSection section screen without saving data")
	public void leaving_page_without_saving_in_ElectricalLeadsSection() throws Throwable {
		StepCommonMethod.leaving_page_without_saving(AssignTeamOBJ.pipingLeads, "leaving page without save ");
	}

	@When("validate toggling off a role with a name populated the name will clear and field will disable in ElectricalLeadsSection")
	public void toggling_off_and_field_will_disable_in_ElectricalLeadsSection() throws Throwable {
		TestUtilDemo.scrollUpTop();
		StepCommonMethod.toggling_off_and_field_will_disable(AssignTeamOBJ.toggleElectrical, AssignTeamOBJ.SAVE_BUTTON,
				"clicked on toggle off and save ");
	}

	@When("validate Section is completed, a check next to the ElectricalLeadsSection is display")
	public void checkMark_is_display_next_to_ElectricalLeadsSection() throws Throwable {
		StepCommonMethod.checkMark_is_display_next_to_section(AssignTeamOBJ.electricalCheckedMark,
				AssignTeamOBJ.EDIT_BUTTON, "CheckedMark displayed ");
		TestUtilDemo.scrollUpTop();

	}

	@When("validate clicking on Define User Permissions displays a list of user permissions that I can assign an individual for ElectricalLeadsSection")
	public void clicking_on_DefineUserPermissions_in_ElectricalLeadsSection() throws Throwable {
		StepCommonMethod.clicking_on_DefineUserPermissions(AssignTeamOBJ.form, AssignTeamOBJ.toggleElectrical,
				AssignTeamOBJ.dropDownBox, AssignTeamOBJ.dropDownValueEle, AssignTeamOBJ.defineUserPermissions,
				"clicked_on_DefineUserPermissions");

	}

	/**
	 * @role PLI
	 * @section I&CLeads
	 */
	@Given("^validate user click on I&CSubSection$")
	public void click_on_IandC_section() throws Throwable {
		TestUtilDemo.clickElement(AssignTeamOBJ.ElectricalLeadsSection, "ElectricalLeadsSection");
		TestUtilDemo.scrollDownForShort();
		TestUtilDemo.clickElement(AssignTeamOBJ.IAndCLeadSection, "IAndCLead Section ");
	}

	@When("validate Section is NOT completed, an empty circle next to the I&C Section label will display in left panel")
	public void validate_empty_circle_next_to_the_IandCSection_will_display() throws Throwable {
		StepCommonMethod.validate_empty_circle_next_to_the_Section_label_will_display(AssignTeamOBJ.IAndCUnCheckedMark,
				"UnCheckedMark ");
	}

	@When("validate toggle is on, the name field will enable under I&C Section")
	public void validate_toggle_on_the_name_field_will_enable_in_IandCSection() throws Throwable {
		StepCommonMethod.validate_toggle_is_on_the_name_field_will_enable(AssignTeamOBJ.form, AssignTeamOBJ.toggleIAndC,
				"toggle On");
	}

	@When("validate System will prompt user to save record if user is moving away from sectionscreen without saving data under I&C Section")
	public void leaving_page_without_saving_in_IandCSection() throws Throwable {
		StepCommonMethod.leaving_page_without_saving(AssignTeamOBJ.ElectricalLeadsSection,
				"leaving page without save ");
	}

	@When("validate toggling off a role with a name populated the name will clear and field will disable under I&C Section")
	public void toggling_off_and_field_will_disable_in_IandCSection() throws Throwable {
		TestUtilDemo.scrollUpTop();
		StepCommonMethod.toggling_off_and_field_will_disable(AssignTeamOBJ.toggleIAndC, AssignTeamOBJ.SAVE_BUTTON,
				"clicked on toggle off and save ");
	}

	@When("validate Section is completed, a check next to the I&C Section label will display in left panel")
	public void checkMark_is_display_next_to_IandCSection() throws Throwable {
		StepCommonMethod.checkMark_is_display_next_to_section(AssignTeamOBJ.IAndCCheckedMark, AssignTeamOBJ.EDIT_BUTTON,
				"CheckedMark displayed ");
		TestUtilDemo.scrollUpTop();

	}

	@When("validate clicking on Define User Permissions displays a list of user permissions that I can assign an individual under I&C Section")
	public void clicking_on_DefineUserPermissions_in_IandCSection() throws Throwable {
		StepCommonMethod.clicking_on_DefineUserPermissions(AssignTeamOBJ.form, AssignTeamOBJ.toggleIAndC,
				AssignTeamOBJ.dropDownBox, AssignTeamOBJ.dropDownValueIC, AssignTeamOBJ.defineUserPermissions,
				"clicked_on_DefineUserPermissions");

	}

	/**
	 * @role PLI
	 * @section StructuralLeads
	 */
	@Given("^validate user click on StructuralLeadsSubSection$")
	public void click_on_structuralLeadSection() throws Throwable {
		TestUtilDemo.clickElement(AssignTeamOBJ.IAndCLeadSection, "IAndCLead Section ");
		TestUtilDemo.scrollDownForShort();
		TestUtilDemo.clickElement(AssignTeamOBJ.structuralLeadsSection, "StructuralLeadsSection");

	}

	@When("validate Section is NOT completed, an empty circle next to the StructuralLeads Section label will display in left panel")
	public void validate_empty_circle_next_to_the_structuralLeadSection_will_display() throws Throwable {
		StepCommonMethod.validate_empty_circle_next_to_the_Section_label_will_display(
				AssignTeamOBJ.structuralLeadsUnCheckedMark, "UnCheckedMark ");
	}

	@When("validate toggle is on, the name field will enable under StructuralLeads Section")
	public void validate_toggle_on_the_name_field_will_enable_in_structuralLeadSection() throws Throwable {
		StepCommonMethod.validate_toggle_is_on_the_name_field_will_enable(AssignTeamOBJ.form,
				AssignTeamOBJ.toggleStructuralLeads, "toggle On");
	}

	@When("validate System will prompt user to save record if user is moving away from sectionscreen without saving data under StructuralLeads Section")
	public void leaving_page_without_saving_in_structuralLeadSection() throws Throwable {
		StepCommonMethod.leaving_page_without_saving(AssignTeamOBJ.IAndCLeadSection, "leaving page without save ");
	}

	@When("validate toggling off a role with a name populated the name will clear and field will disable under StructuralLeads Section")
	public void toggling_off_and_field_will_disable_in_structuralLeadSection() throws Throwable {
		TestUtilDemo.scrollUpTop();
		StepCommonMethod.toggling_off_and_field_will_disable(AssignTeamOBJ.toggleStructuralLeads,
				AssignTeamOBJ.SAVE_BUTTON, "clicked on toggle off and save ");
	}

	@When("validate Section is completed, a check next to the StructuralLeads Section label will display in left panel")
	public void checkMark_is_display_next_to_structuralLeadSection() throws Throwable {
		StepCommonMethod.checkMark_is_display_next_to_section(AssignTeamOBJ.structuralLeadsCheckedMark,
				AssignTeamOBJ.EDIT_BUTTON, "CheckedMark displayed ");
		TestUtilDemo.scrollUpTop();

	}

	@When("validate clicking on Define User Permissions displays a list of user permissions that I can assign an individual under StructuralLeads Section")
	public void clicking_on_defineUserPermissions_in_structuralLeadSection() throws Throwable {
		StepCommonMethod.clicking_on_DefineUserPermissions(AssignTeamOBJ.form, AssignTeamOBJ.toggleStructuralLeads,
				AssignTeamOBJ.dropDownBox, AssignTeamOBJ.dropDownValueSt, AssignTeamOBJ.defineUserPermissions,
				"clicked_on_DefineUserPermissions");
	}

	/**
	 * @role PLI
	 * @section ProcessLeads
	 */
	@Given("^validate user click on ProcessLeadsSubSection$")
	public void click_on_processLeadsSubSection() throws Throwable {

		TestUtilDemo.clickElement(AssignTeamOBJ.structuralLeadsSection, "StructuralLeadsSection");
		TestUtilDemo.scrollDownForShort();
		TestUtilDemo.clickElement(AssignTeamOBJ.processLeadsSection, "IAndCLead Section ");

	}

	@When("validate Section is NOT completed, an empty circle next to the Section label will display in left panel under ProcessLeads")
	public void validate_empty_circle_next_to_the_processLeadsSection_will_display() throws Throwable {
		StepCommonMethod.validate_empty_circle_next_to_the_Section_label_will_display(
				AssignTeamOBJ.processLeadsUnCheckedMark, "UnCheckedMark ");
	}

	@When("validate toggle is on, the name field will enable under ProcessLeads")
	public void validate_toggle_on_the_name_field_will_enable_in_processLeadsSection() throws Throwable {
		StepCommonMethod.validate_toggle_is_on_the_name_field_will_enable(AssignTeamOBJ.form,
				AssignTeamOBJ.toggleprocessLeads, "toggle On");
	}

	@When("validate System will prompt user to save record if user is moving away from sectionscreen without saving data under ProcessLeads")
	public void leaving_page_without_saving_in_processLeadsSection() throws Throwable {
		StepCommonMethod.leaving_page_without_saving(AssignTeamOBJ.structuralLeadsSection,
				"leaving page without save ");
	}

	@When("validate toggling off a role with a name populated the name will clear and field will disable under ProcessLeads")
	public void toggling_off_and_field_will_disable_in_processLeadsSection() throws Throwable {
		TestUtilDemo.scrollUpTop();
		StepCommonMethod.toggling_off_and_field_will_disable(AssignTeamOBJ.toggleprocessLeads,
				AssignTeamOBJ.SAVE_BUTTON, "clicked on toggle off and save ");
	}

	@When("validate Section is completed, a check next to the Section label will display in left panel under ProcessLeads")
	public void checkMark_is_display_next_to_processLeadsSection() throws Throwable {
		StepCommonMethod.checkMark_is_display_next_to_section(AssignTeamOBJ.processLeadsCheckedMark,
				AssignTeamOBJ.EDIT_BUTTON, "CheckedMark displayed ");
		TestUtilDemo.scrollUpTop();

	}

	@When("validate clicking on Define User Permissions displays a list of user permissions that I can assign an individual under ProcessLeads")
	public void clicking_on_defineUserPermissions_in_processLeadsSection() throws Throwable {
		StepCommonMethod.clicking_on_DefineUserPermissions(AssignTeamOBJ.form, AssignTeamOBJ.toggleprocessLeads,
				AssignTeamOBJ.dropDownBox, AssignTeamOBJ.dropDownValuePro, AssignTeamOBJ.defineUserPermissions,
				"clicked_on_DefineUserPermissions");
	}

	/**
	 * @role PLI
	 * @section EquipmentLeads
	 */
	@Given("^validate user click on EquipmentLeadsSubSection$")
	public void click_on_equipmentLeadsSubSection() throws Throwable {
		TestUtilDemo.clickElement(AssignTeamOBJ.processLeadsSection, "processLeadsSection Section ");
		TestUtilDemo.scrollDownForShort();
		TestUtilDemo.clickElement(AssignTeamOBJ.equipmentLeadsSection, "equipmentLeadsSection");

	}

	@When("validate Section is NOT completed, an empty circle next to the Section label will display in left panel under EquipmentLeads")
	public void validate_empty_circle_next_to_the_equipmentLeadsSubSection_will_display() throws Throwable {
		StepCommonMethod.validate_empty_circle_next_to_the_Section_label_will_display(
				AssignTeamOBJ.equipmentLeadsUnCheckedMark, "UnCheckedMark ");
	}

	@When("validate toggle is on, the name field will enable under EquipmentLeads")
	public void validate_toggle_on_the_name_field_will_enable_in_equipmentLeadsSubSection() throws Throwable {
		StepCommonMethod.validate_toggle_is_on_the_name_field_will_enable(AssignTeamOBJ.form,
				AssignTeamOBJ.toggleEquipmentLeads, "toggle On");
	}

	@When("validate System will prompt user to save record if user is moving away from sectionscreen without saving data under EquipmentLeads")
	public void leaving_page_without_saving_in_equipmentLeadsSubSection() throws Throwable {
		StepCommonMethod.leaving_page_without_saving(AssignTeamOBJ.processLeadsSection, "leaving page without save ");
	}

	@When("validate toggling off a role with a name populated the name will clear and field will disable under EquipmentLeads")
	public void toggling_off_and_field_will_disable_in_equipmentLeadsSubSection() throws Throwable {
		TestUtilDemo.scrollUpTop();
		StepCommonMethod.toggling_off_and_field_will_disable(AssignTeamOBJ.toggleEquipmentLeads,
				AssignTeamOBJ.SAVE_BUTTON, "clicked on toggle off and save ");
	}

	@When("validate Section is completed, a check next to the Section label will display in left panel under EquipmentLeads")
	public void checkMark_is_display_next_to_equipmentLeadsSubSection() throws Throwable {
		StepCommonMethod.checkMark_is_display_next_to_section(AssignTeamOBJ.equipmentLeadsCheckedMark,
				AssignTeamOBJ.EDIT_BUTTON, "CheckedMark displayed ");
		TestUtilDemo.scrollUpTop();

	}

	@When("validate clicking on Define User Permissions displays a list of user permissions that I can assign an individual under EquipmentLeads")
	public void clicking_on_defineUserPermissions_in_equipmentLeadsSubSection() throws Throwable {
		StepCommonMethod.clicking_on_DefineUserPermissions(AssignTeamOBJ.form, AssignTeamOBJ.toggleEquipmentLeads,
				AssignTeamOBJ.dropDownBox, AssignTeamOBJ.dropDownValueEqp, AssignTeamOBJ.defineUserPermissions,
				"clicked_on_DefineUserPermissions");
	}

	/**
	 * @role PLI
	 * @section ManagementTeam
	 */
	@Given("^validate user click on ManagementTeamSubSection$")
	public void click_on_managementTeamSubSection() throws Throwable {
		TestUtilDemo.clickElement(AssignTeamOBJ.equipmentLeadsSection, "equipmentLeadsSection");
		TestUtilDemo.scrollDownForShort();
		TestUtilDemo.clickElement(AssignTeamOBJ.managementTeamSection, "managementTeamSection Section ");

	}

	@When("validate Section is NOT completed, an empty circle next to the Section label will display in left panel under ManagementTeam")
	public void validate_empty_circle_next_to_the_managementTeamSubSection_will_display() throws Throwable {
		StepCommonMethod.validate_empty_circle_next_to_the_Section_label_will_display(
				AssignTeamOBJ.managementTeamUnCheckedMark, "UnCheckedMark ");
	}

	@When("validate toggle is on, the name field will enable under ManagementTeam")
	public void validate_toggle_on_the_name_field_will_enable_in_managementTeamSubSection() throws Throwable {
		StepCommonMethod.validate_toggle_is_on_the_name_field_will_enable(AssignTeamOBJ.form,
				AssignTeamOBJ.toggleManagementTeam, "toggle On");
	}

	@When("validate System will prompt user to save record if user is moving away from sectionscreen without saving data under ManagementTeam")
	public void leaving_page_without_saving_in_managementTeamSubSection() throws Throwable {
		StepCommonMethod.leaving_page_without_saving(AssignTeamOBJ.equipmentLeadsSection, "leaving page without save ");
	}

	@When("validate toggling off a role with a name populated the name will clear and field will disable under ManagementTeam")
	public void toggling_off_and_field_will_disable_in_managementTeamSubSection() throws Throwable {
		TestUtilDemo.scrollUpTop();
		StepCommonMethod.toggling_off_and_field_will_disable(AssignTeamOBJ.toggleManagementTeam,
				AssignTeamOBJ.SAVE_BUTTON, "clicked on toggle off and save ");
	}

	@When("validate Section is completed, a check next to the Section label will display in left panel under ManagementTeam")
	public void checkMark_is_display_next_to_managementTeamSubSection() throws Throwable {
		StepCommonMethod.checkMark_is_display_next_to_section(AssignTeamOBJ.managementTeamCheckedMark,
				AssignTeamOBJ.EDIT_BUTTON, "CheckedMark displayed ");
		TestUtilDemo.scrollUpTop();

	}

	@When("validate clicking on Define User Permissions displays a list of user permissions that I can assign an individual under ManagementTeam")
	public void clicking_on_defineUserPermissions_in_managementTeamSubSection() throws Throwable {
		StepCommonMethod.clicking_on_DefineUserPermissions(AssignTeamOBJ.form, AssignTeamOBJ.toggleManagementTeam,
				AssignTeamOBJ.dropDownBox, AssignTeamOBJ.dropDownValueMngt, AssignTeamOBJ.defineUserPermissions,
				"clicked_on_DefineUserPermissions");
	}

	/**
	 * @discipline Piping
	 * @section pipingTeamLeads
	 */
	@Then("^validate user click on pipingEngineeringTeam section$")
	public void validate_pipingEngineeringTeam_is_click() throws Throwable {
		Thread.sleep(3000);
		TestUtilDemo.clickElement(AssignTeamOBJ.pipingTeamLeads, "");
	}

	@When("validate Section is NOT completed, an empty circle next to the Section label will display in left panel")
	public void validate_empty_circle_next_to_the_Section_label_will_display_in_left_panel() throws Throwable {
		StepCommonMethod.validate_empty_circle_next_to_the_Section_label_will_display(
				AssignTeamOBJ.pipingTeamLeadsUnCheckedMark, "UnCheckedMark ");
	}

	@Then("validate For each editable section Engineering Team or Design Team the appropriate roles will display as default toggled off.")
	public void default_editable_section_display_as_toggled_off_In_PipingSection() throws Throwable {
		StepCommonMethod.default_editable_section_display_as_toggled_off(AssignTeamOBJ.PipingPDE,
				AssignTeamOBJ.PipingPLD, "PipingPDE/PLD Engineering Team");
	}

	@When("validate toggle is on, the name field will enable.")
	public void validate_toggle_on_the_name_field_will_enable_in_pipingSection() throws Throwable {

		StepCommonMethod.validate_toggle_is_on_the_name_field_will_enable(AssignTeamOBJ.form,
				AssignTeamOBJ.togglePipingTeamLeads, "toggle On");
	}

	@When("validate entering the assignee name, it will search matching names and display NameJobFamilyOffice")
	public void autoSearchName_in_dropdown_and_select_in_pipingSection() throws Throwable {
		StepCommonMethod.autoSearchName_in_dropdown_and_select(AssignTeamOBJ.dropDownBox, AssignTeamOBJ.dropDownValue,
				"pipingPDEDropDownBox/value");
	}

	@When("validate name is populated a Notify and Define User Permissions option will activate to the right of the name box")
	public void notify_and_define_user_permissions_option_is_activate_in_pipingSection() throws Throwable {
		TestUtilDemo.scrollUpTop();
		StepCommonMethod.notify_and_define_user_permissions_option_is_activate(AssignTeamOBJ.defineUserPermissions,
				AssignTeamOBJ.notify, AssignTeamOBJ.SAVE_BUTTON, "defineUserPermissionsAndnotifyAndSaveButton");
	}

	@When("validate upon making an edit, the Save button will be enabled and the Complete button will be disabled")
	public void save_button_will_enable_in_pipingSection() throws Throwable {
		TestUtilDemo.scrollUpTop();
		StepCommonMethod.over_editing_save_button_will_enable(AssignTeamOBJ.form, AssignTeamOBJ.notify,
				AssignTeamOBJ.dropDownBox, AssignTeamOBJ.dropDownValueforEdit, AssignTeamOBJ.SAVE_BUTTON,
				"PDEDropDownBox/ValueAndSaveButton");
	}

	@When("validate System will prompt user to save record if user is moving away from sectionscreen without saving data")
	public void leaving_page_without_saving_in_pipingSection() throws Throwable {
		TestUtilDemo.clickElement(AssignTeamOBJ.pipingTeamLeads, "pipingEngineeringTeam");
		TestUtilDemo.scrollDownForShort();
		StepCommonMethod.leaving_page_without_saving(AssignTeamOBJ.pipingTeam, "leaving page without save ");
	}

	@When("validate the section information has been saved, the Complete button will be enabled")
	public void saving_data_and_complete_button_enable_in_pipingSection() throws Throwable {
		StepCommonMethod.saving_data_and_complete_button_enable(AssignTeamOBJ.SAVE_BUTTON, AssignTeamOBJ.form,
				AssignTeamOBJ.COMPLETE_BUTTON, "save and complete button");
	}

	@When("validate toggling off a role with a name populated the name will clear and field will disable.")
	public void toggling_off_and_field_will_disable_in_pipingSection() throws Throwable {
		TestUtilDemo.scrollUpTop();
		StepCommonMethod.toggling_off_and_field_will_disable(AssignTeamOBJ.togglePipingTeamLeads,
				AssignTeamOBJ.SAVE_BUTTON, "clicked on toggle off and save ");
	}

	@When("validate For select roles, user can select +Add Professional which will create a new blank field to populate an additional professional for a given role")
	public void add_new_role_in_pipingSection() throws Throwable {
		TestUtilDemo.clickElement(AssignTeamOBJ.form, "click on form");
		TestUtilDemo.scrollUpTop();
		validate_toggle_on_the_name_field_will_enable_in_pipingSection();
		autoSearchName_in_dropdown_and_select_in_pipingSection();
		Thread.sleep(1000);
		StepCommonMethod.add_new_role(AssignTeamOBJ.addProfesstional, AssignTeamOBJ.dropDownBoxAddProfesstional,
				AssignTeamOBJ.dropDownValueforEdit, AssignTeamOBJ.SAVE_BUTTON, "Adding new role ");
	}

	@When("validate For select roles, user can select +Add Professional which will create a new blank field to populate an additional professional for a given role for management")
	public void add_new_role_in_managementTeam() throws Throwable {
		TestUtilDemo.clickElement(AssignTeamOBJ.form, "click on form");
		TestUtilDemo.scrollDownTillBottum();
		TestUtilDemo.clickElement(AssignTeamOBJ.toggleprojectEngineer, "click on toggle");
		autoSearchName_in_dropdown_and_select_in_pipingSection();
		Thread.sleep(1000);
		StepCommonMethod.add_new_role(AssignTeamOBJ.addProfesstional1, AssignTeamOBJ.addProfesstional1DD,
				AssignTeamOBJ.dropDownValueforEdit, AssignTeamOBJ.SAVE_BUTTON, "Adding new role ");
	}

	@When("validate a section within a header area that does not have dependencies (Project Information, Project Reference Library, Assign Project Lead) has been marked complete, the Reset, Save and Complete buttons will be replaced with an Edit button.")
	public void edit_button_is_display_in_pipingSection() throws Throwable {
		StepCommonMethod.edit_button_is_display(AssignTeamOBJ.COMPLETE_BUTTON, AssignTeamOBJ.EDIT_BUTTON,
				"complete button clicked and edit button display");
	}

	@When("validate Section is completed, a check next to the Section label will display in left panel")
	public void checkMark_is_display_next_to_pipingSection() throws Throwable {
		StepCommonMethod.checkMark_is_display_next_to_section(AssignTeamOBJ.pipingTeamLeadsCheckedMark,
				AssignTeamOBJ.EDIT_BUTTON, "CheckedMark displayed ");
		TestUtilDemo.scrollUpTop();
	}

	@When("validate clicking on Define User Permissions displays a list of user permissions that I can assign an individual.")
	public void clicking_on_defineUserPermissions_in_pipingSection() throws Throwable {
		StepCommonMethod.clicking_on_DefineUserPermissions(AssignTeamOBJ.form, AssignTeamOBJ.togglePipingTeamLeads,
				AssignTeamOBJ.dropDownBox, AssignTeamOBJ.dropDownValue, AssignTeamOBJ.defineUserPermissions,
				"clicked_on_DefineUserPermissions");
	}

	@When("validate clicking on Define User Permissions displays a list of user permissions that I can assign an individual in Discipline")
	public void clicking_on_defineUserPermissions_in_Discipline() throws Throwable {
		StepCommonMethod.clicking_on_DefineUserPermissions_discipline(AssignTeamOBJ.form, AssignTeamOBJ.dropDownBox,
				AssignTeamOBJ.dropDownValue, AssignTeamOBJ.defineUserPermissions, "clicked_on_DefineUserPermissions");
	}

	@Then("validate multiple permissions can be selected for a single individual.")
	public void validate_multiple_permissions_selection_in_pipingSection() throws Throwable {
		StepCommonMethod.validate_multiple_permissions_selection(AssignTeamOBJ.gigDistributorRole,
				AssignTeamOBJ.gigCompleterRole, "roles selection");
	}

	@Then("validate hovering over i next to user permissions provides additional informationORdescription of permissions.")
	public void validate_hovering_over_i_in_pipingSection() throws Throwable {
		StepCommonMethod.validate_hovering_over_i(AssignTeamOBJ.iIconForGigcompleter, AssignTeamOBJ.hoverInformation,
				"hover message");
	}

	@Then("validate user can select Save to save selections")
	public void validate_user_can_save_selection_in_pipingSection() throws Throwable {
		StepCommonMethod.validate_user_can_save_selection(AssignTeamOBJ.saveForDefineUser, AssignTeamOBJ.SAVE_BUTTON,
				AssignTeamOBJ.COMPLETE_BUTTON, "clicked on save button");
	}

	/**
	 * @discipline Piping
	 * @section PipingTeam
	 */
	@When("validate user click on piping Design Team")
	public void validate_user_click_on_pipingDesignTeam_Section() throws Throwable {
		TestUtilDemo.clickElement(AssignTeamOBJ.pipingTeamLeads, "pipingTeamLeads Section");
		TestUtilDemo.scrollDownForShort();
		TestUtilDemo.clickElement(AssignTeamOBJ.pipingTeam, "pipingTeam Section");

	}

	@When("validate validate Section is NOT completed, an empty circle next to the pipingDesingTeamSection is display")
	public void validate_empty_circle_next_to_the_pipingTeamSection_will_display() throws Throwable {
		StepCommonMethod.validate_empty_circle_next_to_the_Section_label_will_display(
				AssignTeamOBJ.pipingTeamUnCheckedMark, "UnCheckedMark ");
	}

	@Then("validate For each editable section Engineering Team or Design Team the appropriate roles will display as default toggled off in pipingDesingTeamSection")
	public void default_editable_section_display_as_toggled_off_in_pipingDesingTeamSection() throws Throwable {
		StepCommonMethod.default_editable_section_display_as_toggled_off(AssignTeamOBJ.PipingPDE,
				AssignTeamOBJ.PipingPLD, "PipingPDE/PLD Engineering Team");
	}

	@When("validate toggle is on, the name field will enable in pipingDesingTeamSection")
	public void validate_toggle_on_the_name_field_will_enable_in_pipingDesingTeamSection() throws Throwable {
		StepCommonMethod.validate_toggle_is_on_the_name_field_will_enable(AssignTeamOBJ.form,
				AssignTeamOBJ.togglePipingTeam, "toggle On");
	}

	@When("validate System will prompt user to save record if user is moving away from pipingDesingTeamSection section screen without saving data")
	public void leaving_page_without_saving_in_pipingDesingTeamSection() throws Throwable {
		TestUtilDemo.clickElement(AssignTeamOBJ.pipingTeamLeads, "pipingTeamLeads");
		TestUtilDemo.scrollDownForShort();
		StepCommonMethod.leaving_page_without_saving(AssignTeamOBJ.pipingTeam, "leaving page without save ");
	}

	@When("validate toggling off a role with a name populated the name will clear and field will disable in pipingDesingTeamSection")
	public void toggling_off_and_field_will_disable_in_pipingDesingTeamSection() throws Throwable {
		TestUtilDemo.scrollUpTop();
		StepCommonMethod.toggling_off_and_field_will_disable(AssignTeamOBJ.togglePipingTeam, AssignTeamOBJ.SAVE_BUTTON,
				"clicked on toggle off and save ");
	}

	@When("validate For select roles, user can select +Add Professional from pipingDesingTeamSection which will create a new blank field to populate an additional professional for a given role")
	public void add_new_role_in_pipingDesingTeamSection() throws Throwable {
		TestUtilDemo.scrollUpTop();
		validate_toggle_on_the_name_field_will_enable_in_pipingDesingTeamSection();
		autoSearchName_in_dropdown_and_select_in_pipingSection();
		Thread.sleep(2000);
		StepCommonMethod.add_new_role(AssignTeamOBJ.addProfesstional, AssignTeamOBJ.dropDownBoxAddProfesstional,
				AssignTeamOBJ.dropDownValueforEdit, AssignTeamOBJ.SAVE_BUTTON, "Adding new role ");
	}

	@When("validate Section is completed, a check next to the pipingDesingTeamSection is display")
	public void checkMark_is_display_next_to_pipingDesingTeamSection() throws Throwable {
		StepCommonMethod.checkMark_is_display_next_to_section(AssignTeamOBJ.pipingTeamCheckedMark,
				AssignTeamOBJ.EDIT_BUTTON, "CheckedMark displayed ");
		TestUtilDemo.scrollUpTop();
	}

	@When("validate clicking on Define User Permissions displays a list of user permissions that I can assign an individual for pipingDesingTeamSection")
	public void clicking_on_DefineUserPermissions_in_pipingDesingTeamSection() throws Throwable {
		StepCommonMethod.clicking_on_DefineUserPermissions_discipline(AssignTeamOBJ.form, AssignTeamOBJ.dropDownBox,
				AssignTeamOBJ.dropDownValue, AssignTeamOBJ.defineUserPermissions, "clicked_on_DefineUserPermissions");
	}

	@Then("validate Top AssignTeam header is completed with cheked mark")
	public void validate_topHeader_check_is_display() {
		TestUtilDemo.isElementPresent(AssignTeamOBJ.completeAssignTeamHeader, "complete Header icon");

	}

	/**
	 * @discipline Process
	 * @section processTeamLeads
	 */
	@When("validate user click on processsEngineeringTeam")
	public void validate_user_click_on_processTeamLeads_Section() throws Throwable {
		TestUtilDemo.clickElement(AssignTeamOBJ.processTeamLeads, "processTeamLeads Section");

	}

	@When("validate validate Section is NOT completed, an empty circle next to the processsEngineeringTeamSection is display")
	public void validate_empty_circle_next_to_the_processTeamLeads_will_display() throws Throwable {
		Thread.sleep(2000);
		StepCommonMethod.validate_empty_circle_next_to_the_Section_label_will_display(
				AssignTeamOBJ.processTeamLeadsUnCheckedMark, "UnCheckedMark ");
	}

	@When("validate toggle is on, the name field will enable in processsEngineeringTeam")
	public void validate_toggle_on_the_name_field_will_enable_in_processsEngineeringTeam() throws Throwable {
		StepCommonMethod.validate_toggle_is_on_the_name_field_will_enable(AssignTeamOBJ.form,
				AssignTeamOBJ.toggleProcessTeamLeads, "toggle On");
	}

	@When("validate System will prompt user to save record if user is moving away from processsEngineeringTeam section screen without saving data")
	public void leaving_page_without_saving_in_processsEngineeringTeam() throws Throwable {
		TestUtilDemo.clickElement(AssignTeamOBJ.processTeamLeads, "processTeamLeads");
		TestUtilDemo.scrollDownForShort();
		TestUtilDemo.clickElement(AssignTeamOBJ.processTeam, "processTeamLeads");
	}

	@When("validate toggling off a role with a name populated the name will clear and field will disable in processsEngineeringTeam")
	public void toggling_off_and_field_will_disable_in_processsEngineeringTeam() throws Throwable {
		TestUtilDemo.scrollUpTop();
		Thread.sleep(5000);
		StepCommonMethod.toggling_off_and_field_will_disable(AssignTeamOBJ.toggleProcessTeamLeads,
				AssignTeamOBJ.SAVE_BUTTON, "clicked on toggle off and save ");
	}

	@When("validate For select roles, user can select +Add Professional from processsEngineeringTeam which will create a new blank field to populate an additional professional for a given role")
	public void add_new_role_in_processsEngineeringTeam() throws Throwable {
		TestUtilDemo.scrollUpTop();
		validate_toggle_on_the_name_field_will_enable_in_processsEngineeringTeam();
		autoSearchName_in_dropdown_and_select_in_pipingSection();
		Thread.sleep(2000);
		StepCommonMethod.add_new_role(AssignTeamOBJ.addProfesstional, AssignTeamOBJ.dropDownBoxAddProfesstional,
				AssignTeamOBJ.dropDownValueforEdit, AssignTeamOBJ.SAVE_BUTTON, "Adding new role ");
	}

	@When("validate Section is completed, a check next to the processsEngineeringTeam is display")
	public void checkMark_is_display_next_to_processsEngineeringTeam() throws Throwable {
		StepCommonMethod.checkMark_is_display_next_to_section(AssignTeamOBJ.processTeamLeadsCheckedMark,
				AssignTeamOBJ.EDIT_BUTTON, "CheckedMark displayed ");
		TestUtilDemo.scrollUpTop();
	}

	@When("validate clicking on Define User Permissions displays a list of user permissions that I can assign an individual for processsEngineeringTeam")
	public void clicking_on_DefineUserPermissions_in_processsEngineeringTeam() throws Throwable {
		StepCommonMethod.clicking_on_DefineUserPermissions_discipline(AssignTeamOBJ.form, AssignTeamOBJ.dropDownBox,
				AssignTeamOBJ.dropDownValue, AssignTeamOBJ.defineUserPermissions, "clicked_on_DefineUserPermissions");
	}

	/**
	 * @discipline Process
	 * @section ProcessTeam
	 */
	@When("validate user click on processDesignTeam")
	public void validate_user_click_on_processTeam_Section() throws Throwable {
		TestUtilDemo.clickElement(AssignTeamOBJ.processTeamLeads, "processTeamLeads Section");
		TestUtilDemo.scrollDownForShort();
		TestUtilDemo.clickElement(AssignTeamOBJ.processTeam, "processTeam Section");

	}

	@When("validate validate Section is NOT completed, an empty circle next to the processDesignTeam is display")
	public void validate_empty_circle_next_to_the_processTeamSection_will_display() throws Throwable {
		StepCommonMethod.validate_empty_circle_next_to_the_Section_label_will_display(
				AssignTeamOBJ.processTeamUnCheckedMark, "UnCheckedMark ");
	}

	@When("validate toggle is on, the name field will enable in processDesignTeam")
	public void validate_toggle_on_the_name_field_will_enable_in_processDesignTeam() throws Throwable {
		StepCommonMethod.validate_toggle_is_on_the_name_field_will_enable(AssignTeamOBJ.form,
				AssignTeamOBJ.toggleProcessTeam, "toggle On");
	}

	@When("validate System will prompt user to save record if user is moving away from processDesignTeam section screen without saving data")
	public void leaving_page_without_saving_in_processDesignTeam() throws Throwable {
		TestUtilDemo.clickElement(AssignTeamOBJ.processTeamLeads, "processTeamLeads");
		TestUtilDemo.scrollDownForShort();
		StepCommonMethod.leaving_page_without_saving(AssignTeamOBJ.processTeam, "leaving page without save ");
	}

	@When("validate toggling off a role with a name populated the name will clear and field will disable in processDesignTeam")
	public void toggling_off_and_field_will_disable_in_processTeam() throws Throwable {
		TestUtilDemo.scrollUpTop();
		StepCommonMethod.toggling_off_and_field_will_disable(AssignTeamOBJ.toggleProcessTeam, AssignTeamOBJ.SAVE_BUTTON,
				"clicked on toggle off and save ");
	}

	@When("validate For select roles, user can select +Add Professional from processDesignTeam which will create a new blank field to populate an additional professional for a given role")
	public void add_new_role_in_processDesignTeam() throws Throwable {
		TestUtilDemo.scrollUpTop();
		validate_toggle_on_the_name_field_will_enable_in_processDesignTeam();
		autoSearchName_in_dropdown_and_select_in_pipingSection();
		Thread.sleep(2000);
		StepCommonMethod.add_new_role(AssignTeamOBJ.addProfesstional, AssignTeamOBJ.dropDownBoxAddProfesstional,
				AssignTeamOBJ.dropDownValueforEdit, AssignTeamOBJ.SAVE_BUTTON, "Adding new role ");
	}

	@When("validate Section is completed, a check next to the processDesignTeam is display")
	public void checkMark_is_display_next_to_processDesignTeam() throws Throwable {
		StepCommonMethod.checkMark_is_display_next_to_section(AssignTeamOBJ.processTeamCheckedMark,
				AssignTeamOBJ.EDIT_BUTTON, "CheckedMark displayed ");
		TestUtilDemo.scrollUpTop();
	}

	@When("validate clicking on Define User Permissions displays a list of user permissions that I can assign an individual for processDesignTeam")
	public void clicking_on_DefineUserPermissions_in_processDesignTeam() throws Throwable {
		StepCommonMethod.clicking_on_DefineUserPermissions_discipline(AssignTeamOBJ.form, AssignTeamOBJ.dropDownBox,
				AssignTeamOBJ.dropDownValue, AssignTeamOBJ.defineUserPermissions, "clicked_on_DefineUserPermissions");

	}

	/**
	 * @role Electrical
	 * @section ElectricalTeamLead
	 */
	@When("validate user click on electricalTeamLead")
	public void validate_user_click_on_electricalTeamLead_Section() throws Throwable {
		TestUtilDemo.clickElement(AssignTeamOBJ.electricalTeamLead, "electricalTeamLead Section");

	}

	@When("validate validate Section is NOT completed, an empty circle next to the electricalTeamLeadSection is display")
	public void validate_empty_circle_next_to_the_electricalTeamLead_will_display() throws Throwable {
		Thread.sleep(2000);
		StepCommonMethod.validate_empty_circle_next_to_the_Section_label_will_display(
				AssignTeamOBJ.electricalTeamLeadUnCheckedMark, "UnCheckedMark ");
	}

	@When("validate toggle is on, the name field will enable in electricalTeamLead")
	public void validate_toggle_on_the_name_field_will_enable_in_electricalTeamLead() throws Throwable {
		StepCommonMethod.validate_toggle_is_on_the_name_field_will_enable(AssignTeamOBJ.form,
				AssignTeamOBJ.toggleElectricalEngineerLeads, "toggle On");
	}

	@When("validate System will prompt user to save record if user is moving away from electricalTeamLead section screen without saving data")
	public void leaving_page_without_saving_in_electricalTeamLead() throws Throwable {
		TestUtilDemo.clickElement(AssignTeamOBJ.electricalTeamLead, "electricalTeamLead");
		TestUtilDemo.scrollDownForShort();
		TestUtilDemo.clickElement(AssignTeamOBJ.electricalTeam, "electricalTeam");
	}

	@When("validate toggling off a role with a name populated the name will clear and field will disable in electricalTeamLead")
	public void toggling_off_and_field_will_disable_in_electricalTeamLead() throws Throwable {
		TestUtilDemo.scrollUpTop();
		Thread.sleep(5000);
		StepCommonMethod.toggling_off_and_field_will_disable(AssignTeamOBJ.toggleElectricalEngineerLeads,
				AssignTeamOBJ.SAVE_BUTTON, "clicked on toggle off and save ");
	}

	@When("validate For select roles, user can select +Add Professional from electricalTeamLead which will create a new blank field to populate an additional professional for a given role")
	public void add_new_role_in_electricalTeamLead() throws Throwable {
		TestUtilDemo.scrollUpTop();
		validate_toggle_on_the_name_field_will_enable_in_electricalTeamLead();
		autoSearchName_in_dropdown_and_select_in_pipingSection();
		Thread.sleep(2000);
		StepCommonMethod.add_new_role(AssignTeamOBJ.addProfesstional, AssignTeamOBJ.dropDownBoxAddProfesstional,
				AssignTeamOBJ.dropDownValueforEdit, AssignTeamOBJ.SAVE_BUTTON, "Adding new role ");
	}

	@When("validate Section is completed, a check next to the electricalTeamLead is display")
	public void checkMark_is_display_next_to_electricalTeamLead() throws Throwable {
		StepCommonMethod.checkMark_is_display_next_to_section(AssignTeamOBJ.electricalTeamLeadCheckedMark,
				AssignTeamOBJ.EDIT_BUTTON, "CheckedMark displayed ");
		TestUtilDemo.scrollUpTop();
	}

	@When("validate clicking on Define User Permissions displays a list of user permissions that I can assign an individual for electricalTeamLead")
	public void clicking_on_DefineUserPermissions_in_electricalTeamLead() throws Throwable {
		StepCommonMethod.clicking_on_DefineUserPermissions_discipline(AssignTeamOBJ.form, AssignTeamOBJ.dropDownBox,
				AssignTeamOBJ.dropDownValue, AssignTeamOBJ.defineUserPermissions, "clicked_on_DefineUserPermissions");
	}

	@When("valiate user click on the Edit button")
	public void clicking_on_editbutton() throws Throwable {
		TestUtilDemo.clickElement(AssignTeamOBJ.EDIT_BUTTON, "");
	}

	/**
	 * @role Electrical
	 * @section ElectricalTeam
	 */
	@When("validate user click on electricalTeam")
	public void validate_user_click_on_electricalTeam_Section() throws Throwable {
		TestUtilDemo.clickElement(AssignTeamOBJ.electricalTeamLead, "electricalTeamLead Section");
		TestUtilDemo.scrollDownForShort();
		TestUtilDemo.clickElement(AssignTeamOBJ.electricalTeam, "electricalTeam Section");

	}

	@When("validate validate Section is NOT completed, an empty circle next to the electricalTeam is display")
	public void validate_empty_circle_next_to_the_electricalTeamSection_will_display() throws Throwable {
		StepCommonMethod.validate_empty_circle_next_to_the_Section_label_will_display(
				AssignTeamOBJ.electricalTeamUnCheckedMark, "UnCheckedMark ");
	}

	@When("validate toggle is on, the name field will enable in electricalTeam")
	public void validate_toggle_on_the_name_field_will_enable_in_electricalTeam() throws Throwable {
		StepCommonMethod.validate_toggle_is_on_the_name_field_will_enable(AssignTeamOBJ.form,
				AssignTeamOBJ.toggleElectricalTeam, "toggle On");
	}

	@When("validate System will prompt user to save record if user is moving away from electricalTeam section screen without saving data")
	public void leaving_page_without_saving_in_electricalTeam() throws Throwable {
		TestUtilDemo.clickElement(AssignTeamOBJ.electricalTeamLead, "electricalTeamLead");
		TestUtilDemo.scrollDownForShort();
		StepCommonMethod.leaving_page_without_saving(AssignTeamOBJ.electricalTeam, "leaving page without save ");
	}

	@When("validate toggling off a role with a name populated the name will clear and field will disable in electricalTeam")
	public void toggling_off_and_field_will_disable_in_electricalTeam() throws Throwable {
		TestUtilDemo.scrollUpTop();
		StepCommonMethod.toggling_off_and_field_will_disable(AssignTeamOBJ.toggleElectricalTeam,
				AssignTeamOBJ.SAVE_BUTTON, "clicked on toggle off and save ");
	}

	@When("validate For select roles, user can select +Add Professional from electricalTeam which will create a new blank field to populate an additional professional for a given role")
	public void add_new_role_in_electricalTeam() throws Throwable {
		TestUtilDemo.scrollUpTop();
		validate_toggle_on_the_name_field_will_enable_in_electricalTeam();
		autoSearchName_in_dropdown_and_select_in_pipingSection();
		Thread.sleep(2000);
		StepCommonMethod.add_new_role(AssignTeamOBJ.addProfesstional, AssignTeamOBJ.dropDownBoxAddProfesstional,
				AssignTeamOBJ.dropDownValueforEdit, AssignTeamOBJ.SAVE_BUTTON, "Adding new role ");
	}

	@When("validate Section is completed, a check next to the electricalTeam is display")
	public void checkMark_is_display_next_to_electricalTeam() throws Throwable {
		StepCommonMethod.checkMark_is_display_next_to_section(AssignTeamOBJ.electricalTeamCheckedMark,
				AssignTeamOBJ.EDIT_BUTTON, "CheckedMark displayed ");
		TestUtilDemo.scrollUpTop();
	}

	@When("validate clicking on Define User Permissions displays a list of user permissions that I can assign an individual for electricalTeam")
	public void clicking_on_DefineUserPermissions_in_electricalTeam() throws Throwable {
		StepCommonMethod.clicking_on_DefineUserPermissions_discipline(AssignTeamOBJ.form, AssignTeamOBJ.dropDownBox,
				AssignTeamOBJ.dropDownValue, AssignTeamOBJ.defineUserPermissions, "clicked_on_DefineUserPermissions");

	}

	/**
	 * @role Equipment
	 * @section EquipmentTeamLeads
	 */
	@When("validate user click on equipmentTeamLeads")
	public void validate_user_click_on_equipmentTeamLeads_Section() throws Throwable {
		TestUtilDemo.clickElement(AssignTeamOBJ.equipmentTeamLeads, "equipmentTeamLeads Section");

	}

	@When("validate validate Section is NOT completed, an empty circle next to the equipmentTeamLeadsSection is display")
	public void validate_empty_circle_next_to_the_equipmentTeamLeads_will_display() throws Throwable {
		Thread.sleep(2000);
		StepCommonMethod.validate_empty_circle_next_to_the_Section_label_will_display(
				AssignTeamOBJ.equipmentTeamLeadsUnCheckedMark, "UnCheckedMark ");
	}

	@When("validate toggle is on, the name field will enable in equipmentTeamLeads")
	public void validate_toggle_on_the_name_field_will_enable_in_equipmentTeamLeads() throws Throwable {
		StepCommonMethod.validate_toggle_is_on_the_name_field_will_enable(AssignTeamOBJ.form,
				AssignTeamOBJ.toggleEquipmentEngineerLeads, "toggle On");
	}

	@When("validate System will prompt user to save record if user is moving away from equipmentTeamLeads section screen without saving data")
	public void leaving_page_without_saving_in_equipmentTeamLeads() throws Throwable {
		TestUtilDemo.clickElement(AssignTeamOBJ.equipmentTeamLeads, "equipmentTeamLeads");
		TestUtilDemo.scrollDownForShort();
		TestUtilDemo.clickElement(AssignTeamOBJ.equipmentTeam, "equipmentTeam");
	}

	@When("validate toggling off a role with a name populated the name will clear and field will disable in equipmentTeamLeads")
	public void toggling_off_and_field_will_disable_in_equipmentTeamLeads() throws Throwable {
		TestUtilDemo.scrollUpTop();
		Thread.sleep(5000);
		StepCommonMethod.toggling_off_and_field_will_disable(AssignTeamOBJ.toggleEquipmentEngineerLeads,
				AssignTeamOBJ.SAVE_BUTTON, "clicked on toggle off and save ");
	}

	@When("validate For select roles, user can select +Add Professional from equipmentTeamLeads which will create a new blank field to populate an additional professional for a given role")
	public void add_new_role_in_equipmentTeamLeads() throws Throwable {
		TestUtilDemo.scrollUpTop();
		validate_toggle_on_the_name_field_will_enable_in_equipmentTeamLeads();
		autoSearchName_in_dropdown_and_select_in_pipingSection();
		Thread.sleep(2000);
		StepCommonMethod.add_new_role(AssignTeamOBJ.addProfesstional, AssignTeamOBJ.dropDownBoxAddProfesstional,
				AssignTeamOBJ.dropDownValueforEdit, AssignTeamOBJ.SAVE_BUTTON, "Adding new role ");
	}

	@When("validate Section is completed, a check next to the equipmentTeamLeads is display")
	public void checkMark_is_display_next_to_equipmentTeamLeads() throws Throwable {
		StepCommonMethod.checkMark_is_display_next_to_section(AssignTeamOBJ.equipmentTeamLeadsCheckedMark,
				AssignTeamOBJ.EDIT_BUTTON, "CheckedMark displayed ");
		TestUtilDemo.scrollUpTop();
	}

	@When("validate clicking on Define User Permissions displays a list of user permissions that I can assign an individual for equipmentTeamLeads")
	public void clicking_on_DefineUserPermissions_in_equipmentTeamLeads() throws Throwable {
		StepCommonMethod.clicking_on_DefineUserPermissions_discipline(AssignTeamOBJ.form, AssignTeamOBJ.dropDownBox,
				AssignTeamOBJ.dropDownValue, AssignTeamOBJ.defineUserPermissions, "clicked_on_DefineUserPermissions");
	}

	/**
	 * @role Equipment
	 * @section EquipmentTeam
	 */
	@When("validate user click on equipmentTeam")
	public void validate_user_click_on_equipmentTeam_Section() throws Throwable {
		TestUtilDemo.clickElement(AssignTeamOBJ.equipmentTeamLeads, "equipmentTeamLeads Section");
		TestUtilDemo.scrollDownForShort();
		TestUtilDemo.clickElement(AssignTeamOBJ.equipmentTeam, "equipmentTeam Section");

	}

	@When("validate validate Section is NOT completed, an empty circle next to the equipmentTeam is display")
	public void validate_empty_circle_next_to_the_equipmentTeamSection_will_display() throws Throwable {
		StepCommonMethod.validate_empty_circle_next_to_the_Section_label_will_display(
				AssignTeamOBJ.equipmentTeamUnCheckedMark, "UnCheckedMark ");
	}

	@When("validate toggle is on, the name field will enable in equipmentTeam")
	public void validate_toggle_on_the_name_field_will_enable_in_equipmentTeam() throws Throwable {
		StepCommonMethod.validate_toggle_is_on_the_name_field_will_enable(AssignTeamOBJ.form,
				AssignTeamOBJ.toggleEquipmentTeam, "toggle On");
	}

	@When("validate System will prompt user to save record if user is moving away from equipmentTeam section screen without saving data")
	public void leaving_page_without_saving_in_equipmentTeam() throws Throwable {
		TestUtilDemo.clickElement(AssignTeamOBJ.equipmentTeamLeads, "equipmentTeamLeads");
		TestUtilDemo.scrollDownForShort();
		StepCommonMethod.leaving_page_without_saving(AssignTeamOBJ.equipmentTeam, "leaving page without save ");
	}

	@When("validate toggling off a role with a name populated the name will clear and field will disable in equipmentTeam")
	public void toggling_off_and_field_will_disable_in_equipmentTeam() throws Throwable {
		TestUtilDemo.scrollUpTop();
		StepCommonMethod.toggling_off_and_field_will_disable(AssignTeamOBJ.toggleEquipmentTeam,
				AssignTeamOBJ.SAVE_BUTTON, "clicked on toggle off and save ");
	}

	@When("validate For select roles, user can select +Add Professional from equipmentTeam which will create a new blank field to populate an additional professional for a given role")
	public void add_new_role_in_equipmentTeam() throws Throwable {
		TestUtilDemo.scrollUpTop();
		validate_toggle_on_the_name_field_will_enable_in_equipmentTeam();
		autoSearchName_in_dropdown_and_select_in_pipingSection();
		Thread.sleep(2000);
		StepCommonMethod.add_new_role(AssignTeamOBJ.addProfesstional, AssignTeamOBJ.dropDownBoxAddProfesstional,
				AssignTeamOBJ.dropDownValueforEdit, AssignTeamOBJ.SAVE_BUTTON, "Adding new role ");
	}

	@When("validate Section is completed, a check next to the equipmentTeam is display")
	public void checkMark_is_display_next_to_equipmentTeam() throws Throwable {
		StepCommonMethod.checkMark_is_display_next_to_section(AssignTeamOBJ.equipmentTeamCheckedMark,
				AssignTeamOBJ.EDIT_BUTTON, "CheckedMark displayed ");
		TestUtilDemo.scrollUpTop();
	}

	@When("validate clicking on Define User Permissions displays a list of user permissions that I can assign an individual for equipmentTeam")
	public void clicking_on_DefineUserPermissions_in_equipmentTeam() throws Throwable {
		StepCommonMethod.clicking_on_DefineUserPermissions_discipline(AssignTeamOBJ.form, AssignTeamOBJ.dropDownBox,
				AssignTeamOBJ.dropDownValue, AssignTeamOBJ.defineUserPermissions, "clicked_on_DefineUserPermissions");

	}

	/**
	 * @role Structural
	 * @section StructuralTeamLeads
	 */
	@When("validate user click on structuralTeamLeads")
	public void validate_user_click_on_structuralTeamLeads_Section() throws Throwable {
		TestUtilDemo.clickElement(AssignTeamOBJ.structuralTeamLeads, "structuralTeamLeads Section");

	}

	@When("validate validate Section is NOT completed, an empty circle next to the structuralTeamLeadsSection is display")
	public void validate_empty_circle_next_to_the_structuralTeamLeads_will_display() throws Throwable {
		Thread.sleep(2000);
		StepCommonMethod.validate_empty_circle_next_to_the_Section_label_will_display(
				AssignTeamOBJ.structuralTeamLeadsUnCheckedMark, "UnCheckedMark ");
	}

	@When("validate toggle is on, the name field will enable in structuralTeamLeads")
	public void validate_toggle_on_the_name_field_will_enable_in_structuralTeamLeads() throws Throwable {
		StepCommonMethod.validate_toggle_is_on_the_name_field_will_enable(AssignTeamOBJ.form,
				AssignTeamOBJ.toggleStructuralEngineerLeads, "toggle On");
	}

	@When("validate System will prompt user to save record if user is moving away from structuralTeamLeads section screen without saving data")
	public void leaving_page_without_saving_in_structuralTeamLeads() throws Throwable {
		TestUtilDemo.clickElement(AssignTeamOBJ.structuralTeamLeads, "structuralTeamLeads");
		TestUtilDemo.scrollDownForShort();
		TestUtilDemo.clickElement(AssignTeamOBJ.structuralTeam, "structuralTeam");
	}

	@When("validate toggling off a role with a name populated the name will clear and field will disable in structuralTeamLeads")
	public void toggling_off_and_field_will_disable_in_structuralTeamLeads() throws Throwable {
		TestUtilDemo.scrollUpTop();
		Thread.sleep(5000);
		StepCommonMethod.toggling_off_and_field_will_disable(AssignTeamOBJ.toggleStructuralEngineerLeads,
				AssignTeamOBJ.SAVE_BUTTON, "clicked on toggle off and save ");
	}

	@When("validate For select roles, user can select +Add Professional from structuralTeamLeads which will create a new blank field to populate an additional professional for a given role")
	public void add_new_role_in_structuralTeamLeads() throws Throwable {
		TestUtilDemo.scrollUpTop();
		validate_toggle_on_the_name_field_will_enable_in_structuralTeamLeads();
		autoSearchName_in_dropdown_and_select_in_pipingSection();
		Thread.sleep(2000);
		StepCommonMethod.add_new_role(AssignTeamOBJ.addProfesstional, AssignTeamOBJ.dropDownBoxAddProfesstional,
				AssignTeamOBJ.dropDownValueforEdit, AssignTeamOBJ.SAVE_BUTTON, "Adding new role ");
	}

	@When("validate Section is completed, a check next to the structuralTeamLeads is display")
	public void checkMark_is_display_next_to_structuralTeamLeads() throws Throwable {
		StepCommonMethod.checkMark_is_display_next_to_section(AssignTeamOBJ.structuralTeamLeadsCheckedMark,
				AssignTeamOBJ.EDIT_BUTTON, "CheckedMark displayed ");
		TestUtilDemo.scrollUpTop();
	}

	@When("validate clicking on Define User Permissions displays a list of user permissions that I can assign an individual for structuralTeamLeads")
	public void clicking_on_DefineUserPermissions_in_structuralTeamLeads() throws Throwable {
		StepCommonMethod.clicking_on_DefineUserPermissions_discipline(AssignTeamOBJ.form, AssignTeamOBJ.dropDownBox,
				AssignTeamOBJ.dropDownValue, AssignTeamOBJ.defineUserPermissions, "clicked_on_DefineUserPermissions");
	}

	/**
	 * @role structural
	 * @section structuralTeam
	 */
	@When("validate user click on structuralTeam")
	public void validate_user_click_on_structuralTeam_Section() throws Throwable {
		TestUtilDemo.clickElement(AssignTeamOBJ.structuralTeamLeads, "structuralTeamLeads Section");
		TestUtilDemo.scrollDownForShort();
		TestUtilDemo.clickElement(AssignTeamOBJ.structuralTeam, "structuralTeam Section");

	}

	@When("validate validate Section is NOT completed, an empty circle next to the structuralTeam is display")
	public void validate_empty_circle_next_to_the_structuralTeamSection_will_display() throws Throwable {
		StepCommonMethod.validate_empty_circle_next_to_the_Section_label_will_display(
				AssignTeamOBJ.structuralTeamUnCheckedMark, "UnCheckedMark ");
	}

	@When("validate toggle is on, the name field will enable in structuralTeam")
	public void validate_toggle_on_the_name_field_will_enable_in_structuralTeam() throws Throwable {
		StepCommonMethod.validate_toggle_is_on_the_name_field_will_enable(AssignTeamOBJ.form,
				AssignTeamOBJ.toggleStructuralTeam, "toggle On");
	}

	@When("validate System will prompt user to save record if user is moving away from structuralTeam section screen without saving data")
	public void leaving_page_without_saving_in_structuralTeam() throws Throwable {
		TestUtilDemo.clickElement(AssignTeamOBJ.structuralTeamLeads, "structuralTeamLeads");
		TestUtilDemo.scrollDownForShort();
		StepCommonMethod.leaving_page_without_saving(AssignTeamOBJ.structuralTeam, "leaving page without save ");
	}

	@When("validate toggling off a role with a name populated the name will clear and field will disable in structuralTeam")
	public void toggling_off_and_field_will_disable_in_structuralTeam() throws Throwable {
		TestUtilDemo.scrollUpTop();
		StepCommonMethod.toggling_off_and_field_will_disable(AssignTeamOBJ.toggleStructuralTeam,
				AssignTeamOBJ.SAVE_BUTTON, "clicked on toggle off and save ");
	}

	@When("validate For select roles, user can select +Add Professional from structuralTeam which will create a new blank field to populate an additional professional for a given role")
	public void add_new_role_in_structuralTeam() throws Throwable {
		TestUtilDemo.scrollUpTop();
		validate_toggle_on_the_name_field_will_enable_in_structuralTeam();
		autoSearchName_in_dropdown_and_select_in_pipingSection();
		Thread.sleep(2000);
		StepCommonMethod.add_new_role(AssignTeamOBJ.addProfesstional, AssignTeamOBJ.dropDownBoxAddProfesstional,
				AssignTeamOBJ.dropDownValueforEdit, AssignTeamOBJ.SAVE_BUTTON, "Adding new role ");
	}

	@When("validate Section is completed, a check next to the structuralTeam is display")
	public void checkMark_is_display_next_to_structuralTeam() throws Throwable {
		StepCommonMethod.checkMark_is_display_next_to_section(AssignTeamOBJ.structuralTeamCheckedMark,
				AssignTeamOBJ.EDIT_BUTTON, "CheckedMark displayed ");
		TestUtilDemo.scrollUpTop();
	}

	@When("validate clicking on Define User Permissions displays a list of user permissions that I can assign an individual for structuralTeam")
	public void clicking_on_DefineUserPermissions_in_structuralTeam() throws Throwable {
		StepCommonMethod.clicking_on_DefineUserPermissions_discipline(AssignTeamOBJ.form, AssignTeamOBJ.dropDownBox,
				AssignTeamOBJ.dropDownValue, AssignTeamOBJ.defineUserPermissions, "clicked_on_DefineUserPermissions");

	}

	/**
	 * @role I&C
	 * @section I&CTeamLeads
	 */
	@When("validate user click on I&CTeamLeads")
	public void validate_user_click_on_iandcTeamLeads_Section() throws Throwable {
		TestUtilDemo.clickElement(AssignTeamOBJ.iandcTeamLeads, "I&CTeamLeads Section");

	}

	@When("validate validate Section is NOT completed, an empty circle next to the I&CTeamLeadsSection is display")
	public void validate_empty_circle_next_to_the_iandcTeamLeads_will_display() throws Throwable {
		Thread.sleep(2000);
		StepCommonMethod.validate_empty_circle_next_to_the_Section_label_will_display(
				AssignTeamOBJ.iandcTeamLeadsUnCheckedMark, "UnCheckedMark ");
	}

	@When("validate toggle is on, the name field will enable in I&CTeamLeads")
	public void validate_toggle_on_the_name_field_will_enable_in_iandcTeamLeads() throws Throwable {
		StepCommonMethod.validate_toggle_is_on_the_name_field_will_enable(AssignTeamOBJ.form,
				AssignTeamOBJ.toggleiandcEngineerLeads, "toggle On");
	}

	@When("validate System will prompt user to save record if user is moving away from I&CTeamLeads section screen without saving data")
	public void leaving_page_without_saving_in_iandcTeamLeads() throws Throwable {
		TestUtilDemo.clickElement(AssignTeamOBJ.iandcTeamLeads, "I&CTeamLeads");
		TestUtilDemo.scrollDownForShort();
		TestUtilDemo.clickElement(AssignTeamOBJ.iandcTeam, "I&CTeam");
	}

	@When("validate toggling off a role with a name populated the name will clear and field will disable in I&CTeamLeads")
	public void toggling_off_and_field_will_disable_in_iandcTeamLeads() throws Throwable {
		TestUtilDemo.scrollUpTop();
		Thread.sleep(5000);
		StepCommonMethod.toggling_off_and_field_will_disable(AssignTeamOBJ.toggleiandcEngineerLeads,
				AssignTeamOBJ.SAVE_BUTTON, "clicked on toggle off and save ");
	}

	@When("validate For select roles, user can select +Add Professional from I&CTeamLeads which will create a new blank field to populate an additional professional for a given role")
	public void add_new_role_in_iandcTeamLeads() throws Throwable {
		TestUtilDemo.scrollUpTop();
		validate_toggle_on_the_name_field_will_enable_in_iandcTeamLeads();
		autoSearchName_in_dropdown_and_select_in_pipingSection();
		Thread.sleep(2000);
		StepCommonMethod.add_new_role(AssignTeamOBJ.addProfesstional, AssignTeamOBJ.dropDownBoxAddProfesstional,
				AssignTeamOBJ.dropDownValueforEdit, AssignTeamOBJ.SAVE_BUTTON, "Adding new role ");
	}

	@When("validate Section is completed, a check next to the I&CTeamLeads is display")
	public void checkMark_is_display_next_to_iandcTeamLeads() throws Throwable {
		StepCommonMethod.checkMark_is_display_next_to_section(AssignTeamOBJ.iandcTeamLeadsCheckedMark,
				AssignTeamOBJ.EDIT_BUTTON, "CheckedMark displayed ");
		TestUtilDemo.scrollUpTop();
	}

	@When("validate clicking on Define User Permissions displays a list of user permissions that I can assign an individual for I&CTeamLeads")
	public void clicking_on_DefineUserPermissions_in_iandcTeamLeads() throws Throwable {
		StepCommonMethod.clicking_on_DefineUserPermissions_discipline(AssignTeamOBJ.form, AssignTeamOBJ.dropDownBox,
				AssignTeamOBJ.dropDownValue, AssignTeamOBJ.defineUserPermissions, "clicked_on_DefineUserPermissions");
	}

	/**
	 * @role I&C
	 * @section I&CTeam
	 */
	@When("validate user click on I&CTeam")
	public void validate_user_click_on_iandcTeam_Section() throws Throwable {
		TestUtilDemo.clickElement(AssignTeamOBJ.iandcTeamLeads, "I&CTeamLeads Section");
		TestUtilDemo.scrollDownForShort();
		TestUtilDemo.clickElement(AssignTeamOBJ.iandcTeam, "I&CTeam Section");

	}

	@When("validate validate Section is NOT completed, an empty circle next to the I&CTeam is display")
	public void validate_empty_circle_next_to_the_iandcTeamSection_will_display() throws Throwable {
		StepCommonMethod.validate_empty_circle_next_to_the_Section_label_will_display(
				AssignTeamOBJ.iandcTeamUnCheckedMark, "UnCheckedMark ");
	}

	@When("validate toggle is on, the name field will enable in I&CTeam")
	public void validate_toggle_on_the_name_field_will_enable_in_iandcTeam() throws Throwable {
		StepCommonMethod.validate_toggle_is_on_the_name_field_will_enable(AssignTeamOBJ.form,
				AssignTeamOBJ.toggleiandcTeam, "toggle On");
	}

	@When("validate System will prompt user to save record if user is moving away from I&CTeam section screen without saving data")
	public void leaving_page_without_saving_in_iandcTeam() throws Throwable {
		TestUtilDemo.clickElement(AssignTeamOBJ.iandcTeamLeads, "I&CTeamLeads");
		TestUtilDemo.scrollDownForShort();
		StepCommonMethod.leaving_page_without_saving(AssignTeamOBJ.iandcTeam, "leaving page without save ");
	}

	@When("validate toggling off a role with a name populated the name will clear and field will disable in I&CTeam")
	public void toggling_off_and_field_will_disable_in_iandcTeam() throws Throwable {
		TestUtilDemo.scrollUpTop();
		StepCommonMethod.toggling_off_and_field_will_disable(AssignTeamOBJ.toggleiandcTeam, AssignTeamOBJ.SAVE_BUTTON,
				"clicked on toggle off and save ");
	}

	@When("validate For select roles, user can select +Add Professional from I&CTeam which will create a new blank field to populate an additional professional for a given role")
	public void add_new_role_in_iandcTeam() throws Throwable {
		TestUtilDemo.scrollUpTop();
		validate_toggle_on_the_name_field_will_enable_in_iandcTeam();
		autoSearchName_in_dropdown_and_select_in_pipingSection();
		Thread.sleep(2000);
		StepCommonMethod.add_new_role(AssignTeamOBJ.addProfesstional, AssignTeamOBJ.dropDownBoxAddProfesstional,
				AssignTeamOBJ.dropDownValueforEdit, AssignTeamOBJ.SAVE_BUTTON, "Adding new role ");
	}

	@When("validate Section is completed, a check next to the I&CTeam is display")
	public void checkMark_is_display_next_to_iandcTeam() throws Throwable {
		StepCommonMethod.checkMark_is_display_next_to_section(AssignTeamOBJ.iandcTeamCheckedMark,
				AssignTeamOBJ.EDIT_BUTTON, "CheckedMark displayed ");
		TestUtilDemo.scrollUpTop();
	}

	@When("validate clicking on Define User Permissions displays a list of user permissions that I can assign an individual for I&CTeam")
	public void clicking_on_DefineUserPermissions_in_iandcTeam() throws Throwable {
		StepCommonMethod.clicking_on_DefineUserPermissions_discipline(AssignTeamOBJ.form, AssignTeamOBJ.dropDownBox,
				AssignTeamOBJ.dropDownValue, AssignTeamOBJ.defineUserPermissions, "clicked_on_DefineUserPermissions");

	}
}
