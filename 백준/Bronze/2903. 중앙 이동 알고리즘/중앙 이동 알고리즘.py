n = int(input())

edge = 2

for i in range(n):
    edge += edge - 1

print(edge ** 2)
