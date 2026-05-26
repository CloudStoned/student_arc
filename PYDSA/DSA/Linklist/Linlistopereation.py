class Node:
    def __init__(self,item):
        self.item = item
        self.next = None

class LinkList:
    def __init__(self):
        self.head = None

    def insertatbeginning(self,new_data):
        new_node = Node(new_data)

        new_node.next = self.head
        self.head = new_node

    def insertAfter(self,prev_node,new_data): # Insert after a node
        if prev_node is None:
            print("The given previous node must in Linklist")
            return
        new_node = Node(new_data)
        prev_node.next = new_node

    def insertEnd(self,new_data):
        new_node = Node(new_data)

        if self.head is None:
            self.head = new_node
            return

        current_node = self.head
        while(current_node.next != None):
            current_node = current_node.next

        current_node.next = new_node

    def deletenode(self,position):
        if self.head is None:
            return

        current_node = self.head

        if position == 0:
            self.head = current_node.next
            current_node = None
            return

        # FIND KEY
        for i in range(position-1):
            current_node = current_node.next
            if current_node is None:
                break

        # IF KEY IS NOT PRESENT
        if current_node is None:
            return

        if current_node.next is None:
            return

        next = current_node.next.next
        current_node.next = None
        current_node.next = next

    def search(self,key):

        current_node = self.head

        while current_node != None:
            if current_node.item == key:
                return  True

            current_node = current_node.next

        return  False

    def printList(self):
        while self.head != None:
            print(self.head.item, end=" ")
            self.head = self.head.next

    def sort(self):
        current_node = self.head
        index = Node(None)

        if self.head is None:
            return
        else:
            while current_node is not None:
                index = current_node.next
                while index is not None:
                    if current_node.item > index.item:
                        current_node.item,index.item = index.item,current_node.item
                    index = index.next
                current_node = current_node.next




llist = LinkList()
llist.head = Node(5)
second = Node(2)
third = Node(3) # WALANG NAKACONNECT SA KANIYA

llist.head.next = second

llist.insertAfter(second,5)
llist.insertEnd(6)
llist.deletenode(2)
print(llist.search(6))
llist.printList()
llist.sort()

