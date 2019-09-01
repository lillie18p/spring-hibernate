select c.first_name, c.last_name, c.email, c.mobile, c.purchase_date, c.delivery_date, 
a.street_name, a.city, a.country
from `hb_web_appress`.`customer` c, `hb_web_appress`.`address` a
where c.address_id=a.id

select * from address