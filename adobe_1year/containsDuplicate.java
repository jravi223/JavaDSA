package adobe_1year;

import java.util.HashSet;
import java.util.Set;

public class containsDuplicate {
    public static void main(String[] args) {
    System.out.println("ijhiojio");
     public boolean containsDuplicates(int[] nums) {

    Set<Integer> seen = new HashSet<>();

        for (final int num : nums)
            if (!seen.add(num))
                return true;

        return false;
    }
}

}
