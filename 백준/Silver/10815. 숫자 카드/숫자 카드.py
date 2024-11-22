import sys

n = int(sys.stdin.readline())

cards = list(map(int, sys.stdin.readline().split()))
cards_dict = {}

for card in cards:
    cards_dict[card] = True

m = int(sys.stdin.readline())
check_cards = list(map(int, sys.stdin.readline().split()))

for card in check_cards:
    if card in cards_dict:
        print(1)
    else:
        print(0)
