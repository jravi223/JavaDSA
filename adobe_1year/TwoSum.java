package adobe_1year;

import java.util.Arrays;
import java.util.HashMap;

public class TwoSum {
    public static void main(String[] args) {
    	int[] nums = {2,7,11,25};
    	System.out.print(Arrays.toString(twoSum(nums, 9)));
    }

    public static int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> hm = new HashMap<Integer, Integer>(); 

        for(int i=0;i<nums.length;i++) {
//        	iterate the array and make the target minus and return array 
        	int req_num = target-nums[i];
//        	check the hashmap whether the value contains or not
        	if(hm.containsKey(req_num)) {
        		int[] arr = {hm.get(req_num),i};
        		return arr;
        	}
        	 hm.put(nums[i],i);
        }
        return null;
    }
}

	