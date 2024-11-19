a, b = map(int, input().split())

divisor = []
for i in range(a):
    num = i + 1
    if a % num == 0:
        divisor.append(num)

if len(divisor) < b:
    print(0)
else:
    print(divisor[b - 1])
