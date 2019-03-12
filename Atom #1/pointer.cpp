#include <bits/stdc++.h>
using namespace std;

/*
scanf("%d",&n);
int *arr=new int[n];
for(i=0;i<n;i++)
{
    cin<<arr[i];
}
delete [] arr;      //Delete memory back to heap-IMPORTANT to do this during dynamic allocation

*/
 
int main()
{
    int arr1[]={1,2,3,4,5};
    int *arr=new int[5];            //Heap memory is accessed during runtime
    for(int i=0;i<5;i++)
    {
        cin>>arr[i];
    }
    cout<<arr1[0]<<endl;
    cout<<*arr1<<endl;
    cout<<*arr1+4<<endl;
    cout<<arr[0]<<endl;
    cout<<&arr[0]<<endl;
    cout<<*(arr+0)<<endl;
    cout<<(arr+0)<<endl;

    return 0;
}

/*
*ptr =arr[0];
int arr[]={1,2}     //Will print jargon if arr[2] 

int *arr=new int[10];
arr[i] = <get some value>;

Use Dynamic in Competitive Coding
*/