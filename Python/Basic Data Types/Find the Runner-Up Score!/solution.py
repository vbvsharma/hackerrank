# https://www.hackerrank.com/challenges/find-second-maximum-number-in-a-list/problem

if __name__ == '__main__':
    n = int(input())
    arr = map(int, input().split())

    max_score = -200
    runner_up_score = -200

    for a in arr:
        if max_score < a:
            runner_up_score = max_score
            max_score = a
        elif a < max_score and runner_up_score < a:
            runner_up_score = a
    
    print(runner_up_score)