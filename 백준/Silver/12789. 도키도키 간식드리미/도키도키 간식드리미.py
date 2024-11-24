import sys
from collections import deque



n = int(sys.stdin.readline())
data = deque(map(int, sys.stdin.readline().split()))

side_street = deque()
goal = 1

i = 0
while i < len(data):
    current_student = data[i]
    if goal == current_student:
        goal += 1
    elif len(side_street) > 0 and goal == side_street[0]:
        side_street.popleft()
        goal += 1
        i -= 1
    else:
        side_street.appendleft(current_student)
    i += 1

result = 'Nice'
for current_student in side_street:
    if goal == current_student:
        goal += 1
    else:
        result = 'Sad'

print(result)
