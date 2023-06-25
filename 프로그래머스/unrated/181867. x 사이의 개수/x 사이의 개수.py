def solution(myString):
    split_strings = myString.split("x")
    lengths = [len(s) for s in split_strings]
    return lengths