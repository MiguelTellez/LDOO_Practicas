
drop table `usuarios`;




CREATE TABLE `usuarios` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `usuario` varchar(50) DEFAULT NULL,
  `contrasena` varchar(50) DEFAULT NULL,
  `numerodeempleado` varchar (10) default NULL,
  `direccion` varchar (50) default NULL,
   `correo` varchar (50) default NULL,
  `admin` boolean default false, 
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=8 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
