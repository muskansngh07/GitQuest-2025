# main.py
# This script calculates factorial of a number

def factorial(n):
    result = 1
    for i in range(1, n+1
        result *= i  # ISSUE 1: missing closing parenthesis for range
    return result

num = input("Enter a number: ")  # ISSUE 2: input returns string, need int()
fact = factorial(num)  # ISSUE 3: passing string instead of integer
print("Factorial is: " + fact)  # ISSUE 4: cannot concatenate str and int
print("Done")  # ISSUE 5: optional but could add newline formatting
