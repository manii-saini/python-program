import numpy as np

def matrix_addition(A, B):
    return np.add(A, B)

def matrix_subtraction(A, B):
    return np.subtract(A, B)

def matrix_multiplication(A, B):
    return np.matmul(A, B)

def matrix_transpose(A):
    return np.transpose(A)

def main():
    A = np.array([[1, 2], [3, 4]])
    B = np.array([[5, 6], [7, 8]])
    
    print("Matrix A:")
    print(A)
    
    print("Matrix B:")
    print(B)
    
    print("Addition of A and B:")
    print(matrix_addition(A, B))
    
    print("Subtraction of A and B:")
    print(matrix_subtraction(A, B))
    
    print("Multiplication of A and B:")
    print(matrix_multiplication(A, B))
    
    print("Transpose of A:")
    print(matrix_transpose(A))
    
if __name__ == "__main__":
    main()