import sys 

class Node: 
    def __init__(self, data):
        self.data = data
        self.next = None
        self.prev = None

class LinkedList:
    def __init__(self):
        self.head = Node(None)
        self.cursor = self.head

    def push(self, data):
        new_node = Node(data)
        self.cursor.next = new_node
        
        new_node.prev = self.cursor
        self.cursor = new_node

        return

    def L(self):
        if self.cursor.prev:
            self.cursor = self.cursor.prev
        return
    def D(self):
        if self.cursor.next:
            self.cursor = self.cursor.next
        return
    
    def B(self):
        if self.cursor == self.head :
            return 
    
        delete_node = self.cursor
        prev_node = delete_node.prev
        next_node = delete_node.next

        prev_node.next = next_node
        if next_node:
            next_node.prev = prev_node
        
        self.cursor = prev_node

        return

    def P(self , data):
        #추가할 노드 
        new_node = Node(data)
        new_node.prev = self.cursor
        new_node.next = self.cursor.next

        if self.cursor.next:
            self.cursor.next.prev = new_node

        self.cursor.next = new_node
        self.cursor = new_node

        return
    def printList(self):
        current = self.head.next
        result=""

        while current:
            result += current.data
            current = current.next
        print(result)
    

string = sys.stdin.readline().strip()
M = int(sys.stdin.readline())

li = LinkedList()

for i in range(len(string)) :
    li.push(string[i])
    
for i in range(M):
    command = sys.stdin.readline().strip()
        
    if "P" in command :
        command = command.split(" ") # [P , X] 로 저장
        li.P(command[1])
    elif command == "L" : 
        li.L()

    elif command == "D" :
        li.D()

    elif command == "B" :
        li.B()

li.printList()