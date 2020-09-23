package utility;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

import domain.Customer;

public class ObjectIO implements Serializable{
		 
	    private static final String filepath="C:\\Users\\kanchan\\Desktop\\obj";
	 
	    public static void main(String args[]) {
	 
	        ObjectIO objectIO = new ObjectIO();
	 
	        Customer customer = new Customer(1,"Derek",2218);
	        objectIO.WriteObjectToFile(customer);
	    }
	 
	    public void WriteObjectToFile(Object serObj) {
	 
	        try {
	 
	            FileOutputStream fileOut = new FileOutputStream(filepath);
	            ObjectOutputStream objectOut = new ObjectOutputStream(fileOut);
	            objectOut.writeObject(serObj);
	            objectOut.close();
	            System.out.println("The Object is succesfully written to a file");
	 
	        } catch (Exception ex) {
	            ex.printStackTrace();
	        }
	    }
	}

}
