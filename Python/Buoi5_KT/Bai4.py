a = list(map(int, input().split()))

maxa = 0
newa = []
mymap = {}
res = []
for i in range(10):
    mymap[i] = 0

id_start = 0
id_end = 0

while id_end < len(a):
  mymap[a[id_end]] += 1
  newa.append(a[id_end])
  # print (mymap)
  # print (newa)
  # print (maxa)

  if (len(newa) > maxa):
    # print (newa)
    res = newa.copy()
    maxa = len(res)
    if mymap[a[id_end]] > 1:
      res.pop(maxa-1)
      maxa -= 1

  while (mymap[a[id_end]] > 1):
    mymap[a[id_start]] -= 1
    id_start += 1
    newa.pop(0)

  id_end += 1

if (len(newa) > maxa):
  res = newa.copy()
  maxa = len(res)
  if mymap[a[id_end]] > 1:
    res.pop(maxa-1)

print (res)
print (maxa)
