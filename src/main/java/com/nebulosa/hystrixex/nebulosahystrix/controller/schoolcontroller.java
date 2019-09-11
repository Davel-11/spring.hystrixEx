package com.nebulosa.hystrixex.nebulosahystrix.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.nebulosa.hystrixex.nebulosahystrix.delegate.StudentServiceDelegate;

@RestController
public class schoolcontroller {
	
	 @Autowired
    StudentServiceDelegate studentServiceDelegate;
	 
	@RequestMapping(value = "/getSchoolDetails/{schoolname}", method = RequestMethod.GET)
	public String getStudents(@PathVariable String schoolname) {
	    System.out.println("Going to call student service to get data!");
	    return studentServiceDelegate.callStudentServiceAndGetData(schoolname);
	}


}
