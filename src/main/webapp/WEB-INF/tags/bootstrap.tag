<%@ tag description="Includes for Twitter Bootstrap" pageEncoding="UTF-8" isELIgnored ="false"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<c:url value="/res/bootstrap.min.css" var="urlBootstrapCss"/>
<c:url value="/res/bootstrap.min.css" var="urlBootstrapTheme"/>
<c:url value="/res/bootstrap.min.js" var="urlBootstrapJs"/>
<c:url value="/res/jquery.min.js" var="urlJquery"/>
<link rel="stylesheet" href="${urlBootstrapCss}"/>
<link rel="stylesheet" href="${urlBootstrapTheme}"/>
<script src="${urlJquery}"></script>
<script src="${urlBootstrapJs}"></script>
