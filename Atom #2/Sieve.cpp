#include "iostream"
#include "vector"

using namespace std;

void getPrimes(int n){
    vector<bool> numList(n+1,true); // an array of n+1 boolean values, initialized to value true
    vector<int> primes; // an array to hold prime numbers initially empty

    for(int i = 2; i <=n; i++){
        if(numList[i] == true){
            primes.push_back(i);
            for(int j = 2*i; j <= n; j+=i)
                numList[j] = false; // setting all factors of i as false so that they won't be included in the array of primes
        }
    }

    for(int i = 0; i < primes.size(); i++){
        cout<<primes[i]<<" ";
    }
    cout<<endl;
}

int main(){
    int n;
    cin>>n;

    getPrimes(n);

}