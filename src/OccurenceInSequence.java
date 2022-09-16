/*
import java.util.HashMap;
import java.util.Map;

public class OccurenceInSequence {

    public int[] returnSequence(int[] nums){
        Map<Integer, Integer> ocurrenceMap = new HashMap<>();
        int[] result = new int[nums.length];
        int k = 0;

        for (int i: nums) {
            ocurrenceMap.computeIfPresent(i, (k,v) -> v+1);
            ocurrenceMap.putIfAbsent(i,1);
        }

        for (int j = 0; j<nums.length; j++){
            if (ocurrenceMap.containsKey(nums[j])) {
                int counter = ocurrenceMap.get(nums[j]);
                for()
            }
        }

    }
}
*/
