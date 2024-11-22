import sys

n, m = map(int, sys.stdin.readline().split())

pokemon_encyclopedia = {}

for i in range(1, n + 1):
    pokemon_name = str(sys.stdin.readline().split()[0])
    pokemon_encyclopedia[str(i)] = pokemon_name
    pokemon_encyclopedia[pokemon_name] = i

for _ in range(m):
    pokemon_name = str(sys.stdin.readline().split()[0])
    print(pokemon_encyclopedia[pokemon_name])
