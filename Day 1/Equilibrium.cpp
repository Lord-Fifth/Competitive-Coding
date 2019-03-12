// C++ program to find equilibrium index of an array 
#include <bits/stdc++.h> 
using namespace std; 
  
int equilibrium(int arr[], int n) 
{ 
    int i, j; 
    int leftsum, rightsum; 
  
    //Check for indexes one by one until an equilibrium index is found
    for (i = 0; i < n; ++i)  
    {      
  
        //Get left sum
        leftsum = 0;  
        for (j = 0; j < i; j++) 
            leftsum += arr[j]; 
  
        //Get right sum
        rightsum = 0;  
        for (j = i + 1; j < n; j++) 
            rightsum += arr[j]; 
  
        //If leftsum and rightsum are same, then we are got it
        if (leftsum == rightsum) 
            return i; 
    } 
  
    //Return -1 if no equilibrium index is found
    return -1; 
} 
  
int main() 
   {   
    int arr[] = { -7, 1, 5, 2, -4, 3, 0 }; 
    int arr_size = sizeof(arr) / sizeof(arr[0]); 
    cout << equilibrium(arr, arr_size); 
    return 0; 
   } 

/* Method 1 (Simple but inefficient)
Use two loops. 
Outer loop iterates through all the element and inner loop finds out whether the current index picked by the outer loop is equilibrium index or not. 
Time complexity of this solution is O(n^2).*/