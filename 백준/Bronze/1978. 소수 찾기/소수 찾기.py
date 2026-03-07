N = int(input())
cnt = 0
numbers = input().split()

for i in range(len(numbers)):
    numbers[i] = int(numbers[i])

def  checkNumber(num):
    if num == 2:
        return True
    for i in range(2, num-1):
        if num % i == 0:
            return False
    return True

for i in range(len(numbers)):
    if numbers[i] != 1 and checkNumber(numbers[i]):
        cnt += 1

print(cnt)