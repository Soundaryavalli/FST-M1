print("Rock-Paper-Scissor game")
player1 = "A"
player2 ="B"
p1_play= input("A,What do you want to play?")
p2_play=input("B,What do you want to play?")
print(player1 +   " wants to play  " +  p1_play)
print(player2 +   " wants to play  " + p2_play)



if( p1_play == p2_play):
    print("it is tie")
elif p1_play == "rock" and p2_play == "paper" :
    print("rock wins")
elif p1_play == "paper" and p2_play =="rock" :
    print("papaer wins")   
elif p1_play == "scissor" and p2_play =="rock" :
    print  ("both are winner")  

