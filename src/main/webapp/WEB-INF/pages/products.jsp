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

    <hr style="width:60%"/>
    <div class="text-center"><input type="button" class="btn" value="Add Product Here"
                                    data-toggle="modal" data-target="#productCreationDialog"/></div>

    <div class="modal fade" id="productCreationDialog" tabindex="-1" role="dialog" aria-hidden="true">
        <div class="modal-dialog">
            <c:url var="urlAddProduct" value="/addproduct"/>
            <form class="modal-content" method="post" action="${urlAddProduct}">
                <div class="modal-header">
                    <h3>Add Product</h3>
                </div>
                <div class="modal-body">
                    <div class="row">
                        <span class="col-md-4">Name:</span>
                        <input class="col-md-6" type="text" name="name"/>
                    </div>
                    <div class="row">&nbsp;</div>
                    <div class="row">
                        <span class="col-md-4">Price:</span>
                        <input class="col-md-6" type="text" name="price"/>
                    </div>
                    <input type="hidden" name="group" value="${group.id}"/>
                </div>
                <div class="modal-footer">
                    <input type="submit" class="btn" value="Save"/>
                    <input type="button" class="btn" value="Cancel" data-dismiss="modal"/>
                </div>
            </form>
        </div>
    </div>
</div>
</body>
</html>
