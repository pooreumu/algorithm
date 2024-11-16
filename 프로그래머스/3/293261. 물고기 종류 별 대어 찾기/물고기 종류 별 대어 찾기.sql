-- 코드를 작성해주세요
select ID, FISH_NAME, LENGTH
from FISH_INFO fi
join FISH_NAME_INFO fni on fi.FISH_TYPE = fni.FISH_TYPE
where (fi.FISH_TYPE, LENGTH) IN (select FISH_TYPE, MAX(LENGTH) from FISH_INFO group by FISH_TYPE)
