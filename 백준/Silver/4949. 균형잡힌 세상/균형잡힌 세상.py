import sys



while True:
    data = list(str(sys.stdin.readline().rstrip()))
    if len(data) == 1 and data[0] == '.':
        break
    stack = []
    result = True
    for e in data:
        if e == '(' or e == '[':
            stack.append(e)
        elif e == ')':
            if len(stack) > 0:
                if stack.pop() != '(':
                    result = False
                    break
            else:
                result = False
                break
        elif e == ']':
            if len(stack) > 0:
                if stack.pop() != '[':
                    result = False
                    break
            else:
                result = False
                break

    if not result or len(stack) > 0:
        print('no')
    else:
        print('yes')
