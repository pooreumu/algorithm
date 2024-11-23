import sys



a, b = map(int, sys.stdin.readline().split())


def get_prime_numbers(start, end):
    prime_numbers = [True for _ in range(end + 1)]
    prime_numbers[0] = False
    prime_numbers[1] = False

    for p in range(2, int(end ** (1 / 2)) + 1):
        if prime_numbers[p]:
            for i in range(p ** 2, end + 1, p):
                prime_numbers[i] = False
    return [p for p in range(start, end + 1) if prime_numbers[p]]


for prime_number in get_prime_numbers(a, b):
    print(prime_number)
