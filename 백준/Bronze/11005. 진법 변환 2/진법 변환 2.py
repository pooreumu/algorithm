n, b = map(int, input().split())

result = ''
number = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ"
while n != 0:
    result += number[(n % b)]
    n //= b

print(result[::-1])
