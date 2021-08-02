-- MySQL dump 10.13  Distrib 8.0.18, for Win64 (x86_64)
--
-- Host: localhost    Database: java10_shopping_manual
-- ------------------------------------------------------
-- Server version	8.0.18

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!50503 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `chitietdonhang`
--

DROP TABLE IF EXISTS `chitietdonhang`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `chitietdonhang` (
  `MaDH` int(11) NOT NULL,
  `MaMH` int(11) NOT NULL,
  `SoLuong` int(11) DEFAULT NULL,
  PRIMARY KEY (`MaDH`,`MaMH`),
  KEY `fk_DonHang_has_MatHang_MatHang1_idx` (`MaMH`),
  KEY `fk_DonHang_has_MatHang_DonHang1_idx` (`MaDH`),
  CONSTRAINT `fk_DonHang_has_MatHang_DonHang1` FOREIGN KEY (`MaDH`) REFERENCES `donhang` (`MaDH`),
  CONSTRAINT `fk_DonHang_has_MatHang_MatHang1` FOREIGN KEY (`MaMH`) REFERENCES `mathang` (`MaMH`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `chitietdonhang`
--

LOCK TABLES `chitietdonhang` WRITE;
/*!40000 ALTER TABLE `chitietdonhang` DISABLE KEYS */;
INSERT INTO `chitietdonhang` VALUES (1,1,1),(1,3,2),(1,4,1),(2,6,2),(2,8,2),(3,1,4),(3,2,2);
/*!40000 ALTER TABLE `chitietdonhang` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `chitiettinhtrangdonhang`
--

DROP TABLE IF EXISTS `chitiettinhtrangdonhang`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `chitiettinhtrangdonhang` (
  `MaDH` int(11) NOT NULL,
  `MaTTDH` int(11) NOT NULL,
  `MaNV` int(11) NOT NULL,
  `ThoiGian` datetime NOT NULL,
  PRIMARY KEY (`MaDH`,`MaTTDH`),
  KEY `fk_DonHang_has_TinhTrangDonHang_TinhTrangDonHang1_idx` (`MaTTDH`),
  KEY `fk_DonHang_has_TinhTrangDonHang_DonHang1_idx` (`MaDH`),
  KEY `FK_NhanVien_ChiTietTTDH_idx` (`MaNV`),
  CONSTRAINT `FK_NhanVien_ChiTietTTDH` FOREIGN KEY (`MaNV`) REFERENCES `nhanvien` (`MaNV`) ON DELETE CASCADE,
  CONSTRAINT `fk_DonHang_has_TinhTrangDonHang_DonHang1` FOREIGN KEY (`MaDH`) REFERENCES `donhang` (`MaDH`),
  CONSTRAINT `fk_DonHang_has_TinhTrangDonHang_TinhTrangDonHang1` FOREIGN KEY (`MaTTDH`) REFERENCES `tinhtrangdonhang` (`MaTTDH`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `chitiettinhtrangdonhang`
--

LOCK TABLES `chitiettinhtrangdonhang` WRITE;
/*!40000 ALTER TABLE `chitiettinhtrangdonhang` DISABLE KEYS */;
INSERT INTO `chitiettinhtrangdonhang` VALUES (1,3,2,'2020-12-14 18:20:20'),(1,4,2,'2020-12-15 18:20:20'),(1,5,2,'2020-12-16 18:20:20'),(2,3,2,'2020-12-14 18:20:20'),(2,4,2,'2020-12-15 18:20:20'),(2,5,2,'2020-12-16 18:20:20'),(3,3,2,'2020-12-14 18:20:20'),(3,4,2,'2020-12-15 18:20:20'),(3,5,2,'2020-12-16 18:20:20');
/*!40000 ALTER TABLE `chitiettinhtrangdonhang` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `donhang`
--

DROP TABLE IF EXISTS `donhang`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `donhang` (
  `MaDH` int(11) NOT NULL,
  `DiaChiGiaoHang` text NOT NULL,
  `SDTNguoiNhan` varchar(255) NOT NULL,
  `PhiVanChuyen` double NOT NULL DEFAULT '0',
  `ThoiGianDatHang` datetime NOT NULL,
  `TongTien` double NOT NULL,
  `MaKH` int(11) NOT NULL,
  `MaNV` int(11) NOT NULL,
  `MaPTTT` int(11) NOT NULL,
  PRIMARY KEY (`MaDH`),
  KEY `fk_DonHang_KhachHang1_idx` (`MaKH`),
  KEY `fk_DonHang_NhanVien1_idx` (`MaNV`),
  CONSTRAINT `fk_DonHang_KhachHang1` FOREIGN KEY (`MaKH`) REFERENCES `khachhang` (`MaKH`),
  CONSTRAINT `fk_DonHang_NhanVien1` FOREIGN KEY (`MaNV`) REFERENCES `nhanvien` (`MaNV`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `donhang`
--

LOCK TABLES `donhang` WRITE;
/*!40000 ALTER TABLE `donhang` DISABLE KEYS */;
INSERT INTO `donhang` VALUES (1,'Âu Cơ - Hòa Khánh','034 767 2514',20,'2020-12-18 16:33:20',0,1,1,1),(2,'Nam Cao - Hòa Khánh','034 167 2514',50,'2020-12-18 20:12:44',0,2,2,1),(3,'Phan Chu Trinh - Hải Châu','034 267 2514',0,'2020-12-17 18:19:24',0,3,1,1),(4,'Lê Lai - Hải Châu','034 367 2514',120,'2021-01-05 21:07:53',0,3,2,1);
/*!40000 ALTER TABLE `donhang` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `hoadon`
--

DROP TABLE IF EXISTS `hoadon`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `hoadon` (
  `MaHD` int(11) NOT NULL,
  `MaDH` int(11) NOT NULL,
  `SoTienCanThanhToan` double NOT NULL DEFAULT '0',
  `NgayXuat` datetime NOT NULL,
  PRIMARY KEY (`MaHD`),
  UNIQUE KEY `MaDH_UNIQUE` (`MaDH`),
  KEY `fk_HoaDon_DonHang1_idx` (`MaDH`),
  CONSTRAINT `fk_HoaDon_DonHang1` FOREIGN KEY (`MaDH`) REFERENCES `donhang` (`MaDH`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `hoadon`
--

LOCK TABLES `hoadon` WRITE;
/*!40000 ALTER TABLE `hoadon` DISABLE KEYS */;
/*!40000 ALTER TABLE `hoadon` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `khachhang`
--

DROP TABLE IF EXISTS `khachhang`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `khachhang` (
  `MaKH` int(11) NOT NULL,
  `TenKH` varchar(255) NOT NULL,
  `Email` varchar(255) NOT NULL,
  `DiaChi` text NOT NULL,
  `SoDienThoai` varchar(255) NOT NULL,
  `MatKhau` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`MaKH`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `khachhang`
--

LOCK TABLES `khachhang` WRITE;
/*!40000 ALTER TABLE `khachhang` DISABLE KEYS */;
INSERT INTO `khachhang` VALUES (1,'Lê Văn Khách','defaul.com.tp@gmail.com','Nam Cao - Hòa Khánh - Đà nẵng','0936 126 363','nf'),(2,'Hoàng Văn Nam','defaul.com.tp@gmail.com','Phan Chu Trinh - Hải Châu 1 - Đà nẵng','036 126 363','nf'),(3,'Nguyễn Nam Bằng','defaul.com.tp@gmail.com','Phan Chu Trinh - Hải Châu 1 - Đà nẵng','097 126 363','nf');
/*!40000 ALTER TABLE `khachhang` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `kichco`
--

DROP TABLE IF EXISTS `kichco`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `kichco` (
  `MaKC` varchar(5) NOT NULL,
  `MoTa` text NOT NULL,
  PRIMARY KEY (`MaKC`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `kichco`
--

LOCK TABLES `kichco` WRITE;
/*!40000 ALTER TABLE `kichco` DISABLE KEYS */;
INSERT INTO `kichco` VALUES ('L','L - Nam Nữ 41 - 50KG'),('M','M - Nam Nữ 31 - 40KG'),('S','S - Nam Nữ 21 - 30KG'),('XL','XL - Nam Nữ 51 - 60KG'),('XXL','XXL - Nam Nữ 61 - 70KG');
/*!40000 ALTER TABLE `kichco` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `kichcomathang`
--

DROP TABLE IF EXISTS `kichcomathang`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `kichcomathang` (
  `MaMH` int(11) NOT NULL,
  `MaKC` varchar(5) NOT NULL,
  `Soluong` int(11) NOT NULL,
  PRIMARY KEY (`MaMH`,`MaKC`),
  KEY `fk_MatHang_has_KichCoMatHang_KichCoMatHang1_idx` (`MaKC`),
  KEY `fk_MatHang_has_KichCoMatHang_MatHang1_idx` (`MaMH`),
  CONSTRAINT `FK_KCMH_KichCo` FOREIGN KEY (`MaKC`) REFERENCES `kichco` (`MaKC`),
  CONSTRAINT `FK_KCMH_MatHang` FOREIGN KEY (`MaMH`) REFERENCES `mathang` (`MaMH`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `kichcomathang`
--

LOCK TABLES `kichcomathang` WRITE;
/*!40000 ALTER TABLE `kichcomathang` DISABLE KEYS */;
INSERT INTO `kichcomathang` VALUES (1,'M',2),(1,'S',1),(2,'M',4),(2,'S',3),(3,'M',6),(3,'S',5),(4,'L',7),(4,'XL',8),(5,'M',1),(5,'S',3),(6,'M',3),(6,'S',2),(7,'XL',1),(7,'XXL',2),(8,'M',4),(8,'S',3),(9,'M',6),(9,'S',5),(10,'M',6),(10,'S',6),(16,'XL',5),(16,'XXL',5);
/*!40000 ALTER TABLE `kichcomathang` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `loaihang`
--

DROP TABLE IF EXISTS `loaihang`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `loaihang` (
  `MaLoai` int(11) NOT NULL,
  `TenLoai` varchar(255) NOT NULL,
  PRIMARY KEY (`MaLoai`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `loaihang`
--

LOCK TABLES `loaihang` WRITE;
/*!40000 ALTER TABLE `loaihang` DISABLE KEYS */;
INSERT INTO `loaihang` VALUES (1,'Áo'),(2,'Quần'),(3,'Giày dép'),(4,'Thắt lưng'),(5,'Mũ');
/*!40000 ALTER TABLE `loaihang` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `mathang`
--

DROP TABLE IF EXISTS `mathang`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `mathang` (
  `MaMH` int(11) NOT NULL,
  `TenMH` varchar(255) NOT NULL,
  `MauSac` varchar(255) NOT NULL,
  `ChatLieu` varchar(255) NOT NULL,
  `GiaBan` double NOT NULL,
  `GiaMua` double NOT NULL,
  `HinhAnh` text,
  `MaLoai` int(11) NOT NULL,
  PRIMARY KEY (`MaMH`),
  KEY `fk_MatHang_LoaiHang_idx` (`MaLoai`),
  KEY `TenMH_IDX` (`TenMH`),
  CONSTRAINT `fk_MatHang_LoaiHang` FOREIGN KEY (`MaLoai`) REFERENCES `loaihang` (`MaLoai`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `mathang`
--

LOCK TABLES `mathang` WRITE;
/*!40000 ALTER TABLE `mathang` DISABLE KEYS */;
INSERT INTO `mathang` VALUES (1,'Áo sơ mi Nam','Trắng','UD',199,160,'ud.png',1),(2,'Áo sơ mi Nữ','Hồng','UD',199,220,'ud.png',1),(3,'Quần tây Nam','Xanh','UD',300,800,'ud.png',2),(4,'Quần jean Nam','Nâu','UD',220,600,'ud.png',2),(5,'Quần jean Nữ','Trắng','UD',140,280,'ud.png',2),(6,'Giày da Nam','Đen','UD',220,750,'ud.png',3),(7,'Giày thể thao Nữ','Vàng','UD',240,780,'ud.png',3),(8,'Thắt lưng Nam','Hồng','UD',40,260,'ud.png',4),(9,'Thắt lưng Nữ','Xanh','UD',42,220,'ud.png',4),(10,'Mũ thể thao Nam','Trắng','UD',180,260,'ud.png',5),(11,'Áo khoác','Hồng','Vải',200,100,NULL,1),(12,'Áo khoác','Trắng','Vải',200,100,NULL,1),(13,'Áo khoác','Hồng','Vải',200,100,NULL,1),(14,'Áo khoác','Hồng','Vải',200,100,NULL,1),(15,'itB1','Đỏ','Da',250,150,NULL,19),(16,'itB2','Đỏ','Da',480,2200,NULL,19);
/*!40000 ALTER TABLE `mathang` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `nhanvien`
--

DROP TABLE IF EXISTS `nhanvien`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `nhanvien` (
  `MaNV` int(11) NOT NULL,
  `TenNV` varchar(255) NOT NULL,
  `Email` varchar(255) NOT NULL,
  `DiaChi` text NOT NULL,
  `SoDienThoai` varchar(255) NOT NULL,
  `MatKhau` text NOT NULL,
  PRIMARY KEY (`MaNV`),
  KEY `IDX_NAME` (`TenNV`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `nhanvien`
--

LOCK TABLES `nhanvien` WRITE;
/*!40000 ALTER TABLE `nhanvien` DISABLE KEYS */;
INSERT INTO `nhanvien` VALUES (1,'Lê Tèo','com1.default.tp@gmail.com','Nam Cao - Hòa Khánh - Đà Nẵng','0936 978 033','827ccb0eea8a706c4c34a16891f84e7b'),(2,'Lê Na','com2.default.tp@gmail.com','Âu Cơ - Hòa Khánh - Đà Nẵng','0936 978 033','adcaec3805aa912c0d0b14a81bedb6ff'),(3,'Hoàng Bửi','com3.default.tp@gmail.com','Nam Cao - Hòa Khánh - Đà Nẵng','0936 978 033','992a6d18b2a148cf20d9014c3524aa11'),(4,'Ngọc Thành','com4.default.tp@gmail.com','Lê Độ - Hòa Khánh - Đà Nẵng','0936 978 033','c4ded2b85cc5be82fa1d2464eba9a7d3'),(5,'Công Danh','com5.default.tp@gmail.com','Nam Cao - Hòa Khánh - Đà Nẵng','0936 978 033','099ebea48ea9666a7da2177267983138');
/*!40000 ALTER TABLE `nhanvien` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `phuongthucthanhtoan`
--

DROP TABLE IF EXISTS `phuongthucthanhtoan`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `phuongthucthanhtoan` (
  `MaPTTT` int(11) NOT NULL,
  `LoaiHinhThanhToan` varchar(255) NOT NULL,
  PRIMARY KEY (`MaPTTT`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `phuongthucthanhtoan`
--

LOCK TABLES `phuongthucthanhtoan` WRITE;
/*!40000 ALTER TABLE `phuongthucthanhtoan` DISABLE KEYS */;
INSERT INTO `phuongthucthanhtoan` VALUES (1,'Cash'),(2,'Visa Card');
/*!40000 ALTER TABLE `phuongthucthanhtoan` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `tinhtrangdonhang`
--

DROP TABLE IF EXISTS `tinhtrangdonhang`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `tinhtrangdonhang` (
  `MaTTDH` int(11) NOT NULL,
  `MoTa` text NOT NULL,
  PRIMARY KEY (`MaTTDH`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `tinhtrangdonhang`
--

LOCK TABLES `tinhtrangdonhang` WRITE;
/*!40000 ALTER TABLE `tinhtrangdonhang` DISABLE KEYS */;
INSERT INTO `tinhtrangdonhang` VALUES (1,'Yêu cầu đặt hàng'),(2,'Đặt hàng thành công'),(3,'Đang đóng gói'),(4,'Đang vận chuyển'),(5,'Giao hàng thành công');
/*!40000 ALTER TABLE `tinhtrangdonhang` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2021-06-23 17:54:54
