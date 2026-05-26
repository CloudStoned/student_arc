
# x = int(input("Enter Number "))
# timesThree = lambda x: x * 3
# print(timesThree(int(input("Input: "))))

add = lambda x,y: x + y
sub = lambda  x,y: x - y
mult = lambda  x,y: x * y
div = lambda  x,y: x / y

op = input("Enter Operation: ")

if op == "+":
    n1 = int(input("Enter n1: "))
    n2 = int(input("Enter n2: "))
    print(add(n1,n2))

elif op == "-":
    n1 = int(input("Enter n1: "))
    n2 = int(input("Enter n2: "))
    print(sub(n1,n2))

# SAME AS DIV, MULT