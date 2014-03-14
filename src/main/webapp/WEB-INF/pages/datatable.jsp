<%@ page isELIgnored ="false" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
<body>
    <h2>Data Table</h2>
    <c:forEach items="${data}" var="group">
        <c:out value="${group.id}"/>.
        <c:out value="${group.name}"/><br/>
    </c:forEach>
</body>
</html>
