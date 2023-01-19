-- run this as root
CREATE USER 'demo'@'%' IDENTIFIED BY 'demo';

GRANT ALL PRIVILEGES ON `demo`.* TO 'demo'@'%' WITH GRANT OPTION;

grant all on `demo`.* to 'demo'@'%';
