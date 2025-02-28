package adobe_1year;

public class reverseLinkedList {

	public static void main(String[] args) {
		System.out.println("Reverse Linked List");

		int[] arr = { 10, 20, 30, 50, 60 };
		reverse(arr, arr.length);
	}

	private static void reverse(int[] array1, int n) {
		// TODO Auto-generated method stub
		int[] b = new int[n];
		int j = n;

		for (int i = 0; i < n; i++) {
			b[j - 1] = array1[i];
			j = j - 1;
		}

		System.out.println("Reverse the array is ");
		for (int k = 0; k < n; k++) {
			System.out.println(b[k]);
		}

	}

}
