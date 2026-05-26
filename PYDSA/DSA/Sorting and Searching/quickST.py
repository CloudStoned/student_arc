def quick_sort(arr):
    arr_len = len(arr)
    if arr_len <= 1:
        return arr
    else:
        pivot = arr.pop()

    lower_arr = []
    higher_arr = []

    for item in arr:
        if item > pivot:
            higher_arr.append(item)
        else:
            lower_arr.append(item)

    return quick_sort(lower_arr) + [pivot] + quick_sort(higher_arr)


print(quick_sort([1, 4, 3, 6, 7, 1, 5, 3]))
