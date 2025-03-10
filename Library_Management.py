# Create a Library Management System that allows users to add books, borrow and return books, 
# and view available books.
# The program should offer a simple menu with basic functionalities.

#Library Stock(A list containing dictionaries)
library = [{"title":"Circuit Theory", "author":"Bill Clinton","year":2009, "edition":6, "available":True,},
           {"title":"Living Streams", "author":"Word Family","year":2024, "edition":1, "available":True,},
           {"title":"Life Hacks", "author":"Bright Howards","year":2023, "edition":19, "available":True,}
]

def all_books():
    """Displays all books in the library
       with their availability status.""" 
    # triple double quotes are like multi-line comments
    if not library:
        print("No books in the library!")
        return
    
    for index,book in enumerate(library, 1): 
        #this syntax is for the enumerate function. The index matches the 1
        #and the book matches the library.
        #enumerate() can help list an index-element pair of a string or list
        status = "Available" if book["available"] else "Borrowed"
        #the printing is going to be formatted so it is readable
        print(f"{index}. {book["title"]} by {book["author"]} {book["year"]}, Edition {book["edition"]} - {status}")
        # in now this becomes like a function when book = library. 
        # So the book["title"] checks through the library list and uses the title as an index


 #Adds a new book to the library
def add_book():
    title = input("Enter book title: ").strip()
    author = input("Enter author name: ").strip()
    year = int(input("Enter publication year: "))
    edition = int(input("What edition is it? "))

    new_book = {"title":title, "author": author, "year": year, "edition":edition}
    library.append(new_book)
    print(f"{title} has been added to the library.")

    #this function is the book borrowing function
def borrow_book():
    title = input("Enter the title of the book to be borrowed: ").strip()
    #strip() function simply clears the whitespaces before and after actual characters

#we loop through the library and compare the inputted book name against the available
    for book in library:
        if book["title"].lower() == title.lower():
            if book["available"]:
                book["available"] = False
                print(f"You have borrowed {book["title"]}.")
                return
            else:
                print("Sorry, this book is already borrowed.")
                return
    print("Book not found.")

#Function for book returning.
def return_book():
    title = input("Enter the title of the book to return: ").strip()

#we loop through the library and compare the inputted book name against the available
    for book in library:
        if book["title"].lower() == title.lower():
            if not book["available"]:
                book["available"] = True
                print(f"{book["title"]} has been returned to the library.")
                return
            else:
                print("This book was not borrowed.")
                return
    print("Book not in library.")

#Main Program - The access menu
while True:
    print("\n---Library Menu---")
    print("1. View All Books")
    print("2. Add Book")
    print("3. Borrow Book")
    print("4. Return Book")
    print("5. Exit")

    choice = input("Enter option: ")

    if choice == "1":
        all_books()
    elif choice == "2":
        add_book()
    elif choice == "3":
        borrow_book()
    elif choice == "4":
        return_book()
    elif choice == "5":
        confirm = input("Do you want to exit? ")
        if confirm == "Yes":
            print("---Exiting Menu---")
            break
        else:
            continue
    else:
        print("Invalid choice. Please enter a number between 1 and 5.")