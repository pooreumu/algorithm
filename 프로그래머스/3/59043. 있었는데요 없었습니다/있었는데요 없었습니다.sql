select ao.ANIMAL_ID, ao.NAME
from ANIMAL_OUTS ao
join ANIMAL_INS ai on ao.ANIMAL_ID = ai.ANIMAL_ID
where ao.DATETIME < ai.DATETIME
order by ai.DATETIME