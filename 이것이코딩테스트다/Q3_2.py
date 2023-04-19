
n, m, k = map(int, input().split())
data = list(map(int, input.split()))

data.sort()
print(data[-1] * (k * (m / k)) + data[-2] * int(m % k))