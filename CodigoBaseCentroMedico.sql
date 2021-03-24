/*==============================================================*/
/* DBMS name:      MySQL 5.0                                    */
/* Created on:     25/2/2021 16:50:55                           */
/*==============================================================*/


drop table if exists ADMINISTRATIVO;

drop table if exists CITA;

drop table if exists MEDICO;

drop table if exists MEDICO_ESPECIALIDAD;

drop table if exists MEDICO_ESPECIALIDAD2;

drop table if exists PACIENTE;

drop table if exists PAGO;

/*==============================================================*/
/* Table: ADMINISTRATIVO                                        */
/*==============================================================*/
create table ADMINISTRATIVO
(
   ID_ADMI              char(10) not null,
   ADMI_NOMBRE          char(10) not null,
   ADMI_APELLIDO        char(10) not null,
   ADMI_CELULAR         char(10) not null,
   ADMI_CORREO          char(10),
   ADMI_DIRECCION       char(10) not null,
   ADMI_SEXO            char(10) not null,
   ADMI_FECHANACIMIENTO char(10) not null,
   primary key (ID_ADMI)
);

/*==============================================================*/
/* Table: CITA                                                  */
/*==============================================================*/
create table CITA
(
   ID_CITA              numeric(15,0) not null,
   ID_MEDICO            numeric(15,0),
   ID_PAC               numeric(15,0),
   ID_PAGO              numeric(10,0),
   ID_ADMI              char(10),
   CITA_HORA            time not null,
   CITA_FECHA           date not null,
   primary key (ID_CITA)
);

/*==============================================================*/
/* Table: MEDICO                                                */
/*==============================================================*/
create table MEDICO
(
   ID_MEDICO            numeric(15,0) not null,
   MED_NOMBRE           varchar(30) not null,
   MED_APELLIDO         varchar(30) not null,
   MED_CELULAR          numeric(15,0) not null,
   MED_CORREO           varchar(30) not null,
   primary key (ID_MEDICO)
);

/*==============================================================*/
/* Table: MEDICO_ESPECIALIDAD                                   */
/*==============================================================*/
create table MEDICO_ESPECIALIDAD
(
   ID_MEDICOESPE        varchar(10) not null,
   ESPE_NOMBRE          varchar(30) not null,
   primary key (ID_MEDICOESPE)
);

/*==============================================================*/
/* Table: MEDICO_ESPECIALIDAD2                                  */
/*==============================================================*/
create table MEDICO_ESPECIALIDAD2
(
   ID_MEDICOESPE        varchar(10) not null,
   ID_MEDICO            numeric(15,0) not null,
   primary key (ID_MEDICOESPE, ID_MEDICO)
);

/*==============================================================*/
/* Table: PACIENTE                                              */
/*==============================================================*/
create table PACIENTE
(
   ID_PAC               numeric(15,0) not null,
   PAC_NOMBRE           varchar(50) not null,
   PAC_APELLIDO         varchar(50) not null,
   PAC_CELULAR          numeric(15,0) not null,
   PAC_CORREO           varchar(30),
   PAC_DIRECCION        varchar(50) not null,
   PAC_SEXO             varchar(10) not null,
   PAC_FECHA_NACIMIENTO date not null,
   primary key (ID_PAC)
);

/*==============================================================*/
/* Table: PAGO                                                  */
/*==============================================================*/
create table PAGO
(
   ID_PAGO              numeric(10,0) not null,
   ID_CITA              numeric(15,0),
   PAGO                 bool not null,
   primary key (ID_PAGO)
);

alter table CITA add constraint FK_ADMI_CITA foreign key (ID_ADMI)
      references ADMINISTRATIVO (ID_ADMI) on delete restrict on update restrict;

alter table CITA add constraint FK_MEDICO_CITA foreign key (ID_MEDICO)
      references MEDICO (ID_MEDICO) on delete restrict on update restrict;

alter table CITA add constraint FK_PAC_CITA foreign key (ID_PAC)
      references PACIENTE (ID_PAC) on delete restrict on update restrict;

alter table CITA add constraint FK_PAGO_CITA2 foreign key (ID_PAGO)
      references PAGO (ID_PAGO) on delete restrict on update restrict;

alter table MEDICO_ESPECIALIDAD2 add constraint FK_MEDICO_ESPECIALIDAD foreign key (ID_MEDICOESPE)
      references MEDICO_ESPECIALIDAD (ID_MEDICOESPE) on delete restrict on update restrict;

alter table MEDICO_ESPECIALIDAD2 add constraint FK_MEDICO_ESPECIALIDAD2 foreign key (ID_MEDICO)
      references MEDICO (ID_MEDICO) on delete restrict on update restrict;

alter table PAGO add constraint FK_PAGO_CITA foreign key (ID_CITA)
      references CITA (ID_CITA) on delete restrict on update restrict;

