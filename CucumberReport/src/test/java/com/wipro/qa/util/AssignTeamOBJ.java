package com.wipro.qa.util;
import org.openqa.selenium.By;
import com.wipro.qa.base.TestBase;

/**
 * @authorID Rat105478
 * @authorName RameshRathod
 */

public class AssignTeamOBJ extends TestBase {

   /**
	*@type xpath
	*@header Icon/Link/completeIcon
	*/
	public static By AssignTeamLink = By.xpath("//a[@href='/projectSetup/assignProjectLeads']");
	public static By AssignTeamHeader = By.xpath("//div[text()='Assign Team']");
	public static By completeAssignTeamHeader = By.xpath("//div[text()='Assign Team']//parent::a//img[@src='/static/media/completed.0bc5e4c8.svg']");
	
   /**
	*@role Piping
	*@section PipingTeamLeads
	*/
	public static By pipingTeamLeads = By.xpath("//p[text()='Piping Team Leads']");
	public static By pipingTeamLeadsCheckedMark = By.xpath("//p[text()='Piping Team Leads']//parent::li//img[@class='sideMenuIcon']");
	public static By pipingTeamLeadsUnCheckedMark = By.xpath("//p[text()='Piping Team Leads']//parent::li//span[@class='sideMenuIcon circle-white']");
	public static By togglePipingTeamLeads = By.xpath("//label[@for='pipingEngineeringSubLeadCoLead']");
	
	public static By PipingPDE = By.xpath("//label[text()='Piping Engineering Sub-lead/Co-Lead']");
	public static By PipingPLD = By.xpath("//label[text()='Piping Designer Sub-lead/Co-Lead']");
	public static By dropDownBox = By.xpath("//div[@class='auto-select-theme css-2b097c-container']/div/div[1]/div[1]");
	public static By dropDownValue = By.xpath("//div[text()='Matthew Fowler / Lead / Kansas']");
	public static By dropDownValueforEdit = By.xpath("//div[text()='john doe / Lead / Wipro']");
	public static By dropDownValueP = By.xpath("//div[text()='Piping Discipline / Lead / Kansas']");
	public static By dropDownValueEle = By.xpath("//div[text()='Electrical Discipline / Lead / Kansas']");
	public static By dropDownValueIC = By.xpath("//div[text()='iandc Discipline / Lead / Kansas']");
	public static By dropDownValueSt = By.xpath("//div[text()='Structural Discipline / Lead / Kansas']");
	public static By dropDownValuePro = By.xpath("//div[text()='Process Discipline / Lead / Kansas']");
	public static By dropDownValueEqp = By.xpath("//div[text()='Equipment Discipline / Lead / Kansas']");
	public static By dropDownValueMngt = By.xpath("//div[text()='Management pli / Lead / Kansas']");
	public static By NotifyAllAssignees = By.xpath("//span[text()='Notify All Assignees']");
	public static By addProfesstional = By.xpath("//div[@class='field-group row'][1]/div[2]/div[2]/button/span");
	public static By dropDownBoxAddProfesstional = By.xpath("//div[@class='field-group row'][1]/div[2]/div[2]/div/div/div/div[1]");
	public static By addProfesstional1 = By.xpath("//label[text()='Add Professional']");
	public static By addProfesstional1DD = By.xpath("//div[@class='field-group row'][7]/div[2]/div[2]/div/div/div/div[1]");
	
   /**
    *@role Piping
	*@section PipingTeam
	*/
	public static By pipingTeam = By.xpath("//p[text()='Piping Team']");
	public static By pipingTeamCheckedMark = By.xpath("//p[text()='Piping Team']//parent::li//img[@class='sideMenuIcon']");
	public static By pipingTeamUnCheckedMark = By.xpath("//p[text()='Piping Team']//parent::li//span[@class='sideMenuIcon circle-white']");
	public static By togglePipingTeam = By.xpath("//label[@for='pipingEngineer']");

   /**
	*@role Process
	*@section ProcessTeamLeads
	*/
	public static By processTeamLeads = By.xpath("//p[text()='Process Team Leads']");
	public static By processTeamLeadsCheckedMark = By.xpath("//p[text()='Process Team Leads']//parent::li//img[@class='sideMenuIcon']");
	public static By processTeamLeadsUnCheckedMark = By.xpath("//p[text()='Process Team Leads']//parent::li//span[@class='sideMenuIcon circle-white']");
	public static By toggleProcessTeamLeads = By.xpath("//label[@for='processEngineeringSubLeadCoLead']");

   /**
	*@role Process
	*@section ProcessTeam
	*/
	public static By processTeam = By.xpath("//p[text()='Process Team']");
	public static By processTeamCheckedMark = By.xpath("//p[text()='Process Team']//parent::li//img[@class='sideMenuIcon']");
	public static By processTeamUnCheckedMark = By.xpath("//p[text()='Process Team']//parent::li//span[@class='sideMenuIcon circle-white']");
	public static By toggleProcessTeam = By.xpath("//label[@for='processEngineer']");

	/**
	*@role Electrical
	*@section ElectricalTeamLead
	*/
	public static By electricalTeamLead = By.xpath("//p[text()='Electrical Team Leads']");
	public static By electricalTeamLeadCheckedMark = By.xpath("//p[text()='Electrical Team Leads']//parent::li//img[@class='sideMenuIcon']");
	public static By electricalTeamLeadUnCheckedMark = By.xpath("//p[text()='Electrical Team Leads']//parent::li//span[@class='sideMenuIcon circle-white']");
	public static By toggleElectricalEngineerLeads = By.xpath("//label[@for='electricalEngineeringSubLeadCoLead']");

   /**
	*@role Electrical
	*@section ElectricalTeam
	*/
	public static By electricalTeam = By.xpath("//p[text()='Electrical Team']");
	public static By electricalTeamCheckedMark = By.xpath("//p[text()='Electrical Team']//parent::li//img[@class='sideMenuIcon']");
	public static By electricalTeamUnCheckedMark = By.xpath("//p[text()='Electrical Team']//parent::li//span[@class='sideMenuIcon circle-white']");
	public static By toggleElectricalTeam = By.xpath("//label[@for='electricalEngineer']");

	/**
	*@role Equipment
	*@section EquipmentTeamLead
	*/
	public static By equipmentTeamLeads = By.xpath("//p[text()='Equipment Team Leads']");
	public static By equipmentTeamLeadsCheckedMark = By.xpath("//p[text()='Equipment Team Leads']//parent::li//img[@class='sideMenuIcon']");
	public static By equipmentTeamLeadsUnCheckedMark = By.xpath("//p[text()='Equipment Team Leads']//parent::li//span[@class='sideMenuIcon circle-white']");
	public static By toggleEquipmentEngineerLeads = By.xpath("//label[@for='equipmentEngineeringSubLeadCoLead']");

   /**
	*@role Equipment
	*@section EquipmentTeam
	*/
	public static By equipmentTeam = By.xpath("//p[text()='Equipment Team']");
	public static By equipmentTeamCheckedMark = By.xpath("//p[text()='Equipment Team']//parent::li//img[@class='sideMenuIcon']");
	public static By equipmentTeamUnCheckedMark = By.xpath("//p[text()='Equipment Team']//parent::li//span[@class='sideMenuIcon circle-white']");
	public static By toggleEquipmentTeam = By.xpath("//label[@for='equipmentEngineer']");

	/**
	*@role Structural
	*@section StructuralTeamLead
	*/
	public static By structuralTeamLeads = By.xpath("//p[text()='Structural Team Leads']");
	public static By structuralTeamLeadsCheckedMark = By.xpath("//p[text()='Structural Team Leads']//parent::li//img[@class='sideMenuIcon']");
	public static By structuralTeamLeadsUnCheckedMark = By.xpath("//p[text()='Structural Team Leads']//parent::li//span[@class='sideMenuIcon circle-white']");
	public static By toggleStructuralEngineerLeads = By.xpath("//label[@for='structuralEngineeringSubLeadCoLead']");

   /**
	*@role Structural
	*@section StructuralTeam
	*/
	public static By structuralTeam = By.xpath("//p[text()='Structural Team']");
	public static By structuralTeamCheckedMark = By.xpath("//p[text()='Structural Team']//parent::li//img[@class='sideMenuIcon']");
	public static By structuralTeamUnCheckedMark = By.xpath("//p[text()='Structural Team']//parent::li//span[@class='sideMenuIcon circle-white']");
	public static By toggleStructuralTeam = By.xpath("//label[@for='structuralEngineer']");

	/**
	*@role I&C
	*@section I&CTeamLead
	*/
	public static By iandcTeamLeads = By.xpath("//p[text()='I&C Team Leads']");
	public static By iandcTeamLeadsCheckedMark = By.xpath("//p[text()='I&C Team Leads']//parent::li//img[@class='sideMenuIcon']");
	public static By iandcTeamLeadsUnCheckedMark = By.xpath("//p[text()='I&C Team Leads']//parent::li//span[@class='sideMenuIcon circle-white']");
	public static By toggleiandcEngineerLeads = By.xpath("//label[@for='icEngineeringSubLeadCoLead']");

   /**
	*@role I&C
	*@section I&CTeam
	*/
	public static By iandcTeam = By.xpath("//p[text()='I&C Team']");
	public static By iandcTeamCheckedMark = By.xpath("//p[text()='I&C Team']//parent::li//img[@class='sideMenuIcon']");
	public static By iandcTeamUnCheckedMark = By.xpath("//p[text()='I&C Team']//parent::li//span[@class='sideMenuIcon circle-white']");
	public static By toggleiandcTeam = By.xpath("//label[@for='icEngineer']");
	
   /**
	*@role PLI
	*@section PipingLeads
	*/
	public static By pipingLeads = By.xpath("//p[text()='Piping Leads']");
	public static By pipingLeadsCheckedMark = By.xpath("//p[text()='Piping Leads']//parent::li//img[@class='sideMenuIcon']");
	public static By pipingLeadsUnCheckedMark = By.xpath("//p[text()='Piping Leads']//parent::li//span[@class='sideMenuIcon circle-white']");
	public static By togglepipingLeads = By.xpath("//label[@for='pipingPdeEngineeringLead']");

   /**
	*@role PLI
	*@section ElectricalLeads
	*/
	public static By ElectricalLeadsSection = By.xpath("//p[text()='Electrical Leads']");
	public static By electricalCheckedMark = By.xpath("//p[text()='Electrical Leads']//parent::li//img[@class='sideMenuIcon']");
	public static By electricalUnCheckedMark = By.xpath("//p[text()='Electrical Leads']//parent::li//span[@class='sideMenuIcon circle-white']");
	public static By toggleElectrical = By.xpath("//label[@for='electricalPdeEngineeringLead']");
	public static By form = By.xpath("//form[@initialvalues='[object Object]']");

   /**
	*@role PLI
	*@section IandCLeads
	*/
	public static By IAndCLeadSection = By.xpath("//p[text()='I&C Leads']");
	public static By IAndCCheckedMark = By.xpath("//p[text()='I&C Leads']//parent::li//img[@class='sideMenuIcon']");
	public static By IAndCUnCheckedMark = By.xpath("//p[text()='I&C Leads']//parent::li//span[@class='sideMenuIcon circle-white']");
	public static By toggleIAndC = By.xpath("//label[@for='icPdeEngineeringLead']");
	
   /**
	*@role PLI
	*@section StructuralLeads
	*/
	public static By structuralLeadsSection = By.xpath("//p[text()='Structural Leads']");
	public static By structuralLeadsCheckedMark = By.xpath("//p[text()='Structural Leads']//parent::li//img[@class='sideMenuIcon']");
	public static By structuralLeadsUnCheckedMark = By.xpath("//p[text()='Structural Leads']//parent::li//span[@class='sideMenuIcon circle-white']");
	public static By toggleStructuralLeads = By.xpath("//label[@for='structuralPdeEngineeringLead']");

   /**
	*@role PLI
	*@section ProcessLeads
	*/
	public static By processLeadsSection = By.xpath("//p[text()='Process Leads']");
	public static By processLeadsCheckedMark = By.xpath("//p[text()='Process Leads']//parent::li//img[@class='sideMenuIcon']");
	public static By processLeadsUnCheckedMark = By.xpath("//p[text()='Process Leads']//parent::li//span[@class='sideMenuIcon circle-white']");
	public static By toggleprocessLeads = By.xpath("//label[@for='processPdeEngineeringLead']");
	
   /**
	*@role PLI
	*@section EquipmentLeads
	*/
	public static By equipmentLeadsSection = By.xpath("//p[text()='Equipment Leads']");
	public static By equipmentLeadsCheckedMark = By.xpath("//p[text()='Equipment Leads']//parent::li//img[@class='sideMenuIcon']");
	public static By equipmentLeadsUnCheckedMark = By.xpath("//p[text()='Equipment Leads']//parent::li//span[@class='sideMenuIcon circle-white']");
	public static By toggleEquipmentLeads = By.xpath("//label[@for='equipmentPdeEngineeringLead']");
	
   /**
	*@role PLI
	*@section ManagementTeam
	*/
	public static By managementTeamSection = By.xpath("//p[text()='Management Team']");
	public static By managementTeamCheckedMark = By.xpath("//p[text()='Management Team']//parent::li//img[@class='sideMenuIcon']");
	public static By managementTeamUnCheckedMark = By.xpath("//p[text()='Management Team']//parent::li//span[@class='sideMenuIcon circle-white']");
	public static By toggleManagementTeam = By.xpath("//label[@for='projectManager']");
	public static By toggleprojectEngineer = By.xpath("//label[@for='projectEngineer']");
	
	/**
	*@defineUserPermission
	*@notify
	*/
	public static By defineUserPermissions = By.xpath("//span[text()='Define User Permissions']");
	public static By notify = By.xpath("//span[text()='Notify']");
	public static By notifyModal = By.xpath("//span[text()='An email will be sent informing the professional[s] of assignment.']");
	public static By sendnotifyModalButtton = By.xpath("//button[text()='Cancel']//parent::div//button[text()='Send']");
	public static By cancelnotifyModalButtton = By.xpath("//button[text()='Send']//parent::div//button[text()='Cancel']");
	public static By pliRole = By.xpath("//input[@value='pli']");
	public static By gigDistributorRole = By.xpath("//input[@value='gdPiping']");
	public static By gigCompleterRole = By.xpath("//input[@value='gcPiping']");
	public static By iIconForGigcompleter = By.xpath("//span[text()='Gig completer']//parent::div//img[@src='/static/media/icon-info.d60fb09f.svg']");
	public static By hoverInformation = By.xpath("//div[text()='Person responsible for performing Gigs in Laminar (typically ALL USERs are Gig Completers)']");
	public static By saveForDefineUser = By.xpath("//button[text()='Cancel']//parent::div//button[text()='Save']");

	/**
	*@type Xpath
	*@function AddRole
	*/
	public static By addRoleButton = By.xpath("//img[@src='/static/media/add.b23f718f.svg']");
	public static By modalBodyText = By.xpath("//span[text()='The following role will be added to the Project']");
	public static By roleTitle = By.xpath("//*[@placeholder='input text'][@id='roleTitle']");
	public static By roleDescription = By.xpath("//*[@placeholder='Write your message here'][@id='roleDescription']");
	public static By saveButtonAddRole = By.xpath("//button[text()='Cancel']//parent::div//button[text()='Save']");
	public static By cancelButtonAddRole = By.xpath("//button[text()='Save']//parent::div//button[text()='Cancel']");
	public static By addRoleAlertMessage = By.xpath("//div[@class='alert alert-danger'][@role='alert']");

	/**
	*@type Xpath
	*@footerButtons Save,Reset,Complete and Edit 
	*/
	public static By RESET_BUTTON = By.xpath("//button[text()='Save']//parent::div//button[text()='Reset']");
	public static By SAVE_BUTTON = By.xpath("//button[text()='Reset']//parent::div//button[text()='Save']");
	public static By COMPLETE_BUTTON = By.xpath("//button[text()='Reset']//parent::div//button[text()='Complete']");
	public static By EDIT_BUTTON = By.xpath("//button[text()='Edit']");

}
