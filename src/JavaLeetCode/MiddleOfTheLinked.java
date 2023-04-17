package JavaLeetCode;

import java.util.ArrayList;

public class MiddleOfTheLinked {
    public ListNode middleNode(ListNode head) {
        ArrayList<ListNode> array = new ArrayList<>();
        int length = 0;
        while(head != null){
            array.add(head);
            head = head.next;
            length++;
        }
        return array.get(length/2);
    }
//    Time Complexity O(n);
//    Space Complexity O(n);
    public static void main(String[] args){
        //create a sample linked list
        ListNode node1 = new ListNode(1);
        ListNode node2 = new ListNode(2);
        ListNode node3 = new ListNode(3);
        ListNode node4 = new ListNode(4);
        ListNode node5 = new ListNode(5);
        ListNode node6 = new ListNode(6);
        ListNode node7 = new ListNode(7);
//        ListNode node8 = new ListNode(8);
        node1.next = node2;
        node2.next = node3;
        node3.next = node4;
        node4.next = node5;
        node5.next = node6;
        node6.next = node7;
//        node7.next = node8;

        MiddleOfTheLinked middleOfTheLinked = new MiddleOfTheLinked();
        ListNode middleNode = middleOfTheLinked.middleNode(node1);
        //print the middle node value
        System.out.println("Middle node: " + middleNode.val);
    }

}


