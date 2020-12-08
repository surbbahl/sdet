def Recfunc(N):
    if N:
       return( N+Recfunc(N-1))
    else :
        return 0
res=Recfunc(6)
print (res)
        