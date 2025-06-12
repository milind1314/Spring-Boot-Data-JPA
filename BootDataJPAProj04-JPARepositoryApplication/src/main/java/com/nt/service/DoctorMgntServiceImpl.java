package com.nt.service;


import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.nt.entity.Doctor;
import com.nt.repository.IDoctorRepository;

@Service("docService")
public class DoctorMgntServiceImpl implements IDoctorService {
	
	@Autowired
	private IDoctorRepository docRepo;

	@Override
	public String removeDoctorsByIdsInBatch(Iterable<Integer> ids) {
		
		List<Doctor> list = docRepo.findAllById(ids);
		long count = list.size();
		
		if (count != 0) {
			 //delete the records by ids in batch
			docRepo.deleteAllInBatch(list);
			
			return count+" no. of records deleted";
		}
		
		return "No records found for deletion";
	}

	@Override
	public List<Doctor> showDoctorByExampleData(Doctor doctor, boolean ascorder, String... props) {
		//prepare example object
		Example<Doctor> example = Example.of(doctor);
		//prepare sort object
		Sort sort = Sort.by(ascorder?Sort.Direction.ASC:Sort.Direction.DESC,props);
		//perform select operation
		List<Doctor> list = docRepo.findAll(example, sort);
		return list;
	}

	
	
	
	@Override
	public Optional<Doctor> showDoctorById(int id) {
		
		return docRepo.findById(id);
		
	}

	@Override
	public Doctor fetchDoctorById(int id) {
		return docRepo.getReferenceById(id);
	}
	
	
		
}
