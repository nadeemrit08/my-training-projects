package in.nadeem.beans;

import org.springframework.stereotype.Component;

@Component("excel")
public class ExcelReport implements IReport {

	public ExcelReport() {
		System.out.println("Excel Report :: Constructor");
	}
	
	@Override
	public void generate() {
		System.out.println("Excel Report Method Generating...");
		
	}
}
