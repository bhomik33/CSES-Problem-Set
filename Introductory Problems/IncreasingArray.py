import sys
import math
import random
import os
 
n = int(input())
nums = [int(item) for item in input().split()]
mx = 0
ans = 0
for i in range(0, n):
    mx = max(nums[i], mx)
    ans += mx - nums[i]
print(ans)
 
