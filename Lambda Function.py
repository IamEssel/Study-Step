# this is an extensive lesson on the lambda function
# a lambda function can take any number of arguments but can only have one expression

# the syntax is lambda arguments : expression

# example 1(one argument)
x = lambda a :a + 10
print(x(5))

# example 2(multiple arguments)
y = lambda a,b,c : a+b*c
print(y(3, 9, 4))

#why lambda functions?
"""The power of lambda functions is better shown when used as an
anononymous function inside another function and this will be demonstrated below"""

def new(n):
    return lambda a : a * n

# whatever input the multiplier variable receives 
# will be passed into the new function defined above into the parameter "n"
multiplier = new(int(input("Enter multiplier factor: ")))
# the input taken below will be passed into the lambda function as value "a"
print(multiplier(int(input("Enter any number: "))))
# ultimately, the new function sources the lambda function with the value of "n"