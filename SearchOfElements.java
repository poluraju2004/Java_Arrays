import java.util.Scanner;
class SearchOfElements{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a size of elements: ");
		int n = sc.nextInt();
		int[] arr;
		arr = new int[n];
		for(int i = 0;i<n;i++){
			arr[i] = 1 +(int) (Math.random()*100);
			System.out.print(arr[i]+" ");
		}
		System.out.println();
		System.out.print("Enter a search: ");
		int searchItem = sc.nextInt();
		boolean flag = false;
		for(int i = 0;i<n;i++){
			if(searchItem == arr[i]){
				System.out.println();
				System.out.println(searchItem+ " found the elements:");
				flag = true;
				break;
			}
		}
		if (flag == false){
			System.out.println(searchItem+" not Found the elements:");
		}
	}
}