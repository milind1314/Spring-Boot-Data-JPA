package com.nt.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

@Entity
@Table(name = "JPA_DOCTOR")
@Data
@NoArgsConstructor
@AllArgsConstructor
@RequiredArgsConstructor

public class Doctor {

	@Column(name = "DOCTOR_ID")
	@Id
	
	//@GeneratedValue(strategy = GenerationType.AUTO)  //generated id values  like 1,2,52 and etc..
	//@SequenceGenerator(name="gen1",sequenceName = "DOCTOR_ID_SEQ",initialValue = 1000 , allocationSize = 1)
	//@GeneratedValue(generator = "gen1",strategy = GenerationType.SEQUENCE)
		
	//@GeneratedValue(strategy = GenerationType.SEQUENCE)
	
	private Integer did;
	
	@Column(name = "DOCTOR_NAME",length = 30)
	@NonNull
	private String dname;
	
	@Column(name = "DOCTOR_ADDRS",length = 30)
	@NonNull
	private String addrs;
	
	@Column(name = "DOCTOR_EXPERT",length = 30)
	@NonNull
	private String expert;
	
	@Column(name="DOCTOR_FEE")
	@NonNull
	//@Transient
    private  Double fee;
	
	
	
	
}
