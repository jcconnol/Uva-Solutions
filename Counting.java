//John Connolly
//2/18/18
//Counting Uva challenge

import java.util.Scanner;
import java.math.BigInteger;
import java.util.Vector;

class Main {
	public static void main(String [] args) {
		Scanner sc = new Scanner(System.in);
		
		Vector<BigInteger> counts = new Vector<BigInteger>(10, 2);
		
		//first 3 values of integers
		counts.add(BigInteger.valueOf(1));
		counts.add(BigInteger.valueOf(2));
		counts.add(BigInteger.valueOf(5));
		counts.add(BigInteger.valueOf(13));
		
		for(int i = 4; i <= 1000; i++) {
			//this element equals sum of the 3 before it and one before again
			BigInteger sum = counts.elementAt(i-1);
			sum = sum.multiply(BigInteger.valueOf(2));
			sum = sum.add(counts.elementAt(i-2));
			sum = sum.add(counts.elementAt(i-3));
			counts.addElement(sum);
		}
		
		while(sc.hasNextInt()) {
			System.out.println(counts.get(sc.nextInt()));
		}
		
		sc.close();
	}
}
