<%@ page import="java.util.List" %>
<%@ page import="com.salon.model.Service" %>
<!DOCTYPE html>
<html>
<head>
    <title>View Services</title>
</head>
<body>

<h2>All Services</h2>

<table border="1" cellpadding="10">
    <tr>
        <th>ID</th>
        <th>Service Name</th>
        <th>Category</th>
        <th>Price</th>
        <th>Duration</th>
        <th>Description</th>
        <th>Actions</th>
    </tr>

    <%
        List<Service> services = (List<Service>) request.getAttribute("services");
        if (services != null) {
            for (Service service : services) {
    %>
    <tr>
        <td><%= service.getServiceId() %></td>
        <td><%= service.getServiceName() %></td>
        <td><%= service.getCategory() %></td>
        <td><%= service.getPrice() %></td>
        <td><%= service.getDuration() %></td>
        <td><%= service.getDescription() %></td>
        <td>
            <a href="jsp/editService.jsp?serviceId=<%= service.getServiceId() %>&serviceName=<%= service.getServiceName() %>&category=<%= service.getCategory() %>&price=<%= service.getPrice() %>&duration=<%= service.getDuration() %>&description=<%= service.getDescription() %>">
                Edit
            </a>
            |
            <a href="deleteService?id=<%= service.getServiceId() %>">Delete</a>
        </td>
    </tr>
    <%
            }
        }
    %>
</table>

<br><br>
<a href="jsp/addService.jsp">Add New Service</a>
<br><br>
<a href="index.jsp">Back to Home</a>

</body>
</html>