s = input()
ds = ['u', 'e', 'o', 'a', 'i']
dem = 0
for i in range (len(s)):
    if (s[i] in ds):
        dem += 1
print(dem)
print(len(s) - dem)
print (s[::-1])

snew = s[::-1]
check = 0
for i in range (len(s)):
    if (s[i] != snew[i]):
        check = 1
        print("No")
        break
if check == 0:
    print("YES")    