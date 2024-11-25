import sys
from collections import deque



n = int(sys.stdin.readline())

d = deque()

for _ in range(n):
    data = list(map(int, sys.stdin.readline().split()))
    action = data[0]

    if action == 1:
        d.appendleft(data[1])
    elif action == 2:
        d.append(data[1])
    elif action == 3:
        if len(d) > 0:
            print(d.popleft())
        else:
            print(-1)
    elif action == 4:
        if len(d) > 0:
            print(d.pop())
        else:
            print(-1)
    elif action == 5:
        print(len(d))
    elif action == 6:
        if len(d) == 0:
            print(1)
        else:
            print(0)
    elif action == 7:
        if len(d) > 0:
            print(d[0])
        else:
            print(-1)
    elif action == 8:
        if len(d) > 0:
            print(d[-1])
        else:
            print(-1)
