"""
Write a Python program to take a string as input and count the number of vowels in the string. Your code is expected to print the count value as output.
Count should includes vowels in lower and upper case.
"""

word = input()
vowels = 0

for i in word:
    i = i.lower()
    if i in ("a","e","i","o","u"):
        vowels += 1

print(vowels)

"""
Input

Hello World

Output

3
"""