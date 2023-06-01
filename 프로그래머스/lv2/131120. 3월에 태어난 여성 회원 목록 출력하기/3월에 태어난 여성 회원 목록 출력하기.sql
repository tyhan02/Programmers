select MEMBER_ID, MEMBER_NAME, GENDER, to_char(DATE_OF_BIRTH, 'YYYY-MM-DD') as DATE_OF_BIRTH
    from MEMBER_PROFILE
    where TLNO is not null                    
        and TO_CHAR(DATE_OF_BIRTH, 'MM') = 3    
        and GENDER = 'W'
    order by MEMBER_ID