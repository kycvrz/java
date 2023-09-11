import java.util.HashMap;
import java.util.Map;
import java.util.function.BiFunction;

public class Exam03 {
    public static void main(String[] args) {
        int[] nums={1,2,3,1};
        int k=3;
//        int[] nums={1,0,1,1};
//        int k=1;
//        int[] nums={1,2,3,1,2,3};
//        int k=2;
        System.out.println(is(nums, k));
    }
    public static boolean is(int[] nums,int k){
        Map<Integer,Integer> map=new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int j=nums[i];
            int finalI = i;
            map.compute(j, new BiFunction<Integer, Integer, Integer>() {
                @Override
                public Integer apply(Integer integer, Integer integer2) {
                    return integer2==null?-1: Math.abs(integer2 - finalI);
                }
            });
        }
        for (Integer integer:map.keySet()) {
            int value= map.get(integer);
            if (value>0 && value<=k){
                return true;
            }else {
                return false;
            }
        }
        return false;
    }
}
