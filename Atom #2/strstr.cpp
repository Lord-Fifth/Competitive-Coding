#include<iostream>
#include<cstdlib>
 
using namespace std;
 
int main()
{
    int i,j,temp;
    char haystack[100]={"This is a pattern matching"};
    char needle[20]={"pattern"};
 
    for(i=0;haystack[i]!='\0';i++)
    {
        j=0;
        if(haystack[i]==needle[j])
        {
            temp=i+1;
            while(haystack[i]==needle[j])
            {
                i++;
                j++;
            }
 
            if(needle[j]=='\0')
            {
                cout<<"The substring is present in given string at position "<<temp<<"\n";
                exit(0);
            }
            else
            {
                i=temp;
                temp=0;
            }
        }
    }
 
    if(temp==0)
        cout<<"The substring is not present in given string\n";
 
    return 0;
}