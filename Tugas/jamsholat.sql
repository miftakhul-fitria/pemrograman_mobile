-- phpMyAdmin SQL Dump
-- version 4.8.3
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Mar 16, 2020 at 07:38 AM
-- Server version: 10.1.37-MariaDB
-- PHP Version: 7.2.12

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `jamsholat`
--

-- --------------------------------------------------------

--
-- Table structure for table `identitas_masjid`
--

CREATE TABLE `identitas_masjid` (
  `id_identitas` int(255) NOT NULL,
  `nama_masjid` varchar(255) NOT NULL,
  `alamat_masjid` text NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `identitas_masjid`
--

INSERT INTO `identitas_masjid` (`id_identitas`, `nama_masjid`, `alamat_masjid`) VALUES
(1, 'hidayah', 'Bojonegoro'),
(2, 'hidayah', 'Bojonegoro'),
(3, 'Al-Hidayah', 'Perumahan Pacul Permai, Bojonegoro, Jawa Timur');

-- --------------------------------------------------------

--
-- Table structure for table `jadwal_sholat`
--

CREATE TABLE `jadwal_sholat` (
  `id_jadwal` int(255) NOT NULL,
  `dhuha` varchar(255) NOT NULL,
  `shubuh` varchar(255) NOT NULL,
  `dhuhur` varchar(255) NOT NULL,
  `ashar` varchar(255) NOT NULL,
  `maghrib` varchar(255) NOT NULL,
  `isha` varchar(255) NOT NULL,
  `foto` varchar(255) NOT NULL,
  `video` varchar(255) NOT NULL,
  `transisi` varchar(255) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `jadwal_sholat`
--

INSERT INTO `jadwal_sholat` (`id_jadwal`, `dhuha`, `shubuh`, `dhuhur`, `ashar`, `maghrib`, `isha`, `foto`, `video`, `transisi`) VALUES
(1, '09.32', '03.30', '11.32', '14.32', '17.32', '19.02', '1576633116122', '0', '1581490011193'),
(2, '09.33', '04.17', '11.44', '14.47', '17.51', '19.00', '', '', '');

-- --------------------------------------------------------

--
-- Table structure for table `marquee`
--

CREATE TABLE `marquee` (
  `id_marquee` int(255) NOT NULL,
  `isi_marquee` text NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `marquee`
--

INSERT INTO `marquee` (`id_marquee`, `isi_marquee`) VALUES
(1, '** Himbauan untuk seluruh Jamaah Masjid An Nur agar berhati-hati dalam menempatkan kendaraan di tempat parkir. Pastikan kendaraan terkunci rapat. **'),
(2, '** Himbauan untuk seluruh Jamaah Masjid Raden Patah agar berhati-hati dalam menempatkan kendaraan di tempat parkir. Pastikan kendaraan terkunci rapat. **'),
(3, '** Himbauan untuk seluruh Jamaah Masjid Al-Hidayah agar berhati-hati dalam menempatkan kendaraan di tempat parkir. Pastikan kendaraan terkunci rapat. **');

-- --------------------------------------------------------

--
-- Table structure for table `pengumuman_masjid`
--

CREATE TABLE `pengumuman_masjid` (
  `id_pengumuman` int(255) NOT NULL,
  `judul_pengumuman` varchar(255) NOT NULL,
  `isi_pengumuman` text NOT NULL,
  `aktif` varchar(100) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `pengumuman_masjid`
--

INSERT INTO `pengumuman_masjid` (`id_pengumuman`, `judul_pengumuman`, `isi_pengumuman`, `aktif`) VALUES
(13, 'PENTING', 'Hadirilah pengajian akbar tahun 2019 di Masjid An Nur, Sabtu 8 Januari 2020 di Pelataran Masjid An Nur Dengan Pembicara Ustadz Budi dari Jakarta.\r\n\r\n<hr>\r\n\r\nProgram khitanan massal akan dilaksanakan pada tanggal 2 Pebruari 2020. Mohon diinformasikan kepada kerabat dan tetangga sekitar.<hr>', 'no'),
(14, 'Khitanan Massal', 'Program khitanan massal akan dilaksanakan pada tanggal 2 Februari 2020. Mohon diinformasikan kepada kerabat dan tetangga sekitar.', 'no'),
(15, 'Pengajian Mingguan', 'Hadirilah pengajian Mingguan tahun 2020 di Masjid Al-Hidayah, Minggu 16 Februari 2020 di Masjid Al-Hidayah. Dengan Pembicara Ustadz Hanan dari Jakarta.', 'no');

-- --------------------------------------------------------

--
-- Table structure for table `slideshow`
--

CREATE TABLE `slideshow` (
  `id_slideshow` int(255) NOT NULL,
  `judul_slideshow` varchar(255) NOT NULL,
  `url_slideshow` varchar(255) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `slideshow`
--

INSERT INTO `slideshow` (`id_slideshow`, `judul_slideshow`, `url_slideshow`) VALUES
(19, 'foto', '1300x1000.jpg'),
(20, 'foto', 'CIMG1043JPG.jpg'),
(21, 'foto', 'CIMG1902JPG.jpg'),
(22, 'foto', 'CIMG1927JPG.jpg'),
(23, 'foto', 'CIMG1968JPG.jpg'),
(24, 'foto', 'efef.jpg'),
(26, 'foto', 'P90811-063819.jpg'),
(27, 'image', 'efef.jpg');

-- --------------------------------------------------------

--
-- Table structure for table `tagline`
--

CREATE TABLE `tagline` (
  `id_tagline` int(255) NOT NULL,
  `isi_tagline` text NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `tagline`
--

INSERT INTO `tagline` (`id_tagline`, `isi_tagline`) VALUES
(2, 'Kajian Rutin dilaksanakan setiap hari Ahad bada Sholat Maghrib'),
(3, 'Kajian Rutin dilaksanakan setiap hari Ahad bada Sholat Subuh'),
(4, 'Kajian Rutin dilaksanakan setiap hari Jumat bada Sholat Subuh');

-- --------------------------------------------------------

--
-- Table structure for table `user`
--

CREATE TABLE `user` (
  `id_user` int(255) NOT NULL,
  `username` varchar(255) NOT NULL,
  `password` varchar(255) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `user`
--

INSERT INTO `user` (`id_user`, `username`, `password`) VALUES
(1, 'miftakhul', 'miftakhul123');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `identitas_masjid`
--
ALTER TABLE `identitas_masjid`
  ADD PRIMARY KEY (`id_identitas`);

--
-- Indexes for table `jadwal_sholat`
--
ALTER TABLE `jadwal_sholat`
  ADD PRIMARY KEY (`id_jadwal`);

--
-- Indexes for table `marquee`
--
ALTER TABLE `marquee`
  ADD PRIMARY KEY (`id_marquee`);

--
-- Indexes for table `pengumuman_masjid`
--
ALTER TABLE `pengumuman_masjid`
  ADD PRIMARY KEY (`id_pengumuman`);

--
-- Indexes for table `slideshow`
--
ALTER TABLE `slideshow`
  ADD PRIMARY KEY (`id_slideshow`);

--
-- Indexes for table `tagline`
--
ALTER TABLE `tagline`
  ADD PRIMARY KEY (`id_tagline`);

--
-- Indexes for table `user`
--
ALTER TABLE `user`
  ADD PRIMARY KEY (`id_user`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `identitas_masjid`
--
ALTER TABLE `identitas_masjid`
  MODIFY `id_identitas` int(255) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=4;

--
-- AUTO_INCREMENT for table `jadwal_sholat`
--
ALTER TABLE `jadwal_sholat`
  MODIFY `id_jadwal` int(255) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=3;

--
-- AUTO_INCREMENT for table `marquee`
--
ALTER TABLE `marquee`
  MODIFY `id_marquee` int(255) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=4;

--
-- AUTO_INCREMENT for table `pengumuman_masjid`
--
ALTER TABLE `pengumuman_masjid`
  MODIFY `id_pengumuman` int(255) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=16;

--
-- AUTO_INCREMENT for table `slideshow`
--
ALTER TABLE `slideshow`
  MODIFY `id_slideshow` int(255) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=28;

--
-- AUTO_INCREMENT for table `tagline`
--
ALTER TABLE `tagline`
  MODIFY `id_tagline` int(255) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=5;

--
-- AUTO_INCREMENT for table `user`
--
ALTER TABLE `user`
  MODIFY `id_user` int(255) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=2;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
