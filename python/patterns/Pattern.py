# Generating Inverse Hollow Pyramid Pattern Using Stars

row = int(input('Enter number of rows required: '))

for i in range(row,0,-1):
    for j in range(row-i):
        print(' ', end='') # printing space and staying in same line
    
    for j in range(2*i-1):
        if i==0 or i==row or j==2*i-2 or j==0:
            print('*',end='') # printing * and staying in same line
        else:
            print(' ', end='') # printing space and staying in same line
    print() # printing new line
