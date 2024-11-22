import sys

n, m = map(int, sys.stdin.readline().split())

s = {}
for _ in range(n):
    s[str(sys.stdin.readline())] = True

result = 0
for _ in range(m):
    if str(sys.stdin.readline()) in s:
        result += 1

print(result)
