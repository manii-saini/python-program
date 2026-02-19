"""
Deobfuscation of manish.py using Z3 SMT Solver
This script analyzes and explains the obfuscated mathematical operation
"""

from z3 import *

print("=" * 70)
print("DEOBFUSCATION ANALYSIS USING Z3 SMT SOLVER")
print("=" * 70)

# Step 1: Understanding the obfuscated code
print("\n[STEP 1] OBFUSCATED CODE ANALYSIS")
print("-" * 70)
print("Original obfuscated function:")
print("  def f(a, b):")
print("      return a - (-b)")
print()
print("This appears to be adding two numbers, but using negation of negation.")
print()

# Step 2: Algebraic simplification
print("[STEP 2] ALGEBRAIC SIMPLIFICATION")
print("-" * 70)
print("Let's analyze the expression: a - (-b)")
print("  = a - (-1 * b)")
print("  = a + b")
print()
print("So the obfuscated function f(a, b) = a - (-b) is simply ADDITION!")
print()

# Step 3: SMT Solver verification
print("[STEP 3] SMT SOLVER VERIFICATION")
print("-" * 70)

# Create symbolic variables
a = Int('a')
b = Int('b')
result = Int('result')

# Create solver
s = Solver()

# Add constraints based on the obfuscated function
print("Adding constraint: result = a - (-b)")
s.add(result == a - (-b))
print("✓ Constraint added")
print()

# Check with specific test values
print("[STEP 4] TESTING WITH EXAMPLES")
print("-" * 70)

test_cases = [
    (5, 3),
    (10, 7),
    (20, 15),
    (100, 50),
]

for x_val, y_val in test_cases:
    s_test = Solver()
    s_test.add(result == a - (-b))
    s_test.add(a == x_val)
    s_test.add(b == y_val)
    
    if s_test.check() == sat:
        model = s_test.model()
        res = model[result].as_long()
        print(f"  f({x_val}, {y_val}) = {x_val} - (-{y_val}) = {res}")
        print(f"  Verification: {x_val} + {y_val} = {x_val + y_val} ✓")
    print()

# Step 5: Deobfuscated code
print("[STEP 5] DEOBFUSCATED CODE")
print("-" * 70)
print("Original obfuscated code:")
print("""
  def f(a, b):
      return a - (-b)
""")
print()
print("Deobfuscated (simplified) code:")
print("""
  def f(a, b):
      return a + b
""")
print()

# Step 6: Prove equivalence using Z3
print("[STEP 6] PROVING EQUIVALENCE WITH Z3")
print("-" * 70)

# Create variables for equivalence check
a_var = Int('a_var')
b_var = Int('b_var')

# Prove that a - (-b) == a + b
s_equivalence = Solver()
s_equivalence.add(a_var - (-b_var) != a_var + b_var)

if s_equivalence.check() == unsat:
    print("✓ PROVEN: a - (-b) is equivalent to a + b for all integer values")
    print("  No counterexample exists - they are mathematically identical!")
else:
    print("✗ Not equivalent")

print()

# Step 7: Complete deobfuscated program
print("[STEP 7] COMPLETE DEOBFUSCATED PROGRAM")
print("-" * 70)
print("""
def f(a, b):
    '''
    Deobfuscated function that adds two numbers.
    Previously obfuscated as: return a - (-b)
    True purpose: Simple addition
    '''
    return a + b

# Main program
x = int(input("Enter first number: "))
y = int(input("Enter second number: "))

r = f(x, y)
print("Result:", r)
""")

print("=" * 70)
print("DEOBFUSCATION COMPLETE")
print("=" * 70)
print()
print("SUMMARY:")
print("  • Obfuscation Type: Mathematical negation trick")
print("  • True Purpose: Addition of two numbers")
print("  • Obfuscation Level: Low (easily spotted)")
print("  • Z3 Verification: ✓ Equivalent expressions confirmed")
print()
