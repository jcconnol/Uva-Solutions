//John Connolly
//2/13/18
//Sum Four Primes Uva challenge

import java.util.Arrays;
import java.util.Scanner;
import java.lang.Math;
import java.math.BigInteger;
import java.util.Vector;

class Main {
	
	public static void main(String []args) {
		Scanner sc = new Scanner(System.in);
		int bigNum = 10000000;
		//set up array with all primes
		boolean [] primes = new boolean[(int) (bigNum+1)];
		int squ = (int) Math.sqrt(bigNum);
		
		Arrays.fill(primes, false);
		
		for(int i = 2; i < squ+1; i++) {
			if(!primes[i]) {
				for(int j = (bigNum-1)/i; j >= i; j--) {
					int k = i*j;
					
					primes[(int) k] = true;
					
					k -= i;
				}
			}
		}
		
		while(sc.hasNextInt()) {
			int num = sc.nextInt();			
			long arr[] = new long[2];
			
			//less than 8 and impossible
			if(num < 8) {
				System.out.println("Impossible.");
			}
			
			//even number
			else if(num % 2 == 0) {
				
				num = num-4;

				for(int i = 2;; i++) {
					if(!primes[num-i] && !primes[i]) {
						arr[0] = num-i;
						arr[1] = i;
						break;
					}
				}
				
				System.out.println("2 2 " + arr[0] + " " + arr[1]);
			}
			
			//odd number
			else {
				
				num = num-5;
				
				for(int i = 2;; i++) {
					if(!primes[num-i] && !primes[i]) {
						arr[0] = num-i;
						arr[1] = i;
						break;
					}
				}
				
				System.out.println("2 3 " + arr[0] + " " + arr[1]);
			}
		}
		
	}
	
	private static boolean prime(int n) {
		int squ = (int) Math.sqrt(n);
		for(int i = 2; i <= squ; i++) {
			if(n % i == 0) {
				return false;
			}
		}
		
		return true;
	}
	
}
