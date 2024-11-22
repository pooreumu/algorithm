import sys

n = int(sys.stdin.readline())

max_num = 0

arr = [0] * 10001

for _ in range(n):
    num = int(sys.stdin.readline())
    max_num = max(max_num, num)
    arr[num] += 1

for i in range(1, max_num + 1):
    for _ in range(arr[i]):
        print(i)
