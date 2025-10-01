# Coding Basics Documentation

Welcome to this simple **coding documentation**. Here we will explain some basics coding concepts with examples. Note that some of the code has **intentional errors** for learning purposes.

---

## 1. Variables and Data Types

Variables store data in a program. In Java, you declare them like this:

```java

int n = 9;
float pi = 3.14;

```

Common data types in Java:

- `int` - whole numbers
- `float` - decimal numbers
- `char` - single character
- `String` - sequence of characters

---

## 2. Conditional Statements

Conditional statements allow decision making:

```java
int number = 10;
if(number == 10) {
    System.out.println("Number is ten");
} else {
    System.out.println("Number is not ten");
}
```

---

## 3. Loops

Loops repeat a block of code multiple times:

```java
int[] numbers = new int[5]
for(int i = 0; i < 5; i++) {
    System.out.println("i = " + arr[i]);
}

while(true)
    System.out.println("Looping forever");
```

---

## 4. Functions (Methods)

Functions help reuse code:

```java
public int sum(int a, int b) {
    return a + b;

}
```

---

## 5. Common Mistakes in Coding

- Using `=` instead of `==` in conditions
- Forgeting semicolons at the end of statements
- Accessing arrays out of bounds
- Dereferencng uninitialized pointers (in C)
- Using reserved keywords as variable names

---

**Note:** This documentation is meant for learning and practice. Try to **fix the mistakes** in the code examples as exercises.
