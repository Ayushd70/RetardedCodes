# Python rogram to find the SHA-1 message digest of a file

# importing the hashlib module
import hashlib

def hash_file(filename):
   # make a hash object
   h = hashlib.sha1()

   # open file for reading in binary mode
   with open(filename,'rb') as file:

       # loop till the end of the file
       chunk = 0
       while chunk != b'':
           # read only 1024 bytes at a time
           chunk = file.read(1024)
           h.update(chunk)

   # return the hex representation of digest
   return h.hexdigest()

  # track1.mp3 replace it with the file name
message = hash_file("track1.mp3")
print(message)
