import shutil

def write_file(filename, content):
    with open(filename, "w") as file:
        file.write(content)
    print(f"Data written to {filename}")

def read_file(filename):
    with open(filename, "r") as file:
        content = file.read()
    print(f"Content of {filename}:\n{content}")

def append_file(filename, content):
    with open(filename, "a") as file:
        file.write(content)
    print(f"Data appended to {filename}")

def copy_file(source, destination):
    shutil.copy(source, destination)
    print(f"File copied from {source} to {destination}")

def main():
    filename = "example.txt"
    copy_filename = "copy_example.txt"
    
    # Writing to a file
    write_file(filename, "This is an example file.\nFile handling in Python.\n")
    
    # Reading from a file
    read_file(filename)
    
    # Appending to a file
    append_file(filename, "Appending new data to the file.\n")
    
    # Reading the updated file
    read_file(filename)
    
    # Copying file content
    copy_file(filename, copy_filename)
    
    # Reading copied file
    read_file(copy_filename)

if __name__ == "__main__":
    main()
