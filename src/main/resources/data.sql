INSERT INTO USER (user_name, email_id,role) VALUES
  ('dileep', 'dileepkm6@gmail.com','admin'),
  ('maurya', 'maurya@gmail.com','');

INSERT INTO PRIORITY (priority) VALUES
  ('Connection'),
  ('Relationships'),
  ('Career'),
  ('Wealth');

INSERT INTO USER_PRIORITY (priority,user_name,satisfaction_rating) VALUES
    ('Connection','dileep',0),
    ('Relationships','dileep',0),
    ('Career','dileep',0),
    ('Wealth','dileep',0),
    ('Connection','maurya',0),
    ('Relationships','maurya',0),
    ('Career','maurya',0),
    ('Wealth','maurya',0);
