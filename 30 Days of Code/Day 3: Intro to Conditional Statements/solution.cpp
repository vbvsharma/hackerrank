#include <bits/stdc++.h>

using namespace std;

int main()
{
    int N;
    cin >> N;
    cin.ignore(numeric_limits<streamsize>::max(), '\n');

    if (N % 2 == 1) {
        cout << "Weird\n";
    } else if ((2 <= N && N <= 5) || (N > 20)) {
        cout << "Not Weird\n";
    } else {
        cout << "Weird\n";
    }

    return 0;
}
