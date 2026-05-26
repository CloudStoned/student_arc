class Node:
    def __init__(self,item):
        self.left = None
        self.right = None
        self.item = item

    def inorder(root): # LEFT DATA RIGHT (2 times to print)
        if root is not None:  # Base case
            # Traverse left
            if root.left is not None:
                root.left.inorder()  # Recursive function

            # Traverse root
            print(str(root.item) + "->", end='')

            # Traverse right
            if root.right is not None:
                root.right.inorder()

    def preorder(root): # DATA LEFT RIGHT (1 time to print)
        if root is not None:
            print(str(root.item) + "->", end = '') # PRINT ROOT
            if root.left is not None: # TRAVERSE LEFT
                root.left.preorder()

            if root.right is not None:
                root.right.preorder() # TRAVERSE RIGHT

    def postorder(root): # LEFT RIGHT DATA (3 times to print)
        if root is not None:
            if root.left is not None:
                Node.postorder(root.left)
            if root.right is not None:
                Node.postorder(root.right)
            print(str(root.item) + "->" ,end= '')

root = Node(1)
root.left = Node(2)
root.right = Node(3)
root.left.left = Node(4)
root.left.right = Node(5)

print("Inorder traversal ")
Node.inorder(root)
print()
print("Preorder Traversal")
Node.preorder(root)
print()
print("Postorder Traversal")
Node.postorder(root)



