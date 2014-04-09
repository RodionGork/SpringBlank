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
    <h2>Product List: ${group.name}</h2>
    <c:url var="backUrl" value="/groups"/>
    <div><a href="${backUrl}">back to groups</a></div>
    <table class="table table-striped">
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

    <c:url var="addProductUrl" value="/addprod"/>
    <form method="post" action="${addProductUrl}">
        <label>Id:<input type="text" name="id"/></label><br/>
        <label>Name:<input type="text" name="name"/></label><br/>
        <label>Price:<input type="text" name="price"/></label><br/>
        <input type="hidden" name="groupid" value="${group.id}"/>
        <input type="submit"/>
    </form>
</div>
</body>
</html>
