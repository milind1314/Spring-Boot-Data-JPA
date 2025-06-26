package com.nt.runner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.nt.entity.DoctorEntity;
import com.nt.service.IDoctorService;

@Component
public class VersioningAndTimeStampingTestRunner implements CommandLineRunner {

	@Autowired
	private IDoctorService docService;
	
	@Override
	public void run(String... args) throws Exception {
		
		/*try {
			DoctorEntity doc = new DoctorEntity("Mahesh", "Pune", "Cardiology", 1000.0);
			String msg = docService.registerDoctor(doc);
			System.out.println(msg);
			
			DoctorEntity doctor = docService.showDoctorById(1);
			System.out.println("Updated count :: "+doctor.getUpdateCount()+" , inserted on :: "+doctor.getRegisteredOn()+" , Lastly updated on :: "+doctor.getLastlyUpdatedOn());
		} catch (Exception e) {
			e.printStackTrace();
		}*/
		
		
		try {
			String msg = docService.modifyDoctorById(1, 2.0);
			System.out.println(msg);
			DoctorEntity doc = docService.showDoctorById(1);
			System.out.println("update count :: "+doc.getUpdateCount()+", inserted on :: "+doc.getRegisteredOn()+", lastly updated on :: "+doc.getLastlyUpdatedOn());
			
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
