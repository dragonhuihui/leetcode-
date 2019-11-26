package leetcode.数组;

import java.util.HashMap;

/**
 *
 * 给定一个整数数组 nums 和一个目标值 target，请你在该数组中找出和为目标值的那 两个 整数，并返回他们的数组下标。
 * 你可以假设每种输入只会对应一个答案。但是，你不能重复利用这个数组中同样的元素。
 * 示例:
 * 给定 nums = [2, 7, 11, 15], target = 9
 * 因为 nums[0] + nums[1] = 2 + 7 = 9
 * 所以返回 [0, 1]
 *
 */
public class code1 {
        public int[] twoSum(int[] nums, int target) {
            //1.对边界处理
            if(nums==null || nums.length<2){
                return new int[]{-1,-1};
            }
            //2.定义一个数组
            //对数组进行初始化
            int[] res=new int[]{-1,-1};
            //3.定义hashmap
            HashMap<Integer,Integer> map=new HashMap<>();
            for(int i=0;i<nums.length;i++){
                //存值和索引
                if(map.containsKey(target-nums[i])){
                    res[0]=map.get(target-nums[i]);
                    res[1]=i;
                    break;
                }
                //4.不存在的话进行添加
                map.put(nums[i],i);
            }
            return res;
        }

}
