//John Connolly
//2/13/18
//Euclid Problem Uva challenge

import java.util.Scanner;

class Main {
	
	public static int[] euclid(int [] arr){
		if(arr[1] == 0){
	        return arr;
	    }

	    int hold_quot = (arr[0]) / (arr[1]);
	    int moding = (arr[0]) % (arr[1]);
	    
	    arr[6] = arr[2] - hold_quot * (arr[4]);
	    arr[7] = arr[3] - hold_quot * (arr[5]);
	    arr[0] = arr[1];
	    arr[1] = moding;
	    
	    arr[2] = arr[4];
	    arr[4] = arr[6];
	    
	    arr[3] = arr[5];
	    arr[5] = arr[7];
	    
	    return euclid(arr);
		
	}
	
	public static void main(String []args) {
		Scanner sc = new Scanner(System.in);
		
		while(sc.hasNextInt()) {
			int [] arr = new int[8];
			
	        arr[0] = sc.nextInt();
	        arr[1] = sc.nextInt();
	        arr[4] = 0;
	        arr[5] = 1;
	        arr[2] = 1;
	        arr[3] = 0;
			
			arr = euclid(arr);
			
			System.out.println(arr[2] + " " + arr[3] + " " + arr[0]);
		}
		
	}
	
}
