import java.security.cert.X509Certificate;

public class Code06_ReverseList {

     public static class Node {
         public int value;
         public Node next;

         public Node(int data) {
             this.value=data;
         }
     }

     public static class DoubleNode {
         public int value;
         public DoubleNode last;
         public DoubleNode next;

         public DoubleNode(int data) {
             this.value=data;
         }
     }

    /**
     * 单链表反转
     * @param head
     * @return
     */
     public static Node reverseLinkedList(Node head) {
         Node pre = null;
         Node next = null;
          while (head != null) {
              next = head.next;
              head.next = pre;
              pre = head;
              head = next;
          }
          return pre;
     }

    /**
     * 双链表反转
     * @param head
     * @return
     */

     public static DoubleNode reverseTwoLinkedList(DoubleNode head) {
         DoubleNode pre = null;
         DoubleNode next = null;
          while (head!=null) {
              next = head.next;
              head.next = pre;
              head.last = next;
              pre = head;
              head = next;
          }
          return pre;
     }

    /**
     * 单链表给定某个值删除
     */

    public static Node deleteLinkedListToOne(Node head,int num) {
        while (head != null) {
            if (head.value != num) {
                break;
            }
            head = head.next;
        }
        Node pre = head;
        Node cur = head;
        while (cur != null) {
            if (cur.value == num) {
                pre.next = cur.next;
            }else{
                pre = cur;
            }
            cur = cur.next;
        }
        return head;
    }
}
