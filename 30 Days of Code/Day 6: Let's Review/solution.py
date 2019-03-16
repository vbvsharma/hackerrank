# Enter your code here. Read input from STDIN. Print output to STDOUT
T = int(input())

while T > 0:
    s = input()

    even = ""
    odd = ""

    for i in range(len(s)):
        if i % 2 == 0:
            even += s[i]
        else:
            odd += s[i]
    
    print(even, odd)
    T = T - 1