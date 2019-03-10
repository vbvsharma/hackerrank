// https://www.hackerrank.com/challenges/attribute-parser/problem

#include <algorithm>
#include <cmath>
#include <cstdio>
#include <iostream>
#include <string>
#include <vector>
#include <map>
using namespace std;

string get_open_tag(string str) {
    int start = 1;
    int end1 = str.find(">");
    int end2 = str.find(" ");
    int end = (end1 < end2 || end2 == -1) ? end1 : end2;
    end--;
    return str.substr(start, end - start + 1);
}

string get_close_tag(string str) {
    int start = str.find("/");
    start++;
    int end = str.find(">");
    end--;
    return str.substr(start, end - start + 1);
}

map<string, string> create_map(int N) {
    map<string, string> m;
    vector<string> tags;
    string line;
    for (int i = 0; i < N; i++) {
        getline(cin, line);
        if (line[0] == '<' && line[1] == '/') {
            string close_tag = get_close_tag(line);
            if (tags.size() > 0 && tags[tags.size()-1] == close_tag) {
                tags.pop_back();
            }
        } else {
                string open_tag = get_open_tag(line);
                tags.push_back(open_tag);

                string prepend = "";
                if (!tags.empty()) {
                    prepend = tags[0];
                    for (int i = 1; i < tags.size(); i++) {
                        prepend += "." + tags[i];
                    }
                }

                int start_index = line.find(" ");
                
                if (start_index == string::npos)    continue; // no attributes

                while (start_index+1 < line.size() && line.find(" ", start_index+1) != string::npos) {
                    int end_index = line.find(" ", start_index+1);
                    string attribute = line.substr(start_index+1, end_index - start_index - 1);
                    start_index = end_index + 1;
                    start_index = line.find("\"", start_index);
                    start_index++;
                    end_index = line.find("\"", start_index);

                    string value = line.substr(start_index, end_index-start_index);

                    m[prepend + "~" + attribute] = value;

                    start_index = end_index+1;
                }
            }
    }

    return m;
}

int main()
{
    int N, Q;
    cin >> N >> Q;
    cin.ignore();

    map<string, string> m = create_map(N);

    while (Q--)
    {
        string query;
        cin >> query;

        if (m.find(query) != m.end()) {
            cout << m[query] << "\n";
        } else {
            cout << "Not Found!\n";
        }
    }
    return 0;
}
