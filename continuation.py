#dictionaries = A changeable, unordered collection of unique key:value pairs
#               They are fast because they use hashing, allows us to access vslues quickly


capitals = {'USA':'Washington DC',
            'Ghana':'Accra',
            'India':'New Dehli',
            'China':'Beijing'}

print(capitals['Ghana'])
print(capitals.get('Germany'))
print(capitals.items())
print(capitals.keys())


for key,value in capitals.items():#loop through the list for key,value pairs
    print(key,",",value)

capitals.update({'Germany':'Berlin'})#older dictionary values can also be updated
capitals.pop('India')#give the key, it removes the value associated with it as well
capitals.clear()


#index operator [] = gives access to a sequence's elements (str, list,tuples)

name = "nana Essel@"

if(name[0].islower()):
    print(name.capitalize())

first_name = name[0:4].capitalize()
last_character = name[-1]
print(last_character)
print(first_name)

