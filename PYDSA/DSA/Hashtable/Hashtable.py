class Hashtable:
    def __init__(self):
        self.size = 100 # SIZE OF THE LIST
        self.arr = [None for i in range(self.size)]

    def get_hash(self,key): # TO FIND INDEX or SIMPLY TO FIND THE HASH
        hash = 0
        for char in key:
            hash += ord(char) # GET ASC VALue
        return  hash % self.size

    def add(self,key,value):
        hash = self.get_hash(key)
        self.arr[hash] = value

    def get_value(self,key):
        hash = self.get_hash(key)
        return self.arr[hash]

    def del_value(self,key):
        hash = self.get_hash(key)
        self.arr[hash] = 0


ht = Hashtable()

ht.add('MARCH 9', 55)
ht.add('JAN 9',22)
print(ht.get_value('MARCH 9'))
print(ht.get_value('JAN 9'))

print(ht.del_value('MARCH 9'))
print(ht.get_value('MARCH 9'))



