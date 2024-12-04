import sys
from collections import deque

n = int(sys.stdin.readline())
data_structures = list(map(int, sys.stdin.readline().split()))
l = list(map(int, sys.stdin.readline().split()))
m = int(sys.stdin.readline())
e = list(map(int, sys.stdin.readline().split()))

queue_stack = deque()

for i, data_structure in enumerate(data_structures):
    if data_structure == 0:
        queue_stack.appendleft(l[i])

for el in e:
    queue_stack.append(el)
    print(queue_stack.popleft(), end=" ")
