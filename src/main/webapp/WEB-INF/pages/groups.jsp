<%@ page isELIgnored ="false" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!doctype html>
<html>
<head>
    <title>Product Groups - Demo Shop</title>
</head>
<body>
    <h2>Product Groups</h2>
    <table>
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
</body>
</html>
