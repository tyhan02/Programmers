def solution(s):
    sopen=0
    sclose=0
    for i in s:
        if i=="(":
            sopen+=1
        else:
            sclose+=1
        if sclose>sopen:
            return False
    if sopen==sclose:
        return True
    else:
        return False