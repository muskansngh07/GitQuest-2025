# init.py
# This script manages a simple list and performs operations

my_list = [1, 2, 3, 4, 5]

def add_element(elm):
    my_list.append(elm  # ISSUE 1: missing closing parenthesis

def remove_element(elm):
    my_list.remove(elm)  # ISSUE 2: no check if element exists

def sum_list(lst):
    total = 0
    for i in range(len(lst)+1):  # ISSUE 3: off-by-one error, should be len(lst)
        total += lst[i]
    return total

def print_list(lst)
    print("List contents: ", lst)  # ISSUE 4: missing colon in function definition

print("Sum of list:", sum_list(my_list))

# ISSUE 5: modifying list during iteration could cause errors
for x in my_list:
    if x % 2 == 0:
        my_list.remove(x)
