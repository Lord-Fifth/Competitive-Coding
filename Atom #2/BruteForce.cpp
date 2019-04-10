#include "vector"
#include "iostream"

using namespace std;

void getPrimes(int n){
    vector<int> primes; // an array of primes initially empty
    bool flag;
    for(int i = 2; i <= n; i++)
    {
        flag = true;
        for(int j = 2; j*j <= i; j++){
            if(i % j == 0){
                flag = false;
                break;
            }
        }
        if(flag)
            primes.push_back(i); // i is added to the array of primes
    }
    
    for(int i = 0; i < primes.size(); i++)
    {
        cout<<primes[i]<<" ";
    }
    cout<<endl;
    
}

int main(){
    int n;
    cin>>n;
    getPrimes(n);
}