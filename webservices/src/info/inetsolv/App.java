package info.inetsolv;

import java.io.File;
import java.util.List;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;

public class App {

	public static void main(String[] args) throws JAXBException {
		Studentstype studentstype = new Studentstype();
		List<StudentType> student = studentstype.getStudent();
		JAXBContext context = JAXBContext.newInstance("info.inetsolv");
		Marshaller marshaller = context.createMarshaller();
		marshaller.marshal(new ObjectFactory().createStudents(studentstype), new File("students.xml"));
	}

}
