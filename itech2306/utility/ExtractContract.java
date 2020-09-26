/***
 *  @author saurav
 * file handling for extracting contracts
 */
package utility;

import java.io.File;
import java.io.IOException;

public class ExtractContract extends Utility{
	private static List<File> readFileFromCSV(string fileName){
		List<File>files = new ArrayList<>();
		Path pathToFile = Paths.get(f1);
		
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

	  

	// assigning values to object variables    
	private static c1 createFile(String[] metadata) {
	int contractID = metadata[0];
	int planID = metadata[1];




	//create and return file of this metadata

			
	createFile.close();


	}
	}
}
