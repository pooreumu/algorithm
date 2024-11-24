import sys
from collections import deque



n, k = map(int, sys.stdin.readline().split())

q = deque(i for i in range(1, n + 1))
result = []
while len(q) > 1:
    for _ in range(k - 1):
        q.append(q.popleft())
    result.append(q.popleft())
result.append(q[0])

print('<' + str(result)[1:-1] + '>')
