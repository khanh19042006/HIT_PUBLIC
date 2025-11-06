a = list(map(int, input().split()))
print(a)

id_start = 0
id_end = 0
dem = 0
demmax = 0
dic = {}
listmax = []
for i in range (10):
    dic[i] = 0

while (id_end < len(a)):
    while (dic[a[id_end]] > 1):
        dic[id_start] -= 1
        id_start += 1
        dem -= 1

    dic[a[id_end]] += 1
    dem += 1

    if (dem > demmax and dic[a[id_end+1]] + 1 > 1):
        listmax = []
        demmax = dem
        for i in range (id_start, id_end+1):
            listmax.append(a[i])

print (listmax)
print (demmax)