package toturial_from_brocode;
import java.io.FileWriter;
import java.io.IOException;

public class Filewriter {

	public static void main(String[] args) {
		try {
			FileWriter writer = new FileWriter("poem.txt");
			writer.write("Roses are red \nViolets are blue ");
			writer.append("\n(A poem by Bro)");
			writer.close();
			
		}
		catch(IOException e) {
			e.printStackTrace();
		}

	}

}
