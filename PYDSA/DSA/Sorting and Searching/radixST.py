def counting_sort(arr, place_value):
    size = len(arr) # how long is the array?
    output = [0] * size
    count = [0] * 10

    for i in range(0,size):
        idx = arr[i] // place_value # ones or tens or hundreds place
        count[idx % 10] += 1


def radix_sort(arr):
    m = max(arr)  # decides up to how many places it needs to go
    place_value = 1
    while m // place_value > 0:
        counting_sort(arr, place_value)
        place = place_value * 10  # increase the place value 10,100,1000 place




