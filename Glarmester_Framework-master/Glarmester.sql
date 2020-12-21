DROP SCHEMA IF EXISTS `glarmester`;
CREATE SCHEMA `glarmester`;
USE `glarmester`;

DROP TABLE IF EXISTS `frames`;


CREATE TABLE `frames` (
 `frame_name` varchar(45),
 `frame_price` double not null,
 PRIMARY KEY (`frame_name`)
);

CREATE TABLE `glass` (
`glass_type` varchar(45),
`glass_price` double not null,
PRIMARY KEY (`glass_type`)
);

INSERT INTO `glass` (`glass_type`,`glass_price`) VALUES ('Glass', 300);




INSERT INTO `frames` (`frame_name`, `frame_price`) VALUES ('Plain',100);
INSERT INTO `frames` (`frame_name`, `frame_price`) VALUES ('Ornate',200);
INSERT INTO `frames` (`frame_name`, `frame_price`) VALUES ('Lavish',350);



