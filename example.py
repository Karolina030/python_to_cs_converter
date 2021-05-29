i = 9
b = 7

if i == 9 and b>1:
    k=0
elif b < 2:
    p = 0
    k = 9.8
else:
    k = 9.8

a = 50

for x in [1,2,3]:
    print(x)

# komentarz

a = 2
b = 8
c = a + b
c = a - b
c = a * b
c = a / b

while c>0:
    a = a + 2
    c = c - 3

def funkcja(a,c):
    a=a+1
    c=a+1
    k = 5

    if a == 1 and c>2:
        c = 0
        k = 9.8
    return a

b = funkcja(1,6)
print(b)