/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 * Author:  vektorel
 * Created: Oct 7, 2017
 */

create sequence seq_kisi_id ;

CREATE TABLE public.kisi
(
    id integer NOT NULL default nextval('seq_kisi_id'),
    ad character varying(30) COLLATE pg_catalog."default",
    soyad character varying(40) COLLATE pg_catalog."default",
    dogum_tarihi date,
    cinsiyet integer,
    adres character varying(200) COLLATE pg_catalog."default",
    email character varying(100) COLLATE pg_catalog."default",
    tel character varying(13) COLLATE pg_catalog."default",
    il_id integer,
    ilce_id integer,
    primary key(id)
);


CREATE TABLE public.il
(
id integer NOT NULL,
adi character varying(50),
plaka_kodu character varying(3),
PRIMARY KEY (id)
)
WITH (
OIDS = FALSE
);

ALTER TABLE public.il
OWNER to postgres;



insert into il (id,adi,plaka_kodu) values (1,'ADANA','01');
insert into il (id,adi,plaka_kodu) values (2,'Adiyaman','02');
insert into il (id,adi,plaka_kodu) values (3,'Afyon','03');
insert into il (id,adi,plaka_kodu) values (4,'Ağri','04');
insert into il (id,adi,plaka_kodu) values (5,'Amasya','05');
insert into il (id,adi,plaka_kodu) values (6,'Ankara','06');
insert into il (id,adi,plaka_kodu) values (7,'Antalya','07');
insert into il (id,adi,plaka_kodu) values (8,'Artvin','08');
insert into il (id,adi,plaka_kodu) values (9,'Aydin','09');
insert into il (id,adi,plaka_kodu) values (10,'Balikesir','10');
insert into il (id,adi,plaka_kodu) values (11,'Bilecik','11');
insert into il (id,adi,plaka_kodu) values (12,'Bingöl','12');
insert into il (id,adi,plaka_kodu) values (13,'Bitlis','13');
insert into il (id,adi,plaka_kodu) values (14,'Bolu','14');
insert into il (id,adi,plaka_kodu) values (15,'Burdur','15');
insert into il (id,adi,plaka_kodu) values (16,'Bursa','16');
insert into il (id,adi,plaka_kodu) values (17,'Çanakkale','17');
insert into il (id,adi,plaka_kodu) values (18,'Çankiri','18');
insert into il (id,adi,plaka_kodu) values (19,'Çorum','19');
insert into il (id,adi,plaka_kodu) values (20,'Denizlİ','20');
insert into il (id,adi,plaka_kodu) values (21,'Diyarbakir','21');
insert into il (id,adi,plaka_kodu) values (22,'Edirne','22');
insert into il (id,adi,plaka_kodu) values (23,'Elaziğ','23');
insert into il (id,adi,plaka_kodu) values (24,'Erzincan','24');
insert into il (id,adi,plaka_kodu) values (25,'Erzurum','25');
insert into il (id,adi,plaka_kodu) values (26,'Eskişehir','26');
insert into il (id,adi,plaka_kodu) values (27,'Gaziantep','27');
insert into il (id,adi,plaka_kodu) values (28,'Giresun','28');
insert into il (id,adi,plaka_kodu) values (29,'Gümüşhane','29');
insert into il (id,adi,plaka_kodu) values (30,'Hakkari','30');
insert into il (id,adi,plaka_kodu) values (31,'Hatay','31');
insert into il (id,adi,plaka_kodu) values (32,'Isparta','32');
insert into il (id,adi,plaka_kodu) values (33,'İçel','33');
insert into il (id,adi,plaka_kodu) values (34,'İstanbul','34');
insert into il (id,adi,plaka_kodu) values (35,'İzmir','35');
insert into il (id,adi,plaka_kodu) values (36,'Kars','36');
insert into il (id,adi,plaka_kodu) values (37,'Kastamonu','37');
insert into il (id,adi,plaka_kodu) values (38,'Kayserİ','38');
insert into il (id,adi,plaka_kodu) values (39,'Kirklareli','39');
insert into il (id,adi,plaka_kodu) values (40,'Kirşehir','40');
insert into il (id,adi,plaka_kodu) values (41,'Kocaeli','41');
insert into il (id,adi,plaka_kodu) values (42,'Konya','42');
insert into il (id,adi,plaka_kodu) values (43,'Kütahya','43');
insert into il (id,adi,plaka_kodu) values (44,'Malatya','44');
insert into il (id,adi,plaka_kodu) values (45,'Manisa','45');
insert into il (id,adi,plaka_kodu) values (46,'Kahramanmaraş','46');
insert into il (id,adi,plaka_kodu) values (47,'Mardin','47');
insert into il (id,adi,plaka_kodu) values (48,'Muğla','48');
insert into il (id,adi,plaka_kodu) values (49,'Muş','49');
insert into il (id,adi,plaka_kodu) values (50,'Nevşehir','50');
insert into il (id,adi,plaka_kodu) values (51,'Niğde','51');
insert into il (id,adi,plaka_kodu) values (52,'Ordu','52');
insert into il (id,adi,plaka_kodu) values (53,'Rize','53');
insert into il (id,adi,plaka_kodu) values (54,'Sakarya','54');
insert into il (id,adi,plaka_kodu) values (55,'Samsun','55');
insert into il (id,adi,plaka_kodu) values (56,'Siirt','56');
insert into il (id,adi,plaka_kodu) values (57,'Sinop','57');
insert into il (id,adi,plaka_kodu) values (58,'Sivas','58');
insert into il (id,adi,plaka_kodu) values (59,'Tekirdağ','59');
insert into il (id,adi,plaka_kodu) values (60,'Tokat','60');
insert into il (id,adi,plaka_kodu) values (61,'Trabzon','61');
insert into il (id,adi,plaka_kodu) values (62,'Tuncelİ','62');
insert into il (id,adi,plaka_kodu) values (63,'Şanliurfa','63');
insert into il (id,adi,plaka_kodu) values (64,'Uşak','64');
insert into il (id,adi,plaka_kodu) values (65,'Van','65');
insert into il (id,adi,plaka_kodu) values (66,'Yozgat','66');
insert into il (id,adi,plaka_kodu) values (67,'Zonguldak','67');
insert into il (id,adi,plaka_kodu) values (68,'Aksaray','68');
insert into il (id,adi,plaka_kodu) values (69,'Bayburt','69');
insert into il (id,adi,plaka_kodu) values (70,'Karaman','70');
insert into il (id,adi,plaka_kodu) values (71,'Kirikkale','71');
insert into il (id,adi,plaka_kodu) values (72,'Batman','72');
insert into il (id,adi,plaka_kodu) values (73,'Şirnak','73');
insert into il (id,adi,plaka_kodu) values (74,'Bartin','74');
insert into il (id,adi,plaka_kodu) values (75,'Ardahan','75');
insert into il (id,adi,plaka_kodu) values (76,'Iğdir','76');
insert into il (id,adi,plaka_kodu) values (77,'Yalova','77');
insert into il (id,adi,plaka_kodu) values (78,'Karabük','78');
insert into il (id,adi,plaka_kodu) values (79,'Kilis','79');
insert into il (id,adi,plaka_kodu) values (80,'Osmaniye','80');
insert into il (id,adi,plaka_kodu) values (81,'Düzce','81');