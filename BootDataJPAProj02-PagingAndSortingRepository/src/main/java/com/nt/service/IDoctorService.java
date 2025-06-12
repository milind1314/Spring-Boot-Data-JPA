package com.nt.service;

import org.springframework.data.domain.Page;

import com.nt.entity.Doctor;

public interface IDoctorService {

	public Iterable<Doctor> showDoctorAsSorted(boolean ascOrder, String...props);
	public Page<Doctor> showDoctorByPageNo(int pageNo, int pageSize);
	public Page<Doctor> showDoctorByPageNoSorted(int pageNo, int pageSize, boolean order, String ...props);
	public void showDOctorByPagination(int pageSize);
}
