# Create a node
class Node:
    def __init__(self, key):
        self.key = key
        self.left = self.right = None


# Inorder traversal
def inorder(node):
    if node is not None:
        # Traverse left
        inorder(node.left)

        # Traverse node
        print(str(node.key) + "->", end=' ')

        # Traverse right
        inorder(node.right)


# Insert a node
def insert(node, key):
    # Return a new node if null
    if node is None:
        return Node(key)

    if key < node.key:
        node.left = insert(node.left, key)

    elif key > node.key:
        node.right = insert(node.right, key)

    return node


def minValueNode(node):
    current = node

    # Find the leftmost leaf
    while (current.left is not None):
        current = current.left

    return current


# Deleting a node
def deleteNode(root, key):
    # Return if the tree is empty
    if root is None:
        return root

    # Find the node to be deleted
    if key < root.key:
        root.left = deleteNode(root.left, key)
    elif key > root.key:
        root.right = deleteNode(root.right, key)
    else:
        # If the node is with only one child or no child
        if root.left is None:
            temp = root.right
            root = None
            return temp

        elif root.right is None:
            temp = root.left
            root = None
            return temp

        # If the node has two children,
        # place the inorder successor in position of the node to be deleted
        temp = minValueNode(root.right)

        root.key = temp.key

        # Delete the inorder successor
        root.right = deleteNode(root.right, temp.key)

    return root


node = None
node = insert(node, 8)
node = insert(node, 3)
node = insert(node, 1)
node = insert(node, 6)
node = insert(node, 7)
node = insert(node, 10)
node = insert(node, 14)
node = insert(node, 4)

print("Inorder traversal: ", end=' ')
inorder(node)

print("\nDelete 10")
root = deleteNode(node, 10)
print("Inorder traversal: ", end=' ')
inorder(node)
