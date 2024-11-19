m = int(input())
n = int(input())


def is_prime_number(number):
    if number == 1:
        return False
    for i in range(2, number):
        if number % i == 0:
            return False
    return True


prime_numbers = []
for i in range(m, n + 1):
    if is_prime_number(i):
        prime_numbers.append(i)
if len(prime_numbers) == 0:
    print(-1)
else:
    print(sum(prime_numbers))
    print(prime_numbers[0])
