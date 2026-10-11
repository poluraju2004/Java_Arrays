package Array;

import java.util.Scanner;
public class ZeroElements {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a size of elements: ");
		int n = sc.nextInt();
		int[] arr = new int[n];
		for(int i = 0;i<arr.length;i++) {
			arr[i] = sc.nextInt();
			
		}
		for(int i = 0;i<arr.length;i++) {
			System.out.print(arr[i] + " ");
		}System.out.println();
		
		int insert = 0;
		for(int i = 0;i<arr.length;i++) {
			if(arr[i] != 0) {
				arr[insert] = arr[i];
				insert++;
			}
		}
		while(insert<arr.length) {
			arr[insert] = 0;
			insert++;
		}
//		int insert = 0;
//		for(int i = 0;i<arr.length;i++) {
//			if(arr[i] != 0) {
//				if(i != 0) {
//					int temp = arr[i];
//					arr[i] = arr[insert];
//					arr[insert] = temp;
//				
//				}
//				insert++;
//			}
//		}
		System.out.print("After all Zero ends: ");
		for(int i = 0;i<arr.length;i++) {
			System.out.print(arr[i] + " ");
		}		
	}
}
