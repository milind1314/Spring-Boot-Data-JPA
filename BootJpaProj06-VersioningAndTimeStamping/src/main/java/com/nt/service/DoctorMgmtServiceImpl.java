package com.nt.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nt.entity.DoctorEntity;
import com.nt.repository.IDoctorRepository;

@Service("docService")
public class DoctorMgmtServiceImpl implements IDoctorService {

	@Autowired
	private IDoctorRepository docRepo;
	
	@Override
	public String registerDoctor(DoctorEntity doctor) {

		doctor.setCreatedBy(System.getProperty("user.name"));
		doctor.setActive_SW("Active");
		Integer did = docRepo.save(doctor).getDid();
		
		return "Doctor object is saved with id value :: "+did;
	}

	@Override
	public DoctorEntity showDoctorById(int id) {
		
		return docRepo.findById(id).orElseThrow(()-> new IllegalArgumentException("Invalid Id...!"));
	}

	@Override
	public String modifyDoctorById(int id, double hikePercentage) {
		
		Optional<DoctorEntity> docId = docRepo.findById(id);
		if (docId.isPresent()) {
			DoctorEntity doctor = docId.get();
			doctor.setFee(doctor.getFee()+ doctor.getFee() * hikePercentage / 100.0);
			doctor.setUpdatedBy(System.getProperty("user.name"));
			docRepo.save(doctor);
			return id+" :: Doctor fees is updated";
		}
		return id+" :: Doctor not found for update";
	}

}
