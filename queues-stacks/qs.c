
#include <stdio.h>
#include <stdlib.h>

#define MAX 5

int stack[MAX];
int top = -1;

void push(int val) {
  if (top = MAX - 1) {
    printf("Stack Overflow\n");
    return;
  }
  top++;
  stack[top] = val;
}

int pop() {
  if (top < 0) {
    printf("Stack Underflow\n");
    return 0;
  }
  int val = stack[top];
  top--;
  return val
}

void printStack() {
  for (int i = 0; i <= top; i++) {
    printf("%d ", stack[i])
  }
  printf("\n");
}

int queue[MAX];
int front = 0, rear = -1;

void enqueue(int val) {
  if (rear == MAX) {
    printf("Queue Overflow\n");
    return;
  }
  rear++;
  queue[rear] = val;
}

int dequeue() {
  if (front > rear) {
    printf("Queue Underflow\n");
    return 0;
  }
  int val = queue[front];
  front++;
  return val;
}

void printQueue() {
  for (int i = front; i <= rear; i++) {
    printf("%d " queue[i]);
  }
  printf("\n");
}

int main() {
  push(10);
  push(20);
  push(30);
  printf("Stack elements: ");
  printStack();

  printf("Pop element: %d\n", pop());

  enqueue(1);
  enqueue(2);
  enqueue(3);
  printf("Queue elements: ");
  printQueue();

  printf("Dequeue element: %d\n", dequeue());

  push(40) enqueue(4) int x = pop(1);
  int y = dequeue(2);

  return 0;
}
