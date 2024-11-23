alphabets = ["a","b","c","d","e","f","g",
             "h","i","j","k","l","m","n",
             "o","p","q","r","s","t","u",
             "v","w","x","y","z"]

index_list = []
character_list = []

ciphered = input("Enter ciphered text: ").lower()
for i in range(len(ciphered)):
    for j in range(0,26):
        if ciphered[i] == alphabets[j]:
            index_list.append(alphabets.index(ciphered[i]))
            

for i in range(0,len(index_list)):
  for j in range(1,26):
    cipher_index = index_list[i]+j
    if cipher_index > 25 :
       cipher_index = index_list[i]-26+j
    character_list.append(alphabets[cipher_index])

def column_print(character_list, rows = 25):
  #now we group the data into chunks of rows  
  columns = [character_list[i:i+rows] for i in range(0, len(character_list), rows)]

  #find the maximum number of columns needed
  max_rows = rows
  max_columns  = len(columns)

  for row in range(max_rows):
        for col in range(max_columns):
            # Print character if it exists, else print a space
            character = columns[col][row] if row < len(columns[col]) else " "
            print(f"{character:<0}", end=" ")  # Adjust spacing as needed
        print()  # Move to the next row

column_print(character_list)






   