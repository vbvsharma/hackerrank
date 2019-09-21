// https://www.hackerrank.com/challenges/insert-a-node-at-a-specific-position-in-a-linked-list/problem

// Complete the insertNodeAtPosition function below.

/*
 * For your reference:
 *
 * SinglyLinkedListNode {
 *     int data;
 *     SinglyLinkedListNode next;
 * }
 *
 */
static SinglyLinkedListNode insertNodeAtPosition(SinglyLinkedListNode head, int data, int position) {
    SinglyLinkedListNode newNode = new SinglyLinkedListNode(data);

    if (position == 0) {
        newNode.next = head;
        return newNode;
    }

    SinglyLinkedListNode currentNode = head;
    int currentPosition = 0;

    while (currentPosition < position-1) {
        currentNode = currentNode.next;
        currentPosition++;
    }

    newNode.next = currentNode.next;
    currentNode.next = newNode;

    return head;
}