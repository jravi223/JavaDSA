import java.util.Scanner;

public class palindrome {
	
	public static boolean isPalin(String str) {
		str = str.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
		return new StringBuilder(str).reverse().toString().equals(str);
	}
	
	public static boolean isPalin(int num) {
		return isPalin(String.valueOf(num));
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        System.out.print("Enter a word or number: ");

		String input = sc.nextLine();
		
		sc.close();
		
		if(input.matches("\\d+")) {
			System.out.println(isPalin(Integer.parseInt(input)) ? "It is a palindrome" : "Its not Palindrome");
		}else {
			System.out.println(isPalin(input) ? "It is a palindrome" : "Its not Palindrome");
		}
	}

}
