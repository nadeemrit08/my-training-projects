package in.nadeem.beans;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;
@Primary
@Component("pdf")
public class PdfReport implements IReport {

	public PdfReport() {
		System.out.println("PdfReport :: Constructor");
	}
	
	
	@Override
	public void generate() {
		System.out.println("Pdf Report Method Generating....");
		
	}
}
