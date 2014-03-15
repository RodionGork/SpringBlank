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
    <table class="table table-striped">
        <tr>
            <th>#</th>
            <th>Name</th>
        </tr>
    <c:forEach items="${groupList}" var="group">
        <tr>
            <td><c:out value="${group.id}"/></td>
            <td>
                <c:url value="/products" var="urlProducts">
                    <c:param name="g" value="${group.id}"/>
                </c:url>
                <a href="${urlProducts}"><c:out value="${group.name}"/></a>
            </td>
        </tr>
    </c:forEach>
    </table>
</div>
</body>
</html>
