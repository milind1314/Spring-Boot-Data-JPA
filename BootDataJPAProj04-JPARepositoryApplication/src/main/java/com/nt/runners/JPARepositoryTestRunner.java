package com.nt.runners;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import com.nt.BootDataJpaProj04JpaRepositoryApplication;
import com.nt.entity.Doctor;
import com.nt.service.IDoctorService;

@Component
public class JPARepositoryTestRunner implements CommandLineRunner {

    private final BootDataJpaProj04JpaRepositoryApplication bootDataJpaProj04JpaRepositoryApplication;




	@Autowired
	private IDoctorService docService;


    JPARepositoryTestRunner(BootDataJpaProj04JpaRepositoryApplication bootDataJpaProj04JpaRepositoryApplication) {
        this.bootDataJpaProj04JpaRepositoryApplication = bootDataJpaProj04JpaRepositoryApplication;
    }

  

	@Override
	public void run(String... args) throws Exception {
		
		System.out.println("Runner  : ");
		/*try {
			String removeDoctorsByIdsInBatch = docService.removeDoctorsByIdsInBatch(List.of(1003,1001));
			System.out.println(removeDoctorsByIdsInBatch);
		} catch (Exception e) {
			e.printStackTrace();
		}*/
		
		
		
		
		/*try {
			Doctor doctor = new Doctor();
			doctor.setDname("Anand");
			doctor.setExpert("Neurology");
			doctor.setFee(1000.0);
		
			List<Doctor> showDoctorByExampleData = docService.showDoctorByExampleData(doctor, true, "dname","expert");
			showDoctorByExampleData.forEach(System.out::println);
		} catch (Exception e) {
			e.printStackTrace();
		}*/
		
		
		
		/*try {
			Optional<Doctor> opt = docService.showDoctorById(1002);
			
			if (opt.isPresent()) {
				
				Doctor doc = opt.get();
				System.out.println("doc obj class name :: "+doc.getClass());
				System.out.println("Doctor name :: "+doc.getDname());
			}
		} catch (Exception e) {
			e.printStackTrace();
		}*/
		
		
		try {
			Doctor doc = docService.fetchDoctorById(1004);
			System.out.println("doc obj class name:: "+doc.getClass()+"------------"+doc.getClass().getSuperclass());
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
	}
	

}
