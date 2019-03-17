// https://www.hackerrank.com/challenges/30-dictionaries-and-maps/problem

#include <cmath>
#include <cstdio>
#include <vector>
#include <iostream>
#include <algorithm>
#include <map>
using namespace std;


int main() {
    int n;
    cin >> n;

    map<string, int> phonebook;
    while (n--) {
        string name;
        int phone;
        cin >> name >> phone;

        phonebook[name] = phone;
    }

    string name;
    while (cin >> name) {
        if (phonebook.find(name) == phonebook.end()) {
            cout << "Not found\n";
        } else {
            cout << name << "=" << phonebook[name] << "\n";
        }
    }
    return 0;
}
