/***
 *  @author kanchan and saurav
 * file handling for plan data
 */
package utility;

import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import domain.BillingContract;

public class LoadPlan implements ObjectIO{
		 
	    private static final String filepath="C:\\Users\\kanchan\\Desktop\\obj";
	        
	        // object serialization 
	 
	    public void WriteObjectToFile(Object plan) {
	 
	        try {
	 
	            FileOutputStream fileOut = new FileOutputStream(filepath);
	            ObjectOutputStream objectOut = new ObjectOutputStream(fileOut);
	            objectOut.writeObject(plan);
	            objectOut.close();
	            System.out.println("The Object is succesfully written to a file");
	 
	        } catch (Exception ex) {
	            ex.printStackTrace();
	        }
	        public static void writeFile(plan p) throws IOException{
	        	ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream("Plan.bin"));
	        	objectOutputStream.writeObject(contract);
	        }
	        public static void readFile() throws IOException, ClassNotFoundException {
	        	ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream("Plan.bin"));
	        	
	        	Contract type = (Plan) objectInputStream.readObject();
	        	System.out.println(type);
	        }
	    
	}

}
