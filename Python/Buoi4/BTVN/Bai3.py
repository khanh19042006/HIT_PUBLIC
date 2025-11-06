t = input()

a = t.lower().split()

b = []
for x in a:
    if x not in b:
        b.append(x)

c = []
for x in b:
    c.append(a.count(x))

m = max(c)
u = b[c.index(m)]

v = b[0]
for x in b:
    if len(x) > len(v):
        v = x

s = sum(len(x) for x in a)

r = []
z = b[:]
while z:
    y = z[0]
    for x in z:
        if len(x) > len(y):
            y = x
    r.append(y)
    z.remove(y)

print(u, m)
print(v)
print(s)
print(r)
