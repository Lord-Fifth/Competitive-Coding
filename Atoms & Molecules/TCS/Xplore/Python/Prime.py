"""
Write a Python code to count how many prime integers are there in a given list of integers.
"""

#!/bin/python3

import math
import os
import random
import re
import sys

# Complete the 'checkCoPrimeExistance' function below.
#
# The function is expected to return an INTEGER.
# The function accepts INTEGER_ARRAY numbers as parameter.
#

def countPrimeNumbers(numbers):
    c = 0
    for i in numbers:
        flag = False
        if(i == 0 or i == 1):
            flag = True
        for j in range(2, i):
            if(i % j == 0):
                flag = True
                break
        if(not flag):
            c += 1
    return c

if __name__ == '__main__':
    numbers=[]
    count=int(input())
    for i in range(count):
        numbers.append(int(input()))
        
    print(countPrimeNumbers(numbers))
        
"""
Input

4
3
5
7
11

Output

4
"""