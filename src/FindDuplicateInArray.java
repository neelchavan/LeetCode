import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class FindDuplicateInArray {

    public Set<Integer> duplicateInArrayBruteForce(){
        Set<Integer> set = new HashSet<>();
        int[] arr = {1,3,4,5,5,5,6,6};

        for(int i =0; i<arr.length; i++){
            int num = arr[i];
            for(int k=i+1;k<arr.length;k++){
                if(num == arr[k]){
                    set.add(num);
                }
            }
        }
        return set;
    }

    public List<Integer> duplicatesInArrayByHashingPattern(){ // leetcode 442
        Set<Integer> seen = new HashSet<>();
        Set<Integer> duplicates = new HashSet<>();
        List<Integer> duplicateList = new ArrayList<>();
        int[] arr = {1,3,4,5,5,5,6,6};

        for (int el: arr){
            if(!seen.add(el)){
                duplicates.add(el);
            }
        }
        duplicateList.addAll(duplicates);
        return duplicateList;
    }

        public boolean containsDuplicate(int[] nums) { // leetcode, hashing pattern 217
            Set<Integer> seen = new HashSet<>();
            boolean isDuplicate = false;
            for(int num: nums){
                if(!seen.add(num)){
                    return true;
                }else{
                    isDuplicate = false;
                }
            }
            return isDuplicate;
        }

    public List<Integer> duplicatesInArrayByIndexMappingPattern(){ // leetcode, in place array manupulation/index mapping pttern 442
        int[] nums = {4,2,5,6,5,4};
        List<Integer> result = new ArrayList<>();

        for (int i = 0; i < nums.length; i++) {
            int index = Math.abs(nums[i])-1;
            if(nums[index]<0){
                result.add(index+1);
            }else{
                nums[index] = -nums[index];
            }
        }
        return result;
    }
}
