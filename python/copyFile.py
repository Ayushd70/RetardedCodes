# Python program to copy files

# The first parameter of copyfile() is the path of the source file and the second parameter is the path of the destination file. 
# The content of the destination file is replaced with the content of the source file.
from shutil import copyfile
copyfile("/root/a.txt", "/root/b.txt")
