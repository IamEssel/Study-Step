# Tuples
dynamic_tuple = ("Car", 2025, 4.5, False) # A tuple(ordered, immutable) with mixed data types
my_tuple = tuple(["Train", 79900, 3.5, True]) # Creating a tuple from a list : tuple constructor
print(dynamic_tuple)
print(my_tuple)
print(my_tuple.index(3.5)) # returns the index of the value 3.5 in my_tuple

#tuple slicing
print(dynamic_tuple[1:4]) # Slicing from index 1 to 3(index 4 not included)

#tuple concatenation
combined_tuple = dynamic_tuple + my_tuple
print(combined_tuple)

#tuple duplicates
new_tuple = dynamic_tuple + (2025,) # the comma at the end is necessary to create a single-element tuple
print(new_tuple)

#other tuple methods
len_of_tuple = len(combined_tuple)
print(len_of_tuple)

count_2025 = new_tuple.count(2025)
print(count_2025)

#tuple unpacking
car_specs = ("Benz", 2026, "3.8L V8", True)

brand, model_year, engine, is_automatic = car_specs
print(f"Brand: {brand}")

# Lists
my_list = ["Apple", "Banana", 42, 3.14, True] # A list(ordered, mutable) with mixed data types
print(my_list)

empty_list = [] # An empty list
mammals = ["Lion", "Tiger", "Elephant"] # A list of strings
cereals = list(("Wheat", "Rice", "Oats")) # Creating a list from a tuple : list constructor


# Sets
my_set = {"ALX", 2026, 32.55, False} # A set(unordered, mutable) with mixed data types
print(my_set)

# Dictionaries
storehouse = {
    "name": "McLaren",
    "model": 2025,
    "price": 250000.99,
    "automatic": True
} # A dictionary(unordered, mutable) with key-value pairs

