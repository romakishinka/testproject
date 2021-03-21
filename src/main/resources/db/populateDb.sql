INSERT INTO patient (id, first_name, last_name, middle_name, number)
VALUES (1, 'Andrew', 'Burkov', 'Ivanovich', '89204537854'),
       (3, 'Roman', 'Makavecky', 'Victorovich', '89202234578'),
       (4, 'Nina', 'Pavlova', 'Ivanovich', '89205544172'),
       (5, 'Alena', 'Burkov', 'Alexandrovich', null),
       (6, 'Sergey', 'Nerovny', 'Pavlovich', '89194455174'),
       (7, 'Andrea', 'Burkov', 'Ivanovich', null),
       (8, 'Masha', 'Navalny', 'Ivanovich', null),
       (9, 'Misha', 'Pushkin', 'Ivanovich', null);

INSERT INTO doctor(id, first_name, last_name, middle_name, specialization)
VALUES (1, 'Genadiy', 'Bykow', 'Maratovich', 'surgeon'),
       (2, 'Ludmila', 'Rogacheva', 'Sergeevna', 'dentist'),
       (3, 'Alex', 'Godvin', 'Markovich', 'dentist'),
       (4, 'Nikita', 'Petrov', 'Maratovich', 'optometrist');

INSERT INTO recipe(id, description, date, duration, priority, doctor_id, patient_id)
VALUES (1, 'bla bla bla', '2021-01-30 13:00:00', 3, 'norm', 2, 1),
       (2, 'bla bla bla', '2020-04-29 14:00:00', 2, 'cito', 1, 3),
       (3, 'bla bla bla', '2021-11-01 10:00:00', 1, 'statim', 3, 8),
       (4, 'bla bla bla', '2021-09-30 10:00:00', 5, 'norm', 4, 9),
       (5, 'bla bla bla', '2021-11-01 10:00:00', 1, 'statim', 3, 7),
       (6, 'bla bla bla', '2021-11-01 10:00:00', 1, 'statim', 2, 6),
       (7, 'bla bla bla', '2021-11-01 10:00:00', 1, 'statim', 1, 4),
       (8, 'bla bla bla', '2021-11-01 10:00:00', 1, 'statim', 4, 4);