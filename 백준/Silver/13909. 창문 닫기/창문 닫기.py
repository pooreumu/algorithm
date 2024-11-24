import sys



n = int(sys.stdin.readline())

count = 1
while count ** 2 <= n:
    count += 1

print(count - 1)
