package com.nadeem.service;

import java.time.LocalDate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nadeem.utils.DateUtils;

@Service
public class ReportService {
	@Autowired
	private DateUtils dateUtils;
	
	
	public ReportService() {
		// TODO Auto-generated constructor stub
	
		System.out.println("ReportService :: Constructor");
	
	}
	
	public void generateReport() {
		LocalDate date = dateUtils.getDate();
		System.out.println("Report Generated For :: " + date);
		
	}
}
