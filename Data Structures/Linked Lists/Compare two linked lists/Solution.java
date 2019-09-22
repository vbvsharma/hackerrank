// https://www.hackerrank.com/challenges/compare-two-linked-lists/problem

// Complete the compareLists function below.

/*
 * For your reference:
 *
 * SinglyLinkedListNode {
 *     int data;
 *     SinglyLinkedListNode next;
 * }
 *
 */
static boolean compareLists(SinglyLinkedListNode head1, SinglyLinkedListNode head2) {
    if (head1 == null && head2 == null)    return true;
    if (head1 == null || head2 == null)   return false;
    if (head1.data != head2.data) return false;

    return compareLists(head1.next, head2.next);
}