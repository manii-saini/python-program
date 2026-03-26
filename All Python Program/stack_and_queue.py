class Queue:
    def __init__(self):
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
        print("Queue:", self.queue)

class Stack:
    def __init__(self):
        self.stack = []
    
    def push(self, item):
        self.stack.append(item)
    
    def pop(self):
        if not self.is_empty():
            return self.stack.pop()
        return "Stack is empty"
    
    def is_empty(self):
        return len(self.stack) == 0
    
    def display(self):
        print("Stack:", self.stack)

# User Input
queue = Queue()
stack = Stack()

tuple_data = tuple(input("Enter elements separated by space: ").split())

for item in tuple_data:
    queue.enqueue(item)
    stack.push(item)

queue.display()
stack.display()

while True:
    action = input("Do you want to insert or remove an element? (insert/remove/exit): ").lower()
    if action == "insert":
        element = input("Enter element to insert: ")
        queue.enqueue(element)
        stack.push(element)
    elif action == "remove":
        print("Dequeued from queue:", queue.dequeue())
        print("Popped from stack:", stack.pop())
    elif action == "exit":
        break
    else:
        print("Invalid option. Please enter 'insert', 'remove', or 'exit'.")
    
    queue.display()
    stack.display()
