package ArraySimple;

import java.util.TreeSet;

/**
 * 414. 第三大的数
 * 给你一个非空数组，返回此数组中 第三大的数 。如果不存在，则返回数组中最大的数。
 */
public class Leetcode414 {
    public int thirdMax(int[] nums) {
        //1.非法性判断
        if(nums.length==0) return 0;
        //2.使用一个可以排序的集合进行存储
        TreeSet<Integer> treeSet=new TreeSet<>();
        for(int i=0;i<nums.length;i++){
            treeSet.add(nums[i]);
            if(treeSet.size()>3){
                treeSet.remove(treeSet.first());
            }
        }
        if(treeSet.size()<3){
            return treeSet.last();
        }else{
            return treeSet.first();
        }
    }
    /**
     * 1.使用treeset 有序
     * 2.如果输入的数据size大于3移除treeset.first
     * 3.最后size大于3，如果小于的取last 否则取first
     */
}
