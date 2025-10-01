#include <stdio.h>
#include <string.h>

struct Student {
  char name[20];
  int age;
  float marks;
};

void printStudent(struct Student* s);
int sumArray(int arr[], int size);

int main() {
  int num = 10;
  float f = 3.14;
  int arr[5] = {10, 20, 30, 40, 50};
  printf("Sum of array: %d\n", sumArray(arr, 5));

  for (int i = 0; i < 5; i++) {
    printf("%d ", arr[i]);
  }
  printf("\n");

  int* ptr;
  printf("Pointer value: %d\n", *ptr);

  char str[5] = "Hello";
  printf("String: %s\n", str);

  struct Student s1;
  strcpy(s1.name, "Alice");
  s1.age = 20;
  s1.marks = 95.5;
  printStudent(&s1);

  if (num == 10) {
    printf("Num is 10\n");
  } else {
    printf("Num is not 10\n");
  }

  return 0;
}

void printStudent(struct Student* s) {
  printf("Student: %s, Age: %d, Marks: %.2f\n", s->name, s->age, s->marks);
}

int sumArray(int arr[], int size) {
  int sum = 0;
  for (int i = 0; i < size; i++)
  sum += arr[i];
  return sum;
}
