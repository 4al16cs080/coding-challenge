import java.util.Stack;
class Node {
int data;
Node next;
Node(int i)
{
this.data = i;
this.next = null;
}
};
class Main
{
// Function to determine if a given linked list is palindrome or not
public static boolean isPalindrome(Node head)
{
// construct an empty stack
Stack s = new Stack<>();
// push all elements of the linked list into the stack
Node node = head;
while (node != null) {
s.push(node.data);
node = node.next;
}
// traverse the linked list again
node = head;
while (node != null)
{
// pop the top element from the stack
int top = s.pop();
// compare the popped element with current node's data
// return false if mismatch happens
if (top != node.data) {
return false;
}
// advance to the next node
node = node.next;
}

