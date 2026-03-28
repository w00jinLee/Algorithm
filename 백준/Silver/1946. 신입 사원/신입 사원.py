import sys

T = int(input())

for _ in range(T):
    N = int(input())
    passCount = 0
    peopleList = []
    
    for i in range(N):
        peopleList.append(tuple(map(int, sys.stdin.readline().split())))

    peopleList.sort()
    minMeeting = 100001

    for i in range(len(peopleList)):
        if peopleList[i][1] < minMeeting:
            minMeeting = peopleList[i][1]
            passCount+=1

    print(passCount)