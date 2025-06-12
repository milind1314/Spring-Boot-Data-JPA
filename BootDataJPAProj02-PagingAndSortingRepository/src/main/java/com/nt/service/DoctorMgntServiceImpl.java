package com.nt.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.PageRequest;

import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.nt.entity.Doctor;
import com.nt.repository.IDoctorRepository;

@Service("docService")
public class DoctorMgntServiceImpl implements IDoctorService {
	
	@Autowired
	private IDoctorRepository docRepo;

	@Override
	public Iterable<Doctor> showDoctorAsSorted(boolean ascOrder, String... props) {
		//Create Sort object
		
		Sort sort = Sort.by(ascOrder?Sort.Direction.ASC:Sort.Direction.DESC,props);
		
		//Fetct the object
		
		Iterable<Doctor> it = docRepo.findAll(sort);
		
		return it;
	}

	@Override
	public Page<Doctor> showDoctorByPageNo(int pageNo, int pageSize) {
		// create Pageable object having inputs
		Pageable pageable = PageRequest.of(pageNo-1, pageSize);
		
		//Load the objects
		Page<Doctor> page = docRepo.findAll(pageable);
		return page;
	}

	@Override
	public Page<Doctor> showDoctorByPageNoSorted(int pageNo, int pageSize, boolean order, String... props) {
		Sort sort = Sort.by(order?Sort.Direction.ASC:Sort.Direction.DESC,props);
		Pageable pageable = PageRequest.of(pageNo, pageSize, sort);
		Page<Doctor> page = docRepo.findAll(pageable);
		return page;
	}

	@Override
	public void showDOctorByPagination(int pageSize) {
		long count = docRepo.count();
		long pageCount = count/pageSize;
		
		if (count % pageSize != 0) {
			pageCount++;
		}
		
		for (int i = 0; i < pageCount; i++) {
			
			Pageable pageable = PageRequest.of(i, pageSize);
			Page<Doctor> page = docRepo.findAll(pageable);
			System.out.println("records  of  " + (page.getNumber() + 1) + "/" + page.getTotalPages());
			page.forEach(System.out::println);
		}
		
	}

}
