# ORDER_ITEM API
 A simple Spring boot API for Create Order of Items and get all order list and get order by order Id whose all data stores in MySQL database.


Click on YouTube Symbol to watch Demo of the OrderItem API.
[![Order-Item Api](https://github.com/imakash28/Student-Management-ERP-System/blob/main/Student%20Management%20System%20Project%20In%20Django%20Source%20Code/media/Youtube.jpeg?raw=true)](https://youtu.be/StLsAd8ee0k"Demo")

## Screenshots

#### Swagger
Swagger URL [Url](http://localhost:8080/swagger-ui.html#/)
![SWAGGER](https://github.com/imakash28/OrderItems/blob/main/testing/src/main/java/com/example/testing/images/Swagger.jpeg)

#### UserDetails Database
![Complete Order Database](https://github.com/imakash28/OrderItems/blob/main/testing/src/main/java/com/example/testing/images/Order%20Table%20DB.png?raw=true)

![Complete Item Database](https://github.com/imakash28/OrderItems/blob/main/testing/src/main/java/com/example/testing/images/Item%20table%20Db.png?raw=true)

#### Request and Response For Create Order 
Api of Create Order Request [Controller](https://github.com/imakash28/OrderItems/blob/main/testing/src/main/java/com/example/testing/controller/OrderController.java#L24)\
Implemented Request of Create Order [ServiceImpl](https://github.com/imakash28/OrderItems/blob/main/testing/src/main/java/com/example/testing/serviceImpl/OrderServiceImpl.java#L30)\
![Create Order Request](https://github.com/imakash28/OrderItems/blob/main/testing/src/main/java/com/example/testing/images/Create%20order%20Request.png?raw=true)
![Add Create Order Response](https://github.com/imakash28/OrderItems/blob/main/testing/src/main/java/com/example/testing/images/Createorder%20Response.png?raw=true)

#### Request and Response for Get Order By OrderId 
Api of Request Get Order By OrderId [Controller](https://github.com/imakash28/OrderItems/blob/main/testing/src/main/java/com/example/testing/controller/OrderController.java#L30)\
Implemented Request Get Order By OrderId [ServiceImpl](https://github.com/imakash28/OrderItems/blob/main/testing/src/main/java/com/example/testing/serviceImpl/OrderServiceImpl.java#L60)\
![Get Order by OrderId Request](https://github.com/imakash28/OrderItems/blob/main/testing/src/main/java/com/example/testing/images/Get%20Order%20by%20Id%20Request.png?raw=true)
![Get Order by OrderId Response](https://github.com/imakash28/OrderItems/blob/main/testing/src/main/java/com/example/testing/images/Get%20Order%20by%20Id%20Response.png?raw=true)

#### Request and Response For Get All Order List
Api of Get All Order List Request [Controller](https://github.com/imakash28/CRUD_OPERATION/blob/main/user/user/src/main/java/com/example/user/controller/UserController.java#L36)\
Implemented Request for Get all OrderList [ServiceImpl](https://github.com/imakash28/OrderItems/blob/main/testing/src/main/java/com/example/testing/serviceImpl/OrderServiceImpl.java#L73)\
![Get All Order List Request](https://github.com/imakash28/OrderItems/blob/main/testing/src/main/java/com/example/testing/images/Get%20all%20order%20Request.png?raw=true)
![Get All Order List Response ](https://github.com/imakash28/OrderItems/blob/main/testing/src/main/java/com/example/testing/images/Get%20all%20order%20Response.png?raw=true)


## CODE
GOTO [OrderController](https://github.com/imakash28/OrderItems/blob/main/testing/src/main/java/com/example/testing/controller/OrderController.java)\
GOTO [Dao->ItemDao](https://github.com/imakash28/OrderItems/blob/main/testing/src/main/java/com/example/testing/dao/ItemDao.java)\
GOTO [Dao->OrderDao](https://github.com/imakash28/OrderItems/blob/main/testing/src/main/java/com/example/testing/dao/OrderDao.java)\
GOTO [Dto->OrderDto](https://github.com/imakash28/OrderItems/blob/main/testing/src/main/java/com/example/testing/dto/OrderDto.java)\
GOTO [Model->Order.Java](https://github.com/imakash28/OrderItems/blob/main/testing/src/main/java/com/example/testing/model/Order.java)\
GOTO [Model->Item.Java](https://github.com/imakash28/OrderItems/blob/main/testing/src/main/java/com/example/testing/model/Items.java)\
GOTO [Service->OrderService](https://github.com/imakash28/OrderItems/blob/main/testing/src/main/java/com/example/testing/service/OrderService.java)\
GOTO [ServiceImpl](https://github.com/imakash28/OrderItems/blob/main/testing/src/main/java/com/example/testing/serviceImpl/OrderServiceImpl.java)

