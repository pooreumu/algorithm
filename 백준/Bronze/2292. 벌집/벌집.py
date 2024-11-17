n = int(input())
x = 6
location = 1
distance = 1

while location < n:
    location += x
    x += 6
    distance += 1

print(distance)
