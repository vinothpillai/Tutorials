package mypackage1;

import java.io.IOException;
import java.io.File;
import java.io.FileReader;

public class LearnException {
	public void readFile(){
		FileReader fr=null;
		try{			
	        File file=new File("file.txt");
	        fr = new FileReader(file); 
	        char [] a = new char[50];
	        fr.read(a); // reads the content to the array
	        for(char c : a)
	         System.out.print(c); //prints the characters one by one
			
		}catch(IOException e){
			e.printStackTrace();
			//e.getMessage();
		}finally{
			try{
				fr.close();
			}catch(IOException e){
				e.printStackTrace();
			}
		
		}
	}
}
