def set_operations():
    try:
        set1 = set(map(int, input("Enter elements of first set separated by space: ").split()))
        set2 = set(map(int, input("Enter elements of second set separated by space: ").split()))
        
        print("Union:", set1 | set2)
        print("Intersection:", set1 & set2)
        print("Difference (Set1 - Set2):", set1 - set2)
        print("Difference (Set2 - Set1):", set2 - set1)
        print("Symmetric Difference:", set1 ^ set2)
    except ValueError:
        print("Please enter valid integers separated by spaces.")

# Run the set operations function
set_operations()
