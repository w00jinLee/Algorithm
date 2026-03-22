n, m = input().split()

n, m = int(n), int(m)
# n개의 노드, m개의 리프

for i in range(n - m) :
    print(i, i + 1)

for i in range(n - m + 1, n):
    print(n - m, i)