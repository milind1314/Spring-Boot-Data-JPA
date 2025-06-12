package com.nt.runners;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.nt.entity.Doctor;
import com.nt.repository.IDoctorRepository;

@Component
public class JPACustomMethodsTestRunner implements CommandLineRunner {


	@Autowired
	private IDoctorRepository docRepo;

	@Override
	public void run(String... args) throws Exception {

		/*List<Doctor> list = docRepo.findByDname("Anand");
		list.forEach(System.out::println);
		System.out.println("===============================");
		docRepo.readByDnameIs("David").forEach(System.out::println);
		System.out.println("===============================");
		docRepo.getByDname("David").forEach(System.out::println);
		*/
		
		/*	List<Doctor> list = docRepo.findByFeeBetween(500.0, 1200.0);
			for (Doctor doctor : list) {
				System.out.println(doctor);
			}*/
		
		
//		docRepo.findByAddrsStartingWith("h").forEach(System.out::println);
		
		
//		docRepo.findByAddrsEndingWith("d").forEach(System.out::println);
		
		/*
		 //Print in Ascending Expert order
		docRepo.findByFeeGreaterThanEqualAndFeeLessThanEqualOrderByExpertAsc(400.0, 1000.0).forEach(msg -> System.out.println(msg));
		
		System.out.println("=====================================================");
		
		//Print in Descending Expert order
		docRepo.findByFeeGreaterThanEqualAndFeeLessThanEqualOrderByExpertDesc(400.0, 1000.0).forEach(msg -> System.out.println(msg));
		*/
		
		
//		docRepo.findByExpertInOrFeeBetween(List.of("Ortho","neuro"), 300.0, 700.0).forEach(System.out::println);
		
		Doctor doc = docRepo.findByDnameEquals("Akash");
		 if(doc!=null)
			   System.out.println("doctor details are ::"+doc);
		  else
	      System.out.println("Doctor is not found");
		
		
		Optional<Doctor> opt = docRepo.readByDnameEquals("Mahesh");
		
		if(opt.isPresent())
			   System.out.println("doctor details are ::"+opt);
		  else
	      System.out.println("Doctor is not found");
		
		
	}	
		

  
			

}
