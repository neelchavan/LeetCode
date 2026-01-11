import java.util.*;

public class MajorityElementInArray {

    public int majorityElement(){ //HashMapFreqPattern
        int[] nums = {2,2,2,1,4};
        HashMap<Integer, Integer> seen = new HashMap<>();
        for(int num : nums){
            seen.put(num, seen.getOrDefault(num,0)+1);
            if (seen.get(num)>nums.length/2)
                return num;
        }
        return -1;
    }
}
