package Arrays;

import java.util.Scanner;

public class RemoveDuplicates {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a array size: ");
		int n = sc.nextInt();
		int[] arr = new int[n];
		int rd = 0;
		for(int i = 0;i<arr.length;i++) {
			arr[i] = sc.nextInt();
		}
		for(int i = 0;i<arr.length;i++) {
			System.out.print(arr[i] + " ");
		}
		
		for(int i = 0;i<arr.length;i++) {
			if(arr[rd] != arr[i]) {
				rd++;
				arr[rd] = arr[i];	
			}
		}
		System.out.println();
		System.out.println("after remove duplicate Elements: ");
		for(int i =0;i<=rd;i++) {
			System.out.print(arr[i] + " ");
			
		}

	}

}
