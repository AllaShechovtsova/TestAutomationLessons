package lesson4.practica;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class SplitFileIntoTwo {
	//�pen file for reading
	//calculate number of strings
	//if number string less than half of string quantity write to first file
	//if number string more than half of string quantity write to second file
	
	public  void numberOfLines(String inputFileName, String firstOutputFileName, String secondOutputFileName) throws IOException {
		ArrayList <String> stringArray = new ArrayList<String>();
		
		File inputFile = new File(inputFileName);
		FileInputStream fis = new FileInputStream(inputFile);
	 
		//Construct BufferedReader from InputStreamReader
		BufferedReader br = new BufferedReader(new InputStreamReader(fis));
	 
		String line = null;
		
		
		while ((line = br.readLine()) != null) {
			
			if(line.length()!=0){	
				stringArray.add(line);
				
			}
		}
		File firstOutputFile = new File(firstOutputFileName);
		File secondOutputFile = new File(secondOutputFileName);
		FileOutputStream firstStream = new FileOutputStream(firstOutputFile);
		FileOutputStream secondStream = new FileOutputStream(secondOutputFile);
		
	 for(int i=0; i<stringArray.size();i++){
		 byte[] buffer = (stringArray.get(i)+"\n").getBytes();
         if(i<=stringArray.size()/2){
        	 firstStream.write(buffer, 0, buffer.length);
        	
         }
         else { secondStream.write(buffer, 0, buffer.length);
        	 
         }
		 
	 }
	 firstStream.flush();
	 firstStream.close();	
	 secondStream.flush();
	 secondStream.close();
	 br.close();
		
		
	}
	
	
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		SplitFileIntoTwo myInstance=new SplitFileIntoTwo();
		
		myInstance.numberOfLines("D://inputFile.txt", "D://outputFile1.txt", "D://outputFile2.txt");
	}

}
