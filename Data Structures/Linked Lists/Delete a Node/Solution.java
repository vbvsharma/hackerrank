// https://www.hackerrank.com/challenges/delete-a-node-from-a-linked-list/problem

// Complete the deleteNode function below.

/*
 * For your reference:
 *
 * SinglyLinkedListNode {
 *     int data;
 *     SinglyLinkedListNode next;
 * }
 *
 */
static SinglyLinkedListNode deleteNode(SinglyLinkedListNode head, int position) {
    if (position == 0) {
        return head.next;
    }

    SinglyLinkedListNode currentNode = head;
    int currentPosition = 0;

    while (currentPosition < position-1) {
        currentNode = currentNode.next;
        currentPosition++;
    }

    if (currentNode != null && currentNode.next != null) {
        currentNode.next = currentNode.next.next;
    }

    return head;
}