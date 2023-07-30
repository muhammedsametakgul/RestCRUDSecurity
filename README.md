# RestCRUDSecurity
----------------------------------------
This repository includes some codes that can do CRUD operations with REST API as previous repository. In additional, this repository includes security and restrictions

Here is the database schema: 

![databaseschema](https://github.com/muhammedsametakgul/RestCRUDSecurity/assets/93324656/501a1ee5-02a0-49c6-9793-427cc98108bf)

Spring actually has a restriction database schema

This database must include these two tables:

authorities:

![image](https://github.com/muhammedsametakgul/RestCRUDSecurity/assets/93324656/60b81ea4-47fd-404c-b2b0-61529ea7583c)


users:

![image](https://github.com/muhammedsametakgul/RestCRUDSecurity/assets/93324656/b5d61b5b-cc09-4340-943d-e41122c45681)

(if you will use BCrypt algorithm in your password, you must make password length 68)
----------------------------------------------

![image](https://github.com/muhammedsametakgul/RestCRUDSecurity/assets/93324656/0e1057db-0d16-4188-8bbd-f4dfa5f6007b)

In Spring, by utilizing the @Bean annotation in a designated method, you can establish a connection to the database and enable automatic configuration for mapping the "authorities" and "users" tables. Spring effectively identifies these tables based on the provided entities and facilitates the configuration process seamlessly.


![image](https://github.com/muhammedsametakgul/RestCRUDSecurity/assets/93324656/f71296f1-c1bb-40ef-8aec-37bc395698b4)

Here is how you can give restrictions. You can restrict requests based on roles

---------------------------------------
If we have differenc named tables and we want Spring to know them and configre automatically, you need this method 

![image](https://github.com/muhammedsametakgul/RestCRUDSecurity/assets/93324656/8b89a552-1b6f-43ac-b9f2-b13946b0d238)

These attributes represent items in your tables.

