def solution(arr, k):
    result = []
    unique_set = set()
    
    for num in arr:
        if num not in unique_set:
            unique_set.add(num)
            result.append(num)
            if len(result) == k:
                break
    
    while len(result) < k:
        result.append(-1)
    
    return result