
CREATE TABLE anios (
    ani_id          INT GENERATED ALWAYS AS IDENTITY,
    ani_descripcion VARCHAR(5) NOT NULL
);

ALTER TABLE anios ADD CONSTRAINT anios_pk PRIMARY KEY ( ani_id );

CREATE TABLE consumos (
    con_id           INT GENERATED ALWAYS AS IDENTITY,
    con_recurso      INTEGER NOT NULL,
    con_cantidad     DECIMAL NULL,
    con_unidades     INTEGER NOT NULL,
    con_mes          INTEGER NOT NULL,
    con_anio         INTEGER NOT NULL,
    con_equipo       INTEGER NOT NULL,
    con_tipo_emision INTEGER NOT NULL,
    con_tipo_consumo INTEGER NOT NULL
);

ALTER TABLE consumos ADD CONSTRAINT consumos_pk PRIMARY KEY ( con_id );

CREATE TABLE equipos (
    equ_id          INT GENERATED ALWAYS AS IDENTITY,
    equ_descripcion VARCHAR(16) NOT NULL
);

ALTER TABLE equipos ADD CONSTRAINT equipos_pk PRIMARY KEY ( equ_id );

CREATE TABLE meses (
    mes_id          INT GENERATED ALWAYS AS IDENTITY,
    mes_descripcion VARCHAR(10) NOT NULL
);

ALTER TABLE meses ADD CONSTRAINT meses_pk PRIMARY KEY ( mes_id );

CREATE TABLE recursos (
    rec_id          INT GENERATED ALWAYS AS IDENTITY,
    rec_descripcion VARCHAR(100) NOT NULL
);

ALTER TABLE recursos ADD CONSTRAINT recursos_pk PRIMARY KEY ( rec_id );

CREATE TABLE tipo_consumo (
    tco_id          INT GENERATED ALWAYS AS IDENTITY,
    tco_descripcion VARCHAR(50) NOT NULL
);

ALTER TABLE tipo_consumo ADD CONSTRAINT tipo_consumo_pk PRIMARY KEY ( tco_id );

CREATE TABLE tipo_emisiones (
    tem_id          INT GENERATED ALWAYS AS IDENTITY,
    tem_descripcion VARCHAR(50) NOT NULL
);

ALTER TABLE tipo_emisiones ADD CONSTRAINT tipo_emisiones_pk PRIMARY KEY ( tem_id );

CREATE TABLE unidades (
    uni_id           INT GENERATED ALWAYS AS IDENTITY,
    uni_abrevitatura VARCHAR(5) NOT NULL,
    uni_descripcion  VARCHAR(50) NOT NULL
);

ALTER TABLE unidades ADD CONSTRAINT unidades_pk PRIMARY KEY ( uni_id );

CREATE TABLE viajes (
    via_id       INT GENERATED ALWAYS AS IDENTITY,
    via_mes      INTEGER NOT NULL,
    via_anio     INTEGER NOT NULL,
    via_equipo   INTEGER NOT NULL,
    via_cantidad INTEGER NOT NULL
);

ALTER TABLE viajes ADD CONSTRAINT viajes_pk PRIMARY KEY ( via_id );

ALTER TABLE consumos
    ADD CONSTRAINT consumos_anios_fk FOREIGN KEY ( con_anio )
        REFERENCES anios ( ani_id );

ALTER TABLE consumos
    ADD CONSTRAINT consumos_equipos_fk FOREIGN KEY ( con_equipo )
        REFERENCES equipos ( equ_id );

ALTER TABLE consumos
    ADD CONSTRAINT consumos_meses_fk FOREIGN KEY ( con_mes )
        REFERENCES meses ( mes_id );

ALTER TABLE consumos
    ADD CONSTRAINT consumos_recursos_fk FOREIGN KEY ( con_recurso )
        REFERENCES recursos ( rec_id );

ALTER TABLE consumos
    ADD CONSTRAINT consumos_tipo_consumo_fk FOREIGN KEY ( con_tipo_consumo )
        REFERENCES tipo_consumo ( tco_id );

ALTER TABLE consumos
    ADD CONSTRAINT consumos_tipo_emisiones_fk FOREIGN KEY ( con_tipo_emision )
        REFERENCES tipo_emisiones ( tem_id );

ALTER TABLE consumos
    ADD CONSTRAINT consumos_unidades_fk FOREIGN KEY ( con_unidades )
        REFERENCES unidades ( uni_id );

ALTER TABLE viajes
    ADD CONSTRAINT viajes_anios_fk FOREIGN KEY ( via_anio )
        REFERENCES anios ( ani_id );

ALTER TABLE viajes
    ADD CONSTRAINT viajes_equipos_fk FOREIGN KEY ( via_equipo )
        REFERENCES equipos ( equ_id );

ALTER TABLE viajes
    ADD CONSTRAINT viajes_meses_fk FOREIGN KEY ( via_mes )
        REFERENCES meses ( mes_id );