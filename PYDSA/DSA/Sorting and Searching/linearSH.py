def linearSearch(array, n, targ):
    print(array)
    for i in range(0,n):
        if array[i] == targ:
            return i
    return -1


array = [2, 4, 0, 1, 9]
targ: int = 1
n = len(array)
result = linearSearch(array, n, targ)

if result == -1:
    print("NOT FOUND")
else:
    print("FOUND AT INDEX: ", result)
