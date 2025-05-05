-- ====== Справочники ======

INSERT INTO student_groups (name) VALUES ('233-121');

INSERT INTO departments (name) VALUES
    ('Строительство'),
    ('Эксплуатация транспортно-технологических машин и комплексов'),
    ('Юриспруденция');

INSERT INTO degree_levels (name) VALUES ('Бакалавриат');
INSERT INTO degree_forms (name) VALUES ('Заочная'), ('Очно-заочная');

INSERT INTO job_titles (name) VALUES ('Доцент, к.н.'), ('Ассистент');
INSERT INTO staff_categories (name) VALUES ('ППС');
INSERT INTO employment_types (name) VALUES ('Основное место работы'), ('Внешнее совместительство'), ('Внутреннее совместительство');

INSERT INTO subdivisions (name, guid) VALUES
    ('Кафедра "Техническая механика и компьютерное моделирование"', '3f78aefc-b234-11eb-bba0-f3424449f339'),
    ('Центр проектной деятельности', 'e83293fa-d1db-11e8-9419-b4b52f5f5348'),
    ('Кафедра "Иностранные языки"', '610c3931-5fa0-11e6-93fd-b4b52f5f5349');

-- ====== Пользователи ======

INSERT INTO users (guid, full_name, first_name, last_name, middle_name, user_type)
VALUES
    ('00025940-e303-11eb-80d3-c5a85e98a61c', 'Кузнецов Александр Владимирович', 'Александр', 'Кузнецов', 'Владимирович', 'student'),
    ('000834b8-f8de-11ed-ae50-ead62c822105', 'Садовникова Валерия Сергеевна', 'Валерия', 'Садовникова', 'Сергеевна', 'student'),
    ('0008cd8a-aabf-11e9-9415-000c29c02919', 'Артемкина Анна Николаевна', 'Анна', 'Артемкина', 'Николаевна', 'student'),

    ('9c8e762f-53ee-11e1-821f-f46d0479696f', 'Лукьянов Александр Сергеевич', 'Александр', 'Лукьянов', 'Сергеевич', 'employee'),
    ('f232a47e-8915-11ee-bbb0-d8a9a22ea1c3', 'Харламов Артем Юрьевич', 'Артем', 'Харламов', 'Юрьевич', 'employee'),
    ('b9366a4b-0091-11e2-9194-d8d38563fc83', 'Циленко Любовь Петровна', 'Любовь', 'Циленко', 'Петровна', 'employee');

-- ====== Студенты ======

INSERT INTO students (guid, course, start_year, department_id, group_id, degree_level_id, degree_form_id)
VALUES
    ('00025940-e303-11eb-80d3-c5a85e98a61c', 1, 2021, 1, NULL, 1, 1),
    ('000834b8-f8de-11ed-ae50-ead62c822105', 2, 2023, 2, 1, 1, 1),
    ('0008cd8a-aabf-11e9-9415-000c29c02919', 1, 2019, 3, NULL, 1, 2);

-- ====== Сотрудники ======

INSERT INTO employees (guid, date_of_birth)
VALUES
    ('9c8e762f-53ee-11e1-821f-f46d0479696f', '1961-06-13'),
    ('f232a47e-8915-11ee-bbb0-d8a9a22ea1c3', '1994-03-29'),
    ('b9366a4b-0091-11e2-9194-d8d38563fc83', '1958-11-15');

-- ====== Трудоустройство ======

INSERT INTO employee_employments (employee_guid, job_title_id, staff_category_id, employment_type_id, subdivision_id, job_state)
VALUES
    ('9c8e762f-53ee-11e1-821f-f46d0479696f', 1, 1, 1, 1, 'Работа'),
    ('f232a47e-8915-11ee-bbb0-d8a9a22ea1c3', 2, 1, 2, 2, 'Работа'),
    ('b9366a4b-0091-11e2-9194-d8d38563fc83', 1, 1, 3, 3, 'Работа'),
    ('b9366a4b-0091-11e2-9194-d8d38563fc83', 1, 1, 1, 3, 'Работа');
