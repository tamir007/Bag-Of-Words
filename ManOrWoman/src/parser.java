import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.LinkedList;


public class parser {
	
	public static LinkedList<Sample> getData(String source) throws IOException{
		
		LinkedList<Sample> list = new LinkedList<Sample>();
		File file = new File(source);
		FileInputStream fis = new FileInputStream(file);
		byte[] data = new byte[(int) file.length()];
		fis.read(data);
		fis.close();
		String theFile = new String(data, "UTF-8");
		String[] samplesArray = theFile.split("\n");
		String[] uniqSample;

		for(String sample : samplesArray){
			
		uniqSample = sample.split("[\\|]");
			
			for(int i = 0; i < uniqSample.length ; i++){

				if(uniqSample[i].length() == 0) continue;
			
				list.add(new Sample(
						Float.valueOf(uniqSample[i].substring(0,uniqSample[i].indexOf(","))),
						Float.valueOf(uniqSample[i].substring(uniqSample[i].indexOf(",") + 1, uniqSample[i].length()))));
				}			
		}
		return list;		
	}

}
