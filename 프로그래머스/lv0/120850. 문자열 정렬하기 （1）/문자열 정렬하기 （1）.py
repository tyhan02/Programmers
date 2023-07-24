def solution(my_string):
    answer = []
    
    for char in list(my_string):
        if char.isnumeric():
            answer.append(int(char))
        
    return sorted(answer)