a = list(map(int, input().split()))
seta = []
for i in a:
    if not i in seta:
        seta.append(i)
print(seta) #1

newa = seta.copy()
for i in range (len(newa)):
    if (newa[i] % 2) == 0:
        newa[i] = newa[i]**2
    else:
        newa[i] = newa[i]**3
print (newa) #2

tbc = 0
dem = 0
for i in range (1,len(seta), 2):
    tbc += seta[i]
    dem += 1
tbc = float(tbc) / dem
print (tbc) #3

seta.sort(reverse=True)
print (seta) #4