def merge(left_arr, right_arr):
    result = []
    i = j = 0
    while i < len(left_arr) and j < len(right_arr):
        if left_arr[i] < right_arr[j]:
            result.append(left_arr[i])
            i += 1
        else:
            result.append(right_arr[j])
            j += 1

    # APPEND THE REMAINING ELEMENTS
    result += left_arr[i:]
    result += right_arr[j:]
    return result


def mergesort(arr):
    if len(arr) <= 1:
        return arr

    mid = len(arr) // 2
    left = mergesort(arr[:mid])
    right = mergesort(arr[mid:])
    return merge(left, right)


lst = [2, 4, 5, -7, -4, -7, 3, 2, 1, 65]
print(mergesort(lst))
