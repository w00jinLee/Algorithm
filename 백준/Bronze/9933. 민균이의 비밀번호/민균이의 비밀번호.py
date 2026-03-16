N = int(input())

wordList = [input() for _ in range(N)]

for i in range(N):
    reveredWord = wordList[i][::-1]

    if wordList[i] in wordList and reveredWord in wordList  :
        print(len(wordList[i]), wordList[i][len(wordList[i])//2])
        break