package com.dsc.hr.base.pojo;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.sql.Timestamp;


/**
 * The persistent class for the human_file_dig database table.
 * 
 */
@Table(name="human_file_dig")
public class HumanFileDig implements Serializable {
	private static final long serialVersionUID = 1L;

	@Column(name="attachment_name")
	private String attachmentName;

	@Column(name="bonus_amount")
	private short bonusAmount;

	@Column(name="change_time")
	private Timestamp changeTime;

	private String changer;

	@Column(name="check_status")
	private short checkStatus;

	@Column(name="check_time")
	private Timestamp checkTime;

	private String checker;

	@Column(name="delete_time")
	private Timestamp deleteTime;

	@Column(name="demand_salaray_sum")
	private BigDecimal demandSalaraySum;

	@Column(name="file_chang_amount")
	private short fileChangAmount;

	@Column(name="first_kind_id")
	private String firstKindId;

	@Column(name="first_kind_name")
	private String firstKindName;

	@Column(name="hfd_id")
	private short hfdId;

	@Column(name="human_account")
	private String humanAccount;

	@Column(name="human_address")
	private String humanAddress;

	@Column(name="human_age")
	private short humanAge;

	@Column(name="human_bank")
	private String humanBank;

	@Column(name="human_birthday")
	private Timestamp humanBirthday;

	@Column(name="human_birthplace")
	private String humanBirthplace;

	@Column(name="human_educated_degree")
	private String humanEducatedDegree;

	@Column(name="human_educated_major")
	private String humanEducatedMajor;

	@Column(name="human_educated_years")
	private short humanEducatedYears;

	@Column(name="human_email")
	private String humanEmail;

	@Lob
	@Column(name="human_family_membership")
	private String humanFamilyMembership;

	@Column(name="human_file_status")
	private byte humanFileStatus;

	@Lob
	@Column(name="human_histroy_records")
	private String humanHistroyRecords;

	@Column(name="human_hobby")
	private String humanHobby;

	@Column(name="human_id")
	private String humanId;

	@Column(name="human_id_card")
	private String humanIdCard;

	@Column(name="human_major_id")
	private String humanMajorId;

	@Column(name="human_major_kind_id")
	private String humanMajorKindId;

	@Column(name="human_major_kind_name")
	private String humanMajorKindName;

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

	@Column(name="human_pro_designation")
	private String humanProDesignation;

	@Column(name="human_qq")
	private String humanQq;

	@Column(name="human_race")
	private String humanRace;

	@Column(name="human_religion")
	private String humanReligion;

	@Column(name="human_sex")
	private String humanSex;

	@Column(name="human_society_security_id")
	private String humanSocietySecurityId;

	@Column(name="human_speciality")
	private String humanSpeciality;

	@Column(name="human_telephone")
	private String humanTelephone;

	@Column(name="hunma_major_name")
	private String hunmaMajorName;

	@Column(name="lastly_change_time")
	private Timestamp lastlyChangeTime;

	@Column(name="major_change_amount")
	private short majorChangeAmount;

	@Column(name="paid_salary_sum")
	private BigDecimal paidSalarySum;

	@Column(name="recovery_time")
	private Timestamp recoveryTime;

	@Column(name="regist_time")
	private Timestamp registTime;

	private String register;

	@Lob
	private String remark;

	@Column(name="salary_standard_id")
	private String salaryStandardId;

	@Column(name="salary_standard_name")
	private String salaryStandardName;

	@Column(name="salary_sum")
	private BigDecimal salarySum;

	@Column(name="second_kind_id")
	private String secondKindId;

	@Column(name="second_kind_name")
	private String secondKindName;

	@Column(name="third_kind_id")
	private String thirdKindId;

	@Column(name="third_kind_name")
	private String thirdKindName;

	@Column(name="training_amount")
	private short trainingAmount;

	public HumanFileDig() {
	}

	public String getAttachmentName() {
		return this.attachmentName;
	}

	public void setAttachmentName(String attachmentName) {
		this.attachmentName = attachmentName;
	}

	public short getBonusAmount() {
		return this.bonusAmount;
	}

	public void setBonusAmount(short bonusAmount) {
		this.bonusAmount = bonusAmount;
	}

	public Timestamp getChangeTime() {
		return this.changeTime;
	}

	public void setChangeTime(Timestamp changeTime) {
		this.changeTime = changeTime;
	}

	public String getChanger() {
		return this.changer;
	}

	public void setChanger(String changer) {
		this.changer = changer;
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

	public Timestamp getDeleteTime() {
		return this.deleteTime;
	}

	public void setDeleteTime(Timestamp deleteTime) {
		this.deleteTime = deleteTime;
	}

	public BigDecimal getDemandSalaraySum() {
		return this.demandSalaraySum;
	}

	public void setDemandSalaraySum(BigDecimal demandSalaraySum) {
		this.demandSalaraySum = demandSalaraySum;
	}

	public short getFileChangAmount() {
		return this.fileChangAmount;
	}

	public void setFileChangAmount(short fileChangAmount) {
		this.fileChangAmount = fileChangAmount;
	}

	public String getFirstKindId() {
		return this.firstKindId;
	}

	public void setFirstKindId(String firstKindId) {
		this.firstKindId = firstKindId;
	}

	public String getFirstKindName() {
		return this.firstKindName;
	}

	public void setFirstKindName(String firstKindName) {
		this.firstKindName = firstKindName;
	}

	public short getHfdId() {
		return this.hfdId;
	}

	public void setHfdId(short hfdId) {
		this.hfdId = hfdId;
	}

	public String getHumanAccount() {
		return this.humanAccount;
	}

	public void setHumanAccount(String humanAccount) {
		this.humanAccount = humanAccount;
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

	public String getHumanBank() {
		return this.humanBank;
	}

	public void setHumanBank(String humanBank) {
		this.humanBank = humanBank;
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

	public String getHumanFamilyMembership() {
		return this.humanFamilyMembership;
	}

	public void setHumanFamilyMembership(String humanFamilyMembership) {
		this.humanFamilyMembership = humanFamilyMembership;
	}

	public byte getHumanFileStatus() {
		return this.humanFileStatus;
	}

	public void setHumanFileStatus(byte humanFileStatus) {
		this.humanFileStatus = humanFileStatus;
	}

	public String getHumanHistroyRecords() {
		return this.humanHistroyRecords;
	}

	public void setHumanHistroyRecords(String humanHistroyRecords) {
		this.humanHistroyRecords = humanHistroyRecords;
	}

	public String getHumanHobby() {
		return this.humanHobby;
	}

	public void setHumanHobby(String humanHobby) {
		this.humanHobby = humanHobby;
	}

	public String getHumanId() {
		return this.humanId;
	}

	public void setHumanId(String humanId) {
		this.humanId = humanId;
	}

	public String getHumanIdCard() {
		return this.humanIdCard;
	}

	public void setHumanIdCard(String humanIdCard) {
		this.humanIdCard = humanIdCard;
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

	public String getHumanProDesignation() {
		return this.humanProDesignation;
	}

	public void setHumanProDesignation(String humanProDesignation) {
		this.humanProDesignation = humanProDesignation;
	}

	public String getHumanQq() {
		return this.humanQq;
	}

	public void setHumanQq(String humanQq) {
		this.humanQq = humanQq;
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

	public String getHumanSocietySecurityId() {
		return this.humanSocietySecurityId;
	}

	public void setHumanSocietySecurityId(String humanSocietySecurityId) {
		this.humanSocietySecurityId = humanSocietySecurityId;
	}

	public String getHumanSpeciality() {
		return this.humanSpeciality;
	}

	public void setHumanSpeciality(String humanSpeciality) {
		this.humanSpeciality = humanSpeciality;
	}

	public String getHumanTelephone() {
		return this.humanTelephone;
	}

	public void setHumanTelephone(String humanTelephone) {
		this.humanTelephone = humanTelephone;
	}

	public String getHunmaMajorName() {
		return this.hunmaMajorName;
	}

	public void setHunmaMajorName(String hunmaMajorName) {
		this.hunmaMajorName = hunmaMajorName;
	}

	public Timestamp getLastlyChangeTime() {
		return this.lastlyChangeTime;
	}

	public void setLastlyChangeTime(Timestamp lastlyChangeTime) {
		this.lastlyChangeTime = lastlyChangeTime;
	}

	public short getMajorChangeAmount() {
		return this.majorChangeAmount;
	}

	public void setMajorChangeAmount(short majorChangeAmount) {
		this.majorChangeAmount = majorChangeAmount;
	}

	public BigDecimal getPaidSalarySum() {
		return this.paidSalarySum;
	}

	public void setPaidSalarySum(BigDecimal paidSalarySum) {
		this.paidSalarySum = paidSalarySum;
	}

	public Timestamp getRecoveryTime() {
		return this.recoveryTime;
	}

	public void setRecoveryTime(Timestamp recoveryTime) {
		this.recoveryTime = recoveryTime;
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

	public String getSalaryStandardId() {
		return this.salaryStandardId;
	}

	public void setSalaryStandardId(String salaryStandardId) {
		this.salaryStandardId = salaryStandardId;
	}

	public String getSalaryStandardName() {
		return this.salaryStandardName;
	}

	public void setSalaryStandardName(String salaryStandardName) {
		this.salaryStandardName = salaryStandardName;
	}

	public BigDecimal getSalarySum() {
		return this.salarySum;
	}

	public void setSalarySum(BigDecimal salarySum) {
		this.salarySum = salarySum;
	}

	public String getSecondKindId() {
		return this.secondKindId;
	}

	public void setSecondKindId(String secondKindId) {
		this.secondKindId = secondKindId;
	}

	public String getSecondKindName() {
		return this.secondKindName;
	}

	public void setSecondKindName(String secondKindName) {
		this.secondKindName = secondKindName;
	}

	public String getThirdKindId() {
		return this.thirdKindId;
	}

	public void setThirdKindId(String thirdKindId) {
		this.thirdKindId = thirdKindId;
	}

	public String getThirdKindName() {
		return this.thirdKindName;
	}

	public void setThirdKindName(String thirdKindName) {
		this.thirdKindName = thirdKindName;
	}

	public short getTrainingAmount() {
		return this.trainingAmount;
	}

	public void setTrainingAmount(short trainingAmount) {
		this.trainingAmount = trainingAmount;
	}

}