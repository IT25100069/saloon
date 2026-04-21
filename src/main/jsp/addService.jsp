<!DOCTYPE html>
<html>
<head>
    <title>Add Service</title>
</head>
<body>
    <h2>Add Service</h2>

    <form action="../addService" method="post">
        Service Name: <input type="text" name="serviceName" required><br><br>
        Category: <input type="text" name="category" required><br><br>
        Price: <input type="number" step="0.01" name="price" required><br><br>
        Duration: <input type="text" name="duration" required><br><br>
        Description: <input type="text" name="description" required><br><br>

        <input type="submit" value="Add Service">
    </form>

    <br>
    <a href="../index.jsp">Back to Home</a>
</body>
</html>