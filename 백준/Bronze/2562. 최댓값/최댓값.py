list = [int(input()) for i in range(9)]

max = 0
pos = 0
for i in range(9):
    if list[i] > max:
        max = list [i]
        pos = i+1

print(max, pos)