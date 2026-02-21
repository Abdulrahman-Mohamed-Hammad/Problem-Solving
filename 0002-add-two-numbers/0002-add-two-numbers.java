import java.math.BigInteger;
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
       BigInteger first = node(l1);
       BigInteger secound = node(l2);
    BigInteger result =first.add(secound);

         
          if(result.equals(BigInteger.ZERO)){
            return new ListNode(0);
         }
    
      return reversetoListNode(result , BigInteger.valueOf(10));
    }
    public BigInteger node(ListNode l1){
        BigInteger values =BigInteger.ZERO;
        BigInteger temp =BigInteger.ONE;
        while(l1  !=null){
           values=BigInteger.valueOf(l1.val).multiply(temp).add(values)  ;
       temp =temp.multiply(BigInteger.valueOf(10));
       l1 = l1.next;
        }
        return values;
    }
     ListNode reversetoListNode(BigInteger val, BigInteger temp){
        if(val.equals(BigInteger.ZERO)){
            return null;
        }

        ListNode varrr = reversetoListNode(val.divide(temp),temp);
        System.out.println(val.remainder(temp));
        return new ListNode(val.remainder(temp).intValue(), varrr);

    }
}