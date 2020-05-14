"""
Write a Python program as per the below prototype to fulfill the below requirements:
a. Which will add an employee to the organization based on the count
b. Display the Employee age, whose ID is given in the input
c. Display the count of employees, who is older than the given age as input

Prototype:
Define a class Employee with attributes name, id, age and gender
Define a class Organization with attributes to have a name for the organization and a list to store list of employees.

Provide following methods to the class:
1. addEmployee(): This method will take name, id, age and gender of the employee as the input arguments in the order - name, id, age and gender, create the employee object and add it to the employee list available with the oragnisation.

2. getEmployeeCount(): This method will return the number of employees that are currently there in the list of employees available with the organisation.

3. findEmployeeAge(): This method takes id as an input argument and return the age of the employee if there is an employee having that id in the list, otherwise will return -1.

4. countEmployees(): This method will take age as an input argument and will return the count of employees in the employee list who are older than the given age.
"""

#!/bin/python3

import math
import os
import random
import re
import sys


class Employee:
    def __init__(self,name,id,age,gender):
        self.name = name
        self.id = id
        self.age = age
        self.gender = gender
        
class Organisation:
    def __init__(self,org_name,emp_list):
        self.org_name = org_name
        self.emp_list=emp_list

    def addEmployee(self,name,id,age,gender):
        s=Employee(name,id,age,gender)
        self.emp_list.append(s)

    def getEmployeeCount(self):
        return len(self.emp_list)

    def findEmployeeAge(self,req_id):
        for i in self.emp_list:
            if(i.id == req_id):
                return i.age
        return -1

    def countEmployees(self,req_age):
        c = 0
        for i in self.emp_list:
            if(i.age > req_age):
                c += 1
        return c
    
if __name__ == '__main__':
    employees=[]
    o = Organisation('XYZ',employees)
    n=int(input())
    for i in range(n):
        name=input()
        id=int(input())
        age=int(input())
        gender=input()
        o.addEmployee(name,id,age,gender)

    id=int(input())
    age=int(input())
    print(o.getEmployeeCount())
    print(o.findEmployeeAge(id))
    print(o.countEmployees(age))

"""
Input

2
'A' 
1
30
'M'
'B'
2
40
'F'
2
30

Output

2
40
1
"""