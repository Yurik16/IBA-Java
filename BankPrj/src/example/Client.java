package example;

import java.io.File;


import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;
 
  
public class Client{  
 public static void main(String[] args) throws JAXBException {  
          
  Employee employee=new Employee(); 
  employee.setId(101);
  employee.setName("Sonoo Jaiswal");
  employee.setSalary(100000);

  File f = new File("c:/Emploer.txt");
  JAXBContext jCont = JAXBContext.newInstance(Employee.class);
  Marshaller jMarsh = jCont.createMarshaller();
  jMarsh.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
  jMarsh.marshal(employee, f);
  jMarsh.marshal(employee, System.out);
   
  System.out.println("XML Created Sucessfully");

	  File r = new File("c:/Emploer.txt");
	  JAXBContext jbCont = JAXBContext.newInstance(Employee.class);
	  Unmarshaller jUnmash = jbCont.createUnmarshaller();
	  Employee emp = (Employee) jUnmash.unmarshal(r);
	  System.out.println(emp);

  
 }  
} 