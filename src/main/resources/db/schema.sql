CREATE TABLE VIDEOS (
                          `video_seq` int(11) NOT NULL AUTO_INCREMENT,
                          `video` varchar(200) DEFAULT NULL,
                          `video_thumnail` varchar(100) DEFAULT NULL,
                          `member_seq` int(11) DEFAULT NULL,
                          `reg_date` timestamp NULL DEFAULT current_timestamp(),
                          `publish_yn` char(1) DEFAULT 'N',
                          `delete_yn` char(1) DEFAULT NULL,
                          PRIMARY KEY (`video_seq`),
                          KEY `member_seq` (`member_seq`),
                          CONSTRAINT `VIDEOS_ibfk_1` FOREIGN KEY (`member_seq`) REFERENCES `MEMBERS` (`member_seq`) ON DELETE CASCADE
);

CREATE TABLE `MEMBERS` (
                           `member_seq` int(11) NOT NULL AUTO_INCREMENT,
                           `member_id` varchar(50) NOT NULL,
                           `member_pw` varchar(50) NOT NULL,
                           `member_nick` varchar(50) NOT NULL,
                           `member_profile` varchar(100) DEFAULT NULL,
                           `member_info` varchar(400) DEFAULT NULL,
                           `use_yn` char(1) DEFAULT 'Y',
                           `reg_date` timestamp NULL DEFAULT current_timestamp(),
                           PRIMARY KEY (`member_seq`),
                           UNIQUE KEY `member_id` (`member_id`)
);

CREATE TABLE `ADMINS` (
                          `admin_seq` int(11) NOT NULL AUTO_INCREMENT,
                          `admin_id` varchar(50) DEFAULT NULL,
                          `admin_pw` varchar(100) DEFAULT NULL,
                          `use_yn` char(1) NOT NULL DEFAULT 'Y' CHECK (`use_yn` in ('Y','N')),
                          `reg_seq` int(11) DEFAULT NULL,
                          `reg_date` timestamp NULL DEFAULT current_timestamp(),
                          PRIMARY KEY (`admin_seq`),
                          UNIQUE KEY `admin_id` (`admin_id`)
);