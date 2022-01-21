class MyQueue:
    def __init__(self):
        self.s1 = []
        self.s2 = []

    def push(self, x: int) -> None:
        self.s1.append(x)

    def pop(self) -> int:
        n = len(self.s1) - 1
        for i in range(n):
            self.s2.append(self.s1.pop())
        res = self.s1.pop()
        for i in range(n):
            self.s1.append(self.s2.pop())
        return res

    def peek(self) -> int:
        n = len(self.s1) - 1
        for i in range(n):
            self.s2.append(self.s1.pop())
        res = self.s1[0]
        for i in range(n):
            self.s1.append(self.s2.pop())
        return res

    def empty(self) -> bool:
        return len(self.s1) == 0
