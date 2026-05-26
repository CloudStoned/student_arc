class Node:
    def __init__(self,item):
        self.item = item
        self.next = None

class LinkList:
    def __init__(self):
        self.head = None


linklist= LinkList()

linklist.head = Node(1)
second = Node(2)
third = Node(3)

linklist.head.next = second
second.next = third

while linklist.head != None:
    print(linklist.head.item, end=" ")
    linklist.head = linklist.head.next
