white_paper = [[0] * 100 for _ in range(100)]

n = int(input())
for i in range(n):
    a, b = map(int, input().split())
    for x in range(a, a + 10):
        for y in range(b, b + 10):
            white_paper[x][y] = 1

result = sum(i.count(1) for i in white_paper)
print(result)