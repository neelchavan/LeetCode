import java.util.HashMap;
import java.util.Map;

public class TwoSum {

    public int[] solution(int[] nums, int target ){
        int[] idexesAre = new int[2];
        for(int i=0; i<nums.length; i++){
            for(int j = i+1; j<nums.length; j++){
                if(nums[i]+nums[j] == target){
                    idexesAre[0] = i;
                    idexesAre[1] = j;
                    break;
                }
            }
        }
        return idexesAre;
    }

    public int[] mapSolution(int []nums, int target){
        Map<Integer, Integer> map = new HashMap<>();
        for(int i= 0; i<nums.length; i++){
            int num = target - nums[i];
            if(map.containsKey(num)){
                return new int[] {map.get(num),i};
            }
            map.put(nums[i],i);
        }
        return new int[] {};
    }
}
