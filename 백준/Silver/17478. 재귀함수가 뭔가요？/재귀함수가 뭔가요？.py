startComment = "어느 한 컴퓨터공학과 학생이 유명한 교수님을 찾아가 물었다."
underbar = "____"
questionComment = "\"재귀함수가 뭔가요?\""
answerComment = ["\"잘 들어보게. 옛날옛날 한 산 꼭대기에 이세상 모든 지식을 통달한 선인이 있었어.", "마을 사람들은 모두 그 선인에게 수많은 질문을 했고, 모두 지혜롭게 대답해 주었지.", "그의 답은 대부분 옳았다고 하네. 그런데 어느 날, 그 선인에게 한 선비가 찾아와서 물었어.\""]
lastComment = ["\"재귀함수는 자기 자신을 호출하는 함수라네\"",  "라고 답변하였지."]

N = int(input())

def func(n):
    if n < -N :
        return
    # N=2일떄 n=2, 1, 0 -1, -2
    # N=4일떄 n=4,3,2,1,0,-1,-2,-3,-4

    if n > 0:
        print((N-n)*underbar + questionComment)
        print((N-n)*underbar + answerComment[0])
        print((N-n)*underbar + answerComment[1])
        print((N-n)*underbar + answerComment[2])
    # # N =2일 때 - answercomment n=2일떄 출력, n=1일때 출력, n= 0일때 출력 x
    elif n==0 :
        print((N-n)*underbar + questionComment) 
        print((N-n)*underbar + lastComment[0])
        print((N-n)*underbar + lastComment[1])
    elif n < 0 : # n=-1일때, N+n=1, n=-2일때 N+n=0
        print((N+n)*underbar+lastComment[1])
    
    return func(n-1)


print(startComment)
func(N)