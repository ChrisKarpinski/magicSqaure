public class Magic {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int [] array = {1,2,3,4,5,6,7,8,9};
		
		permute();

	}
	
	public static boolean checkMagic(int [] square) {
		
		int [] rows = new int[8];
		rows[0] = square[0] + square[1] + square[2];
		rows[1] = square[3] + square[4] + square[5];
		rows[2] = square[6] + square[7] + square[8];
		rows[3] = square[0] + square[3] + square[6];
		rows[4] = square[1] + square[4] + square[7];
		rows[5] = square[2] + square[5] + square[8];
		rows[6] = square[0] + square[4] + square[8];
		rows[7] = square[2] + square[4] + square[6];
		
		if (rows[0] == rows[1] && rows[1] == rows[2] && rows[2] == rows[3] && rows[3] == rows[4]
				&& rows[4] == rows[5] && rows[5] == rows[6] && rows[6] == rows[7]) {
			
			return true;
			
		}
		else {
			return false;
		}
		
	}
	
	public static void permute() {
		
		int temp;
		int [] array = new int [9];
		for (int counter1 = 0; counter1 < array.length-1; counter1++) {
			
			for (int counter2 = 0; counter2 < array.length-1; counter2++) {
				
				temp = array[counter2];
				array[counter2] = array[counter1];
				array[counter1] = temp;
				
				
				
			}
			if (checkMagic(array) == true) {
				System.out.println("This array is magic");
				
				for (int i = 0; i < array.length-1; i++) {
					System.out.println(array[i]);
				}
				
			}
			
			
		}
		
		
		
	}
	
}
