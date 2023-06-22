def solution(array):
    answer = 0
    i=0
    
    array.sort()
    
    i = (len(array)) //2
    
    answer = array[i]
    
    return answer