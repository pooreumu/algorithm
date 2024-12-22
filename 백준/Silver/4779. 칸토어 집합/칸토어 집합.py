import sys



n = list(map(int, filter(None, sys.stdin.read().split('\n'))))


def cantor_set(n, set):
    if n == 0: return set

    third = len(set) // 3
    left = set[:third]
    right = set[2 * third:]

    return cantor_set(n - 1, left) + ' ' * third + cantor_set(n - 1, right)


for i in n:
    print(cantor_set(i, (3 ** i) * '-'))
