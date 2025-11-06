a = input()
print(a.split(",")) #1

print(tuple(set(a.split(",")))) #2

print(len(tuple(set(a.split(","))))) #3

mostSell = ["Phone", "Laptop", "Smartwatch"]
b = list(a.split(",")).copy()
c = []
for i in mostSell:
    if i in b:
        c.append(i)
print (c) #5

c.clear()
for i in b:
    if not i in mostSell:
        c.append(i)
print(list(set(c))) #6