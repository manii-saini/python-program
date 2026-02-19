class StackList:
    def _init_(self):
        self.stack = []

    def push(self, item):
        self.stack.append(item)

    def pop(self):
        if not self.is_empty():
            return self.stack.pop()
        return "Stack is empty"

    def peek(self):
        if not self.is_empty():
            return self.stack[-1]
        return "Stack is empty"

    def is_empty(self):
        return len(self.stack) == 0

    def display(self):
        return self.stack


class QueueList:
    def _init_(self):
        self.queue = []

    def enqueue(self, item):
        self.queue.append(item)

    def dequeue(self):
        if not self.is_empty():
            return self.queue.pop(0)
        return "Queue is empty"

    def is_empty(self):
        return len(self.queue) == 0

    def display(self):
        return self.queue


class StackTuple:
    def _init_(self):
        self.stack = ()

    def push(self, item):
        self.stack += (item,)

    def pop(self):
        if self.stack:
            item, self.stack = self.stack[-1], self.stack[:-1]
            return item
        return "Stack is empty"

    def peek(self):
        return self.stack[-1] if self.stack else "Stack is empty"

    def display(self):
        return self.stack


class QueueTuple:
    def _init_(self):
        self.queue = ()

    def enqueue(self, item):
        self.queue += (item,)

    def dequeue(self):
        if self.queue:
            item, self.queue = self.queue[0], self.queue[1:]
            return item
        return "Queue is empty"

    def display(self):
        return self.queue


# Testing the implementations
if _name_ == "_main_":
    # Stack using list
    stack_list = StackList()
    stack_list.push(1)
    stack_list.push(2)
    print("Stack (List):", stack_list.display())  # Output: [1, 2]
    print("Popped from Stack (List):", stack_list.pop())  # Output: 2

    # Queue using list
    queue_list = QueueList()
    queue_list.enqueue(1)
    queue_list.enqueue(2)
    print("Queue (List):", queue_list.display())  # Output: [1, 2]
    print("Dequeued from Queue (List):", queue_list.dequeue())  # Output: 1

    # Stack using tuple
    stack_tuple = StackTuple()
    stack_tuple.push(1)
    stack_tuple.push(2)
    print("Stack (Tuple):", stack_tuple.display())  # Output: (1, 2)
    print("Popped from Stack (Tuple):", stack_tuple.pop())  # Output: 2

    # Queue using tuple
    queue_tuple = QueueTuple()
    queue_tuple.enqueue(1)
    queue_tuple.enqueue(2)
    print("Queue (Tuple):", queue_tuple.display())  # Output: (1, 2)
    print("Dequeued from Queue (Tuple):", queue_tuple.dequeue())  