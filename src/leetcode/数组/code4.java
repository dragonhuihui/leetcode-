package leetcode.数组;

import java.util.TreeSet;

/**
 *给定一个非空数组，返回此数组中第三大的数。如果不存在，则返回数组中最大的数。要求算法时间复杂度必须是O(n)。
 * 示例 1:
 * 输入: [3, 2, 1]
 * 输出: 1
 * 解释: 第三大的数是 1.
 */
public class code4 {
    class Solution {
        public int thirdMax(int[] nums) {
            if (nums == null || nums.length == 0) throw new RuntimeException("error");
            //1.treeset 有序性，
            TreeSet<Integer> set = new TreeSet<>();
            //2.遍历数组中的元素
            for (Integer elem : nums) {
                //3.添加到set集合中
                set.add(elem);
                //4.判断是是否大于3.大于的话把最小
                if (set.size() > 3) set.remove(set.first());
            }
            return set.size() < 3 ? set.last() : set.first();   // set.last() 里面最大的元素
        }
    }
}
