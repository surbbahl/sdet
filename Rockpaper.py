user1_answer=input("What is user1's reply")
user2_answer=input("What is user2's reply")
if user1_answer==user2_answer:
 print("its a tie")
elif user1_answer=="rock" :
    if  user2_answer=='scissors':
        print("Rock wins")
    else:
        print("Paper wins")
elif user1_answer=='scissors':
    if user2_answer=='paper':
        print("scissors win")
    else:
        print("Rock wins!!!")
elif user1_answer=='paper':
    if user2_answer=='rock':
     print("paper wins")
    else :
     print("scissors wins")
else :
     print("Invalid inpt")


