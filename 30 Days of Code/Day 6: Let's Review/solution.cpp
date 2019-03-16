#include <cmath>
#include <cstdio>
#include <vector>
#include <iostream>
#include <algorithm>
using namespace std;


int main() {
    /* Enter your code here. Read input from STDIN. Print output to STDOUT */
    int T;
    cin >> T;
    cin.ignore();

    while (T--) {
        string s;
        getline(cin, s);

        string even = "";
        string odd = "";

        for (int i = 0; i < s.size(); i++) {
            if (i % 2 == 0)     even += s[i];
            else                odd += s[i];
        }

        cout << even << " " << odd << "\n";
    }
    return 0;
}
