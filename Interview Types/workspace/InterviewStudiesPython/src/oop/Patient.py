'''
Created on 31 Oca 2014

@author: cm
'''

class Patient:
            
    def __init__(self, name="", idn="", priority=0):
            self.name = name;
            self.idn = idn;
            self.priority = priority;        
    def __repr__(self):
        return self.name + ' ' + self.idn + ' ' + str(self.priority)
            
    def getName(self):
        return self.name
    def getidn(self):
        return self.idn
    def getpriority(self):
        return self.priority
    
    def setPriority(self, _priority):
        self.priority = _priority