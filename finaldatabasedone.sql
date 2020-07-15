/*
SQLyog - Free MySQL GUI v5.19
Host - 5.0.15-nt : Database - dm_pmse
*********************************************************************
Server version : 5.0.15-nt
*/

SET NAMES utf8;

SET SQL_MODE='';

create database if not exists `dm_pmse`;

USE `dm_pmse`;

SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0;
SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO';

/*Table structure for table `m_admin` */

DROP TABLE IF EXISTS `m_admin`;

CREATE TABLE `m_admin` (
  `admin_id` varchar(100) default NULL,
  `admin_pwd` varchar(100) default NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Data for the table `m_admin` */

insert into `m_admin` (`admin_id`,`admin_pwd`) values ('admin','admin');

/*Table structure for table `m_content_ontology` */

DROP TABLE IF EXISTS `m_content_ontology`;

CREATE TABLE `m_content_ontology` (
  `co_code` int(11) NOT NULL auto_increment,
  `keywords` varchar(150) default NULL,
  `parent` int(50) default NULL,
  `remarks` varchar(200) default NULL,
  `enc_keywords` varchar(200) default NULL,
  PRIMARY KEY  (`co_code`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Data for the table `m_content_ontology` */

insert into `m_content_ontology` (`co_code`,`keywords`,`parent`,`remarks`,`enc_keywords`) values (1,'Car',0,'Car-root',NULL);
insert into `m_content_ontology` (`co_code`,`keywords`,`parent`,`remarks`,`enc_keywords`) values (2,'Benz',1,'Benz-Car',NULL);
insert into `m_content_ontology` (`co_code`,`keywords`,`parent`,`remarks`,`enc_keywords`) values (3,'Jaguar',1,'Jaguar-Car',NULL);
insert into `m_content_ontology` (`co_code`,`keywords`,`parent`,`remarks`,`enc_keywords`) values (4,'Animal',0,'Animal-root',NULL);
insert into `m_content_ontology` (`co_code`,`keywords`,`parent`,`remarks`,`enc_keywords`) values (5,'Jaguar',4,'Jaguar-Animal',NULL);
insert into `m_content_ontology` (`co_code`,`keywords`,`parent`,`remarks`,`enc_keywords`) values (6,'Lion',4,'Lion-Animal',NULL);
insert into `m_content_ontology` (`co_code`,`keywords`,`parent`,`remarks`,`enc_keywords`) values (7,'Black Jaguar',3,'Black Jaguar-Jaguar',NULL);
insert into `m_content_ontology` (`co_code`,`keywords`,`parent`,`remarks`,`enc_keywords`) values (8,'Elephant',4,'Elephant-Animal',NULL);
insert into `m_content_ontology` (`co_code`,`keywords`,`parent`,`remarks`,`enc_keywords`) values (9,'Hotel',0,'Hotel-root',NULL);
insert into `m_content_ontology` (`co_code`,`keywords`,`parent`,`remarks`,`enc_keywords`) values (10,'Restaurant',9,'Restaurant-Hotel',NULL);
insert into `m_content_ontology` (`co_code`,`keywords`,`parent`,`remarks`,`enc_keywords`) values (11,'Reservation',9,'Reservation-Hotel',NULL);
insert into `m_content_ontology` (`co_code`,`keywords`,`parent`,`remarks`,`enc_keywords`) values (12,'Meeting Room',9,'Meeting Room-Hotel',NULL);
insert into `m_content_ontology` (`co_code`,`keywords`,`parent`,`remarks`,`enc_keywords`) values (13,'Conference Hall',9,'Conference Hall-Hotel',NULL);
insert into `m_content_ontology` (`co_code`,`keywords`,`parent`,`remarks`,`enc_keywords`) values (14,'Cinema',0,'Cinema-root',NULL);
insert into `m_content_ontology` (`co_code`,`keywords`,`parent`,`remarks`,`enc_keywords`) values (15,'Actor',14,'Actor-Cinema',NULL);
insert into `m_content_ontology` (`co_code`,`keywords`,`parent`,`remarks`,`enc_keywords`) values (16,'swizt',1,'swizt-Car',NULL);
insert into `m_content_ontology` (`co_code`,`keywords`,`parent`,`remarks`,`enc_keywords`) values (17,'bmw',1,'bmw-Car','71913f59e458e026d6609cdb5a7cc53d');
insert into `m_content_ontology` (`co_code`,`keywords`,`parent`,`remarks`,`enc_keywords`) values (18,'hospital',0,'hospital-root','8b42a1c9b8f9fde869f83c954b3d463b');
insert into `m_content_ontology` (`co_code`,`keywords`,`parent`,`remarks`,`enc_keywords`) values (19,'doctor',18,'doctor-hospital','f9f16d97c90d8c6f2cab37bb6d1f1992');
insert into `m_content_ontology` (`co_code`,`keywords`,`parent`,`remarks`,`enc_keywords`) values (20,'nurse',18,'nurse-hospital','701aa317da5a004fbf6111545678a6c');
insert into `m_content_ontology` (`co_code`,`keywords`,`parent`,`remarks`,`enc_keywords`) values (21,'cricket',0,'cricket-root','247184f5fcf8c0afea1291676dc6df8f');
insert into `m_content_ontology` (`co_code`,`keywords`,`parent`,`remarks`,`enc_keywords`) values (22,'player',21,'player-cricket','912af0dff974604f1321254ca8ff38b6');
insert into `m_content_ontology` (`co_code`,`keywords`,`parent`,`remarks`,`enc_keywords`) values (23,'bike',0,'bike-root','dde2c7ad63ad86d6a18de781205d194f');
insert into `m_content_ontology` (`co_code`,`keywords`,`parent`,`remarks`,`enc_keywords`) values (24,'suzuki',23,'suzuki-bike','101186a9a44bc0354ed997696a6aefba');
insert into `m_content_ontology` (`co_code`,`keywords`,`parent`,`remarks`,`enc_keywords`) values (25,'yamaha',23,'yamaha-bike','501a60a2b28ba8e6a95ce30c11877fda');
insert into `m_content_ontology` (`co_code`,`keywords`,`parent`,`remarks`,`enc_keywords`) values (26,'mall',0,'mall-root','2ee385d4e42e07f2c539b597559e70ee');

/*Table structure for table `m_location_ontology` */

DROP TABLE IF EXISTS `m_location_ontology`;

CREATE TABLE `m_location_ontology` (
  `lo_code` int(11) NOT NULL auto_increment,
  `location_name` varchar(200) default NULL,
  `latitude` double default NULL,
  `longitude` double default NULL,
  `parent` int(50) default '0',
  PRIMARY KEY  (`lo_code`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Data for the table `m_location_ontology` */

insert into `m_location_ontology` (`lo_code`,`location_name`,`latitude`,`longitude`,`parent`) values (1,'India',21,78.777,0);
insert into `m_location_ontology` (`lo_code`,`location_name`,`latitude`,`longitude`,`parent`) values (2,'chennai',13.0839,80.27,5);
insert into `m_location_ontology` (`lo_code`,`location_name`,`latitude`,`longitude`,`parent`) values (3,'Bangalore',12.9667,77.5667,4);
insert into `m_location_ontology` (`lo_code`,`location_name`,`latitude`,`longitude`,`parent`) values (4,'Karanataka',12.97044,77.56044,1);
insert into `m_location_ontology` (`lo_code`,`location_name`,`latitude`,`longitude`,`parent`) values (5,'Tamil Nadu',13.09,80.27,1);
insert into `m_location_ontology` (`lo_code`,`location_name`,`latitude`,`longitude`,`parent`) values (6,'Jayanagar',12.925,77.595,3);
insert into `m_location_ontology` (`lo_code`,`location_name`,`latitude`,`longitude`,`parent`) values (7,'Jp nagar',12.912,77.593,3);
insert into `m_location_ontology` (`lo_code`,`location_name`,`latitude`,`longitude`,`parent`) values (8,'Delhi',28.61,77.24,1);
insert into `m_location_ontology` (`lo_code`,`location_name`,`latitude`,`longitude`,`parent`) values (13,'maharashtra',19.495075067871,75.6381225585938,1);
insert into `m_location_ontology` (`lo_code`,`location_name`,`latitude`,`longitude`,`parent`) values (14,'west bengal',22.8647872160031,87.2286987304688,1);
insert into `m_location_ontology` (`lo_code`,`location_name`,`latitude`,`longitude`,`parent`) values (15,'jharkhand',23.672197382983,85.1632690429688,1);
insert into `m_location_ontology` (`lo_code`,`location_name`,`latitude`,`longitude`,`parent`) values (16,'nagaland',25.9852059559336,94.4796752929688,1);
insert into `m_location_ontology` (`lo_code`,`location_name`,`latitude`,`longitude`,`parent`) values (17,'assam',26.4779487051629,92.7218627929688,1);
insert into `m_location_ontology` (`lo_code`,`location_name`,`latitude`,`longitude`,`parent`) values (18,'gujarat',23.1176276119206,70.8920288085938,1);
insert into `m_location_ontology` (`lo_code`,`location_name`,`latitude`,`longitude`,`parent`) values (19,'haryana',29.1401672330443,76.0995483398438,1);

/*Table structure for table `m_post` */

DROP TABLE IF EXISTS `m_post`;

CREATE TABLE `m_post` (
  `post_no` int(11) NOT NULL auto_increment,
  `post_heading` varchar(200) default NULL,
  `post_description` blob,
  `post_link_content` varchar(100) default NULL,
  `post_link_location` varchar(100) default NULL,
  `post_image` varchar(100) default NULL,
  PRIMARY KEY  (`post_no`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Data for the table `m_post` */

insert into `m_post` (`post_no`,`post_heading`,`post_description`,`post_link_content`,`post_link_location`,`post_image`) values (1,'Benz car Showroom','No.107, Opp Sir M Vishweshwaraiah Museum, Kasturba Road, Bangalore - 560001','1,2','3','benz-car.jpg');
insert into `m_post` (`post_no`,`post_heading`,`post_description`,`post_link_content`,`post_link_location`,`post_image`) values (2,'Jaguar car Dealer','No:1,Ethiraj Salai, Near Mount Road, Egmore, \r\nChennai - 600008','1,3','2','jaguar-car.jpg');
insert into `m_post` (`post_no`,`post_heading`,`post_description`,`post_link_content`,`post_link_location`,`post_image`) values (3,'Jaguar animal in zoo','Bannerghatta Rd, Bangalore, Karnataka 560083','4,5','3','tiger--tambako-the-jaguar--.jpg');
insert into `m_post` (`post_no`,`post_heading`,`post_description`,`post_link_content`,`post_link_location`,`post_image`) values (4,'Jaguar & Lion animal ','Bannerghatta Rd, Bangalore, Karnataka 560083','4,6,5','3','Lion-and-Tiger-animals.jpg');
insert into `m_post` (`post_no`,`post_heading`,`post_description`,`post_link_content`,`post_link_location`,`post_image`) values (6,'New Jaguar Model car','Jaguar Mumbai Corporate Showroom. Jaguar Land Rover Ceejay House, Ground floor. Shiv Sagar Estate Dr Annie Besant Road Worli, Mumbai - 400 018','1,3,7','1','New Jaguar Model.JPG');
insert into `m_post` (`post_no`,`post_heading`,`post_description`,`post_link_content`,`post_link_location`,`post_image`) values (7,'Black Jaguar car ',' Travancore and other parts of southern India','1,3,7','1','Black Jaguar.JPG');
insert into `m_post` (`post_no`,`post_heading`,`post_description`,`post_link_content`,`post_link_location`,`post_image`) values (8,'Jaguar fighting with Elephant animal','A protective elephant mother fights off a pack of hyenas to protect her calf. The hyenas had pounced on the baby elephant when it became separated from its mother.','4,5,8','1','Jaguar fighting with Elephant.JPG');
insert into `m_post` (`post_no`,`post_heading`,`post_description`,`post_link_content`,`post_link_location`,`post_image`) values (9,'Jaguar XF Model car','The 2013 Jaguar XF is powered by a turbocharged four-cylinder engine, which critics say provides adequate power. Higher trims come with supercharged V6 or V8 engines, which can make the XF significantly quicker. \r\nA-5 Mohan Co-op Industrial Estate\r\nMathura Road\r\nNew Delhi - 110 0044','1,3','8','jaguar-xf-exterior-047.jpg');
insert into `m_post` (`post_no`,`post_heading`,`post_description`,`post_link_content`,`post_link_location`,`post_image`) values (10,'Hotel Komfort Terraces','Hotel Komfort Terraces\r\nNo 301, 3rd floor, Bluemoon Complex M G.Road, Bengaluru, Karnataka,560001','9','3','Hotel Komfort Terraces.JPG');
insert into `m_post` (`post_no`,`post_heading`,`post_description`,`post_link_content`,`post_link_location`,`post_image`) values (12,'Vivanta by Taj','Vivanta by Taj - M G Road, Bangalore\r\n41/3, Mahatma Gandhi Road, Trinity Circle,Bangalore, Karnataka 560001','9,11,12','3','Vivanta by Taj.JPG');
insert into `m_post` (`post_no`,`post_heading`,`post_description`,`post_link_content`,`post_link_location`,`post_image`) values (13,'Concorde Towers','Level 14 & 15, Concorde Towers, UB City, 1 Vittal Mallya Road, Bangalore, 560001 - See more at: http://www.regus.co.in/locations/meeting-room/bangalore-ub-city?MROProduct=MeetingRoom#sthash.UodHutah.dpuf','12,13,9,10,11','3','Concorde Towers.JPG');
insert into `m_post` (`post_no`,`post_heading`,`post_description`,`post_link_content`,`post_link_location`,`post_image`) values (14,'The Millenia','Level 1, Tower B, The Millenia, 1 & 2 Murphy Road, Ulsoor, Bangalore, 560008 - See more at: http://www.regus.co.in/locations/meeting-room/bangalore-millenia?MROProduct=MeetingRoom#sthash.S26pOnnc.dpuf','12,10,11','3','The Millenia.JPG');
insert into `m_post` (`post_no`,`post_heading`,`post_description`,`post_link_content`,`post_link_location`,`post_image`) values (16,'The Leela Palace','The Leela Palace Bangalore \r\n#23, Kodihalli, Old Airport Road \r\nBangalore 560 008','10,11','3','The Leela Palace1.JPG');
insert into `m_post` (`post_no`,`post_heading`,`post_description`,`post_link_content`,`post_link_location`,`post_image`) values (17,'Vivanta by Taj Connemara','No 2 Binny Road, 600002 Chennai','9','2','Vivanta by Taj.JPG');
insert into `m_post` (`post_no`,`post_heading`,`post_description`,`post_link_content`,`post_link_location`,`post_image`) values (18,'Smyle Inn Hotel','Smyle Inn Hotel\r\n916, Main Bazaar, Gali Chandiwali, Paharganj, New Delhi, Delhi 110055','9','8','Smyle Inn Hotel.JPG');
insert into `m_post` (`post_no`,`post_heading`,`post_description`,`post_link_content`,`post_link_location`,`post_image`) values (19,'Rajkumar Kannda actor','Dr.Raj is considered a cultural icon of Kannada,[9][10] where he is also known as Rajanna, Natasarvabhouma (emperor of acting), Gaana Gandharva (singer in the court of Gods), and as Annavru (beloved elder brother).','14,15','4','rajkuma.jpeg');
insert into `m_post` (`post_no`,`post_heading`,`post_description`,`post_link_content`,`post_link_location`,`post_image`) values (20,'BMW car','The vehicles offered by BMW are for those who enjoy the finer tastes in life. For enthusiasts and BMW aficionados, photos and technical specifications further fuel the desire to understand and gain more knowledge on their favourite vehicle.\r\n\r\n73, Millers Road, Vasanth Nagar, Vasanth Nagar\r\nBangalore, Karnataka\r\n080 2234 1661','1','3','bmw.jpeg');
insert into `m_post` (`post_no`,`post_heading`,`post_description`,`post_link_content`,`post_link_location`,`post_image`) values (22,'jaguar car showroom in bangalore','new BEL road bangalore','2,5,1,4','3','Black Jaguar.JPG');
insert into `m_post` (`post_no`,`post_heading`,`post_description`,`post_link_content`,`post_link_location`,`post_image`) values (23,' car jaguar showroom in bangalore','Vasanthnagar bangalore 573009','5,1,5','1','New Jaguar Model.JPG');
insert into `m_post` (`post_no`,`post_heading`,`post_description`,`post_link_content`,`post_link_location`,`post_image`) values (24,'jaguar  car dealer in bangalore','at Mysore ,the best showroom jaguar car is there','5,1','4','Jaguar & Lion.JPG');
insert into `m_post` (`post_no`,`post_heading`,`post_description`,`post_link_content`,`post_link_location`,`post_image`) values (25,'jaguar car showroom in bangalore','jaguar car is nice','7,5,1','16','jaguar-car.jpg');
insert into `m_post` (`post_no`,`post_heading`,`post_description`,`post_link_content`,`post_link_location`,`post_image`) values (26,'jaguar dealer in delhi  car ','Vasanthnagar bangalore,karnataka 573009','5,2','16','jaguar-xf-exterior-047.jpg');
insert into `m_post` (`post_no`,`post_heading`,`post_description`,`post_link_content`,`post_link_location`,`post_image`) values (27,'jaguar car black','jaguar car showroom is in bangalore','5','3','Black Jaguar.JPG');
insert into `m_post` (`post_no`,`post_heading`,`post_description`,`post_link_content`,`post_link_location`,`post_image`) values (28,'bwm','bwm','17','3','bmw.jpeg');
insert into `m_post` (`post_no`,`post_heading`,`post_description`,`post_link_content`,`post_link_location`,`post_image`) values (29,'yamaha bike showroom','the yamaha bike showroom is located in bangalore 560070 for more details visit website','25,23','3','yamahab1.jpg');
insert into `m_post` (`post_no`,`post_heading`,`post_description`,`post_link_content`,`post_link_location`,`post_image`) values (30,'yamaha service center','yamaha bike service center is located in delhi. it is a very big service center','25,23','8','b2yama.jpg');
insert into `m_post` (`post_no`,`post_heading`,`post_description`,`post_link_content`,`post_link_location`,`post_image`) values (31,'yamaha bike race','yamaha bike race for this particular model is been held in bangalore ','25,23','3','b3yama.jpg');
insert into `m_post` (`post_no`,`post_heading`,`post_description`,`post_link_content`,`post_link_location`,`post_image`) values (32,'yamaha bike spare parts','yamaha bike spare parts are available in jharkhand. it is the biggest outlet in which all spare parts are available','23,25','15','b4yamaha.jpg');
insert into `m_post` (`post_no`,`post_heading`,`post_description`,`post_link_content`,`post_link_location`,`post_image`) values (33,'bike yamaha','this bike of yamaha is available in jayanagar. it is a blue color bike which gives a good mileage','23,25','6','b5scotty yamaha.jpg');
insert into `m_post` (`post_no`,`post_heading`,`post_description`,`post_link_content`,`post_link_location`,`post_image`) values (34,'fastest bike suzuki','fastest bike of suzuki is available for sale in bangalore location contact for more details','24,23','3','suzukib1.jpg');
insert into `m_post` (`post_no`,`post_heading`,`post_description`,`post_link_content`,`post_link_location`,`post_image`) values (35,'suzuki bike showroom','yamaha cbr bike showroom is available in west bengal in cheapest rate','24,23','14','suzukib2.jpg');
insert into `m_post` (`post_no`,`post_heading`,`post_description`,`post_link_content`,`post_link_location`,`post_image`) values (36,'suzuki bike service center','all suzuki bikes are being serviced here and good services are provided','24,23','14','suzukib3.jpg');
insert into `m_post` (`post_no`,`post_heading`,`post_description`,`post_link_content`,`post_link_location`,`post_image`) values (37,'suzuki bike for sale','suzuki bikes are available for sale in cheapest here and are of good quality','24,23','14','suzukib4.jpg');
insert into `m_post` (`post_no`,`post_heading`,`post_description`,`post_link_content`,`post_link_location`,`post_image`) values (38,'race of suzuki bikes','best suzuki bike available in india.\r\nit has a very good mileage.\r\nit goes from speed 0-100 in 10sec','23,24','8','suzukib5.jpg');
insert into `m_post` (`post_no`,`post_heading`,`post_description`,`post_link_content`,`post_link_location`,`post_image`) values (39,'animals in zoo','giraffe animal in alipore zoo','4','14','firaffe.jpg');
insert into `m_post` (`post_no`,`post_heading`,`post_description`,`post_link_content`,`post_link_location`,`post_image`) values (40,'kids playing with animal','kids are playing with sheep and feeding food to the sheep','4','3','kids playing with animal.jpg');
insert into `m_post` (`post_no`,`post_heading`,`post_description`,`post_link_content`,`post_link_location`,`post_image`) values (41,'fortis hospital','one of the best hospital for gynecology,neurology etc','18','3','fortis.jpg');
insert into `m_post` (`post_no`,`post_heading`,`post_description`,`post_link_content`,`post_link_location`,`post_image`) values (42,'manipal hospital','costly hospital but provide many advanced facilities.','18','2','manipal.jpg');
insert into `m_post` (`post_no`,`post_heading`,`post_description`,`post_link_content`,`post_link_location`,`post_image`) values (43,'apollo hospital','one of the best hospital of india.','18','2','apollo.jpg');
insert into `m_post` (`post_no`,`post_heading`,`post_description`,`post_link_content`,`post_link_location`,`post_image`) values (44,'bravo cricket player ','one of the best allrounder player in cricket history.','21,22','2','bravo.jpg');
insert into `m_post` (`post_no`,`post_heading`,`post_description`,`post_link_content`,`post_link_location`,`post_image`) values (45,'malinga cricket player','deadliest player of cricket history ','21,22','13','mallinga.jpg');
insert into `m_post` (`post_no`,`post_heading`,`post_description`,`post_link_content`,`post_link_location`,`post_image`) values (46,'viru cricket player','Most destructive player of indian cricket team.','21,22','8','sehwag.jpg');
insert into `m_post` (`post_no`,`post_heading`,`post_description`,`post_link_content`,`post_link_location`,`post_image`) values (47,'Saurav Ganguly cricket player','Best captain of indian cricket team and one of the finest player of offside.','21,22','14','dada.jpg');
insert into `m_post` (`post_no`,`post_heading`,`post_description`,`post_link_content`,`post_link_location`,`post_image`) values (48,'AB DeVillers','ABD is a fine cricket player of spin. ','21,22','3','abd.jpg');
insert into `m_post` (`post_no`,`post_heading`,`post_description`,`post_link_content`,`post_link_location`,`post_image`) values (49,'Ravi Ashwin','Main player of bowling department of indian cricket team.','21,22','2','ashwin.jpg');
insert into `m_post` (`post_no`,`post_heading`,`post_description`,`post_link_content`,`post_link_location`,`post_image`) values (50,'MS Dhoni cricket player','India cricket team wicketkeeper. currently chennai super king player.','21,22','2','ms.jpg');
insert into `m_post` (`post_no`,`post_heading`,`post_description`,`post_link_content`,`post_link_location`,`post_image`) values (51,'Virat kohli cricket player','virat is the best player of indian cricket team. Currently playing for RCB.','21,22','3','virat.jpg');
insert into `m_post` (`post_no`,`post_heading`,`post_description`,`post_link_content`,`post_link_location`,`post_image`) values (52,'one horned animal','rhinocores is an one horned animal usually found in forest of tamil nadu','4','5','rhinoceres.jpg');
insert into `m_post` (`post_no`,`post_heading`,`post_description`,`post_link_content`,`post_link_location`,`post_image`) values (53,'venomous animal','snake is a very venomous animal \r\nmost of the snakes are found in tamil nadu\r\nsnike bite may cause death','4','5','snake.jpg');
insert into `m_post` (`post_no`,`post_heading`,`post_description`,`post_link_content`,`post_link_location`,`post_image`) values (54,'pet animal','pet animal for sale in bangalore location\r\nmany breeds of dog are present','4','3','dogs.jpg');
insert into `m_post` (`post_no`,`post_heading`,`post_description`,`post_link_content`,`post_link_location`,`post_image`) values (55,'national animal','tiger is the national animal of our country\r\nhe is also known as king of the jungle','4','14','tiger.jpg');
insert into `m_post` (`post_no`,`post_heading`,`post_description`,`post_link_content`,`post_link_location`,`post_image`) values (56,'saint john hospital','one of the cheapest hospital in bangalore.','18','3','saint.jpg');
insert into `m_post` (`post_no`,`post_heading`,`post_description`,`post_link_content`,`post_link_location`,`post_image`) values (57,'Manipal hospital','advanced facility is provided by the hospital.','18','3','manipal.jpg');
insert into `m_post` (`post_no`,`post_heading`,`post_description`,`post_link_content`,`post_link_location`,`post_image`) values (58,'orthopaedician doctor','best orthopaedician doctor of manipal hospital ,bangalore.','18,19','3','1.jpg');
insert into `m_post` (`post_no`,`post_heading`,`post_description`,`post_link_content`,`post_link_location`,`post_image`) values (59,'physician doctor','senior physician doctor in saint john hospital ','18,19','3','2.jpg');
insert into `m_post` (`post_no`,`post_heading`,`post_description`,`post_link_content`,`post_link_location`,`post_image`) values (60,'gynecology specialist doctor','fortis hospital has best gynecology doctor','18,19','2','5.jpg');
insert into `m_post` (`post_no`,`post_heading`,`post_description`,`post_link_content`,`post_link_location`,`post_image`) values (61,'hotel room','hotel room in banglore,cheap price','9,11,33','3','images1.jpg');
insert into `m_post` (`post_no`,`post_heading`,`post_description`,`post_link_content`,`post_link_location`,`post_image`) values (62,'hotel','hotel in bangalore...very good,reputed','9','3','location-of-hotel-galvez-and-spa-galveston-top.jpg');
insert into `m_post` (`post_no`,`post_heading`,`post_description`,`post_link_content`,`post_link_location`,`post_image`) values (63,'meeting room','book meeting room in bangalore,very traditional','32,33,31','3','ES_boardroom1_2_1280x430_FitToBox_Center.jpg');
insert into `m_post` (`post_no`,`post_heading`,`post_description`,`post_link_content`,`post_link_location`,`post_image`) values (64,'conferance hall for lease','good conferance hall for lease in karnataka','31,32,33','4','2b0f0fb7dd3ad0cc2d3f8d1c7e82d294.jpg');
insert into `m_post` (`post_no`,`post_heading`,`post_description`,`post_link_content`,`post_link_location`,`post_image`) values (65,'restaurant with good ambience ','good restaurant in tamil nadu...offer good service and food','10,9','5','restaurant-939435_960_720.jpg');
insert into `m_post` (`post_no`,`post_heading`,`post_description`,`post_link_content`,`post_link_location`,`post_image`) values (66,'traditional restaurant','traditional restaurant in bangalore...really catches the eye','10,9','3','restaurant-06.jpg');
insert into `m_post` (`post_no`,`post_heading`,`post_description`,`post_link_content`,`post_link_location`,`post_image`) values (67,'famous theater','very old and famous theater in bangalore','27','3','IMG_1084.jpg');
insert into `m_post` (`post_no`,`post_heading`,`post_description`,`post_link_content`,`post_link_location`,`post_image`) values (68,'hotel of lalu ','one of the hotel of lalu..goes often to feed his cow friesXD','9','13','lalu-fodder.jpg');
insert into `m_post` (`post_no`,`post_heading`,`post_description`,`post_link_content`,`post_link_location`,`post_image`) values (69,'ganesh anna ','auto raja ganesh anna in bangalore for film promotion','29','3','auto-raja-muhurat_134570613215.jpg');
insert into `m_post` (`post_no`,`post_heading`,`post_description`,`post_link_content`,`post_link_location`,`post_image`) values (70,'liam nesson','actor liam nesson visiting india for promoting his film','29','1','m0117_ft_neeson_a-cb7e2101-2367-478c-ac0e-e10d94efd88b.jpg');
insert into `m_post` (`post_no`,`post_heading`,`post_description`,`post_link_content`,`post_link_location`,`post_image`) values (71,'theater in bangalore','good theater in bangalore,very cheap and affordable','27','3','images.jpg');
insert into `m_post` (`post_no`,`post_heading`,`post_description`,`post_link_content`,`post_link_location`,`post_image`) values (72,'multiplex ','good multiplex theater in ur area around u','27','3','WGA_WEB_0741.jpg');
insert into `m_post` (`post_no`,`post_heading`,`post_description`,`post_link_content`,`post_link_location`,`post_image`) values (73,'pvr','pvr in karnataka,go to have the ideal viewing experience','27','4','download.jpg');

/*Table structure for table `m_search` */

DROP TABLE IF EXISTS `m_search`;

CREATE TABLE `m_search` (
  `s_no` int(11) NOT NULL auto_increment,
  `s_query` varchar(100) default NULL,
  `u_code` int(50) default NULL,
  PRIMARY KEY  (`s_no`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Data for the table `m_search` */

insert into `m_search` (`s_no`,`s_query`,`u_code`) values (1,'dde2c7ad63ad86d6a18de781205d194f',1);
insert into `m_search` (`s_no`,`s_query`,`u_code`) values (2,'501a60a2b28ba8e6a95ce30c11877fda',1);
insert into `m_search` (`s_no`,`s_query`,`u_code`) values (3,'dde2c7ad63ad86d6a18de781205d194f',1);
insert into `m_search` (`s_no`,`s_query`,`u_code`) values (4,'8b42a1c9b8f9fde869f83c954b3d463b',1);
insert into `m_search` (`s_no`,`s_query`,`u_code`) values (5,'f9f16d97c90d8c6f2cab37bb6d1f1992',1);
insert into `m_search` (`s_no`,`s_query`,`u_code`) values (6,'8b42a1c9b8f9fde869f83c954b3d463b',1);
insert into `m_search` (`s_no`,`s_query`,`u_code`) values (7,'8b42a1c9b8f9fde869f83c954b3d463b',1);
insert into `m_search` (`s_no`,`s_query`,`u_code`) values (8,'8b42a1c9b8f9fde869f83c954b3d463b',1);
insert into `m_search` (`s_no`,`s_query`,`u_code`) values (9,'e919c49d5f0cd737285367810a3394d0',1);
insert into `m_search` (`s_no`,`s_query`,`u_code`) values (10,'8e62561c3ac6d3fb0016e9a34a2caa5d',1);
insert into `m_search` (`s_no`,`s_query`,`u_code`) values (11,'e919c49d5f0cd737285367810a3394d0',1);
insert into `m_search` (`s_no`,`s_query`,`u_code`) values (12,'2fbe87f7b9b78791a47e69796301790c',1);
insert into `m_search` (`s_no`,`s_query`,`u_code`) values (13,'247184f5fcf8c0afea1291676dc6df8f',1);
insert into `m_search` (`s_no`,`s_query`,`u_code`) values (14,'247184f5fcf8c0afea1291676dc6df8f',1);
insert into `m_search` (`s_no`,`s_query`,`u_code`) values (15,'8b42a1c9b8f9fde869f83c954b3d463b',1);
insert into `m_search` (`s_no`,`s_query`,`u_code`) values (16,'8b42a1c9b8f9fde869f83c954b3d463b',1);

/*Table structure for table `m_set` */

DROP TABLE IF EXISTS `m_set`;

CREATE TABLE `m_set` (
  `s_no` int(11) NOT NULL auto_increment,
  `s_query` varchar(100) default NULL,
  `matched_post` varchar(100) default NULL,
  `positive` varchar(100) default NULL,
  `negative` varchar(100) default NULL,
  `u_code` int(100) default NULL,
  PRIMARY KEY  (`s_no`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Data for the table `m_set` */

insert into `m_set` (`s_no`,`s_query`,`matched_post`,`positive`,`negative`,`u_code`) values (1,'dde2c7ad63ad86d6a18de781205d194f','29,30,31,32,33',NULL,'29,30,31,32,33',1);
insert into `m_set` (`s_no`,`s_query`,`matched_post`,`positive`,`negative`,`u_code`) values (2,'501a60a2b28ba8e6a95ce30c11877fda','29,30,31,32,33',NULL,'29,30,31,32,33',1);
insert into `m_set` (`s_no`,`s_query`,`matched_post`,`positive`,`negative`,`u_code`) values (3,'dde2c7ad63ad86d6a18de781205d194f','29,30,31,32,33,34,35,36,37,38',NULL,'29,30,31,32,33,34,35,36,37,38',1);
insert into `m_set` (`s_no`,`s_query`,`matched_post`,`positive`,`negative`,`u_code`) values (4,'8b42a1c9b8f9fde869f83c954b3d463b','41,42,43,56,57',NULL,'41,42,43,56,57',1);
insert into `m_set` (`s_no`,`s_query`,`matched_post`,`positive`,`negative`,`u_code`) values (5,'f9f16d97c90d8c6f2cab37bb6d1f1992','58,59',NULL,'58,59',1);
insert into `m_set` (`s_no`,`s_query`,`matched_post`,`positive`,`negative`,`u_code`) values (6,'8b42a1c9b8f9fde869f83c954b3d463b','41,42,43,56,57,58,59',NULL,'41,42,43,56,57,58,59',1);
insert into `m_set` (`s_no`,`s_query`,`matched_post`,`positive`,`negative`,`u_code`) values (7,'8b42a1c9b8f9fde869f83c954b3d463b','41,42,43,56,57,58,59',NULL,'41,42,43,56,57,58,59',1);
insert into `m_set` (`s_no`,`s_query`,`matched_post`,`positive`,`negative`,`u_code`) values (8,'8b42a1c9b8f9fde869f83c954b3d463b','41,42,43,56,57,58,59,60',NULL,'41,42,43,56,57,58,59,60',1);
insert into `m_set` (`s_no`,`s_query`,`matched_post`,`positive`,`negative`,`u_code`) values (9,'e919c49d5f0cd737285367810a3394d0','10,18,61,62,68',NULL,'10,18,61,62,68',1);
insert into `m_set` (`s_no`,`s_query`,`matched_post`,`positive`,`negative`,`u_code`) values (10,'8e62561c3ac6d3fb0016e9a34a2caa5d','19,70',NULL,'19,70',1);
insert into `m_set` (`s_no`,`s_query`,`matched_post`,`positive`,`negative`,`u_code`) values (11,'e919c49d5f0cd737285367810a3394d0','10,18,61,62,68',NULL,'10,18,61,62,68',1);
insert into `m_set` (`s_no`,`s_query`,`matched_post`,`positive`,`negative`,`u_code`) values (12,'2fbe87f7b9b78791a47e69796301790c','63',NULL,'63',1);
insert into `m_set` (`s_no`,`s_query`,`matched_post`,`positive`,`negative`,`u_code`) values (13,'247184f5fcf8c0afea1291676dc6df8f','44,45,46,47,48,49,50,51',NULL,'44,45,46,47,48,49,50,51',1);
insert into `m_set` (`s_no`,`s_query`,`matched_post`,`positive`,`negative`,`u_code`) values (14,'247184f5fcf8c0afea1291676dc6df8f','44,45,46,47,48,49,50,51',NULL,'44,45,46,47,48,49,50,51',1);
insert into `m_set` (`s_no`,`s_query`,`matched_post`,`positive`,`negative`,`u_code`) values (15,'8b42a1c9b8f9fde869f83c954b3d463b','41,42,43,56,57,58,59,60','58,58,58','41,42,43,56,57,59,60',1);
insert into `m_set` (`s_no`,`s_query`,`matched_post`,`positive`,`negative`,`u_code`) values (16,'8b42a1c9b8f9fde869f83c954b3d463b','41,42,43,56,57,58,59,60',NULL,'41,42,43,56,57,58,59,60',1);

/*Table structure for table `m_temp` */

DROP TABLE IF EXISTS `m_temp`;

CREATE TABLE `m_temp` (
  `t_code` int(100) default NULL,
  `t_heading` varchar(200) default NULL,
  `t_desc` blob,
  `t_image` varchar(100) default NULL,
  `t_location` varchar(100) default NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Data for the table `m_temp` */

insert into `m_temp` (`t_code`,`t_heading`,`t_desc`,`t_image`,`t_location`) values (58,'orthopaedician doctor','best orthopaedician doctor of manipal hospital ,bangalore.','1.jpg','Bangalore');
insert into `m_temp` (`t_code`,`t_heading`,`t_desc`,`t_image`,`t_location`) values (59,'physician doctor','senior physician doctor in saint john hospital ','2.jpg','Bangalore');
insert into `m_temp` (`t_code`,`t_heading`,`t_desc`,`t_image`,`t_location`) values (41,'fortis hospital','one of the best hospital for gynecology,neurology etc','fortis.jpg','Bangalore');
insert into `m_temp` (`t_code`,`t_heading`,`t_desc`,`t_image`,`t_location`) values (56,'saint john hospital','one of the cheapest hospital in bangalore.','saint.jpg','Bangalore');
insert into `m_temp` (`t_code`,`t_heading`,`t_desc`,`t_image`,`t_location`) values (57,'Manipal hospital','advanced facility is provided by the hospital.','manipal.jpg','Bangalore');
insert into `m_temp` (`t_code`,`t_heading`,`t_desc`,`t_image`,`t_location`) values (60,'gynecology specialist doctor','fortis hospital has best gynecology doctor','5.jpg','chennai');
insert into `m_temp` (`t_code`,`t_heading`,`t_desc`,`t_image`,`t_location`) values (42,'manipal hospital','costly hospital but provide many advanced facilities.','manipal.jpg','chennai');
insert into `m_temp` (`t_code`,`t_heading`,`t_desc`,`t_image`,`t_location`) values (43,'apollo hospital','one of the best hospital of india.','apollo.jpg','chennai');

/*Table structure for table `m_test` */

DROP TABLE IF EXISTS `m_test`;

CREATE TABLE `m_test` (
  `keyword` varchar(100) default NULL,
  `posting` varchar(100) default NULL,
  `content` varchar(100) default '0',
  `cweight` varchar(100) default NULL,
  `c50` varchar(100) default NULL,
  `location` varchar(100) default NULL,
  `distance` varchar(100) default NULL,
  `point` varchar(100) default NULL,
  `lpoint` varchar(100) default NULL,
  `l50` varchar(100) default NULL,
  `final` varchar(100) default NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Data for the table `m_test` */

/*Table structure for table `m_user` */

DROP TABLE IF EXISTS `m_user`;

CREATE TABLE `m_user` (
  `u_code` int(11) NOT NULL auto_increment,
  `u_id` varchar(100) default NULL,
  `u_name` varchar(100) default NULL,
  `u_pwd` varchar(50) default NULL,
  `u_email` varchar(150) default NULL,
  `u_cellno` varchar(50) default NULL,
  PRIMARY KEY  (`u_code`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Data for the table `m_user` */

insert into `m_user` (`u_code`,`u_id`,`u_name`,`u_pwd`,`u_email`,`u_cellno`) values (1,'jeet','jeet','jeet1234','jeet@gmail.com','9876543210');

SET SQL_MODE=@OLD_SQL_MODE;
SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS;
