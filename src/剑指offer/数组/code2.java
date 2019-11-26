package 剑指offer.数组;

/**
 * 题目描述
 * 在一个二维数组中（每个一维数组的长度相同），每一行都按照从左到右递增的顺序排序，
 * 每一列都按照从上到下递增的顺序排序。请完成一个函数，输入这样的一个二维数组和一个整数，
 * 判断数组中是否含有该整数。
 */
public class code2 {
    public boolean find(int[][] numbers,int target){

        //1.定义行和列
        int rows=numbers.length;
        int cols=numbers[0].length;
        int col;
        int row;
        //2.从右上开始
        for(row=0,col=cols-1;row<rows && col>=0;){

            //3.判断是大于还是等于小于还是等于
            if(numbers[row][col]==target){
                 return true;
            }
            //
            if(numbers[row][col]>target){
                col--;
                continue;
            }
            if(numbers[row][col]<target){
                row++;
                continue;
            }

        }
        //4.如果没有找的话
        return  false;
    }
}
