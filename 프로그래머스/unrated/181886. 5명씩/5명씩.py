def solution(names):
    groups = []
    num_groups = len(names) // 5  
    remainder = len(names) % 5   

    for i in range(num_groups):
        group = names[i * 5: (i + 1) * 5] 
        groups.append(group[0])  

    if remainder > 0:
        last_group = names[-remainder:]  
        groups.append(last_group[0])     

    return groups