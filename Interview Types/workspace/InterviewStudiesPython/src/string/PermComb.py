'''
Created on 31 Oca 2014

@author: cm
'''
class PermComb:
    
    def __init__(self):
        self.data = []
    
    def perm(self,prefix, word):
        if not word:
            print(prefix)        
        for i in range(len(word)):
            self.perm(prefix + word[i] , word[:i] + word[i+1:])
       
    def comb(self,prefix, word):
        if prefix:
            print(prefix)        
        for i in range(len(word)):
            self.comb(prefix + word[i], word[i+1:])
        
        
        
pc = PermComb()
pc.perm('', 'abc')
print('\n')
pc.comb('', 'xyz')