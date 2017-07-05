select e.username, r.role from USER_ROLES r join table_user e on r.role_id=e.role_id where e.username='dhananjay';


drop sequence customers_seq RESTRICT;



CREATE SEQUENCE customers_seq
 START WITH     1
 INCREMENT BY   1;