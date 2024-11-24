import sys



n = int(sys.stdin.readline())

for i in range(n):
    data = list(str(sys.stdin.readline().strip()))
    stack = []
    result = True
    for e in data:
        if e == '(':
            stack.append(e)
        else:
            if len(stack) > 0:
                stack.pop()
            else:
                result = False
                break
    if not result:
        print('NO')
    elif len(stack) > 0:
        print('NO')
    else:
        print('YES')
