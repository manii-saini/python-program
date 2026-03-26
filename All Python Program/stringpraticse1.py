# String functions
#length function
s1="manish"
a1=len(s1)
print(a1)

#string starts with
s2="manish"
a2=s2.startswith("ma")
print(a2)

#string ends with
s3="buddy"
print(s3.endswith("ddy"))

#string elements count
s4="buddy"
print(s4.count("d"))

# string capitilize
s5="buddy"
a5=s5.capitalize();
print(a5)

# string lower
s6="BUDDY"
print(s6.lower())

# string upper
s7="buddy"
print(s7.upper())

# string title
s8="manish saini"
print(s8.title())

# string find

s9="manish kumar saini"
print(s9.find("saini"))

# string replace
s10="python is very good language"
string_replace=s10.replace("python","java")
print(string_replace)

m1="manish"
print(m1[0:3])

m2="manish"
print(m2[1:5])

m3="manish"
print(m3[:5])

m4="manish"
print(m4[0:])

m5="man"
print(m5[0:5])

m6="manish"
print(m6[-6:-1])

m7="manishkumarsaini"
print(m7[1:6:2])#aih

m8="hellomynameismanishkumarsaini"
print(m8[1:10:3])#eon

m9="hello guys my name is manish kumar saini \ni am form dausa"
print(m9)

name=input("Enter a number:")
print(f"good morning,{name}")

name1=input("Enter your name:")
print(f"Hello,{name1}")