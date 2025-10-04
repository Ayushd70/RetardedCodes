import 'dart:math' show Random;

// Binary Search Tree Node
class TreeNode {
  int value;
  TreeNode? left;
  TreeNode? right;

  TreeNode(this.value);
}

// Binary Search Tree implementation
class BinarySearchTree {
  TreeNode? root;

  // Insert a value into the BST
  void insert(int value) {
    root = _insertRecursive(root, value);
  }

  TreeNode? _insertRecursive(TreeNode? node, int value) {
    if (node == null) {
      return TreeNode(value);
    }

    if (value < node.value) {
      node.left = _insertRecursive(node.left, value);
    } else if (value > node.value) {
      node.right = _insertRecursive(node.right, value);
    }

    return node;
  }

  // Search for a value in the BST
  bool search(int value) {
    return _searchRecursive(root, value);
  }

  bool _searchRecursive(TreeNode? node, int value) {
    if (node == null) {
      return false;
    }

    if (value == node.value) {
      return true;
    } else if (value < node.value) {
      return _searchRecursive(node.left, value);
    } else {
      return _searchRecursive(node.right, value);
    }
  }

  // Delete a value from the BST
  void delete(int value) {
    root = _deleteRecursive(root, value);
  }

  TreeNode? _deleteRecursive(TreeNode? node, int value) {
    if (node == null) {
      return null;
    }

    if (value < node.value) {
      node.left = _deleteRecursive(node.left, value);
    } else if (value > node.value) {
      node.right = _deleteRecursive(node.right, value);
    } else {
      // Node to be deleted found
      if (node.left == null) {
        return node.right;
      } else if (node.right == null) {
        return node.left;
      }

      // Node with two children: get the inorder successor
      node.value = _minValue(node.right!);
      node.right = _deleteRecursive(node.right, node.value);
    }

    return node;
  }

  int _minValue(TreeNode node) {
    int minValue = node.value;
    while (node.left != null) {
      minValue = node.left!.value;
      node = node.left!;
    }
    return minValue;
  }

  // Inorder traversal (left, root, right)
  List<int> inorderTraversal() {
    List<int> result = [];
    _inorderRecursive(root, result);
    return result;
  }

  void _inorderRecursive(TreeNode? node, List<int> result) {
    if (node != null) {
      _inorderRecursive(node.left, result);
      result.add(node.value);
      _inorderRecursive(node.right, result);
    }
  }

  // Preorder traversal (root, left, right)
  List<int> preorderTraversal() {
    List<int> result = [];
    _preorderRecursive(root, result);
    return result;
  }

  void _preorderRecursive(TreeNode? node, List<int> result) {
    if (node != null) {
      result.add(node.value);
      _preorderRecursive(node.left, result);
      _preorderRecursive(node.right, result);
    }
  }

  // Postorder traversal (left, right, root)
  List<int> postorderTraversal() {
    List<int> result = [];
    _postorderRecursive(root, result);
    return result;
  }

  void _postorderRecursive(TreeNode? node, List<int> result) {
    if (node != null) {
      _postorderRecursive(node.left, result);
      _postorderRecursive(node.right, result);
      result.add(node.value);
    }
  }

  // Get the height of the tree
  int height() {
    return _heightRecursive(root);
  }

  int _heightRecursive(TreeNode? node) {
    if (node == null) {
      return -1;
    }
    return 1 + _heightRecursive(node.left).clamp(_heightRecursive(node.right), _heightRecursive(node.right));
  }

  // Check if the tree is empty
  bool isEmpty() {
    return root == null;
  }

  // Get the size (number of nodes) of the tree
  int size() {
    return _sizeRecursive(root);
  }

  int _sizeRecursive(TreeNode? node) {
    if (node == null) {
      return 0;
    }
    return 1 + _sizeRecursive(node.left) + _sizeRecursive(node.right);
  }
}

// Main function to demonstrate BST operations
void main() {
  print('Binary Search Tree Implementation in Dart');
  print('==========================================');
  
  // Create a new BST
  var bst = BinarySearchTree();
  
  // Generate random numbers for insertion
  final random = Random();
  var numbers = List.generate(10, (index) => random.nextInt(100));
  
  print('Inserting numbers: $numbers');
  
  // Insert numbers into BST
  for (int number in numbers) {
    bst.insert(number);
  }
  
  print('\nTree Properties:');
  print('Height: ${bst.height()}');
  print('Size: ${bst.size()}');
  print('Is Empty: ${bst.isEmpty()}');
  
  print('\nTraversals:');
  print('Inorder (sorted): ${bst.inorderTraversal()}');
  print('Preorder: ${bst.preorderTraversal()}');
  print('Postorder: ${bst.postorderTraversal()}');
  
  // Search for some values
  print('\nSearch Operations:');
  var searchValues = [numbers[0], numbers[5], 999];
  for (int value in searchValues) {
    print('Searching for $value: ${bst.search(value)}');
  }
  
  // Delete some values
  print('\nDelete Operations:');
  var deleteValues = [numbers[2], numbers[7]];
  for (int value in deleteValues) {
    print('Deleting $value...');
    bst.delete(value);
    print('Inorder after deletion: ${bst.inorderTraversal()}');
  }
  
  print('\nFinal tree size: ${bst.size()}');
  print('Final tree height: ${bst.height()}');
}
