import java.util.ArrayList;
import java.util.HashSet;
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

    public Set<Integer> duplicatesInArrayByHashingPattern(){
        Set<Integer> seen = new HashSet<>();
        Set<Integer> duplicates = new HashSet<>();
        int[] arr = {1,3,4,5,5,5,6,6};

        for (int el: arr){
            if(!seen.add(el)){
                duplicates.add(el);
            }
        }
        return duplicates;
    }

        public boolean containsDuplicate(int[] nums) { // leetcode 217
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
}
