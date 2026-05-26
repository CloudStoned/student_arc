# Binary Search in python


def binarySearch(array, x, low, high):
    if high >= low:

        mid = low + (high - low) // 2

        # If found at mid, then return it
        if array[mid] == x:
            return mid

        elif x > array[mid]:  # x is on the right side
            return binarySearch(array, x, mid + 1, high)

        else:  # x is on the left side
            return binarySearch(array, x, low, mid - 1)

    else:
        return -1


array = [3, 4, 5, 6, 7, 8, 9]
x = 4

result = binarySearch(array, x, 0, len(array) - 1)

if result != -1:
    print("Element is present at index " + str(result))
else:
    print("Not found")
