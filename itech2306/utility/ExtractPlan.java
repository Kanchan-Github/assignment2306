
/***
 *  @author kanchan
 * file handling for extracting plan plan
 */package utility;

import java.io.File;
import java.io.IOException;

public class ExtractPlan extends Utility {

private static List<File> readFileFromCSV(string fileName){
	List<File>files = new ArrayList<>();
	Path pathToFile = Paths.get(f3);
	
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
	if (plan = prePaidMobile) {
String typeOfPlan = metadata[0];
int planID = metadata[1];
int costOfPlan = metadata[2];
int maxDay = metadata[3];
int upperLimit = metadata[4];
int voiceTimeUpperLimit = metadata[5];
	}
	if (plan = prePaidMobile) {
		String typeOfPlan = metadata[0];
		int planID = metadata[1];
		int costOfPlan = metadata[2];
		int maxDay = metadata[3];
		int upperLimit = metadata[4];
		int voiceTimeUpperLimit = metadata[5];
			}
	else if (plan = postPaidMobile) {
		String typeOfPlan = metadata[0];
		int planID = metadata[1];
		int costOfPlan = metadata[2];
		int dataQuotaIncluded = metadata[3];
		int voiceQuotaIncluded = metadata[4];
		int sizeOfDataBlock = metadata[5];
		int chargeRateOfDataBlock = metadata[6];
		int chargeRateOfVoiceBlock = metadata[7]
			}
	else if (plan = internet) {
		String typeOfPlan = metadata[0];
		int planID = metadata[1];
		int baseDataPlan = metadata[2];
		int downloadSpeed = metadata[3];
		int uploadSpeed = metadata[4];
		int typeOfPenalty = metadata[5];
		if (typeOfPenalty = noSpeedRestrict) {
			int excessCost = metaData[6];
			}
		else if typeOfPenalty = SpeedRestrict{
			int excessCost = metaData[5];
			int sizeOfBlock = metaData[6];
			int downloadSpeedLimit = metaData[7];
			int uploadSpeedLimit = metaData[8];
		}





//create and return file of this metadata

		
createFile.close();


}
}



