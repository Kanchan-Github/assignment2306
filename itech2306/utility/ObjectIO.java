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
	        
	      /*  try {
	        	writeToFile(customer);
	        } catch (IOException e) {
	        	System.out.println(e.getMessage());
	        }
	    }
	    */
	 
	    public void WriteObjectToFile(Object customer) {
	 
	        try {
	 
	            FileOutputStream fileOut = new FileOutputStream(filepath);
	            ObjectOutputStream objectOut = new ObjectOutputStream(fileOut);
	            objectOut.writeObject(customer);
	            objectOut.close();
	            System.out.println("The Object is succesfully written to a file");
	 
	        } catch (Exception ex) {
	            ex.printStackTrace();
	        }
	        public static void writeFile(Person p) throws IOException{
	        	ObjectOutputStregam objectOutputStream = new ObjectOutputStream(new FileOutputStream("Customer.bin"));
	        	objectOutputStream.writeObject(customer);
	        }
	        public static void readFile() {
	        	ObjectInputStream objectInputStream = new ObjectInputStream(new FileInput)
	        }
	    }
	}

}
