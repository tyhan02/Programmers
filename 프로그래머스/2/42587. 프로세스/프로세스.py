def solution(priorities, location):

    answer = 0
    loc = []

    for i in range(len(priorities)):               
                                                   
        for i in range(len(priorities)):
            if max(priorities) == priorities[i]:   
                loc.append(i)                      
                priorities[i] = 0                  

            if len(loc) == len(priorities):        
                break

        if len(loc) == len(priorities):         
            break
                   

    answer = loc.index(location) + 1

    return answer