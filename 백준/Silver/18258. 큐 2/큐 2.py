import sys
from collections import deque



n = int(sys.stdin.readline())

q = deque()
for _ in range(n):
    data = list(map(str, sys.stdin.readline().split()))
    action = data[0]
    if action == 'push':
        q.append(data[1])
    elif action == 'pop':
        if len(q) > 0:
            print(q.popleft())
        else:
            print(-1)
    elif action == 'size':
        print(len(q))
    elif action == 'empty':
        if len(q) == 0:
            print(1)
        else:
            print(0)
    elif action == 'front':
        if len(q) > 0:
            print(q[0])
        else:
            print(-1)
    elif action == 'back':
        if len(q) > 0:
            print(q[-1])
        else:
            print(-1)
