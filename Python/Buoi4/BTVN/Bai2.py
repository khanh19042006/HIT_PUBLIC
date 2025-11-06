import re
import string

text = input()
text = re.sub(r'[^a-zA-ZÀ-ỹ\s]', '', text)
text.lower()
print (text) #1

demnguyen = 0
demphu = 0
nguyenam = "ueoai"
for i in text:
    if i.lower() in nguyenam:
        demnguyen += 1
    else:
        if i != " ":
            demphu += 1
print (demnguyen)
print (demphu) #2

a = text.split()
for i in range(len(a)):
    a[i] = a[i][::-1]
print (a) #3

newtext = ""
for i in a:
    newtext += i
newtext = newtext.lower()
if newtext == newtext[::-1]:
    print (True)
else:
    print (False) #4