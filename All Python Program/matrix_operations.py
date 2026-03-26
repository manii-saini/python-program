import sys

try:
    import numpy as np
    print("NumPy version:", np.__version__)  # Check if NumPy is correctly imported
except ImportError:
    print("NumPy is not installed. Please install it using 'pip install numpy'.")
    sys.exit(1)

def numpy_intrinsics():
    # Creating intrinsic NumPy objects
    print("Zero Matrix:")
    print(np.zeros((3, 3)))
    
    print("Ones Matrix:")
    print(np.ones((3, 3)))
    
    print("Identity Matrix:")
    print(np.eye(3))
    
    print("Random Matrix:")
    print(np.random.rand(3, 3))

def numpy_random():
    # Generating random numbers
    print("Random Integer Matrix:")
    print(np.random.randint(1, 10, (3, 3)))
    
    print("Random Normal Distribution:")
    print(np.random.randn(3, 3))

def numpy_manipulation():
    A = np.array([[1, 2, 3], [4, 5, 6], [7, 8, 9]])
    print("Original Array:")
    print(A)
    
    print("Indexing Example (Element at 1,1):")
    print(A[1, 1])
    
    print("Slicing Example (First Two Rows):")
    print(A[:2, :])
    
    print("Reshaping Example (1x9 Matrix):")
    print(A.reshape(1, 9))
    
    B = np.array([[10, 11, 12], [13, 14, 15], [16, 17, 18]])
    print("Joining Two Arrays Horizontally:")
    print(np.hstack((A, B)))
    
    print("Joining Two Arrays Vertically:")
    print(np.vstack((A, B)))
    
    print("Splitting Array into Two Parts:")
    print(np.hsplit(A, 3))

def main():
    numpy_intrinsics()
    numpy_random()
    numpy_manipulation()
    
if __name__ == "__main__":
    main()
