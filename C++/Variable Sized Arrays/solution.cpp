// https://www.hackerrank.com/challenges/variable-sized-arrays/problem

#include <cmath>
#include <cstdio>
#include <vector>
#include <iostream>
#include <algorithm>
using namespace std;


int main() {
    int n, q;
    cin >> n >> q;

    vector<vector<int>> a(n);
    for (int i = 0; i < n; i++) {
        int k;
        cin >> k;
        
        for (int j = 0; j < k; j++) {
            int x;
            cin >> x;

            a[i].push_back(x);
        }
    }

    while (q--) {
        int i, j;
        cin >> i >> j;
        cout << a[i][j] << '\n';
    }

    return 0;
}