text = input()
kq = list(set(list(text.lower().split())))
dem = 0
i = 0
while i < len(kq)-1:
    if len(kq[i]) >= 4:
        kq.pop(i)
        dem += 1
        i -= 1
    else:
        dem += 1
    i += 1
print(kq)
print(dem)