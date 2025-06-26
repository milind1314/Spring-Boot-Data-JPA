package com.nt.service;

import com.nt.entity.DoctorEntity;

public interface IDoctorService {

	public String registerDoctor(DoctorEntity doctor);

	public DoctorEntity showDoctorById(int id);
	
	public String modifyDoctorById(int id, double hikePercentage);
}
