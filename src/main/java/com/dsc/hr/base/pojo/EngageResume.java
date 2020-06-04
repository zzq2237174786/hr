package com.dsc.hr.base.pojo;

import java.io.Serializable;
import java.sql.Timestamp;

/**
 * The persistent class for the engage_resume database table.
 * 
 */

public class EngageResume implements Serializable {
	private static final long serialVersionUID = 1L;

	private String attachmentName;

	private short checkStatus;

	private Timestamp checkTime;

	private String checker;

	private double demandSalaryStandard;

	private String engageType;

	
	private String humanAddress;


	private short humanAge;

	private Timestamp humanBirthday;

	
	private String humanBirthplace;


	private String humanCollege;

	
	private String humanEducatedDegree;

	private String humanEducatedMajor;

	
	private short humanEducatedYears;

	
	private String humanEmail;

	private String humanHistoryRecords;


	private String humanHobby;

	private String humanHomephone;

	private String humanIdcard;

	private String humanMajorId;

	private String humanMajorKindId;

	private String humanMajorKindName;

	private String humanMajorName;

	private String humanMobilephone;

	private String humanName;

	private String humanNationality;

	private String humanParty;

	private String humanPicture;

	private String humanPostcode;

	private String humanRace;

	private String humanReligion;

	private String humanSex;

	private String humanSpecility;

	private String humanTelephone;

	private short interviewStatus;

	private short passCheckStatus;

	private Timestamp passCheckTime;

	private String pass_checkComment;

	private String passChecker;

	private String pass_passComment;

	private Timestamp passRegistTime;

	private String passRegister;

	private String recomandation;

	private Timestamp registTime;

	private String register;

	private String remark;

	private short resId;
	
	private short testAmount;

	private Timestamp testCheckTime;

	private String testChecker;

	private double totalPoints;

	public EngageResume() {
	}

	public String getAttachmentName() {
		return this.attachmentName;
	}

	public void setAttachmentName(String attachmentName) {
		this.attachmentName = attachmentName;
	}

	public short getCheckStatus() {
		return this.checkStatus;
	}

	public void setCheckStatus(short checkStatus) {
		this.checkStatus = checkStatus;
	}

	public Timestamp getCheckTime() {
		return this.checkTime;
	}

	public void setCheckTime(Timestamp checkTime) {
		this.checkTime = checkTime;
	}

	public String getChecker() {
		return this.checker;
	}

	public void setChecker(String checker) {
		this.checker = checker;
	}

	public double getDemandSalaryStandard() {
		return this.demandSalaryStandard;
	}

	public void setDemandSalaryStandard(double demandSalaryStandard) {
		this.demandSalaryStandard = demandSalaryStandard;
	}

	public String getEngageType() {
		return this.engageType;
	}

	public void setEngageType(String engageType) {
		this.engageType = engageType;
	}

	public String getHumanAddress() {
		return this.humanAddress;
	}

	public void setHumanAddress(String humanAddress) {
		this.humanAddress = humanAddress;
	}

	public short getHumanAge() {
		return this.humanAge;
	}

	public void setHumanAge(short humanAge) {
		this.humanAge = humanAge;
	}

	public Timestamp getHumanBirthday() {
		return this.humanBirthday;
	}

	public void setHumanBirthday(Timestamp humanBirthday) {
		this.humanBirthday = humanBirthday;
	}

	public String getHumanBirthplace() {
		return this.humanBirthplace;
	}

	public void setHumanBirthplace(String humanBirthplace) {
		this.humanBirthplace = humanBirthplace;
	}

	public String getHumanCollege() {
		return this.humanCollege;
	}

	public void setHumanCollege(String humanCollege) {
		this.humanCollege = humanCollege;
	}

	public String getHumanEducatedDegree() {
		return this.humanEducatedDegree;
	}

	public void setHumanEducatedDegree(String humanEducatedDegree) {
		this.humanEducatedDegree = humanEducatedDegree;
	}

	public String getHumanEducatedMajor() {
		return this.humanEducatedMajor;
	}

	public void setHumanEducatedMajor(String humanEducatedMajor) {
		this.humanEducatedMajor = humanEducatedMajor;
	}

	public short getHumanEducatedYears() {
		return this.humanEducatedYears;
	}

	public void setHumanEducatedYears(short humanEducatedYears) {
		this.humanEducatedYears = humanEducatedYears;
	}

	public String getHumanEmail() {
		return this.humanEmail;
	}

	public void setHumanEmail(String humanEmail) {
		this.humanEmail = humanEmail;
	}

	public String getHumanHistoryRecords() {
		return this.humanHistoryRecords;
	}

	public void setHumanHistoryRecords(String humanHistoryRecords) {
		this.humanHistoryRecords = humanHistoryRecords;
	}

	public String getHumanHobby() {
		return this.humanHobby;
	}

	public void setHumanHobby(String humanHobby) {
		this.humanHobby = humanHobby;
	}

	public String getHumanHomephone() {
		return this.humanHomephone;
	}

	public void setHumanHomephone(String humanHomephone) {
		this.humanHomephone = humanHomephone;
	}

	public String getHumanIdcard() {
		return this.humanIdcard;
	}

	public void setHumanIdcard(String humanIdcard) {
		this.humanIdcard = humanIdcard;
	}

	public String getHumanMajorId() {
		return this.humanMajorId;
	}

	public void setHumanMajorId(String humanMajorId) {
		this.humanMajorId = humanMajorId;
	}

	public String getHumanMajorKindId() {
		return this.humanMajorKindId;
	}

	public void setHumanMajorKindId(String humanMajorKindId) {
		this.humanMajorKindId = humanMajorKindId;
	}

	public String getHumanMajorKindName() {
		return this.humanMajorKindName;
	}

	public void setHumanMajorKindName(String humanMajorKindName) {
		this.humanMajorKindName = humanMajorKindName;
	}

	public String getHumanMajorName() {
		return this.humanMajorName;
	}

	public void setHumanMajorName(String humanMajorName) {
		this.humanMajorName = humanMajorName;
	}

	public String getHumanMobilephone() {
		return this.humanMobilephone;
	}

	public void setHumanMobilephone(String humanMobilephone) {
		this.humanMobilephone = humanMobilephone;
	}

	public String getHumanName() {
		return this.humanName;
	}

	public void setHumanName(String humanName) {
		this.humanName = humanName;
	}

	public String getHumanNationality() {
		return this.humanNationality;
	}

	public void setHumanNationality(String humanNationality) {
		this.humanNationality = humanNationality;
	}

	public String getHumanParty() {
		return this.humanParty;
	}

	public void setHumanParty(String humanParty) {
		this.humanParty = humanParty;
	}

	public String getHumanPicture() {
		return this.humanPicture;
	}

	public void setHumanPicture(String humanPicture) {
		this.humanPicture = humanPicture;
	}

	public String getHumanPostcode() {
		return this.humanPostcode;
	}

	public void setHumanPostcode(String humanPostcode) {
		this.humanPostcode = humanPostcode;
	}

	public String getHumanRace() {
		return this.humanRace;
	}

	public void setHumanRace(String humanRace) {
		this.humanRace = humanRace;
	}

	public String getHumanReligion() {
		return this.humanReligion;
	}

	public void setHumanReligion(String humanReligion) {
		this.humanReligion = humanReligion;
	}

	public String getHumanSex() {
		return this.humanSex;
	}

	public void setHumanSex(String humanSex) {
		this.humanSex = humanSex;
	}

	public String getHumanSpecility() {
		return this.humanSpecility;
	}

	public void setHumanSpecility(String humanSpecility) {
		this.humanSpecility = humanSpecility;
	}

	public String getHumanTelephone() {
		return this.humanTelephone;
	}

	public void setHumanTelephone(String humanTelephone) {
		this.humanTelephone = humanTelephone;
	}

	public short getInterviewStatus() {
		return this.interviewStatus;
	}

	public void setInterviewStatus(short interviewStatus) {
		this.interviewStatus = interviewStatus;
	}

	public short getPassCheckStatus() {
		return this.passCheckStatus;
	}

	public void setPassCheckStatus(short passCheckStatus) {
		this.passCheckStatus = passCheckStatus;
	}

	public Timestamp getPassCheckTime() {
		return this.passCheckTime;
	}

	public void setPassCheckTime(Timestamp passCheckTime) {
		this.passCheckTime = passCheckTime;
	}

	public String getPass_checkComment() {
		return this.pass_checkComment;
	}

	public void setPass_checkComment(String pass_checkComment) {
		this.pass_checkComment = pass_checkComment;
	}

	public String getPassChecker() {
		return this.passChecker;
	}

	public void setPassChecker(String passChecker) {
		this.passChecker = passChecker;
	}

	public String getPass_passComment() {
		return this.pass_passComment;
	}

	public void setPass_passComment(String pass_passComment) {
		this.pass_passComment = pass_passComment;
	}

	public Timestamp getPassRegistTime() {
		return this.passRegistTime;
	}

	public void setPassRegistTime(Timestamp passRegistTime) {
		this.passRegistTime = passRegistTime;
	}

	public String getPassRegister() {
		return this.passRegister;
	}

	public void setPassRegister(String passRegister) {
		this.passRegister = passRegister;
	}

	public String getRecomandation() {
		return this.recomandation;
	}

	public void setRecomandation(String recomandation) {
		this.recomandation = recomandation;
	}

	public Timestamp getRegistTime() {
		return this.registTime;
	}

	public void setRegistTime(Timestamp registTime) {
		this.registTime = registTime;
	}

	public String getRegister() {
		return this.register;
	}

	public void setRegister(String register) {
		this.register = register;
	}

	public String getRemark() {
		return this.remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

	public short getResId() {
		return this.resId;
	}

	public void setResId(short resId) {
		this.resId = resId;
	}

	public short getTestAmount() {
		return this.testAmount;
	}

	public void setTestAmount(short testAmount) {
		this.testAmount = testAmount;
	}

	public Timestamp getTestCheckTime() {
		return this.testCheckTime;
	}

	public void setTestCheckTime(Timestamp testCheckTime) {
		this.testCheckTime = testCheckTime;
	}

	public String getTestChecker() {
		return this.testChecker;
	}

	public void setTestChecker(String testChecker) {
		this.testChecker = testChecker;
	}

	public double getTotalPoints() {
		return this.totalPoints;
	}

	public void setTotalPoints(double totalPoints) {
		this.totalPoints = totalPoints;
	}

}