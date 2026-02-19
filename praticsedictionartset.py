a={
    "key":"value",
    "harry":"code",
    "marks":"100",
    "list":"[1,2,3]"
}
print(a)
a.items()
print(a)
a.update({"friends":"manish"})
print(a)

a.get("code")
print(a)
print(a.keys())
print(a.items())
print(a.values())


s={1,3,5,6,7,7,8,9,9,10}
print(s)
print(s,type(s))
print(len(s))
print(s.pop())
print(s.clear())

s1={1,2,3,4,4,5}
s2={2,3,4}
print(s1.union(s2))
print(s1.intersection(s2))

s=set()
n=input("Enter a number:")
s.add(int(n))

n=input("Enter a number:")
s.add(int(n))

n=input("Enter a number:")
s.add(int(n))

n=input("Enter a number:")
s.add(int(n))

n=input("Enter a number:")
s.add(int(n))

n=input("Enter a number:")
s.add(int(n))

n=input("Enter a number:")
s.add(int(n))

print(s)