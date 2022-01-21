<%-- 
    Document   : arithmeticCalculator
    Created on : Jan. 18, 2022, 4:13:16 p.m.
    Author     : Lucky
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        
        <h1>Arithmetic Calculator</h1>
        <form action="arithmetic" method="post">
            <label for=" number1">First:</label>
            <input type="number" name="number1" id="number1">
            <br>
            <label for=" number2">Second:</label>
            <input type="number" name="number2" id="number2">
            <br>
<!--            <button type="submit">+</button> <button type="submit">-</button> <button type="submit">/</button> <button type="submit">*</button>-->
            <input type="submit" value="+" name="button">
            <input type="submit" value="-" name="button">
            <input type="submit" value="*" name="button">
            <input type="submit" value="%" name="button">
            
        </form>
        <p>${result}</p>
        
        <p><a href="age"> Age Calculator</p>
    </body>
</html>
