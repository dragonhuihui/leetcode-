package leetcode.数组;

/**
 * 给定一个已按照升序排列 的有序数组，找到两个数使得它们相加之和等于目标数。
 * 函数应该返回这两个下标值 index1 和 index2，其中 index1 必须小于 index2。
 * 说明:
 * 返回的下标值（index1 和 index2）不是从零开始的。
 * 你可以假设每个输入只对应唯一的答案，而且你不可以重复使用相同的元素。
 * 示例:
 * 输入: numbers = [2, 7, 11, 15], target = 9
 * 输出: [1,2]
 * 解释: 2 与 7 之和等于目标数 9 。因此 index1 = 1, index2 = 2 。
 */
public class code3 {
    /**
     * 使用双指针，一个指针指向值较小的元素，一个指针指向值较大的元素。指向较小元素的指针从头向尾遍历，指向较大元素的指针从尾向头遍历.
     * 如果两个指针指向元素的和 sum == targetsum==target，那么得到要求的结果；
     * 如果 sum > targetsum>target，移动较大的元素，使 sumsum 变小一些；
     * 如果 sum < targetsum<target，移动较小的元素，使 sumsum 变大一些。
     */
    class Solution {
        public int[] twoSum(int[] numbers, int target) {
            if (numbers == null) return null;
            //1.定义前后指针
            int i = 0, j = numbers.length - 1;
            //2.循环遍历
            while (i < j) {
                //求和
                int sum = numbers[i] + numbers[j];
                //如果相等的话直接返回一个数组
                if (sum == target) {
                    return new int[]{i + 1, j + 1};
                } else if (sum < target) {
                    //移动小的
                    i++;
                } else {
                    //移动大的。
                    j--;
                }
            }
            //3.返回空
            return null;
        }
    }
}
