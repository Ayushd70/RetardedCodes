// Stack Implementation in Dart
// LIFO (Last In, First Out) data structure

class Stack<T> {
  List<T> _items = [];

  // Push element onto stack
  void push(T item) {
    _items.add(item);
  }

  // Pop element from stack
  T? pop() {
    if (isEmpty) return null;
    return _items.removeLast();
  }

  // Peek at top element without removing
  T? peek() {
    if (isEmpty) return null;
    return _items.last;
  }

  // Check if stack is empty
  bool get isEmpty => _items.isEmpty;

  // Check if stack is not empty
  bool get isNotEmpty => _items.isNotEmpty;

  // Get stack size
  int get size => _items.length;

  // Clear all elements
  void clear() {
    _items.clear();
  }

  // Convert to list
  List<T> toList() {
    return List.from(_items);
  }

  // Print stack contents
  void printStack() {
    if (isEmpty) {
      print('Stack is empty');
      return;
    }
    print('Stack (top to bottom): ${_items.reversed.toList()}');
  }
}

// Stack applications and algorithms
class StackAlgorithms {
  // Check if parentheses are balanced
  static bool isBalanced(String expression) {
    Stack<String> stack = Stack<String>();
    
    for (int i = 0; i < expression.length; i++) {
      String char = expression[i];
      
      if (char == '(' || char == '[' || char == '{') {
        stack.push(char);
      } else if (char == ')' || char == ']' || char == '}') {
        if (stack.isEmpty) return false;
        
        String top = stack.pop()!;
        if ((char == ')' && top != '(') ||
            (char == ']' && top != '[') ||
            (char == '}' && top != '{')) {
          return false;
        }
      }
    }
    
    return stack.isEmpty;
  }

  // Convert infix to postfix notation
  static String infixToPostfix(String infix) {
    Stack<String> stack = Stack<String>();
    String postfix = '';
    
    for (int i = 0; i < infix.length; i++) {
      String char = infix[i];
      
      if (char == ' ') continue;
      
      if (_isOperand(char)) {
        postfix += char;
      } else if (char == '(') {
        stack.push(char);
      } else if (char == ')') {
        while (stack.isNotEmpty && stack.peek() != '(') {
          postfix += stack.pop()!;
        }
        stack.pop(); // Remove '('
      } else if (_isOperator(char)) {
        while (stack.isNotEmpty && 
               _precedence(stack.peek()!) >= _precedence(char)) {
          postfix += stack.pop()!;
        }
        stack.push(char);
      }
    }
    
    while (stack.isNotEmpty) {
      postfix += stack.pop()!;
    }
    
    return postfix;
  }

  // Evaluate postfix expression
  static double evaluatePostfix(String postfix) {
    Stack<double> stack = Stack<double>();
    
    for (int i = 0; i < postfix.length; i++) {
      String char = postfix[i];
      
      if (char == ' ') continue;
      
      if (_isOperand(char)) {
        stack.push(double.parse(char));
      } else if (_isOperator(char)) {
        double b = stack.pop()!;
        double a = stack.pop()!;
        
        switch (char) {
          case '+':
            stack.push(a + b);
            break;
          case '-':
            stack.push(a - b);
            break;
          case '*':
            stack.push(a * b);
            break;
          case '/':
            stack.push(a / b);
            break;
        }
      }
    }
    
    return stack.pop()!;
  }

  // Reverse a string using stack
  static String reverseString(String input) {
    Stack<String> stack = Stack<String>();
    
    for (int i = 0; i < input.length; i++) {
      stack.push(input[i]);
    }
    
    String reversed = '';
    while (stack.isNotEmpty) {
      reversed += stack.pop()!;
    }
    
    return reversed;
  }

  // Check if string is palindrome
  static bool isPalindrome(String input) {
    String reversed = reverseString(input);
    return input == reversed;
  }

  // Helper methods
  static bool _isOperand(String char) {
    return RegExp(r'[0-9]').hasMatch(char);
  }

  static bool _isOperator(String char) {
    return ['+', '-', '*', '/'].contains(char);
  }

  static int _precedence(String op) {
    switch (op) {
      case '+':
      case '-':
        return 1;
      case '*':
      case '/':
        return 2;
      default:
        return 0;
    }
  }
}

// Main function to demonstrate stack operations
void main() {
  print('Stack Implementation in Dart');
  print('===========================');
  
  // Basic stack operations
  var stack = Stack<int>();
  
  print('Basic Stack Operations:');
  print('Pushing 1, 2, 3, 4, 5...');
  stack.push(1);
  stack.push(2);
  stack.push(3);
  stack.push(4);
  stack.push(5);
  
  stack.printStack();
  print('Stack size: ${stack.size}');
  print('Top element: ${stack.peek()}');
  
  print('\nPopping elements:');
  while (stack.isNotEmpty) {
    print('Popped: ${stack.pop()}');
  }
  
  // Stack applications
  print('\nStack Applications:');
  
  // 1. Balanced parentheses
  List<String> expressions = [
    '((()))',
    '([{}])',
    '([)]',
    '((())',
    '()[]{}'
  ];
  
  print('\n1. Balanced Parentheses Check:');
  for (String expr in expressions) {
    print('$expr: ${StackAlgorithms.isBalanced(expr)}');
  }
  
  // 2. Infix to Postfix conversion
  print('\n2. Infix to Postfix Conversion:');
  String infix = 'a+b*c-d/e';
  String postfix = StackAlgorithms.infixToPostfix(infix);
  print('Infix: $infix');
  print('Postfix: $postfix');
  
  // 3. Postfix evaluation
  print('\n3. Postfix Evaluation:');
  String postfixExpr = '23*4+';
  double result = StackAlgorithms.evaluatePostfix(postfixExpr);
  print('Postfix: $postfixExpr');
  print('Result: $result');
  
  // 4. String reversal
  print('\n4. String Reversal:');
  String original = 'Hello World';
  String reversed = StackAlgorithms.reverseString(original);
  print('Original: $original');
  print('Reversed: $reversed');
  
  // 5. Palindrome check
  print('\n5. Palindrome Check:');
  List<String> words = ['racecar', 'hello', 'madam', 'world'];
  for (String word in words) {
    print('$word: ${StackAlgorithms.isPalindrome(word)}');
  }
  
  // Performance test
  print('\nPerformance Test (1000 operations):');
  var perfStack = Stack<int>();
  var stopwatch = Stopwatch();
  
  stopwatch.start();
  for (int i = 0; i < 1000; i++) {
    perfStack.push(i);
  }
  while (perfStack.isNotEmpty) {
    perfStack.pop();
  }
  stopwatch.stop();
  
  print('1000 push/pop operations completed in ${stopwatch.elapsedMicroseconds}μs');
}
