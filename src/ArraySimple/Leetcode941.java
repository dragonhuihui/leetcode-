package ArraySimple;

/**
 * 题目
 * 给定一个整数数组 A，如果它是有效的山脉数组就返回 true，否则返回 false。
 *
 * 让我们回顾一下，如果 A 满足下述条件，那么它是一个山脉数组：
 *
 * A.length >= 3
 * 在 0 < i < A.length - 1 条件下，存在 i 使得：
 * A[0] < A[1] < ... A[i-1] < A[i]
 * A[i] > A[i+1] > ... > A[A.length - 1]
 *
 * 题解：所谓山脉数组就是先升后降的数组。
 */
public class Leetcode941 {
    public static boolean validMountainArray(int[] arr) {
        int n=arr.length;
        int i=0;
        //i+1 防止到最后，这个是把上升的走完
        while(i+1<n && arr[i]<arr[i+1]){
            i++;
        }
        //非法性，当最大值等于n-1的话，那么就是不对的。
        if(i==0 || i==n-1){
            return false;
        }
        //再继续遍历，遍历的数字，
        while(i+1<n && arr[i]>arr[i+1]){
            i++;
        }
        return i==n-1;
    }
    /**
     * 特别注意：这个计数是i,因为要不断移动数组的下标进行比较不能使普通count用来计数。
     * 1.先遍历走完上升，注意遍历的时候的i+1数组越界
     * 2.判断是否一直都是上升
     * 3.再继续遍历是否向下并且也要注意i+1数组越界。
     */


}
