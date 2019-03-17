# https://www.hackerrank.com/challenges/30-dictionaries-and-maps/problem

import sys

n = int(input())

phonebook = dict()

for _ in range(n):
    name, phone = input().split()
    phonebook[name] = phone

names = sys.stdin.readlines()
for name in names:
    name = name.strip()
    phone = phonebook.get(name, None)

    if phone == None:
        print("Not found")
    else:
        print(name + "=" + phone)
