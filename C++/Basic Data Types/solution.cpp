// https://www.hackerrank.com/challenges/c-tutorial-basic-data-types/problem

#include <iostream>
#include <iomanip>
using namespace std;

int main() {
    int input_int;
    long input_long;
    char input_char;
    float input_float;
    double input_double;

    cin >> input_int >> input_long >> input_char >> input_float >> input_double;
    
    cout << input_int << '\n' << input_long  << '\n' << input_char << '\n';
    cout << std::fixed << std::setprecision(3) << input_float << '\n';
    cout << std::fixed << std::setprecision(9) << input_double << '\n';
                                     
    return 0;
}