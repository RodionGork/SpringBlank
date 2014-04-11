<%@ page isELIgnored ="false" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="z" tagdir="/WEB-INF/tags"%>
<!doctype html>
<html>
<head>
    <title>Product List - Demo Shop</title>
    <z:bootstrap/>
</head>
<body>
<div class="container">
    <h2>Product View: ${product.name}</h2>
    <c:url var="urlGroup" value="/products">
        <c:param name="g" value="${product.group.id}"/>
    </c:url>
    <div>Back to <a href="${urlGroup}">product group</a></div><br/>
    <table class="table table-striped">
        <tr>
            <td>Id</td>
            <td><c:out value="${product.id}"/></td>
        </tr>
        <tr>
            <td>Name</td>
            <td><c:out value="${product.name}"/></td>
        </tr>
        <tr>
            <td>Price</td>
            <td><c:out value="${product.price}"/></td>
        </tr>
        <tr>
            <td>Group</td>
            <td><c:out value="${product.group.name}"/></td>
        </tr>
    </table>
</div>
</body>
</html>
