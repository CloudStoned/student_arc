# Insertion sort works similarly
# as we sort cards in our hand in a card game.

def insertionSort(array):
    for step in range(1, len(array)):
        key = array[step]  # 5
        left_step = step - 1  # 9

        while left_step >= 0 and key < array[left_step]: # left step = 0 || 5 < 9
            array[left_step + 1] = array[step]
            left_step = left_step - 1 # 0 = 0 - 1 = -1
        array[left_step] = key



data = [9, 5, 1, 4, 3]
insertionSort(data)
print('Sorted Array in Ascending Order:')
print(data)
