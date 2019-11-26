package leetcode.数组;

/**
 *给定一个由整数组成的非空数组所表示的非负整数，在该数的基础上加一。
 * 最高位数字存放在数组的首位， 数组中每个元素只存储单个数字。
 * 你可以假设除了整数 0 之外，这个整数不会以零开头。
 * 示例 1:
 * 输入: [1,2,3]
 * 输出: [1,2,4]
 * 解释: 输入数组表示数字 123。。
 */
public class code2 {
    class Solution {
        /**
         加一：两种情况
         99加一和除了99加一
         **/
        public int[] plusOne(int[] digits) {
            //1，因为个位是末尾的数字。
            for (int i = digits.length - 1; i >= 0; i--) {
                //对末尾数字进行加一
                digits[i]++;
                //看是否有是9有进位
                digits[i] = digits[i] % 10;
                //没有进位的话进行返回
                if (digits[i] != 0) return digits;
            }
            //有进位的话。
            digits = new int[digits.length + 1];
            digits[0] = 1;
            return digits;
        }
    }
}
