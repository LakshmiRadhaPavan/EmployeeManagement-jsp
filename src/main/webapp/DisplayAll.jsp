<html>
<form action="displayall" method="get">
    <div class="container mt-5">
        <h2 class="text-center">Student List</h2>
        <table class="table table-bordered">
            <thead>
                <tr>
                    <th>Id</th>
                    <th>Name</th>
                    <th>Salary</th>
                    <th>Age</th>
                    <th>Phone number</th>
                    <th>Email</th>
                </tr>
            </thead>
            <tbody>
                <c:forEach var="emp" items="${Employees}">
                    <tr>
                        <td>${emp.id}</td>
                        <td>${emp.name}</td>
                        <td>${emp.salary}</td>
                        <td>${emp.age}</td>
                        <td>${emp.phno}</td>
                        <td>${emp.email}</td>
                    </tr>
                </c:forEach>
            </tbody>
        </table>
    </div>
    <script src="https://code.jquery.com/jquery-3.5.1.slim.min.js"></script>
    <script src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.5.3/dist/umd/popper.min.js"></script>
    <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js"></script>
</form>
<html>