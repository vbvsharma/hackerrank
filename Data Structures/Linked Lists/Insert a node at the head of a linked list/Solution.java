// https://www.hackerrank.com/challenges/insert-a-node-at-the-head-of-a-linked-list/problem

// Complete the insertNodeAtHead function below.

/*
 * For your reference:
 *
 * SinglyLinkedListNode {
 *     int data;
 *     SinglyLinkedListNode next;
 * }
 *
 */
static SinglyLinkedListNode insertNodeAtHead(SinglyLinkedListNode llist, int data) {
    SinglyLinkedListNode newNode = new SinglyLinkedListNode(data);

    newNode.next = llist;

    return newNode;
}