CREATE TABLE IF NOT EXISTS `h_producer` (
  `h_hid` int(11) NOT NULL AUTO_INCREMENT,
  `h_name` varchar(20) NOT NULL,
  `h_country` varchar(20) NOT NULL,
  `h_year_of_foundation` int(11) NOT NULL,
  PRIMARY KEY (`h_hid`)
) ENGINE=InnoDB  DEFAULT CHARSET=utf8 AUTO_INCREMENT=9 ;

INSERT INTO `h_producer` (`h_hid`, `h_name`, `h_country`, `h_year_of_foundation`) VALUES
(1, 'KTM', 'Austria', 1934),
(2, 'Kawasaki', 'Japan', 1896),
(3, 'Honda', 'Japan', 1948),
(4, 'Suzuki', 'Japan', 1909),
(5, 'Husqvarna', 'Schweden', 1689),
(6, 'Husaberg', 'Schweden', 1988),
(7, 'GasGas', 'Spanien', 1971),
(8, 'Beta', 'Spanien', 1920);
