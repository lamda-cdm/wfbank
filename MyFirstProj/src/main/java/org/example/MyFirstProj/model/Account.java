package org.example.MyFirstProj.model;

public class Account {
	private int account_no;
	private String title;
	private String first_name;
	private String last_name;
	private String middle_name;
	private String number;
	private String email;
	private String aadhar;
	private Address present;
	private Address permanent;
	private Job job;
	private boolean debitCard;
	private boolean netbanking;
	private static int counter = 1;
	
	public Account(String title, String first_name, String last_name, String middle_name, String number,
			String email, String aadhar, Address present, Address permanent, Job job, boolean debitCard,
			boolean netbanking) {
		super();
		this.account_no = counter++;
		this.title = title;
		this.first_name = first_name;
		this.last_name = last_name;
		this.middle_name = middle_name;
		this.number = number;
		this.email = email;
		this.aadhar = aadhar;
		this.present = present;
		this.permanent = permanent;
		this.job = job;
		this.debitCard = debitCard;
		this.netbanking = netbanking;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getFirst_name() {
		return first_name;
	}

	public void setFirst_name(String first_name) {
		this.first_name = first_name;
	}

	public String getLast_name() {
		return last_name;
	}

	public void setLast_name(String last_name) {
		this.last_name = last_name;
	}

	public String getMiddle_name() {
		return middle_name;
	}

	public void setMiddle_name(String middle_name) {
		this.middle_name = middle_name;
	}

	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getAadhar() {
		return aadhar;
	}

	public void setAadhar(String aadhar) {
		this.aadhar = aadhar;
	}

	public Address getPresent() {
		return present;
	}

	public void setPresent(Address present) {
		this.present = present;
	}

	public Address getPermanent() {
		return permanent;
	}

	public void setPermanent(Address permanent) {
		this.permanent = permanent;
	}

	public Job getJob() {
		return job;
	}

	public void setJob(Job job) {
		this.job = job;
	}

	public boolean isDebitCard() {
		return debitCard;
	}

	public void setDebitCard(boolean debitCard) {
		this.debitCard = debitCard;
	}

	@Override
	public String toString() {
		return "Account \nAccount_no=" + account_no + "\nTitle=" + title + "\nFirst_name=" + first_name + "\nMiddle_name=" + middle_name + "\nLast_name=" + last_name + "\nNumber=" + number + ", \nEmail=" + email + "\nAadhar=" + aadhar + "\nPresent Address=" + present + "\nPermanent Address=" + permanent + "\nJob=" + job + "\nDebitCard=" + debitCard + "\nNetbanking=" + netbanking + "]";
	}

	public boolean isNetbanking() {
		return netbanking;
	}

	public void setNetbanking(boolean netbanking) {
		this.netbanking = netbanking;
	}
}
