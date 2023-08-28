import java.util.Arrays;

public class Exercise04 {
    public static void main(String[] args) {
        // 有如下数组 nums ，请通过删除掉其中的 33 ，得到一个新的数组 newNums
        int[] nums = {2, 11, 33, 44, 55, 66, 277};
        // newNums = {2, 11, 44,55, 66, 277}
        // 使用多种方式实现：
        // 1. for 循环（自己写方法实现）
        // 定义一个新数组
        int[] newNums=new int[nums.length-1];
        int temp=0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i]==33){
                continue;
            }else if (nums[i]!=33){
                newNums[temp]=nums[i];
                temp++;
            }
        }
        for (int a:newNums) {
            System.out.print(a+"\t");
        }
        System.out.println();
        // 2. System 类中的 arraycopy 方法实现
        int[] newNums1=new int[nums.length-1];
        int key=33;
        int Index=Arrays.binarySearch(nums,key);
        System.out.println(Index);
        System.arraycopy(nums,0,newNums1,0,Index);
        System.arraycopy(nums,Index+1,newNums1,Index,newNums1.length-Index);
        System.out.println(Arrays.toString(newNums1));
    }
}
