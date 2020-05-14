"""
Write a Python code as per the below guidelines which will calculate the percentage and grade of a student based on the percentage of marks.

Define a class Student with attributes roll number (roll), student name (name) and a list which stores the marks scored by the students (marks_list).
Provide following methods to the class:

1. calculate_percentage(): This method will calculate the percentage of the student on the basis of the marks obtained by him/her and return the percentage value.
Percentage Calculation:
Percentage = Sum of all the marks/Number of subjects

2. find_grade(): This method will find the grade of the student on the basis of the percentage acquired by the student. The method returns the grade of the student.
The criteria for grade calculation:

i. If percentage of marks is greater than or equal to 80, grade is 'A'.
ii. If percentage of marks is greater than or equal to 60 but less than 80, grade is 'B'.
iii. If percentage of marks is greater than or equal to 40 but less than 60, grade is 'C'.
iv. If percentage of marks is less than 40, grade is 'F'.
"""

#!/bin/python3

import math
import os
import random
import re
import sys


class Student:
    def __init__(self,roll,name,marks_list):
        self.roll=roll
        self.name=name
        self.marks_list=marks_list
        self.percentage=0
    
    def calculate_percentage(self):
        s=sum(self.marks_list)
        n=len(self.marks_list)
        p=s//n
        self.percentage=p
        return p

    def find_grade(self):
        p=self.percentage
        if(p>=80):
            g='A'
        elif(p>=60):
            g='B'
        elif(p>=40):
            g='C'
        else:
            g='F'
        return g
    
if __name__ == '__main__':
    roll=int(input())
    name=input()
    count=int(input())
    marks=[]
    for i in range(count):
        marks.append(int(input()))
    s=Student(roll,name,marks)
    print(s.calculate_percentage())
    print(s.find_grade())

"""
Input

123
Rahul
3
80
70
80

Output

76
B
"""