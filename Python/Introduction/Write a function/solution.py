# https://www.hackerrank.com/challenges/write-a-function/problem

def is_leap(year):
    leap = False
    
    # Write your logic here
    leap = (year % 4 == 0 and year % 100 != 0) or year % 400 == 0
    
    return leap

year = int(input())
print(is_leap(year))