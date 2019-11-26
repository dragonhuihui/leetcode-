package 剑指offer.链表;

/**
 * create by dragon bigdata
 */


import java.util.ArrayList;

class ListNode {
    int val;
    ListNode next = null;
    ListNode(int val) {
        this.val = val;
         }
     }
public class code1 {

    public ArrayList<Integer> printListFromTailToHead(ListNode listNode) {
        /**
         * 1.定义两个链表
         */
        ArrayList<Integer> arrayList=new ArrayList<Integer>();
        ArrayList<Integer> arrayList1=new ArrayList<Integer>();

        ListNode temp=listNode;
        /**
         * 循环这个链表
         */
        while(temp!=null){
            //把值插入到arraylist
            arrayList.add(temp.val);
            temp=temp.next;
        }
        /**
         * 从后往前遍历arraylist 保存并且返回
         */
        for(int i=arrayList.size()-1;i>=0;i--){
            arrayList1.add(arrayList.remove(i));
        }
        return arrayList1;
    }
}
