def solution(my_string):
    n = len(my_string)
    answer = [my_string[i:] for i in range(n)]
    return sorted(answer) 