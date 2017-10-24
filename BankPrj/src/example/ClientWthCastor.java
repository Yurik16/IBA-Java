package example;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

import org.exolab.castor.xml.MarshalException;
import org.exolab.castor.xml.ValidationException;

public class ClientWthCastor {
	public static void main(String[] args) throws IOException, MarshalException, ValidationException {
		Employee emp = new Employee();
		emp.setId(101);
		emp.setName("Sonoo Jaiswal");
		emp.setSalary(100000);
		
		Writer wrt = new FileWriter(new File("data/emp.txt"));
		org.exolab.castor.xml.Marshaller.marshal(emp, wrt);
	}
}
