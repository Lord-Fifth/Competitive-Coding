
r=int(input("Enter rows\n"))
c=int(input("Enter columns\n"))
arr=[[0 for i in range(r)]for i in range(c)]
col=[]
row=[]
print("Enter elements")
for i in range(r):
    for j in range(c):
        arr[i][j]=int(input())
        if(arr[i][j]==0):
            row.append(i)
            col.append(j)

print("Input Matrix")
for i in range(r):
    for j in range(c):
        print(arr[i][j], end = " ")
    print()

#print(arr)
#print(row)
#print(col)

for i in range(len(row)):
    for j in range(c):
        arr[row[i]][j]=0
for i in range(len(col)):
    for j in range(r):
        arr[j][col[i]]=0

print("Final Matrix")
for i in range(r):
    for j in range(c):
        print(arr[i][j], end = " ")
    print()