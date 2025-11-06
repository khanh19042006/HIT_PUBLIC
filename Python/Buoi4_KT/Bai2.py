a = input()
dic = {}
for i in a:
    if i >= "A" or i <= "Z":
        i = i.lower()
    if i in dic:
        dic[i] += 1
    else:
        dic[i] = 1
print (dic)