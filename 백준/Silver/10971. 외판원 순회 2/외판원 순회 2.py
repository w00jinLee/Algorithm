N = int(input())
visited=[False for i in range(N)]

W=[]
minCost=[]

for i in range(N):
    W.append(input().split())
    for j in range(N):
        W[i][j] = int(W[i][j])

def backTracking(start, cur, count, currentCost):
    if count == N:
        if W[cur][start]!=0:    # 자기 자신을 가리키는지
            minCost.append(currentCost + W[cur][start])
        return
        #종료 조건문
    for i in range(N):
        if visited[i] == True: # 이미 방문했으면 건너뛰기
            continue
        if W[cur][i] == 0: # 자기 자신을 가르키는지 
            continue
        visited[i]=True
        backTracking(start, i, count+1, currentCost + W[cur][i]) # 시작 도시, 현재위치, 방문한 도시횟수 증가,누적 비용에 현재 비용 추가
        visited[i]=False

visited[0]=True
backTracking(0, 0, 1, 0)        

minCost.sort()
print(minCost[0])