#!/usr/bin/env python
import sys

number = input("Enter an integer: ")
prime = True
primeNumbers = []

for x in range(2,number):
    prime = True
    for k in range(2,x):
        if x % k == 0:
            prime = False
            break
            
    if prime == True:
        primeNumbers.append(x)

print(primeNumbers)
