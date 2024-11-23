import sys


n = int(sys.stdin.readline())


def is_prime(num):
    if num < 2:
        return False

    for i in range(2, int(num ** (1 / 2)) + 1):
        if num % i == 0:
            return False
    return True


for _ in range(n):
    number = int(sys.stdin.readline())
    while True:
        if number < 2:
            print(2)
            break
        if is_prime(number):
            print(number)
            break
        else:
            number += 1
