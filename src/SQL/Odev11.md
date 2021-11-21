# Ödev 11

Aşağıdaki sorgu senaryolarını dvdrental örnek veri tabanı üzerinden gerçekleştiriniz.

1. actor ve customer tablolarında bulunan first_name sütunları için tüm verileri sıralayalım.

2. actor ve customer tablolarında bulunan first_name sütunları için kesişen verileri sıralayalım.

3. actor ve customer tablolarında bulunan first_name sütunları için ilk tabloda bulunan ancak ikinci tabloda bulunmayan
   verileri sıralayalım.

---

### Cevaplar:

```
1. (select first_name from actor) union all (select first_name from customer);

2. (select first_name from actor) intersect (select first_name from customer);

3. (select first_name from actor) except (select first_name from customer);

```


