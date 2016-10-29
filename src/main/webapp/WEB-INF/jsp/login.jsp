<%-- 
    Document   : login
    Created on : Oct 18, 2016, 1:55:03 PM
    Author     : Sofrie
--%>

<%@page contentType="text/html" pageEncoding="windows-1252"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
 
<!DOCTYPE html>

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=windows-1252">
        <title>Login Page</title>
        <style type="text/css">
            h1{
               font-family: sans-serif;
               border-bottom: 3px solid #abcae8;
               color:#4d7ba7;
            }
            
            table{
                border:2px solid #4d7ba7;
                color: #4d7ba7;
                font-family: arial;
                padding: 5px;
            }
            
            table td{
                padding: 5px;
                padding-bottom: 10px;
            }
            
            table input{
                border:1px solid #4d7ba7;
                padding: 3px;
            }
            #buttonLogin{
                margin-bottom: 10px;
            }
            
            #buttonLogin a{
                text-decoration: none;
                color: #ffffff;
                font-family: arial;
                background: #abcae8;
                border:1px solid antiquewhite;
                padding: 5px;
                border-radius: 8px;
            }
        </style>
    </head>
    <body>
        <h1>Login</h1>
        
         
        <form:form modelAttribute="user" action="${pageContext.request.contextPath}/loginuser" method="post">
            <table>
                <tr>
                    <td>Username</td>
                    <td>:</td>
                    <td><form:input path="username" /></td>
                </tr>
                <tr>
                    <td>Password</td>
                    <td>:</td>
                    <td><form:input path="password" type="password"/></td>
                </tr>
                <tr>
                    <td><input type="submit" value="Login" /></td>
                    <td>
                        <div id="buttonLogin">            
                            <a href="${pageContext.request.contextPath}/tambahUser">Register</a>
                        </div>
                    </td>
                </tr>
            </table>
        </form:form>
    </body>
</html>