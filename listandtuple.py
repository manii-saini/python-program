class StackList:
    """Stack implementation using List"""
    def __init__(self):
        self.stack = []

    def push(self, item):
        self.stack.append(item)

    def pop(self):
        if self.stack:
            return self.stack.pop()
        return "Stack is empty"

    def display(self):
        return self.stack


class StackTuple:
    """Stack implementation using Tuple (Immutable)"""
    def __init__(self):
        self.stack = ()

    def push(self, item):
        self.stack += (item,)

    def pop(self):
        if self.stack:
            popped = self.stack[-1]
            self.stack = self.stack[:-1]
            return popped
        return "Stack is empty"

    def display(self):
        return self.stack


class QueueList:
    """Queue implementation using List"""
    def __init__(self):
        self.queue = []

    def enqueue(self, item):
        self.queue.append(item)

    def dequeue(self):
        if self.queue:
            return self.queue.pop(0)
        return "Queue is empty"

    def display(self):
        return self.queue


class QueueTuple:
    """Queue implementation using Tuple (Immutable)"""
    def __init__(self):
        self.queue = ()

    def enqueue(self, item):
        self.queue += (item,)

    def dequeue(self):
        if self.queue:
            dequeued = self.queue[0]
            self.queue = self.queue[1:]
            return dequeued
        return "Queue is empty"

    def display(self):
        return self.queue


def main():
    """Main function to interact with the user"""
    stack_list = StackList()
    stack_tuple = StackTuple()
    queue_list = QueueList()
    queue_tuple = QueueTuple()

    while True:
        print("\nChoose operation:")
        print("1. Stack (List) - Push")
        print("2. Stack (List) - Pop")
        print("3. Stack (Tuple) - Push")
        print("4. Stack (Tuple) - Pop")
        print("5. Queue (List) - Enqueue")
        print("6. Queue (List) - Dequeue")
        print("7. Queue (Tuple) - Enqueue")
        print("8. Queue (Tuple) - Dequeue")
        print("9. Display all")
        print("10. Exit")

        choice = input("Enter choice: ")

        if choice == "1":
            item = input("Enter element to push in Stack (List): ")
            stack_list.push(item)
        elif choice == "2":
            print("Popped element from Stack (List):", stack_list.pop())
        elif choice == "3":
            item = input("Enter element to push in Stack (Tuple): ")
            stack_tuple.push(item)
        elif choice == "4":
            print("Popped element from Stack (Tuple):", stack_tuple.pop())
        elif choice == "5":
            item = input("Enter element to enqueue in Queue (List): ")
            queue_list.enqueue(item)
        elif choice == "6":
            print("Dequeued element from Queue (List):", queue_list.dequeue())
        elif choice == "7":
            item = input("Enter element to enqueue in Queue (Tuple): ")
            queue_tuple.enqueue(item)
        elif choice == "8":
            print("Dequeued element from Queue (Tuple):", queue_tuple.dequeue())
        elif choice == "9":
            print("\nCurrent Stack (List):", stack_list.display())
            print("Current Stack (Tuple):", stack_tuple.display())
            print("Current Queue (List):", queue_list.display())
            print("Current Queue (Tuple):", queue_tuple.display())
        elif choice == "10":
            print("Exiting program...")
            break
        else:
            print("Invalid choice. Please try again.")


if __name__ == "__main__":
    main()