
Simple maintenance Costumer
---------------------------

Spring Boot + Hibernate, using MariaDB and embebed Tomcat

Resume of funcionalities:

- findAll: Method to retrieve a complete list of Customers.
- findCustomerId: Method to retrieve a Customer searched by Customer Id.
- findCustomerName: Method to retrieve list of Customers searched by Customer name.
- findCustomerAddress: Method to retrieve list of Customers searched by Customer address.
- findCustomerPhone: Method to retrieve list of Customers searched by Customer phone.
- addCustomer: Method to add a Costumer with parameters
- addCustomer: Method to add a Costumer with Json file sends in @RequestBody

Example of Endpoints:

- http://localhost:8080/customer/findAll
- http://localhost:8080/customer/findbyId/{userid}
- http://localhost:8080/customer/findbyName
- http://localhost:8080/customer/findbyAddress/{useraddress}
- http://localhost:8080/customer/findbyPhone/{userphone}
- http://localhost:8080/customer/addCostumer/{username}/{useraddress}/{userphone} // Remember %20 if you want a space in the any field, in this case 
- http://localhost:8080/customer/addCostumerBody

Review application.properties for conection to Database with Maria DB
(IMPORTANT: Configure Database engine with "InnoDB")

Next goals:

- Add Integration test with "Mock Mvc" and "Mockito"
- Add Unit test with "Mock Mvc" and "Mockito"
