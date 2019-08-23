/* 206. Reverse Linked List
Reverse a singly linked list.

Example:

Input: 1->2->3->4->5->NULL
Output: 5->4->3->2->1->NULL

Follow up:

A linked list can be reversed either iteratively or recursively. Could you implement both?

*/

#include <iostream>
#include <vector>
using namespace std;

// Data Structure to store a linked list node
struct Node
{
	int data;
	Node* next;
};

// Helper function to print given linked list
void printList(Node* head)
{
	Node* ptr = head;
	while (ptr)
	{
		cout << ptr->data << " -> ";
		ptr = ptr->next;
	}

	cout << "nullptr" << '\n';
}

// Helper function to insert new Node in the beginning of the linked list
void push(Node* &headRef, int data)
{
	Node* newNode = new Node();
	newNode->data = data;
	newNode->next = headRef;

	headRef = newNode;
}

// Recursive function to reverse the given linked list. It reverses the
// given linked list by fixing the head pointer first and then .next
// pointers of very node in reverse order
void recursiveReverse(Node* head, Node* &headRef)
{
	Node* first;
	Node* rest;

	// empty list base case
	if (head == nullptr)
	   return;

	first = head;		  // suppose first = {1, 2, 3}
	rest = first->next;	// rest = {2, 3}

	// base case: List has only one node
	if (rest == nullptr)
	{
		// fix the head pointer here
		headRef = first;
		 return;
	}

	// Recursively reverse the smaller {2, 3} case
	// after: rest = {3, 2}
	recursiveReverse(rest, headRef);

	// put the first elem on the end of the list
	rest->next = first;
	first->next = nullptr;	// (tricky step -- make a drawing)
}

// Reverse the given linked list. The function takes a pointer
// (reference) to the head pointer
void reverse(Node* &headRef)
{
	recursiveReverse(headRef, headRef);
}

// Reverse linked list using Recursion
int main()
{
	// input keys
	vector<int> keys = { 1, 2, 3, 4, 5, 6 };

	Node *head = nullptr;
	for (int i = keys.size() - 1; i >=0; i--)
		push(head, keys[i]);

	reverse(head);
	printList(head);

	return 0;
}