#MySQL


Type of Triangle:
=================
1-
SELECT CASE             
            WHEN A + B > C AND B + C > A AND A + C > B THEN
                CASE 
                    WHEN A = B AND B = C THEN 'Equilateral'
                    WHEN A = B OR B = C OR A = C THEN 'Isosceles'
                    ELSE 'Scalene'
                END
            ELSE 'Not A Triangle'
        END
FROM TRIANGLES;

2-
SELECT IF((A+ B) > C and (A + C)> B and (B + C) > A ,
            IF(A = B and A = C and C=B,'Equilateral',
                IF(A=B OR B = C OR A = C,'Isosceles','Scalene'))
        ,'Not A Triangle') TRIANGLES
FROM TRIANGLES




