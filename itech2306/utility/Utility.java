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

public static void main(String [] args)
{
    
    if( f2.isFile() && f2.canRead() && f2.canWrite() )
       System.out.print("File exists and can be used");
    else
       System.out.print("File is no good for purposes");
    List<File> f2 = readFileFromCSV(f2);
    //print all the customer from the customer file
    for(File f : f2) {
    	System.out.println(f);
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
    
    
}
}
