import sys
import math
import random
import os

n = int(input())
ansString = ""
ansString += str(n) + " "
if n == 1 :
    print(ansString)
else:
    while n > 1:
        if n%2==0:
            n = n // 2
            ansString += str(n) + " "
        else:
            n = n * 3 + 1
            ansString += str(n) + " "
    print(ansString)
