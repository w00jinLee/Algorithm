N = int(input())

flag_a = [False]*N
flag_b = [False for i in range(2*N-1)]
flag_c = [False for i in range(2*N-1)]

def backTracking(num):
    global cnt
    if num == N:
        cnt+=1
        return
    for i in range(N):
        if not flag_a[i] and not flag_b[num+i] and not flag_c[N-1+num-i]:                     
            flag_a[i] = True
            flag_b[num+i] = True
            flag_c[N-1+num-i] = True
            
            backTracking(num+1)
            flag_a[i] = False
            flag_b[num+i] = False
            flag_c[N-1+num-i] = False        
    
cnt=0

backTracking(0)

print(cnt)