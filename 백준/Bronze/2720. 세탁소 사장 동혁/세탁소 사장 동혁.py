Quarter = 25
Dime = 10
Nickel = 5
Penny = 1

n = int(input())
for i in range(n):
    change = int(input())
    q = change // Quarter
    change %= Quarter
    d = change // Dime
    change %= Dime
    n = change // Nickel
    change %= Nickel
    p = change // Penny
    change %= Penny
    print(q, d, n, p)