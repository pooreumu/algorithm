def get_divisor(num):
    result = []

    for i in range(num):
        divisor = i + 1
        if num % divisor == 0:
            result.append(divisor)

    return result


while True:
    n = int(input())
    if n == -1:
        break
    divisor = get_divisor(n)
    divisor.pop()
    if sum(divisor) == n:
        print(f'{n} = {" + ".join(map(str,divisor))}')
    else:
        print(f'{n} is NOT perfect.')
