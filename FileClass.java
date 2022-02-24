package toturial_from_brocode;
import java.io.File;
public class FileClass {

	public static void main(String[] args) {
		//file=An abstract representation of file and directory pathnames
		File file = new File("src/secret_message.txt");
		//if it keeps saying not existing file, type" src/secret_message.txt"
		if(file.exists()) {
			System.out.println("That file exists!:o");
			System.out.println(file.getPath());
			System.out.println(file.getAbsolutePath());
			//this can delete the file after the running
			file.delete();
		}
		else {
			System.out.println("That file doesn't exist :<");
		}
		

	}

}
