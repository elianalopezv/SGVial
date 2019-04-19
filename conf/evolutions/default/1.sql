# --- Created by Ebean DDL
# To stop Ebean DDL generation, remove this comment and start using Evolutions

# --- !Ups

create table bordillo (
  id                            serial not null,
  longitud                      float not null,
  orden                         integer not null,
  indice_condicion              float not null,
  segmento_id                   integer not null,
  estado_id                     integer,
  constraint pk_bordillo primary key (id)
);

create table calzada (
  id                            serial not null,
  mdr                           float not null,
  opi                           float not null,
  iri                           float not null,
  segmento_id                   integer not null,
  funcionalidad_id              integer,
  superficie_id                 integer,
  constraint pk_calzada primary key (id)
);

create table estado (
  id                            serial not null,
  estado                        varchar(255),
  constraint pk_estado primary key (id)
);

create table funcionalidad (
  id                            serial not null,
  funcionalidad                 varchar(255),
  constraint pk_funcionalidad primary key (id)
);

create table nomenclatura (
  id                            serial not null,
  via_generadora                varchar(255),
  n_via_gen                     integer not null,
  cruce_desde                   varchar(255),
  n_cruce_desde                 varchar(255),
  cruce_hasta                   varchar(255),
  n_cruce_hasta                 varchar(255),
  segmento_id                   integer,
  constraint uq_nomenclatura_segmento_id unique (segmento_id),
  constraint pk_nomenclatura primary key (id)
);

create table segmento (
  id                            serial not null,
  longitud                      float not null,
  tipo_via                      varchar(255),
  estrato                       integer not null,
  constraint pk_segmento primary key (id)
);

create table superficie (
  id                            serial not null,
  superficie                    varchar(255),
  constraint pk_superficie primary key (id)
);

create index ix_bordillo_segmento_id on bordillo (segmento_id);
alter table bordillo add constraint fk_bordillo_segmento_id foreign key (segmento_id) references segmento (id) on delete restrict on update restrict;

create index ix_bordillo_estado_id on bordillo (estado_id);
alter table bordillo add constraint fk_bordillo_estado_id foreign key (estado_id) references estado (id) on delete restrict on update restrict;

create index ix_calzada_segmento_id on calzada (segmento_id);
alter table calzada add constraint fk_calzada_segmento_id foreign key (segmento_id) references segmento (id) on delete restrict on update restrict;

create index ix_calzada_funcionalidad_id on calzada (funcionalidad_id);
alter table calzada add constraint fk_calzada_funcionalidad_id foreign key (funcionalidad_id) references funcionalidad (id) on delete restrict on update restrict;

create index ix_calzada_superficie_id on calzada (superficie_id);
alter table calzada add constraint fk_calzada_superficie_id foreign key (superficie_id) references superficie (id) on delete restrict on update restrict;

alter table nomenclatura add constraint fk_nomenclatura_segmento_id foreign key (segmento_id) references segmento (id) on delete restrict on update restrict;


# --- !Downs

alter table if exists bordillo drop constraint if exists fk_bordillo_segmento_id;
drop index if exists ix_bordillo_segmento_id;

alter table if exists bordillo drop constraint if exists fk_bordillo_estado_id;
drop index if exists ix_bordillo_estado_id;

alter table if exists calzada drop constraint if exists fk_calzada_segmento_id;
drop index if exists ix_calzada_segmento_id;

alter table if exists calzada drop constraint if exists fk_calzada_funcionalidad_id;
drop index if exists ix_calzada_funcionalidad_id;

alter table if exists calzada drop constraint if exists fk_calzada_superficie_id;
drop index if exists ix_calzada_superficie_id;

alter table if exists nomenclatura drop constraint if exists fk_nomenclatura_segmento_id;

drop table if exists bordillo cascade;

drop table if exists calzada cascade;

drop table if exists estado cascade;

drop table if exists funcionalidad cascade;

drop table if exists nomenclatura cascade;

drop table if exists segmento cascade;

drop table if exists superficie cascade;

