# RestCRUDSecurity
----------------------------------------
This repository includes some codes that can do CRUD operations with REST API as previous repository. In additional, this repository includes security and restrictions

Here is the database schema: 

![databaseschema](https://github.com/muhammedsametakgul/RestCRUDSecurity/assets/93324656/411998e6-5c5b-40ca-8545-8b16d3fba73a)


Spring actually has a restriction database schema

This database must include these two tables:

authorities:

![authorities](https://github.com/muhammedsametakgul/RestCRUDSecurity/assets/93324656/e29fbb7d-6ddd-4674-8d9a-ccd63ab0f7a8)


users:

![users](https://github.com/muhammedsametakgul/RestCRUDSecurity/assets/93324656/0b49cb1a-c9d2-4789-84c0-bd9364c3b892)

(if you will use BCrypt algorithm in your password, you must make password length 68)
----------------------------------------------

![UserDetailManager](https://github.com/muhammedsametakgul/RestCRUDSecurity/assets/93324656/9c2306e5-6cbf-46d8-a684-e03b3e02fa67)

In Spring, by utilizing the @Bean annotation in a designated method, you can establish a connection to the database and enable automatic configuration for mapping the "authorities" and "users" tables. Spring effectively identifies these tables based on the provided entities and facilitates the configuration process seamlessly.


![Restrictions](https://github.com/muhammedsametakgul/RestCRUDSecurity/assets/93324656/ff473d37-e759-4067-898d-e1696f486919)

Here is how you can give restrictions. You can restrict requests based on roles

---------------------------------------
If we have differenc named tables and we want Spring to know them and configre automatically, you need this method 

![config](https://github.com/muhammedsametakgul/RestCRUDSecurity/assets/93324656/3a621c4b-59bb-4ca4-8603-6f0ad5742429)

These attributes must represent items in your tables. You need make it according to table you created.

