def solution(n):
    c = list(str(n))
    c.sort(reverse = True)
    answer = int("".join(c))
    return answer