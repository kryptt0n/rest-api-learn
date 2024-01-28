INSERT INTO user_details(id, name, birth_date) VALUES (101, 'Vitaly', current_date());
INSERT INTO user_details(id, name, birth_date) VALUES (102, 'Tom', current_date());
INSERT INTO user_details(id, name, birth_date) VALUES (103, 'Ben', current_date());

INSERT INTO post(id, description, user_id) VALUES (201, 'Learn Java', 101);
INSERT INTO post(id, description, user_id) VALUES (202, 'Learn DevOps', 101);
INSERT INTO post(id, description, user_id) VALUES (203, 'Learn C++', 102);
INSERT INTO post(id, description, user_id) VALUES (204, 'Learn C#', 102);
INSERT INTO post(id, description, user_id) VALUES (205, 'Certified Java', 102);
INSERT INTO post(id, description, user_id) VALUES (206, 'Certified DevOps', 103);
