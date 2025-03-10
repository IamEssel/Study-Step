#functions = a block of code which is executed only when called

def newFunction(firstname,lastname):
    print("hallo " + firstname + lastname)

newFunction("Nana","Essel")

#return statements = Functions send Python values/objects back to the caller

def multiplication(number1,number2):
    return number1 * number2

a = multiplication (6,8)
print(a)


#keyword parameters = they are preceded by identifiers and their order 
#                     doesn't matter since they are identified

def person(firstname,lastname,age):
    print("Yo "+ firstname +" "+ lastname + " "+ str(age))

person(firstname="Nana", lastname="Essel", age=17)

#nested function calls

print(abs(round(float(input("Enter any number: ")))))

#scope = the region that a variable is recognized

name = "senior"

def variable():
    name = "bossman"
    print(name)#local variable will be used first

variable()
print(name)#and then global variable

#the order for variable reading in functions is Local, Enclosing, Global, Built-in



