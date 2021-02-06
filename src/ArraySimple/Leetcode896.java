package ArraySimple;

/**
 * 896.单调数列
 * 如果数组是单调递增或单调递减的，那么它是单调的。
 * 如果对于所有 i <= j，A[i] <= A[j]，那么数组 A 是单调递增的。
 * 如果对于所有 i <= j，A[i]> = A[j]，那么数组 A 是单调递减的。
 * 当给定的数组 A 是单调数组时返回 true，否则返回 false。
 */
public class Leetcode896 {

    public boolean isMonotonic(int[] A) {
        int countA=0;
        int countB=0;
        for(int i=0;i<A.length;i++){
            if(i+1<A.length && A[i]<=A[i+1]){
                countA++;
            }
            if(i+1<A.length && A[i]>=A[i+1]){
                countB++;
            }
        }
        if(countA==A.length-1 || countB==A.length-1){
            return true;
        }
        return  false;

    }
}
