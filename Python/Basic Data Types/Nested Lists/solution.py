# https://www.hackerrank.com/challenges/nested-list/problem

if __name__ == '__main__':
    
    students = []
    
    for _ in range(int(input())):
        name = input()
        score = float(input())

        students.append([name, score])
    
    lowest_score = 100000000.0
    second_lowest_score = 100000000.0

    for student in students:
        score = student[1]

        if score < lowest_score:
            second_lowest_score = lowest_score
            lowest_score = score
        elif lowest_score < score and score < second_lowest_score:
            second_lowest_score = score
    
    second_lowest_scorers = []
    for student in students:
        name = student[0]
        score = student[1]

        if (score == second_lowest_score):
            second_lowest_scorers.append(name)
    
    for name in sorted(second_lowest_scorers):
        print(name)