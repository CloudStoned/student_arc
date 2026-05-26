def create_stack():
    stack = []
    return stack

def isEmpty(stack):
    if len(stack) == 0:
        return True
    else:
        return False

def push(stack,item):
    stack.append(item) # PYTHON BUILT IN FUNC
    print("Pushed Item: " + item)

def pop(stack):
    return stack.pop() # PYTHON BUILT IN FUNC

stack = create_stack()
push(stack,str(1))
stack.pop()
print(isEmpty(stack))
