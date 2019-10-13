#include<bits/stdc++.h>
using namespace std;

int solve(vector<vector<int>> A, int N,int M) {
    int half = M/2;
    int sum1 = 0, sum2 = 0, count = 0;
    int max;

    for (int i_A = 0; i_A < N; i_A++)
    {   max = 0;
        if(count%2 == 0) {
            for (int j_A = 0; j_A < half; j_A++)
            {
                if(max <= A[i_A][j_A]) {
                    max = A[i_A][j_A];
                }                        
            }
            sum1 += max;
            count++;
        }
        else
        {
            for (int j_A = half; j_A < M; j_A++)
            {
                if(max <= A[i_A][j_A]) {
                    max = A[i_A][j_A];
                }                        
            }
            sum1 += max;
            count++;
        }          
    }

    count = 1;
    for (int i_A = 0; i_A < N; i_A++)
    {   max = 0;
        if(count%2 == 0) {
            for (int j_A = 0; j_A < half; j_A++)
            {
                if(max <= A[i_A][j_A]) {
                    max = A[i_A][j_A];
                }                        
            }
            sum2 += max;
            count++;
        }
        else {
            for (int j_A = half; j_A < M; j_A++) 
            {
                if(max <= A[i_A][j_A]) {
                    max = A[i_A][j_A];
                }                        
            }
            sum2 += max;
            count++;
        }          
    }

    //std::cout << sum1 << " " << sum2 << std::endl;

    if(sum1 > sum2)
        return sum1;
    else
        return sum2;
}

int main() {
    ios::sync_with_stdio(0);
    cin.tie(0);
    int T;
    cin >> T;
    int c;
    if(T>=1 && T<=100) {
        for (int t_i = 0; t_i < T; t_i++)
        {   c=0;
            int N;
            cin >> N;
            int M;
            cin >> M;
            if(N>=1 && N<=500 && M>=1 && M<=500 && M%2==0) {
                vector<vector<int>> A(N, vector<int>(M));
                for (int i_A = 0; i_A < N; i_A++)
                {
                    for (int j_A = 0; j_A < M; j_A++)
                    {
                        cin >> A[i_A][j_A];
                        if(!(A[i_A][j_A]>=1 && A[i_A][j_A]<=1000000)) {
                            c++;
                            break;
                        }
                    }
                    if(c!=0)
                        break;
                }
                if(c==0) {
                    int out_;
                    out_ = solve(A,N,M);
                    cout << out_;
                    cout << "\n";
                }
                else
                    cout << "Invalid entry";                    
            }
            else
                cout << "Invalid entry";
        }
    }
    else
        cout << "Invalid entry";   
}

/*
1
4 4
10 15 2 5
20 4 14 12   
10 11 10 2
2 3 4 5
45 38
45
*/