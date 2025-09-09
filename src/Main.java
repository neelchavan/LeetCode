import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        TwoSum twoSum = new TwoSum();
        int[]arr = {2,11,8,9,7};
        int target = 9;
        int[]sol=twoSum.mapSolution(arr,target);
        System.out.println(Arrays.toString(sol));
    }
}