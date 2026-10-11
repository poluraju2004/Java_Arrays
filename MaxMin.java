package Arrays;

import java.util.Scanner;

public class MaxMin {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a size of elements: ");
		int n = sc.nextInt();
		
		int[] arr = new int[n];
		for(int i = 0;i<arr.length;i++) {
			arr[i] = 1 + (int) (Math.random()*100);
		}
		for(int i = 0;i<arr.length;i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
		int max = arr[0];
		int min = arr[0];;
		for(int i= 0;i<arr.length;i++ ) {
			if(arr[i] > max) {
				max = arr[i];			
			}	
			if(arr[i] < min) {
				min = arr[i];
			}
		}
		System.out.println("Maxmum number: " + max);
		System.out.println("Maimum number: " + min);

	}

}
