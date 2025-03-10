# importing math and cmath libraries for square root and complex square root functions
import math, cmath

# taking coefficients

a = float(input("Enter coefficient of x-squared: "))
while a == 0:
    print("Coefficient of x-squared must not be 0!")
    a = float(input("Enter coefficient of x-squared: "))
# the while loop above is to ensure that the value of a is never 0
b = float(input("Enter coefficient of x: "))
c = float(input("Enter constant: "))

#calculation and display of discriminant
discriminant = pow(b,2)-4*a*c
print("Discriminant is ",discriminant)

#logical statements for checking the type of discriminant and calculating the roots based on that
if discriminant == 0:
    root = -b/2*a
    # if the discriminant is 0 this (-b/2*a) is what will be left of the formula
    print("Repeated roots.\nThe root is ", root)
    print("", root)
elif discriminant > 0:
    # the math square root functions allows us to take the square root of the discriminant
    root1 = (-b + math.sqrt(discriminant))/2*a
    root2 = (-b - math.sqrt(discriminant))/2*a
    print("Real and distinct roots.\nThe roots are ",(root1),",",(root2))
else:
    # the cmath square root functions allows us to take the square root of a complex discriminant
    root1 = (-b + cmath.sqrt(discriminant))/2*a
    root2 = (-b - cmath.sqrt(discriminant))/2*a
    print("Complex roots.\nThe roots are ",root1,",",root2)