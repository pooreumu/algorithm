import sys


n = int(sys.stdin.readline())


def hanoi(num, source_pole, target_pole, aux_pole):
    if num == 0: return
    hanoi(num - 1, source_pole, aux_pole, target_pole)
    print(source_pole, target_pole)
    hanoi(num - 1, aux_pole, target_pole, source_pole)

print(2 ** n - 1)
hanoi(n, 1, 3, 2)
