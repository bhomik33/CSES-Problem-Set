import sys
import math
import random
import os

sequence = input()
count = 1
maxCount = 1

# Time complexity -> O(n)
# Space complexity -> O(1)
for i in range(0, len(sequence) -1):
    if sequence[i] == sequence[i+1]:
        count += 1
        maxCount = max(maxCount, count)
    else:
        count = 1
        continue
print(maxCount)



