package Arrays;

import java.util.Scanner;

public class ReverseArray {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a array: ");
		int n = sc.nextInt();
		int[] arr = new int[n];
		int reversed;
		
		for(int i = 0;i<arr.length;i++) {
//			arr[i] = sc.nextInt();
			arr[i] = 1 + (int) (Math.random()*100);
		}
		for(int i = 0;i<arr.length;i++) {
			System.out.print(arr[i] + " ");		
		}
//		for(int i = 0;i<arr.length/2;i++) {	
//			reversed = arr[i];
//			arr[i] = arr[arr.length-1-i];
//			arr[arr.length-1-i] = reversed;
//		}
		
		for(int i = arr.length/2;i>0;i--) {
			System.out.print(arr[i] + " ");		
		}
		System.out.println();
		for(int i = 0;i<arr.length;i++) {
			System.out.print(arr[i] + " ");		
		}
	}
}
