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
    <h2>Product List: ${groupName}</h2>
    <c:url var="urlGroups" value="/groups"/>
    <div>Back to <a href="${urlGroups}">group list</a></div><br/>
    <table class="table table-striped">
        <tr>
            <th>#</th>
            <th>Name</th>
            <th>Price</th>
        </tr>
    <c:forEach items="${productList}" var="product">
        <tr>
            <c:url var="urlProduct" value="/viewproduct">
                <c:param name="p" value="${product.id}"/>
            </c:url>
            <td><c:out value="${product.id}"/></td>
            <td><a href="${urlProduct}"><c:out value="${product.name}"/></a></td>
            <td><c:out value="${product.price}"/></td>
        </tr>
    </c:forEach>
    </table>
</div>
</body>
</html>
