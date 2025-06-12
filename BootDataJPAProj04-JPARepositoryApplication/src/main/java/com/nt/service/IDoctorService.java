package com.nt.service;

import java.util.List;
import java.util.Optional;

import com.nt.entity.Doctor;

public interface IDoctorService {

	public String removeDoctorsByIdsInBatch(Iterable<Integer> ids);
	public List<Doctor> showDoctorByExampleData(Doctor doctor, boolean ascorder , String ... props);
	public Optional<Doctor> showDoctorById(int id);
	public Doctor fetchDoctorById(int id);
}
