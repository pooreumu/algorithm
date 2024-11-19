n = int(input())
number = 2

if n != 1:
    while number <= n:
        if n % number == 0:
            print(number)
            n /= number
        else:
            number += 1
