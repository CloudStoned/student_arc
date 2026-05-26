class Node:
    def __init__(self, data):
        self.data = data
        self.left = None
        self.right = None


def tree_height(node):
    if node is None:
        return 0
    else:
        left_height = tree_height(node.left)
        right_height = tree_height(node.right)
        return max(left_height, right_height) + 1


# Example usage:
root = Node(1)
root.left = Node(2)
root.right = Node(3)
root.left.left = Node(4)
root.left.right = Node(5)

height = tree_height(root)
print("Height of the tree is:", height)
