def fab(N):
    a=1
    b=1
    i=0
    print(str(a))
    print(str(b))
    while (i<N):
         c=a+b
         print(str(c))
         a=b
         b=c
         
         i=i+1

res=fab(6)
print (res)
        