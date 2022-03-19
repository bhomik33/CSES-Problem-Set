import sys
import math
import random
import os
 
n = int(input())
nums = [int(item) for item in input().split()]
sum = 0
ans = 0
for i in range(0, n -1):
    sum += nums[i]
 
ans = (n* (n+1) // 2) - sum
print(ans)
