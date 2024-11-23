import math
import sys

n = int(sys.stdin.readline())

colonnade = []
for _ in range(n):
    colonnade.append(int(sys.stdin.readline()))

interval = []
for i, c in enumerate(colonnade):
    if i == 0:
        continue
    interval.append(c - colonnade[i - 1])

gcd = math.gcd(*interval)
result = 0
for e in interval:
    result += int(e / gcd) - 1

print(result)
