import math
import sys

a, b = map(int, sys.stdin.readline().split())
x, y = map(int, sys.stdin.readline().split())

numerator = a * y + b * x
denominator = b * y

gcd = math.gcd(numerator, denominator)

print(int(numerator / gcd), int(denominator / gcd))
