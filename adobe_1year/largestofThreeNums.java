package adobe_1year;

import java.util.*;
import java.lang.*;

public class largestofThreeNums {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		int a, b, c;
//		a = 100;
//		b = 10;
//		c = 95;
//
//		ArrayList<Integer> x = new ArrayList<>();
//		
//		x.add(a);
//		x.add(b);
//		x.add(c);
//		
//		System.out.print(Collections.max(x));

		int num1 = 98, num2 = 22, num3 = 23;

		int largestNum = Math.max(Math.max(num1, num2), num3);

		System.out.print(largestNum);

	}

}
