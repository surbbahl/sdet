def sum1(numbers):
    sum_i=0
    for number in numbers:
        sum_i=sum_i+number
    return sum_i
list=[1,2,3,4,5]
sum1=sum1(list)
print("Sum="+str(sum1))