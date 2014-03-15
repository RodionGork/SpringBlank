<%@ page isELIgnored ="false" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!doctype html>
<html>
<head>
    <title>Product List - Demo Shop</title>
</head>
<body>
    <h2>Product List: ${groupName}</h2>
    <table>
        <tr>
            <th>#</th>
            <th>Name</th>
            <th>Price</th>
        </tr>
    <c:forEach items="${productList}" var="product">
        <tr>
            <td><c:out value="${product.id}"/></td>
            <td><c:out value="${product.name}"/></td>
            <td><c:out value="${product.price}"/></td>
        </tr>
    </c:forEach>
    </table>
</body>
</html>
