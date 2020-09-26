/***
 *  @author kanchan and saurav
 * file handling 
 */


package utility;
import java.io.*;
import java.util.regex.*;

public class Utility {
String fileName1 = "files/ITECH2306_2020_Load_Contracts.csv";
String fileName2 = "files/ITECH2306_2020_Load_Customers.csv";
String fileName3 = "files/ITECH2306_2020_Load_Plans.csv";
File f1 = new File(fileName1);
File f2 = new File(fileName2);
File f3 = new File(fileName3);

    // method to check the condition of the file
public class FileClassMethods {
	public static void main(String[] args) {
		File myFile = new File("Data.txt");
		if (myFile.exists()) {
			System.out.println(myFile.getName() + " exists");
			System.out.println("The file is " + myFile.length() + " bytes long");
			if (myFile.canRead())
				System.out.println(" ok to read");
			else
				System.out.println(" not ok to read");
			if (myFile.canWrite())
				System.out.println(" ok to write");
			else
				System.out.println(" not ok to write");
			System.out.println("path: " +myFile.getAbsolutePath());
			System.out.println("File Name: "+ myFile.getName());
			System.out.println("File Size: "+ myFile.length() + " bytes");
		} else
			System.out.println("File does not exist");
	}
}
    
    	
    	private static List<File> readFileFromCSV(string fileName){
    		List<File>files = new ArrayList<>();
    		Path pathToFile = Paths.get(f2);
    		
    		// Creating an instance of a bufferreader 
    		try BufferReader br = Files.newBufferedReader(pathToFile, StandardCharsets.US_ASCII)){
    			
    			// read the first line from the text file
    			String line = br.readLine();
    			
    			//loop until all lines are read
    			while(line != null);
    			
    			//using string.split to load string array with the values from each 
    			// line of file using comma as a delimiter
    			String[] attributes = line.split(",");
    			File file = createFile(attributes);
    			
    			//adding file into arrayList
    			file.add(file);
    			
    			// reading next line before looping 
    			//line will be null at the end of file
    			line = br.endLine();	
    			
    		} catch (IOException ioe) {
    			ioe.printStackTrace();
    		}
    		return files;
    	}
    	// function to validating username
    	public static boolean isValidUsername(String name) { 
            String regex = "^[aA-zZ]\\w{5,29}$";
            Pattern p = Pattern.compile(regex); 
      
            // If the username is empty 
            // return false
            if (name == null) { 
                return false; 
            }
            Matcher m = p.matcher(name); 
      
            // Return if the username 
            // matched the ReGex 
            return m.matches(); 
        }
       
      
          
    	
    	// assigning values to object variables    
    private static c1 createFile(String[] metadata) {
    	String customerType = metadata[0];
    	String name = metadata[1];
    	String address = metadata[2];
    	int id = metadata[3];
    	String address = metadata[4];
    	int documentId = metadata[5];
    	
    	if(name.length(5)) {
    		
    	}
    	
    	//create and return file of this metadata
    	return new c1(customerType, name, id, address, documentId);
    	
    }
    
    createFile.close();
    
    @Override
    public String toString() {
    	return "ExtractPlan [fileName1=" + fileName1 + ", fileName2=" + fileName2 + ", fileName3=" + fileName3 + ", f1="
    			+ f1 + ", f2=" + f2 + ", f3=" + f3 + ", getClass()=" + getClass() + ", hashCode()=" + hashCode()
    			+ ", toString()=" + super.toString() + "]";
    }
    
    
}

@Override
public String toString() {
	return "Utility [fileName1=" + fileName1 + ", fileName2=" + fileName2 + ", fileName3=" + fileName3 + ", f1=" + f1
			+ ", f2=" + f2 + ", f3=" + f3 + "]";
}

@Override
public int hashCode() {
	final int prime = 31;
	int result = 1;
	result = prime * result + ((f1 == null) ? 0 : f1.hashCode());
	result = prime * result + ((f2 == null) ? 0 : f2.hashCode());
	result = prime * result + ((f3 == null) ? 0 : f3.hashCode());
	result = prime * result + ((fileName1 == null) ? 0 : fileName1.hashCode());
	result = prime * result + ((fileName2 == null) ? 0 : fileName2.hashCode());
	result = prime * result + ((fileName3 == null) ? 0 : fileName3.hashCode());
	return result;
}

@Override
public boolean equals(Object obj) {
	if (this == obj)
		return true;
	if (obj == null)
		return false;
	if (getClass() != obj.getClass())
		return false;
	Utility other = (Utility) obj;
	if (f1 == null) {
		if (other.f1 != null)
			return false;
	} else if (!f1.equals(other.f1))
		return false;
	if (f2 == null) {
		if (other.f2 != null)
			return false;
	} else if (!f2.equals(other.f2))
		return false;
	if (f3 == null) {
		if (other.f3 != null)
			return false;
	} else if (!f3.equals(other.f3))
		return false;
	if (fileName1 == null) {
		if (other.fileName1 != null)
			return false;
	} else if (!fileName1.equals(other.fileName1))
		return false;
	if (fileName2 == null) {
		if (other.fileName2 != null)
			return false;
	} else if (!fileName2.equals(other.fileName2))
		return false;
	if (fileName3 == null) {
		if (other.fileName3 != null)
			return false;
	} else if (!fileName3.equals(other.fileName3))
		return false;
	return true;
}

}
