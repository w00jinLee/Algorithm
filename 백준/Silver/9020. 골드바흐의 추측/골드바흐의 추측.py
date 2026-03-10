import math
T = int(input())

for i in range(T):
    # 골드바흐의 추측은 유명한 정수론의 미해결 문제로, 2보다 큰 모든 짝수는 두 소수의 합으로 나타낼 수 있다는 것이다.
    # 이러한 수를 골드바흐 수라고 한다. 또, 짝수를 두 소수의 합으로 나타내는 표현을 그 수의 골드바흐 파티션이라고 한다. 
    # 예를 들면, 4 = 2 + 2, 6 = 3 + 3, 8 = 3 + 5, 10 = 5 + 5, 12 = 5 + 7, 14 = 3 + 11, 14 = 7 + 7이다. 10000보다 작거나 같은 모든 짝수 n에 대한 골드바흐 파티션은 존재한다.

    n = int(input())
    
    primeNumber = []

    def checkPrimeNUmber(num):
        if num <2:
            return False
        for i in range(2,int(math.sqrt(num))+1):
            if num % i ==0: 
                return False
        return True

    for i in range(n//2, 0, -1): # 
        if checkPrimeNUmber(i) and checkPrimeNUmber(n-i) :
            primeNumber.append([i,n-i])
            break;
    
    print(primeNumber[0][0], primeNumber[0][1])