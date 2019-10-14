#include<bits/stdc++.h>
using namespace std;

bool subarray(long long val, vector<int> a, int N) {
    int c = 0, s;

    for (int i = 0; i < N; i++)
    {
        c = i + 1;
        while (c < N)
        {
            s = a[i];
            for (int j = c; j < N; j++)
            {
                s += a[j];
                if(s == val) {
                    return true;
                }
            }
            c += 1;
        }
        
    }
    
    return false;
}

vector<int> solve(int A0, vector<long long> X, int N, int Q) {
    vector<int> arr(N);
    arr[0] = A0;
    int val;

    for (int i = 1; i < N; i++)
    {
        if(i%2 != 0) {
            val = (3*arr[i-1]) + 1;
            arr[i] = val;
        }
        else {
            val = 2*arr[i-1] + 3*arr[i-2];
            arr[i] = val;            
        }       
    }

    for (int i = 0; i < N; i++)
    {
        cout << arr[i] << " ";
    }
    cout << "\n";

    vector<int> req(Q);
    long long v;

    for (int i = 0; i < Q; i++) {
        v = X[i];

        bool flag = subarray(v,arr,N);
        if(flag)
            req[i] = 1;
        else
            req[i] = 0;
    }

    return req;
    //Return a vector of size Q, such that arr[i]=1 if the query evaluates to the other
}

int main() {
    ios::sync_with_stdio(0);
    cin.tie(0);
    int T;
    cin >> T;
    for (int t_i = 0; t_i < T; t_i++)
    {
        int N;
        cin >> N;
        int A0;
        cin >> A0;
        int Q;
        cin >> Q;
        vector<long long> X(Q);
        for (int i_X = 0; i_X < Q; i_X++)
        {
            cin >> X[i_X];
        }
        /* code */
        vector<int> ans = solve(A0,X,N,Q);
        for (int i = 0; i < ans.size(); i++)
        {
            if(ans[i])
                cout << "true" << endl;
            else
                cout << "false" << endl;
        }
    }   
}