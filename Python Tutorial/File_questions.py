with open("File_questions.txt","w") as f:
    f.write("my name is manish,\nI am from dausa")
    f.write("\nI am learning python,\nI am a B.Tech student")

with open("File_questions.txt","r") as f:
    data=f.read()
    print(data)
new_data=data.replace("I","My")

with open("File_questions.txt","w") as f:
    f.write(new_data)    