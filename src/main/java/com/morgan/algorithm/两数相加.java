package com.morgan.algorithm;

/**
 * @Description 两数相加
 * @Author Morgan
 * @Date 2021/2/24 11:06
 **/
public class 两数相加 {

    private static class ListNode {
        int val;

        ListNode next;

        ListNode() {
        }

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }

    public static void main(String[] args) {
        ListNode l1 = new ListNode(9);
        ListNode l12 = new ListNode(9);
        ListNode l13 = new ListNode(9);
        ListNode l14 = new ListNode(9);
        ListNode l15 = new ListNode(9);
        ListNode l16 = new ListNode(9);
        ListNode l17 = new ListNode(9);
        l1.next = l12;
        l12.next = l13;
        l13.next = l14;
        l14.next = l15;
        l15.next = l16;
        l16.next = l17;

        ListNode l2 = new ListNode(9);
        ListNode l22 = new ListNode(9);
        ListNode l23 = new ListNode(9);
        ListNode l24 = new ListNode(9);
        l2.next = l22;
        l22.next = l23;
        l23.next = l24;

        ListNode resultNode = addTwoNumbers(l1,l2);
        System.out.println(resultNode);
    }

    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode head = null,tail = null;
        int carry = 0;
        while (l1 != null || l2 !=null){
            int a = l1 !=null ? l1.val : 0;
            int b = l2 !=null ? l2.val : 0;
            int sum = a + b + carry;
            if (head == null){
                head = tail = new ListNode(sum % 10);
            }else {
                tail.next = new ListNode(sum % 10);
                tail = tail.next;
            }
            carry = sum / 10;
            if (l1 != null){
                l1 = l1.next;
            }
            if (l2 != null){
                l2 = l2.next;
            }
        }
        if (carry > 0){
            tail.next = new ListNode(carry);
        }
        return head;
    }
}
