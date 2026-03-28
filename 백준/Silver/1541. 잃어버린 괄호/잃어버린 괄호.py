numList = input().split("-")
result = 0

for i in range(len(numList)):
    listSum=0
    if "+" in numList[i]:
        numList[i] = numList[i].split("+")
        for j in range(len(numList[i])):
            listSum += int(numList[i][j])
        numList[i] = listSum
    else :
        numList[i] = int(numList[i])

result += numList[0]
for i in range(1, len(numList)):
    result -= numList[i]

print(result)