<%@page contentType="text/html" pageEncoding="windows-1252"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
 
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=windows-1252">
        <title>Tambah Page</title>
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
        </style>
    </head>
    <body>
        <h1>Tambah User</h1>
        
         <h2> Welome, 
            <c:out value="${cantik}"/>
         </h2>
        <form:form modelAttribute="barang" action="${pageContext.request.contextPath}/tambahkanBarang" method="post">
            <table>
                <tr>
                    <td>namabarang</td>
                    <td>:</td>
                    <td><form:input path="namabarang" /></td>
                </tr>
                <tr>
                    <td>idkategori</td>
                    <td>:</td>
                    <td><form:input path="idkategori" /></td>
                </tr>
                <tr>
                    <td>hargajual</td>
                    <td>:</td>
                    <td><form:input path="hargajual" /></td>
                </tr>
                <tr>
                    <td>hargabeli</td>
                    <td>:</td>
                    <td><form:input path="hargabeli" /></td>
                </tr>
                <tr>
                    <td>jumlah</td>
                    <td>:</td>
                    <td><form:input path="jumlah" /></td>
                </tr>
                <tr>
                    <td>idtoko</td>
                    <td>:</td>
                    <td><form:input path="idtoko" /></td>
                </tr>
                <tr>
                    <td><form:hidden path="gambar" value="" /></td>
                    <td><input type="submit" value="Simpan" /></td>
                </tr>
            </table>
    </form:form>
    </body>
</html>