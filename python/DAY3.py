# count = 0
# while(count < 5):
#     print(count)
#     count += 1

# i = 1
# while(i <= 5):
#     print("*" * i)
#     i += 1
    
# sum = 0
# i =1
# while (i <= 10):
#     sum  = sum + i
#     i += 1
# print(sum)

# j = 1
# num = int(input("Enter the number"))
# while ( j <= 10):
#     print(num * j)
#     j = j+1
    
    
# n = int(input("Enter the number"))
# while(num > 0):
#     if(num % 2 == 0):
#         print("number is even")
#         break
#     else:
#         print("number is odd")
#         break
    
# fact = 1
# f = int(input("Enter the number"))
# while( f > 0):
#     fact = fact * f
#     f = f-1
# print(fact)


# num = int(input("Enter number: "))
# temp = num
# power = len(str(num))
# sum = 0

# while temp > 0:
#     digit = temp % 10
#     sum += digit ** power
#     temp //= 10

# if sum == num:
#     print("Armstrong Number")
# else:
#     print("Not Armstrong Number")        



num = int(input("Enter a Number"))
n = num
sum = 0
len = len(str(num))
for i in range(num):
    if(num > 0):
        mod = num % 10
        sum = sum + mod ** len
        num = num // 10
if(sum == n):
    print("number is amstrong")
else:
    print("number is not amstrong")
