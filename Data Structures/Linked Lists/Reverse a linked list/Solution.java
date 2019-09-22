// https://www.hackerrank.com/challenges/reverse-a-linked-list/problem

// Complete the reverse function below.

/*
 * For your reference:
 *
 * SinglyLinkedListNode {
 *     int data;
 *     SinglyLinkedListNode next;
 * }
 *
 */
static SinglyLinkedListNode reverse(SinglyLinkedListNode head) {
    if (head == null)       return null;
    if (head.next == null)  return head;

    SinglyLinkedListNode prev = null;
    SinglyLinkedListNode curr = head;
    SinglyLinkedListNode next = curr.next;

    while (curr != null) {
        next = curr.next;
        curr.next = prev;
        prev = curr;
        curr = next;
    }

    return prev;
}