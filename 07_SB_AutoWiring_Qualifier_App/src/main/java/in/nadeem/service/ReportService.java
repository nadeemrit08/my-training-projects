package in.nadeem.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import in.nadeem.beans.IReport;

@Service
public class ReportService {
	@Autowired
	private IReport report;
	
	public ReportService(@Qualifier("excel") IReport report) {
		System.out.println("Report Service :: Constructor");
		this.report = report;
		System.out.println("report hascode "+report.hashCode());
		this.report=null;
	}
	
	public void generateReport() {
		report.generate();
		
		System.out.println("Report Generation Completed......");
		System.out.println("report hascode "+report.hashCode());
	}
}
