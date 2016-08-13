drop table if exists `message`;
CREATE TABLE `message` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `message` varchar(512) DEFAULT NULL,
  `destination` varchar(90) NOT NULL,
  `delivery_type` int(11) NOT NULL,
  `delivery_time` datetime DEFAULT NULL,
  `has_sent` tinyint(1) DEFAULT '0',
  `sent_at` datetime DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `ix_sent_at_has_sent` (`has_sent`,`sent_at`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8
