str = input().upper()

#아스키 코드, A=65, Z= 90 a=97

check = [0 for i in range(91)]

for i in range(len(str)):
    check[ord(str[i])] +=1

#for i in range(65, len(check)):
#    if check[i] > 0 :
#        print("check: ", check[i], ", 문지: ", chr(i))

max=0
multimax=False
idx = 0

for i in range(65, len(check)):
    if max < check[i] :
        multimax = False
        max = check[i]
        idx = i
    elif max == check[i] :
        multimax = True

if multimax :
    print("?")
else:
    print(chr(idx))