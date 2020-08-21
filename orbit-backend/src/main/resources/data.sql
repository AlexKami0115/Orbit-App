DROP TABLE IF EXISTS planets;

CREATE TABLE planets (
  id int primary key,
  name varchar(30) not null,
  orbitSpeed int not null,
  spinSpeed int not null,
  color varchar(20) not null,
  radius int not null,
  filePath varchar(255) not null,
);

INSERT INTO planets (id, name, orbitSpeed, spinSpeed, color, radius, filepath) VALUES
  (0, 'Earth', 5, 6, 'blue', 45, '../../assets/images/earth.jpg'),
  (1, 'Jupiter', 15, 10, 'orange', 90, '../../assets/images/jupiter.jpg'),
  (2, 'Venus', 3, 5, 'blood red', 30, '../../assets/images/venus.jpg'),
  (3, 'Mars', 6, 7, 'red', 30, '../../assets/images/mars.jpg'),
  (4, 'Mercury', 7, 4, 'British', 50, '../../assets/images/mercury.png'),
  (5, 'Neptune', 7, 10, 'sky blue', 50, '../../assets/images/neptune.png'),
  (6, 'Pluto', 20, 5, 'brown', 15, '../../assets/images/pluto.jpg'),
  (7, 'Saturn', 12, 7, 'light gray', 80, '../../assets/images/saturn.jpg'),
  (8, 'Uranus', 9, 5, 'light blue', 55, '../../assets/images/uranus.jpg');