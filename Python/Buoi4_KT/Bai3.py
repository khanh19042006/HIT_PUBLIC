a = input()

number = ""
s = ""
res = ""
check = 1

for i in a:
    if i == "[": continue
    if i >= "1" and i <= "9":
        number += i
    elif (i >= "a" and i <= "z") or (i >= "A" and i <= "Z"):
        s += i
    elif i == "]":
        if len(number) == 0: number = "1"
        res += int(number) * s
        number = ""
        s = ""
res += s
print (res)

