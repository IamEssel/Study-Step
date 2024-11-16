alphabets = ["a","b","c","d","e","f","g",
             "h","i","j","k","l","m","n",
             "o","p","q","r","s","t","u",
             "v","w","x","y","z"]

index_list = []
char_limit = 25

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
    print(alphabets[cipher_index])





  