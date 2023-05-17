package in.nadeem;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.Marshaller;

public class JavaToXmlConverter {

	public static void main(String[] args) throws Exception {

		Book b = new Book();
		b.setBookId(101);
		b.setBookName("Spring");
		b.setBookPrice(350.00);

		JAXBContext context = JAXBContext.newInstance(Book.class);

		Marshaller marshaller = context.createMarshaller();

		marshaller.marshal(b, System.out);
	}
}
