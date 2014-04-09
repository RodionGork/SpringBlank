<%@ page isELIgnored ="false" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="z" tagdir="/WEB-INF/tags"%>
<!doctype html>
<html>
<head>
    <title>Product Groups - Demo Shop</title>
    <z:bootstrap/>
</head>
<body>
<div class="container">
    <h2>Product Groups</h2>
    <table class="table table-striped table-bordered table-hover">
        <tr>
            <th>#</th>
            <th>Name</th>
        </tr>
    <c:forEach items="${shelfList}" var="shelf">
        <tr>
            <td><c:out value="${shelf.id}"/></td>
            <td>
                <c:url value="/products" var="urlProducts">
                    <c:param name="g" value="${shelf.id}"/>
                </c:url>
                <a href="${urlProducts}"><c:out value="${shelf.name}"/></a>
            </td>
        </tr>
    </c:forEach>
    </table>
</div>
</body>
</html>
