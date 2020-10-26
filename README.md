# My new online shop
This is a rest api, developed using java with spring boot, and managed with maven. <BR/>
To execute the unit tests  run : <BR/>
<pre>
mvn clean install
</pre>
There is 4 Unit tests covering the shopping cart operations

Start the API : mvn spring-boot:run and wisite the openApi url :  http://localhost:8080/swagger-ui.html
Evenry REST endpoint has a simple documenteation and can be tested via the swagger page

To test both in the unit tests or via the REST api , you can use the following values : <BR/>
 <pre> customerId : 1 <BR/> </pre>pre>
 Products : <BR/>
    <pre>
    reference : prod01          price:  10 <BR/>
    reference : prod02          price:   5
    </pre>