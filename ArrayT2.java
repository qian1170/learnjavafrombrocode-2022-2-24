package toturial_from_brocode;

public class ArrayT2 {
	public static void main(String[] args) {
		// 2D array = an array of arrays

		
		String[][] cars = new String[3][3];
		
		cars[0][0] = "A";
		cars[0][1] = "B";
		cars[0][2] = "C";
		cars[1][0] = "D";
		cars[1][1] = "E";
		cars[1][2] = "F";
		cars[2][0] = "G";
		cars[2][1] = "H";
		cars[2][2] = "I";
		
		// another way of setting a array
		String[][] cars2 = {
				{"A","B","C"},
				{"A","B","C"},
				{"A","B","C"},
				};
		
		
		
		
		for(int i=0; i<cars.length;i++) {
			System.out.println();
			for(int j=0; j<cars[i].length;j++) {
				System.out.print(cars[i][j]+" ");
			}
		}
		
		System.out.println(" ");
		for(int i=0; i<cars2.length;i++) {
			System.out.println();
			for(int j=0; j<cars2[i].length;j++) {
				System.out.print(cars2[i][j]+" ");
			}
		}
	
	}

}
