
def fibonacci(number):
    if number <= 1:
        return number
    else:
        return(fibonacci(number-1) + fibonacci(number-2))
 
num=int(input("Please eneter how many fibo series you wanted:"))
 
if num <= 0:
    print("Please enter a positive number")
else:
    print("Fibonacci Sequence: ")
    for i in range(num):
        print(fibonacci(i))

