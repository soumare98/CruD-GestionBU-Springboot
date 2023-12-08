-- phpMyAdmin SQL Dump
-- version 5.1.1
-- https://www.phpmyadmin.net/
--
-- Hôte : 127.0.0.1:3306
-- Généré le : ven. 08 déc. 2023 à 19:53
-- Version du serveur : 5.7.36
-- Version de PHP : 7.4.26

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de données : `bubliotheque`
--

-- --------------------------------------------------------

--
-- Structure de la table `autheur`
--

DROP TABLE IF EXISTS `autheur`;
CREATE TABLE IF NOT EXISTS `autheur` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `name` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=utf8;

--
-- Déchargement des données de la table `autheur`
--

INSERT INTO `autheur` (`id`, `name`) VALUES
(1, 'Émile-Auguste '),
(2, 'Louis Aragon'),
(3, 'Saint Augustin'),
(4, 'Honoré de Balzac'),
(5, 'Mikhaïl Boulgakov');

-- --------------------------------------------------------

--
-- Structure de la table `book`
--

DROP TABLE IF EXISTS `book`;
CREATE TABLE IF NOT EXISTS `book` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `isbn` int(11) NOT NULL,
  `title` varchar(255) DEFAULT NULL,
  `autheur_id` bigint(20) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `FKesxvv4phsfuovg5u5hun4rga4` (`autheur_id`)
) ENGINE=InnoDB AUTO_INCREMENT=7 DEFAULT CHARSET=utf8;

--
-- Déchargement des données de la table `book`
--

INSERT INTO `book` (`id`, `isbn`, `title`, `autheur_id`) VALUES
(1, 234, 'Les Arts et les dieux, 1958', 4),
(2, 124, 'Œuvres romanesques complètes, 4 volumes, 1997-2008', 2),
(3, 2345, 'Les Confessions, Dialogues philosophiques, 1998', 3),
(4, 665, 'La Cité de Dieu, 2000', 5),
(5, 432, 'La Comédie humaine', 1);

--
-- Contraintes pour les tables déchargées
--

--
-- Contraintes pour la table `book`
--
ALTER TABLE `book`
  ADD CONSTRAINT `FKesxvv4phsfuovg5u5hun4rga4` FOREIGN KEY (`autheur_id`) REFERENCES `autheur` (`id`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
