package adobe_1year;

import java.util.Arrays;

public class reverseArr {
    public static void main(String[] args) {
        int[] arr1 = new int[] { 9, 5, 4, 7, 1, 2, 6, 8, 5, 2, 1, 65, 6, 5 };
        System.out.println("Original Array is ");
        for (int i = 0; i < arr1.length; i++) {
            System.out.print(arr1[i] + " ");
        }
        // System.out.print("Original array is " + Arrays.toString(arr1));
        System.out.println();
        System.out.println("Reversed Arra is");
        for (int i = arr1.length - 1; i >= 0; i--) {
            System.out.print(arr1[i] + " ");
        } 
        
    }
}
