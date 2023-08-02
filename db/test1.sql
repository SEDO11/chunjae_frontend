-- --------------------------------------------------------
-- 호스트:                          127.0.0.1
-- 서버 버전:                        11.0.2-MariaDB - mariadb.org binary distribution
-- 서버 OS:                        Win64
-- HeidiSQL 버전:                  12.3.0.6589
-- --------------------------------------------------------

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET NAMES utf8 */;
/*!50503 SET NAMES utf8mb4 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;


-- edu 데이터베이스 구조 내보내기
DROP DATABASE IF EXISTS `edu`;
CREATE DATABASE IF NOT EXISTS `edu` /*!40100 DEFAULT CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci */;
USE `edu`;

-- 테이블 edu.goods 구조 내보내기
DROP TABLE IF EXISTS `goods`;
CREATE TABLE IF NOT EXISTS `goods` (
  `gcode` int(11) NOT NULL AUTO_INCREMENT,
  `gname` varchar(150) NOT NULL,
  `gcate` varchar(40) NOT NULL,
  `gprice` int(11) NOT NULL,
  `gqty` int(11) DEFAULT 0,
  `regdate` date DEFAULT current_timestamp(),
  PRIMARY KEY (`gcode`)
) ENGINE=InnoDB AUTO_INCREMENT=16 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

-- 테이블 데이터 edu.goods:~15 rows (대략적) 내보내기
DELETE FROM `goods`;
INSERT INTO `goods` (`gcode`, `gname`, `gcate`, `gprice`, `gqty`, `regdate`) VALUES
	(1, '국어책', '0001', 20000, 96, '2023-07-28'),
	(2, '영어책', '0002', 25000, 200, '2023-07-28'),
	(3, '수학책', '0003', 18000, 300, '2023-07-28'),
	(4, '사회책', '0004', 15000, 150, '2023-07-28'),
	(5, '과학책', '0005', 15000, 150, '2023-07-28'),
	(6, '국어교육', '1001', 40000, 500, '2023-07-28'),
	(7, '영어교육', '1002', 50000, 600, '2023-07-28'),
	(8, '수학교육', '1003', 36000, 700, '2023-07-28'),
	(9, '사회교육', '1004', 30000, 800, '2023-07-28'),
	(10, '과학교육', '1005', 30000, 800, '2023-07-28'),
	(11, '국어영상', '2001', 80000, 91, '2023-07-28'),
	(12, '영어영상', '2002', 100000, 100, '2023-07-28'),
	(13, '수학영상', '2003', 70000, 100, '2023-07-28'),
	(14, '사회영상', '2004', 60000, 100, '2023-07-28'),
	(15, '과학영상', '2005', 60000, 100, '2023-07-28');

-- 테이블 edu.member 구조 내보내기
DROP TABLE IF EXISTS `member`;
CREATE TABLE IF NOT EXISTS `member` (
  `id` varchar(16) NOT NULL,
  `pw` varchar(330) NOT NULL,
  `NAME` varchar(100) NOT NULL,
  `email` varchar(100) NOT NULL,
  `tel` varchar(13) DEFAULT NULL,
  `regdate` timestamp NULL DEFAULT current_timestamp(),
  `POINT` int(11) DEFAULT 0,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

-- 테이블 데이터 edu.member:~6 rows (대략적) 내보내기
DELETE FROM `member`;
INSERT INTO `member` (`id`, `pw`, `NAME`, `email`, `tel`, `regdate`, `POINT`) VALUES
	('admin', '1234', '관리자', 'admin@edu.com', '010-1234-5678', '2023-07-28 02:45:02', 0),
	('hong', 'h5678', '홍길동', 'hong@edu.com', '010-1111-2222', '2023-07-28 02:45:02', 0),
	('kang', 'kang12', '강감찬', 'kang@edu.com', '010-3333-4444', '2023-07-28 02:45:02', 0),
	('lee', 'lee4885', '이순신', 'lee@edu.com', '010-8765-4321', '2023-07-28 02:45:02', 0),
	('shin', 'shin4885', '신승원', 'shin@edu.com', '010-8765-1234', '2023-07-28 02:45:02', 0),
	('son', 'sony1234', '손흥민', 'son@edu.com', '010-5555-6666', '2023-07-28 02:45:02', 0);

-- 테이블 edu.sales 구조 내보내기
DROP TABLE IF EXISTS `sales`;
CREATE TABLE IF NOT EXISTS `sales` (
  `pcode` int(11) NOT NULL AUTO_INCREMENT,
  `gcode` int(11) NOT NULL,
  `id` varchar(16) NOT NULL,
  `qty` int(11) DEFAULT 1,
  `sprice` int(11) NOT NULL,
  `stype` int(11) NOT NULL,
  `distotal` int(11) DEFAULT NULL,
  `paytotal` int(11) DEFAULT NULL,
  `stotal` int(11) DEFAULT NULL,
  `saledate` date DEFAULT current_timestamp(),
  PRIMARY KEY (`pcode`)
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

-- 테이블 데이터 edu.sales:~5 rows (대략적) 내보내기
DELETE FROM `sales`;
INSERT INTO `sales` (`pcode`, `gcode`, `id`, `qty`, `sprice`, `stype`, `distotal`, `paytotal`, `stotal`, `saledate`) VALUES
	(1, 1, 'hong', 2, 20000, 0, 4000, 36000, 40000, '2023-07-28'),
	(2, 1, 'hong', 2, 20000, 0, 4000, 16000, 40000, '2023-07-28'),
	(3, 11, 'son', 3, 80000, 1, 30000, 50000, 240000, '2023-07-28'),
	(4, 11, 'son', 3, 80000, 1, 30000, NULL, 240000, '2023-07-28'),
	(5, 11, 'son', 3, 80000, 1, 30000, 210000, 240000, '2023-07-28');

-- 테이블 edu.test_table 구조 내보내기
DROP TABLE IF EXISTS `test_table`;
CREATE TABLE IF NOT EXISTS `test_table` (
  `id` varchar(16) NOT NULL,
  `name` varchar(100) NOT NULL,
  `email` varchar(100) NOT NULL,
  `bno` int(11) NOT NULL AUTO_INCREMENT,
  `title` varchar(200) NOT NULL,
  PRIMARY KEY (`bno`)
) ENGINE=InnoDB AUTO_INCREMENT=8 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

-- 테이블 데이터 edu.test_table:~7 rows (대략적) 내보내기
DELETE FROM `test_table`;
INSERT INTO `test_table` (`id`, `name`, `email`, `bno`, `title`) VALUES
	('hong', '홍길동', 'hong@edu.com', 1, '더미글'),
	('kang', '강감찬', 'kang@edu.com', 2, '더미글'),
	('kang', '강감찬', 'kang@edu.com', 3, '더미글'),
	('hong', '홍길동', 'hong@edu.com', 4, '더미글'),
	('lee', '이순신', 'lee@edu.com', 5, '더미글'),
	('hong', '홍길동', 'hong@edu.com', 6, '더미글'),
	('admin', '관리자', 'admin@edu.com', 7, '더미글');

/*!40103 SET TIME_ZONE=IFNULL(@OLD_TIME_ZONE, 'system') */;
/*!40101 SET SQL_MODE=IFNULL(@OLD_SQL_MODE, '') */;
/*!40014 SET FOREIGN_KEY_CHECKS=IFNULL(@OLD_FOREIGN_KEY_CHECKS, 1) */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40111 SET SQL_NOTES=IFNULL(@OLD_SQL_NOTES, 1) */;
