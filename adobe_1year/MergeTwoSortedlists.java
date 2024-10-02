/**
 * 
 */
package adobe_1year;
import java.util.ArrayList;
import java.util.List;

public class MergeTwoSortedlists {
	 public static List<Integer> mergeSortedLists(List<Integer> list1, List<Integer> list2) {
	        List<Integer> mergedList = new ArrayList<>();
	        int i = 0, j = 0;
	        
	        // Traverse both lists and add smaller element to the merged list
	        while (i < list1.size() && j < list2.size()) {
	            if (list1.get(i) < list2.get(j)) {
	                mergedList.add(list1.get(i));
	                i++;
	            } else {
	                mergedList.add(list2.get(j));
	                j++;
	            }
	        }
	        
	        // If there are remaining elements in list1, add them
	        while (i < list1.size()) {
	            mergedList.add(list1.get(i));
	            i++;
	        }
	        
	        // If there are remaining elements in list2, add them
	        while (j < list2.size()) {
	            mergedList.add(list2.get(j));
	            j++;
	        }
	        
	        return mergedList;
	 }
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	     List<Integer> list1 = List.of(1, 3, 5, 7);
	        List<Integer> list2 = List.of(2, 4, 6, 8);
	        
	        List<Integer> merged = mergeSortedLists(list1, list2);
	        System.out.println(merged);

	}

}
