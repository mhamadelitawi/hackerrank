#MySQL


Revising the Select Query I:
============================
select * from CITY where population > 100000 and CountryCode  = 'USA';



Revising the Select Query II:
==============================
select name from City where population > 120000 and CountryCode = 'USA'



Select All:
===========
select * from city



Select By ID:
=============
select * from city where id = 1661



Japanese Cities' Attributes:
============================
select * from city where COUNTRYCODE  = 'JPN'



Japanese Cities' Names:
=======================
select name from City where COUNTRYCODE = 'JPN'



Weather Observation Station 1:
==============================
select city , state from station



Weather Observation Station 3:
==============================
select distinct (city) from station where (id % 2) = 0



Weather Observation Station 4:
==============================
select ( select count(*) from station ) - (select count(distinct (city)) from station ) from dual



Weather Observation Station 5:
==============================
select CITY, length(CITY) as l from station 
where CITY = ( select CITY from station order by length(CITY), city limit 1 )
or
CITY = ( select CITY from station order by length(CITY) desc, city limit 1 )
order by l



Weather Observation Station 6:
==============================
1-
select distinct (city) from station where city Like "a%"  or city Like "e%" or city Like "i%"  or city Like "o%" or city Like "u%"
2-
SELECT DISTINCT city FROM station WHERE city REGEXP "^[aeiou].*";



Weather Observation Station 7:
==============================