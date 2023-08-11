package com.example.wfbank.model;

//package com.example.demo.model;
import java.math.BigDecimal;
import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonFormat;

//import lombok.Getter;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@Entity
@Table(name="Accounts")
@NoArgsConstructor
@AllArgsConstructor
public class Accounts {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="accNumber")
	private long accNumber;
	
	@Column(name="title", nullable=false)
	private String title;
	
	@Column(name="firstName", nullable=false)
	private String firstName;
	
	@Column(name="lastName", nullable=false)
	private String lastName;
	
	@Column(name="middleName", nullable=true)
	private String middleName;
	
	@Column(name="fatherName", nullable=false)
	private String fatherName;
	
	@Column(name="mobile", nullable=false)
	private String mobile;
	
	@Column(name="email", nullable=false)
	private String email;
	
	@Column(name="aadhar", nullable=false)
	private String aadhar;
	
	@JsonFormat(pattern="yyyy-MM-dd")
	@Column(name="dob", nullable=false)
	private Date dob;
	
	@Column(name="residentAddress", nullable=false)
	private String residentAddress;
	
	@Column(name="permanentAddress", nullable=false)
	private String permanentAddress;
	
	@Column(name="occupationDetails", nullable=false)
	private String occupationDetails;
	
	@Column(name="debitCardRequired", nullable=false)
	private boolean debitCardRequired;
	
	@Column(name="netBankingRequired", nullable=false)
	private boolean netBankingRequired;
	
	@Column(name="balance", nullable=false)
	private BigDecimal balance;
}
