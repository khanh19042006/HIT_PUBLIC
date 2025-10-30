ds = list(map(int,input().split()))
i = 0
while (i < len(ds)):
    if ds[i] < 5:
        ds.pop(i)
        i -= 1
    i += 1
ds.sort()
print(ds)
print(ds[0], ds[len(ds)-1])