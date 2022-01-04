# Checking if a binary tree is height balanced in Python


class Node:
    def isBalanced(self, root):

        if not root:
            return True
        left_depth = self.depth(root.left)
        right_depth = self.depth(root.right)
        if abs(left_depth - right_depth) <= 1:
            return self.isBalanced(root.left) and self.isBalanced(root.right)
        else:
            return False

    def depth(self, node):
        if not node:
            return 0
        return max(self.depth(node.left), self.depth(node.right)) + 1
