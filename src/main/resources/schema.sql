DROP TABLE IF EXISTS USER;
DROP TABLE IF EXISTS PRIORITY;

CREATE TABLE USER (
  user_name VARCHAR(50) PRIMARY KEY,
  email_id VARCHAR(50),
  role varchar(20)
);

CREATE TABLE PRIORITY (
priority varchar(50) PRIMARY KEY
);

CREATE TABLE USER_PRIORITY (
user_priory_id int IDENTITY(1,1) PRIMARY KEY,
priority varchar(50) NOT NULL,
user_name varchar(50) NOT NULL,
satisfaction_rating int,
FOREIGN KEY (user_name) REFERENCES USER(user_name),
FOREIGN KEY (priority) REFERENCES PRIORITY(priority)
);
