List1=[1,2,3,4,5,6,7,8,9,10]
List2=[1,2,3,4,5,6,7,8,9,10]

List3 = []
List4 = []
while True :
 for num in List1 :
  if (num % 2 == 0)  :
    List3.append(num)
    
for num in List2 : 
    if (num % 2 != 0) :
      List4.append(num)
      pass
      # print the values
      print("Even Num is ") 
      print(List3)
      print("Odd Num is " )
      print(List4)

