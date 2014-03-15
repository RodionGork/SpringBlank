<%@ page isELIgnored ="false" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!doctype html>
<html>
<head>
    <title>Spring Demo Shop</title>
</head>
<body>
    <h2>Spring Demo Shop</h2>
    <c:url value="/groups" var="urlGroups"/>
    <p><a href="${urlGroups}">Go to product groups page</a></p>
</body>
</html>
