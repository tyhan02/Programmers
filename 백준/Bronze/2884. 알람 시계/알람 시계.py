time = input().split(' ')
h = int(time[0])
m = int(time[1])

if m > 44:
    print(h, m-45)
elif m <= 45 and h >= 1:
    print(h-1, m+15)
else:
    print(23, m+15)