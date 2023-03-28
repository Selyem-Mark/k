select cim, tema
from Konyvtar.konyv
where tema not in ('krimi','sci-fi')
or tema is null;

select cim, tema
from Konyvtar.konyv
where tema is null;

select cim, tema
from Konyvtar.konyv
where tema is not null;

select cim, tema, oldalszam, ar, to_char(kiadas_datuma, 'YYYY.MM.DD')
from Konyvtar.konyv
where extract(year from kiadas_datuma) >= 1990
AND extract(year from kiadas_datuma) <= 2000
or ar >= 1000 And ar <= 3000
or tema = 'sci-fi' and oldalszam < 20
order by tema desc NULLs LAST,oldalszam;

select cim, tema, oldalszam, ar, to_char(kiadas_datuma, 'ds')
from Konyvtar.konyv
where extract(year from kiadas_datuma) Between 1990 And 200
or ar between 1000 and 3000
or tema = 'sci-fi' and oldalszam < 20
order by tema desc NULLs LAST,oldalszam;

select count(1)
from konyvtar.konyv;

select count(*)
from konyvtar.konyv
where ar < 3000;

select count(*)
from konyvtar.konyv
where tema is null;

select count(*)
from konyvtar.konyv
where tema is not null; 

select count(tema)
from konyvtar.konyv;

select count(distinct tema)
from konyvtar.konyv;

select distinct tema
from konyvtar.konyv;

select count(*)
from (Select distinct tema
        from konyvtar.konyv
        where tema is not null);

select max(ar)
from konyvtar.konyv;

select
    count(ar),
    sum(ar),
    min(ar),
    sum(ar),
    avg(ar)
    from konyvtar.konyv;
    
select 
    count(ar),
    sum(ar),
    round(avg(ar),2),
    round(sum(ar) / count(ar),2),
    round(sum(ar) / count(*),2),
    round(sum(nvl(ar,1000)) / count(ar),2),
    round(sum(nvl(ar,(select round(avg(ar),2) from konyvtar.konyv))) / count(*),2)
    from konyvtar.konyv;
    
select count(*), round(avg(ar),2)
from konyvtar.konyv
where tema = 'krimi';

select tema, count(*), round(avg(ar),2)
from konyvtar.konyv
group by tema;

select tema, count(*), round(avg(ar),2)
from konyvtar.konyv
where oldalszam < 500
group by tema
order by 3 desc;

select tema, count(*), kiado, avg(oldalszam)
from konyvtar.konyv
group by tema, kiado
order by 4 desc;


select substr(cim, 1, 4) ir_szam, count(*)
from konyvtar.tag
group by substr(cim, 1, 4)
order by 1 desc;

select substr(cim, 6, instr(cim, ',')-6) , count(*)
from konyvtar.tag
group by substr(cim, 6, instr(cim, ',')-6)
order by 1 desc;

select konyvtar.tag.keresztnev, months_between(sysdate,konyvtar.tag.szuletesi_datum)/12
from konyvtar.tag
where months_between(sysdate,konyvtar.tag.szuletesi_datum)/12 > 5;

select extract(year from szuletesi_datum) ev, count(*)
from konyvtar.tag
group by extract(year from szuletesi_datum)
having count(*) > 1
order by 1;

select *
from konyvtar.konyv, konyvtar.konyvtari_konyv
where konyvtar.konyv.konyv_azon = konyvtar.konyvtari_konyv.konyv_azon;

select *
from konyvtar.konyv k join konyvtar.konyvtari_konyv kk
on k.konyv_azon = kk.konyv_azon
where cim like 'N%';

select *
from konyvtar.konyv join konyvtar.konyvtari_konyv
using(konyv_azon);

select leltari_szam, ertek
from konyvtar.konyv join konyvtar.konyvtari_konyv
using(konyv_azon)
where cim = 'Tíz kicsi néger';

select honorarium
from konyvtar.szerzo join konyvtar.konyvszerzo
using(szerzo_azon)
where vezeteknev = 'King' and keresztnev = 'Stephan';

select vezeteknev, keresztnev, konyv.cim, leltari_szam
from konyvtar.tag join konyvtar.kolcsonzes on tag_azon = olvasojegyszam join  konyvtar.konyvtari_konyv using(leltari_szam) join konyvtar.konyv using(konyv_azon)
where besorolas = 'diák' and visszahozasi_datum is null;

