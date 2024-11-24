import sys
from collections import deque



n = int(sys.stdin.readline())

q = deque(i for i in range(1, n + 1))

if len(q) == 1:
    print(1)
else:
    while len(q) > 1:
        q.popleft()
        card = q.popleft()
        q.append(card)

    print(q[0])
