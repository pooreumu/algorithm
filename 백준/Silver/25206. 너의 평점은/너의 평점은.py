Score = {
    'A+': 4.5,
    'A0': 4.0,
    'B+': 3.5,
    'B0': 3.0,
    'C+': 2.5,
    'C0': 2.0,
    'D+': 1.5,
    'D0': 1.0,
    'F': 0.0
}

sumOfScore = 0.0
sumOfGrade = 0.0

for i in range(20):
    data = list(map(str, input().split()))
    grade = data[1]
    score = data[2]
    if score == 'P':
        continue
    sumOfGrade += float(grade)
    sumOfScore += float(grade) * Score[score]

print(sumOfScore / sumOfGrade)
