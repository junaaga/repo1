<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Title</title>
</head>
<body>
<h1>All Items</h1>
<table>
    <thead>
    <tr>
        <th>Name</th>
        <th>Price</th>
        <th>Description</th>
        <th>Quantity </th>
    </tr>
    </thead>
    <tbody>
    <c:forEach items="${items}" var="items">
        <tr>
            <td><a href="/details/${items.id}"> <c:out value="${items.name}"/> </a></td>
            <td><c:out value="${items.description}"/></td>
            <td><c:out value="${items.rating}"/></td>
            <td><c:out value="${items.category}"/></td>
        </tr>
    </c:forEach>
    </tbody>
</table>
<a href="/create">New Item </a>


</body>
</html>