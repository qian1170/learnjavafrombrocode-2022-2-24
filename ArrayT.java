package toturial_from_brocode;

public class ArrayT {
	public static void main(String[] args) {
		//aray = used to store multiple values in a single variable 
		String[] cars = {"Camaro","Corvette","Tesla","BMW"};
		// the components have to be the same data type
		cars[0] = "Mustang";
		System.out.println(cars[3]);
		
		//another way to write array
		String[] cars2 = new String[3];
		cars2[0] = "Camaro";
		cars2[1] = "Corvette";
		cars2[2] = "Tesla";
		
		for(int i=0;i<cars2.length; i++) {
			System.out.println(cars2[i]);
		}
	
	}

}
