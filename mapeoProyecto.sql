
CREATE TABLE `clientes` (
  `idCliente` int(11) NOT NULL AUTO_INCREMENT,
  `nit` int(11) DEFAULT NULL,
  `nombre` varchar(50) NOT NULL,
  `telefono` int(11) DEFAULT NULL,
  `email` varchar(50) DEFAULT NULL,
  `direccion` varchar(100) NOT NULL,
  PRIMARY KEY (`idCliente`)
) ENGINE=InnoDB;

--
-- Table structure for table `envios`
--


CREATE TABLE `envios` (
  `idEnvios` int(11) NOT NULL AUTO_INCREMENT,
  `id_Cliente` int(11) DEFAULT NULL,
  `peso` decimal(10,2) NOT NULL,
  `categoria` varchar(20) NOT NULL,
  `ingreso` date NOT NULL,
  `priorizar` tinyint(1) NOT NULL DEFAULT 0,
  `id_Ruta` int(11) DEFAULT NULL,
  `cod_D` varchar(12) DEFAULT NULL,
  `paisD` varchar(20)  DEFAULT NULL,
  `ciudad_D` varchar(20)  DEFAULT NULL,
  `ubicacion` varchar(12) DEFAULT NULL,
  `montoPriorizar` decimal(10,2) DEFAULT NULL,
  `montoPeso` decimal(10,2) DEFAULT NULL,
  `montoDestino` decimal(10,2) DEFAULT NULL,
  `montoTotal` decimal(10,2) DEFAULT NULL,
  `costo` decimal(12,2) DEFAULT 0.00,
  PRIMARY KEY (`idEnvios`),
  KEY `FK_IDRUTA` (`id_Ruta`),
  KEY `idCliente` (`id_Cliente`),
  CONSTRAINT `FK_IDRUTA` FOREIGN KEY (`id_Ruta`) REFERENCES `rutas` (`idRutas`) ON DELETE CASCADE ON UPDATE CASCADE,
  CONSTRAINT `envios_ibfk_1` FOREIGN KEY (`id_Cliente`) REFERENCES `clientes` (`idCliente`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB;

--
-- Table structure for table `facturas`
--


CREATE TABLE `facturas` (
  `noFactura` int(11) NOT NULL AUTO_INCREMENT,
  `idCliente` int(11) DEFAULT NULL,
  `nitCliente` int(11) DEFAULT NULL,
  `nombre` varchar(50)  DEFAULT NULL,
  `direccion` varchar(100) NOT NULL,
  `fecha` date NOT NULL,
  `idEnvio` int(11) NOT NULL,
  `montoTotal` decimal(10,2) NOT NULL,
  PRIMARY KEY (`noFactura`),
  KEY `idEnvio` (`idEnvio`),
  KEY `idCliente` (`idCliente`),
  CONSTRAINT `facturas_ibfk_2` FOREIGN KEY (`idEnvio`) REFERENCES `envios` (`idEnvios`) ON DELETE CASCADE ON UPDATE CASCADE,
  CONSTRAINT `facturas_ibfk_3` FOREIGN KEY (`idCliente`) REFERENCES `clientes` (`idCliente`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB;

--
-- Table structure for table `precios`
--


CREATE TABLE `precios` (
  `idPrecio` int(11) NOT NULL AUTO_INCREMENT,
  `tipoDePago` varchar(20)  NOT NULL,
  `precio` decimal(10,2) NOT NULL,
  PRIMARY KEY (`idPrecio`)
) ENGINE=InnoDB;

--
-- Table structure for table `puntosDeControl`
--

CREATE TABLE `puntosDeControl` (
  `codigo` varchar(12) NOT NULL,
  `pais_P` varchar(20) NOT NULL,
  `ciudad_P` varchar(20) NOT NULL,
  `tarifa` decimal(10,2) DEFAULT NULL,
  `tamañoBodega` int(2) NOT NULL,
  `encargado` varchar(10) NOT NULL,
  PRIMARY KEY (`codigo`),
  KEY `encargado` (`encargado`),
  CONSTRAINT `puntosDeControl_ibfk_1` FOREIGN KEY (`encargado`) REFERENCES `usuarios` (`usuario`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB;

--
-- Table structure for table `rutas`
--


CREATE TABLE `rutas` (
  `idRutas` int(11) NOT NULL AUTO_INCREMENT,
  `Destino` varchar(20)  NOT NULL,
  `pais` varchar(20) NOT NULL,
  `ciudad` varchar(20)NOT NULL,
  `precio` decimal(10,2) NOT NULL,
  `puntosC` int(2) NOT NULL,
  `pc1` varchar(12) DEFAULT NULL,
  `pc2` varchar(12) DEFAULT NULL,
  `pc3` varchar(12) DEFAULT NULL,
  `pc4` varchar(12) DEFAULT NULL,
  `pc5` varchar(12) DEFAULT NULL,
  PRIMARY KEY (`idRutas`),
  KEY `FK_PC1` (`pc1`),
  KEY `FK_PC2` (`pc2`),
  KEY `FK_PC3` (`pc3`),
  KEY `FK_PC4` (`pc4`),
  KEY `FK_PC5` (`pc5`),
  CONSTRAINT `FK_PC1` FOREIGN KEY (`pc1`) REFERENCES `puntosDeControl` (`codigo`) ON DELETE CASCADE ON UPDATE CASCADE,
  CONSTRAINT `FK_PC2` FOREIGN KEY (`pc2`) REFERENCES `puntosDeControl` (`codigo`) ON DELETE CASCADE ON UPDATE CASCADE,
  CONSTRAINT `FK_PC3` FOREIGN KEY (`pc3`) REFERENCES `puntosDeControl` (`codigo`) ON DELETE CASCADE ON UPDATE CASCADE,
  CONSTRAINT `FK_PC4` FOREIGN KEY (`pc4`) REFERENCES `puntosDeControl` (`codigo`) ON DELETE CASCADE ON UPDATE CASCADE,
  CONSTRAINT `FK_PC5` FOREIGN KEY (`pc5`) REFERENCES `puntosDeControl` (`codigo`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB;

--
-- Table structure for table `usuarios`
--


CREATE TABLE `usuarios` (
  `usuario` varchar(10) NOT NULL,
  `contraseña` varchar(10) NOT NULL,
  `tipoUsuario` varchar(15) NOT NULL,
  `nombre` varchar(30) NOT NULL,
  `apellidos` varchar(20) NOT NULL,
  PRIMARY KEY (`usuario`)
) ENGINE=InnoDB;

