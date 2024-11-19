n = int(input())
data = list(map(int, input().split()))


def is_prime_number(number):
    if number == 1:
        return False
    for i in range(2, number):
        if number % i == 0:
            return False
    return True


print(len(list(filter(lambda x: is_prime_number(x), data))))
