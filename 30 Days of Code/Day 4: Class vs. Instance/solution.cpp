using namespace std;
#include <iostream>

class Person {
  public:
    int age;
    Person(int initialAge);
    void amIOld();
    void yearPasses();
};

Person::Person(int initialAge) {
    // Add some more code to run some checks on initialAge
    if (initialAge < 0) {
        cout << "Age is not valid, setting age to 0.\n";
        age = 0;
    } else {
        age = initialAge;
    }
}

void Person::amIOld()
{
    // Do some computations in here and print out the correct statement to the console
    string message = "You are young.";

    if (13 <= this->age && this->age < 18) {
        message = "You are a teenager.";
    } else if (18 <= this->age) {
        message = "You are old.";
    }

    cout << message << "\n";
}

void Person::yearPasses() {
    // Increment the age of the person in here
    this->age++;
}

int main() {
    int t;
    int age;
    cin >> t;
    for (int i = 0; i < t; i++) {
        cin >> age;
        Person p(age);
        p.amIOld();
        for (int j = 0; j < 3; j++) {
            p.yearPasses();
        }
        p.amIOld();

        cout << '\n';
    }

    return 0;
}