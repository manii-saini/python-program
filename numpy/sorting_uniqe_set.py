import numpy as np
arr=np.array([4,2,7,4,2])
print(np.sort(arr))
print(np.unique(arr))


arr1=np.array([1,2,3,4,5])
arr2=np.array([2,3,4])

print(np.intersect1d(arr1,arr2))
print(np.union1d(arr1,arr2))