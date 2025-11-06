s = input()
l = s.split(", ")
ds = []
for i in l:
    ds.append(tuple(i.split(":")))
print(*ds)  # 1

seta = set()
for i in ds:
    seta.add(i[0])
print(seta)

tbc = 0
dem = 0
for i in ds:
    tbc += float(i[1])
    dem += 1
print(tbc / dem)

maxi = 0
mini = 100000000
for i in ds:
    if float(i[1]) > maxi:
        maxi = float(i[1])
    if float(i[1]) < mini:
        mini = float(i[1])
print(maxi, mini)

tb = []
for ten in seta:
    tong = 0
    dem = 0
    for j in ds:
        if j[0] == ten:
            tong += float(j[1])
            dem += 1
    tb.append((ten, tong / dem))

for i in range(len(tb) - 1):
    for j in range(i + 1, len(tb)):
        if tb[i][1] < tb[j][1]:
            tb[i], tb[j] = tb[j], tb[i]

tb = tuple(tb)
print(tb)
