-- 코드를 입력하세요
select fp.PRODUCT_ID, fp.PRODUCT_NAME, sum(fp.PRICE * fo.AMOUNT) as TOTAL_SALES
from FOOD_PRODUCT fp
join FOOD_ORDER fo
    on fo.PRODUCT_ID = fp.PRODUCT_ID
where fo.PRODUCE_DATE between '2022-05-01' and '2022-05-31'
group by fp.PRODUCT_ID
order by TOTAL_SALES desc, fp.PRODUCT_ID