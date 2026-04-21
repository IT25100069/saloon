<!DOCTYPE html>
<html>
<head>
    <title>Edit Service</title>
</head>
<body>

<h2>Edit Service</h2>

<form action="<%= request.getContextPath() %>/updateService" method="post">

    <input type="hidden" name="serviceId"
           value="<%= request.getParameter("serviceId") %>">

    Service Name:
    <input type="text" name="serviceName"
           value="<%= request.getParameter("serviceName") %>" required>
    <br><br>

    Category:
    <input type="text" name="category"
           value="<%= request.getParameter("category") %>" required>
    <br><br>

    Price:
    <input type="number" step="0.01" name="price"
           value="<%= request.getParameter("price") != null ? request.getParameter("price") : "0" %>" required>
    <br><br>

    Duration:
    <input type="text" name="duration"
           value="<%= request.getParameter("duration") %>" required>
    <br><br>

    Description:
    <input type="text" name="description"
           value="<%= request.getParameter("description") %>" required>
    <br><br>

    <input type="submit" value="Update Service">
</form>

<br>
<a href="<%= request.getContextPath() %>/viewServices">Back to Services</a>

</body>
</html>