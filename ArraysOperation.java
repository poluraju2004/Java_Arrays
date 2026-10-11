package Array;
import java.util.Scanner;
public class ArraysOperation {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter size of elements: ");
		int n = sc.nextInt();
		int[] arr = new int[n+1];

		//1. Display all elements of the array.
		for(int i = 0;i<arr.length-1;i++) {
			arr[i] = sc.nextInt();
		}
		for(int i = 0;i<arr.length-1;i++) {
			System.out.print(arr[i] + " ");
		}
		//Insert an element at a specified position.
		System.out.println();
		System.out.print("Enter index values: ");
		int index = sc.nextInt();
		System.out.print("Enter a insert values: ");
		int insertElement = sc.nextInt();
		int change = index;
		for(int i = 0;i<arr.length-change;i++){
			int temp = arr[index];
			arr[index] = insertElement;
			insertElement = temp;
			index++;
		}System.out.println("Insert an element at a specified position.");
		for(int i = 0;i<arr.length;i++){
			System.out.print(arr[i] + " ");
		}System.out.println();

		//Delete an element from a specified position.
		System.out.print("Enter a delete position: ");
		int deleteNumber = sc.nextInt();
		for(int i = 0;i<arr.length-1;i++){
			if(i>=deleteNumber){
				arr[i] = arr[i+1];
				arr[i+1] = 0;
			}
		}
		System.out.println("After delete the elements:");
		for(int i = 0;i<arr.length;i++){
			System.out.print(arr[i] + " ");
		}System.out.println();

		//Search for a given element and display its position.
		System.out.print("Enter search given a elements: ");
		int searchElement = sc.nextInt();
		boolean found = false;
		int a = 0;
		for(int i = 0;i<arr.length-1;i++){
			if(arr[i] == searchElement){
				found = true;
				a = i;
				break;
			}
		}
		if(found == true){
			System.out.print("Found the Position: " + a);
		}
		else{
			System.out.println("Not found:");
		}
		for(int i = 0;i<arr.length;i++){
			System.out.print(arr[i] + " ");
		}System.out.println();
		//Update an element at a specified position.
		System.out.print("Update an element at a specified position: ");
		int updateElement = sc.nextInt();
		System.out.print("Enter new elements: ");
		int element = sc.nextInt();
		for(int i = 0;i<arr.length;i++){
			if( i == updateElement){
				arr[i] = element;
			}
		}
		for(int i = 0;i<arr.length;i++){
			System.out.print(arr[i] + " ");
		}
	}

}
