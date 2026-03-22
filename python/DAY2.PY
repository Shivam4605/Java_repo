my_set = {12,10,100,45,46,"shivam"}
print(my_set)

x = (10,20,50,40,[50,78,89])
x[4].append(0);
print(x)

x[4].append([48,98,7,4])
print(x)

set1 = {1,2,3,4,5,6,7,8}
set2 = {7,3,2,5,4,6,1,7,8,9}

set1.add(100)
print(set1)
set1.remove(3)
print(set1)
print(set1.union(set2))
print(set1.intersection(set2))

tup = (1,2,3,4,5)
for i in range(5):
    if(i == 0 or i == 4):
        print(tup[i])
        
s = (1,2,3)

a,b,c = s

print(a)
print(b)
print(c)

a = [2,5,4,2,1,1,2,3,4,5]

print(list(set(a)))


# i = int(input("Enter a value"))
# j = int(input("Enter b value"))
# if (i >= j):
#     print("i greater than j")
# else:
#     print("j is greater")

# num = int(input("Enter a number"))
# if (num >= 0):
#     print("number is positive")
# else:
#     print("nuuber is negative")
    
# n = int(input("enter a number")) 
# if (a % 2 ==0 ):
#     print("number is even")
# else:
#     print("number is odd")
    


word = "shivam"
for i in word:
    print(i)
    
dit = {
    'Name' : 'Shivam', 
    'Age' : 21 , 
    "salary" : 200000,
}
for i,j in dit.items():
    print(f"{i} : {j}")
    
for i in range(2,21,2):
    print(i)
    
for i in range(1,11):
    print(i**2)
    
for i in range(4):
    print()
    for j in range():
        print(j)