package toturial_from_brocode;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Filereader {

	public static void main(String[] args) {
		//FileReader = read the contents of a file as a steam of characters. One by one
		//			   read() returns an int value which contains the bytes value
		//			   when read() returns -1, there is no more data to be read
		try {
			FileReader reader = new FileReader("art.txt");
			int data = reader.read();
			while(data!=-1) {
				System.out.print((char)data);
				data = reader.read();
			}
			reader.close();
			
		} catch (FileNotFoundException e){
			e.printStackTrace();
		}catch (IOException e) {
			e.printStackTrace();
		}
		
		
		
		

	}

}
