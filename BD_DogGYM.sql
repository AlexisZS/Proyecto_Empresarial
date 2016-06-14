use master;
-- Borra la bd
DROP DATABASE DogGYM
go

-- Creamos la bd
CREATE DATABASE DogGYM
go

-- Usar la bd
USE DogGYM
go

-- TABLAS
CREATE TABLE tb_categorias
(
  idCategoria         char(5) not null primary key ,
  nombreCategoria     varchar(15),
  descripcion         varchar(50),
  estado              bit
)
go

CREATE TABLE tb_proveedores
(
  idProveedor         char(5)  not null primary key,
  nombreCia           varchar(50) ,
  nombreContacto      varchar(30),
  cargoContacto       varchar(30),
  direccion           varchar(60),
  telefono            varchar(11),
  estado              bit
)
go

CREATE TABLE tb_productos
(
idProd                char(5) not null primary key,
nomPro                varchar(50),
idProveedor           char (5),
idCategoria           char (5),
disponible            int,
precio                decimal (8,2),
imagen                varchar(150),
estado                bit,

FOREIGN KEY (idProveedor) references  tb_proveedores (idProveedor),
FOREIGN KEY  (idCategoria) references tb_categorias (idCategoria)
)
go

CREATE TABLE tb_distritos
(
	idDistrito        int primary key,
	nomDistrito       varchar(50) not null
)
go

CREATE TABLE tb_tipo_usuario
(
	idTipoUsu         int primary key,
	desTipoUsu        varchar(30) not null
)
go

CREATE TABLE tb_usuarios
(
  idUsuario           varchar(15)  not null primary key,
  clave               varchar(15) not null,
  nombre              varchar(20),
  apePaterno          varchar(15),
  apeMaterno          varchar(15),
  fecNac              date,
  correo              varchar(30),
  direccion           varchar(60),
  idDistrito          int,
  telefono            varchar(11),
  idTipoUsu           int not null,
  estado              bit,
  FOREIGN KEY (idDistrito) references tb_distritos(idDistrito),
  FOREIGN KEY (idTipoUsu) references tb_tipo_usuario(idTipoUsu)
)
go

CREATE TABLE tb_pedidos
(
	idPedido               char (5) not null primary key,
	idUsuario              varchar(15) not null,
	idDistritoDestinatario int,
	fechaPedido            date,
	fechaEntrega           date not null,
	fechaEnvio             date not null,
	direccionDestinatario  varchar(60),
	estado                 bit,
  
  FOREIGN KEY (idUsuario) references tb_usuarios(idUsuario),
  FOREIGN KEY (idDistritoDestinatario) references tb_distritos(idDistrito)
)
go

CREATE TABLE tb_detalle_pedido
(
idDetallePed             char(5) not null primary key,
idPedido                 char (5) not null,
idProd                   char(5) not null,
cantidad                 int not null,
precioTotal              decimal(8,2),

FOREIGN KEY (idPedido) references tb_pedidos(idPedido),
FOREIGN KEY (idProd) references tb_productos(idProd)
)
go

CREATE TABLE tb_factura
(
numFac                    char(8) not null primary key,
fecFac                    date,
idUsuario                 varchar(15),
estFac                    varchar(20),
estado                    bit,
FOREIGN KEY (idUsuario) references tb_usuarios (idUsuario)
)
go

CREATE TABLE tb_detalle_factura
(
idDetFac                  char(5)not null primary key,
numFac                    char(8) not null,
idProd                    char(5) not null,
canVend                   int,    
preVenta                  decimal(8,2),
FOREIGN KEY (idProd) references tb_productos(idProd)
)
go

select * from tb_usuarios;
go



  CREATE TABLE tb_Departamento (
  cod_dpt                  CHAR(5) NOT NULL,
  desc_dpt                 VARCHAR(100) NULL,
  PRIMARY KEY (cod_dpt)
  )go

CREATE TABLE tb_provincia (
  cod_prov CHAR(5) NOT NULL,
  desc_prov VARCHAR(100) NULL,
  cod_dpt CHAR(5) NOT NULL,
  PRIMARY KEY (cod_prov, cod_dpt),
  CONSTRAINT fk_tb_provincia_tb_Departamento
    FOREIGN KEY (cod_dpt)
    REFERENCES tb_Departamento (cod_dpt)

	)
   

CREATE TABLE tb_Distrito (
  cod_dist CHAR(5) NOT NULL,
  desc_dist VARCHAR(45) NULL,
  cod_prov CHAR(5) NOT NULL,
  cod_dpt CHAR(5) NOT NULL,
  PRIMARY KEY (cod_dist, cod_prov, cod_dpt),
  CONSTRAINT fk_tb_Distrito_tb_provincia1
    FOREIGN KEY (cod_prov , cod_dpt)
    REFERENCES tb_provincia (cod_prov , cod_dpt)
  )



