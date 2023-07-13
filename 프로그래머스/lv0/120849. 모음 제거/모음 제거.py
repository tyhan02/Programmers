def solution(my_string):

    callection = ("a,e,i,o,u")
    answer =''
    for i in my_string:
        if i not in callection:
            answer +=i
    return answer