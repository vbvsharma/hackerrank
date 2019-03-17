# https://www.hackerrank.com/challenges/python-lists/problem

if __name__ == '__main__':
    N = int(input())

    l = []
    for _ in range(N):
        command, *line = input().split()

        if command == 'insert':
            i = int(line[0])
            e = int(line[1])
            l.insert(i, e)
        elif command == 'print':
            print(l)
        elif command == 'remove':
            e = int(line[0])
            l.remove(e)
        elif command == 'append':
            e = int(line[0])
            l.append(e)
        elif command == 'sort':
            l.sort()
        elif command == 'pop':
            l.pop()
        elif command == 'reverse':
            l.reverse()