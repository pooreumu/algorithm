import sys



n = int(sys.stdin.readline())


def get_prime_numbers(end):
    prime_numbers = [True for _ in range(end + 1)]
    prime_numbers[0] = False
    prime_numbers[1] = False

    for p in range(2, int(end ** (1 / 2)) + 1):
        if prime_numbers[p]:
            for i in range(p ** 2, end + 1, p):
                prime_numbers[i] = False
    return [p for p in range(2, end + 1) if prime_numbers[p]]


numbers = []
for _ in range(n):
    numbers.append(int(sys.stdin.readline()))

limit = numbers[0] if len(numbers) == 1 else max(*numbers)
prime_numbers = get_prime_numbers(limit)
prime_numbers_dic = {prime_number: True for prime_number in prime_numbers}

for num in numbers:
    result = set()
    for prime_number in prime_numbers:
        number = num - prime_number
        if number in prime_numbers_dic:
            result.add(min(number, prime_number))

    print(len(result))
