-- phpMyAdmin SQL Dump
-- version 5.2.0
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Dec 13, 2022 at 01:48 PM
-- Server version: 10.4.27-MariaDB
-- PHP Version: 8.1.12

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `banksys`
--

-- --------------------------------------------------------

--
-- Table structure for table `transac`
--

CREATE TABLE `transac` (
  `transid` bigint(30) NOT NULL,
  `accnum` bigint(12) NOT NULL,
  `transtype` varchar(50) NOT NULL,
  `amount` int(9) NOT NULL,
  `dot` datetime NOT NULL,
  `targaccnum` bigint(12) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `transac`
--

INSERT INTO `transac` (`transid`, `accnum`, `transtype`, `amount`, `dot`, `targaccnum`) VALUES
(23, 20220000015, 'Deposit', 4000, '2022-12-13 15:07:28', 0),
(24, 20220000015, 'Withdraw', 5000, '2022-12-13 15:07:35', 0),
(25, 20220000015, 'Withdraw', 500, '2022-12-13 15:08:22', 20220000016),
(26, 20220000016, 'Deposit', 500, '2022-12-13 15:08:22', 0),
(27, 20220000016, 'Deposit', 5000, '2022-12-13 15:24:40', 0),
(28, 20220000016, 'Withdraw', 500, '2022-12-13 15:25:04', 0),
(29, 20220000016, 'Withdraw', 500, '2022-12-13 15:25:48', 20220000017),
(30, 20220000017, 'Deposit', 500, '2022-12-13 15:25:48', 0);

-- --------------------------------------------------------

--
-- Table structure for table `users`
--

CREATE TABLE `users` (
  `username` varchar(50) NOT NULL,
  `password` varchar(50) NOT NULL,
  `accname` varchar(50) NOT NULL,
  `fname` varchar(50) NOT NULL,
  `lname` varchar(50) NOT NULL,
  `adrs` varchar(50) NOT NULL,
  `age` int(3) NOT NULL,
  `dob` date NOT NULL,
  `type` varchar(15) NOT NULL,
  `bal` int(9) NOT NULL,
  `accnum` bigint(15) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `users`
--

INSERT INTO `users` (`username`, `password`, `accname`, `fname`, `lname`, `adrs`, `age`, `dob`, `type`, `bal`, `accnum`) VALUES
('clarka', '1234', 'clarkd', 'clakrss', 'abutals', 'asda', 19, '2022-12-13', '', 1500, 20220000017);

--
-- Triggers `users`
--
DELIMITER $$
CREATE TRIGGER `getAccnum` BEFORE INSERT ON `users` FOR EACH ROW BEGIN


END
$$
DELIMITER ;

--
-- Indexes for dumped tables
--

--
-- Indexes for table `transac`
--
ALTER TABLE `transac`
  ADD PRIMARY KEY (`transid`);

--
-- Indexes for table `users`
--
ALTER TABLE `users`
  ADD PRIMARY KEY (`accnum`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `transac`
--
ALTER TABLE `transac`
  MODIFY `transid` bigint(30) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=31;

--
-- AUTO_INCREMENT for table `users`
--
ALTER TABLE `users`
  MODIFY `accnum` bigint(15) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=20220000019;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
