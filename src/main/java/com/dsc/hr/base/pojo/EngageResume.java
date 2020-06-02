package com.dsc.hr.base.pojo;

import java.io.Serializable;
import javax.persistence.*;
import java.sql.Timestamp;


/**
 * The persistent class for the engage_resume database table.
 * 
 */
@Table(name="engage_resume")
public class EngageResume implements Serializable {
	private static final long serialVersionUID = 1L;

	@Column(name="attachment_name")
	private String attachmentName;

	@Column(name="check_status")
	private short checkStatus;

	@Column(name="check_time")
	private Timestamp checkTime;

	private String checker;

	@Column(name="demand_salary_standard")
	private double demandSalaryStandard;

	@Column(name="engage_type")
	private String engageType;

	@Column(name="human_address")
	private String humanAddress;

	@Column(name="human_age")
	private short humanAge;

	@Column(name="human_birthday")
	private Timestamp humanBirthday;

	@Column(name="human_birthplace")
	private String humanBirthplace;

	@Column(name="human_college")
	private String humanCollege;

	@Column(name="human_educated_degree")
	private String humanEducatedDegree;

	@Column(name="human_educated_major")
	private String humanEducatedMajor;

	@Column(name="human_educated_years")
	private short humanEducatedYears;

	@Column(name="human_email")
	private String humanEmail;

	@Lob
	@Column(name="human_history_records")
	private String humanHistoryRecords;

	@Column(name="human_hobby")
	private String humanHobby;

	@Column(name="human_homephone")
	private String humanHomephone;

	@Column(name="human_idcard")
	private String humanIdcard;

	@Column(name="human_major_id")
	private String humanMajorId;

	@Column(name="human_major_kind_id")
	private String humanMajorKindId;

	@Column(name="human_major_kind_name")
	private String humanMajorKindName;

	@Column(name="human_major_name")
	private String humanMajorName;

	@Column(name="human_mobilephone")
	private String humanMobilephone;

	@Column(name="human_name")
	private String humanName;

	@Column(name="human_nationality")
	private String humanNationality;

	@Column(name="human_party")
	private String humanParty;

	@Column(name="human_picture")
	private String humanPicture;

	@Column(name="human_postcode")
	private String humanPostcode;

	@Column(name="human_race")
	private String humanRace;

	@Column(name="human_religion")
	private String humanReligion;

	@Column(name="human_sex")
	private String humanSex;

	@Column(name="human_specility")
	private String humanSpecility;

	@Column(name="human_telephone")
	private String humanTelephone;

	@Column(name="interview_status")
	private short interviewStatus;

	@Column(name="pass_check_status")
	private short passCheckStatus;

	@Column(name="pass_check_time")
	private Timestamp passCheckTime;

	private String pass_checkComment;

	@Column(name="pass_checker")
	private String passChecker;

	private String pass_passComment;

	@Column(name="pass_regist_time")
	private Timestamp passRegistTime;

	@Column(name="pass_register")
	private String passRegister;

	@Lob
	private String recomandation;

	@Column(name="regist_time")
	private Timestamp registTime;

	private String register;

	@Lob
	private String remark;

	@Column(name="res_id")
	private short resId;

	@Column(name="test_amount")
	private short testAmount;

	@Column(name="test_check_time")
	private Timestamp testCheckTime;

	@Column(name="test_checker")
	private String testChecker;

	@Column(name="total_points")
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