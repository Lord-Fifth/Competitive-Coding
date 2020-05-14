"""
Write a Python program to take a string as input and count the number of vowels in the string. Your code is expected to print the count value as output.
Count should includes vowels in lower and upper case.
"""

word = input()
vowels = 0

for i in word:
    if(i == 'a' or i == 'e' or i == 'i' or i == 'o' or i == 'u' or i == 'A' or i == 'E' or i == 'I' or i == 'O' or i == 'U'):
        vowels += 1

print(vowels)