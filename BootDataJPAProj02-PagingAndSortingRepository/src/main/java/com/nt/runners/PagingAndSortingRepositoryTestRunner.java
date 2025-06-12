package com.nt.runners;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Component;

import com.nt.entity.Doctor;
import com.nt.service.DoctorMgntServiceImpl;
import com.nt.service.IDoctorService;

@Component

public class PagingAndSortingRepositoryTestRunner implements CommandLineRunner {


	@Autowired
	private IDoctorService docService;

	
	@Override
	public void run(String... args) throws Exception {
		/*
		try {
			
			docService.showDoctorAsSorted(true,"dname","expert").forEach(System.out::println);
		} 
		catch (Exception e) {
			e.printStackTrace();
		}
		*/
		
		
		/*try {
			Page<Doctor> page = docService.showDoctorByPageNo(1, 3);
			List<Doctor> list = page.getContent();
			System.out.println("Record of "+(page.getNumber()+1)+"/"+page.getTotalPages());
			list.forEach(System.out::println);
		} catch (Exception e) {
			e.printStackTrace();
		}*/
	
		/*
			try {
				Page<Doctor> page = docService.showDoctorByPageNoSorted(2, 4, false, "dname");
		//			List<Doctor> list = page.getContent();
				System.out.println("Record of "+(page.getNumber()+1)+"/"+page.getTotalPages());
				page.forEach(System.out::println);
				System.out.println("Current page no. :: "+(page.getNumber()+1));
				System.out.println("Total no. of pages :: "+page.getTotalPages());
				System.out.println("Record count in current page :: "+page.getNumberOfElements());
				System.out.println("Is current page is first page :: "+page.isFirst());
				System.out.println("Is current page is last page :: "+page.isLast());
			} catch (Exception e) {
				e.printStackTrace();
			}*/
	
	
		try {
			docService.showDOctorByPagination(2);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	

}
