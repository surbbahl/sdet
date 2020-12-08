list1=[1,3,4,5,6,8,9]
list2=[2,6,8,7,0,5,1]
list3=[]
for i in list1:
    if(i%2!=0):
        list3.append(i)
for j in list2:
    if(j%2==0):
        list3.append(j)
print (list3)
    