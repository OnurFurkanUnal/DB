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


