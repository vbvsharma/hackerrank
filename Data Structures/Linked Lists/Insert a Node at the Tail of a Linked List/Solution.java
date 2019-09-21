// https://www.hackerrank.com/challenges/insert-a-node-at-the-tail-of-a-linked-list/problem?h_r=next-challenge&h_v=zen

// Complete the insertNodeAtTail function below.

/*
 * For your reference:
 *
 * SinglyLinkedListNode {
 *     int data;
 *     SinglyLinkedListNode next;
 * }
 *
 */
static SinglyLinkedListNode insertNodeAtTail(SinglyLinkedListNode head, int data) {
    SinglyLinkedListNode newNode = new SinglyLinkedListNode(data);

    if (head == null) {
        return newNode;
    }

    SinglyLinkedListNode currentNode = head;

    while (currentNode.next != null) {
        currentNode = currentNode.next;
    }

    currentNode.next = newNode;

    return head;
}