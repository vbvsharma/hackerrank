// https://www.hackerrank.com/challenges/c-tutorial-strings/problem

#include <iostream>
#include <string>
using namespace std;

int main() {
    string a, b;
    cin >> a >> b;

    cout << a.size() << " " << b.size() << '\n';
    cout << a + b << '\n';

    // swap first characters of both strings
    char t = a[0];
    a[0] = b[0];
    b[0] = t;
    cout << a << " " << b << '\n';

    return 0;
}

