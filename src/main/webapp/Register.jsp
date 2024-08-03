<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Register</title>
<%@include file="boostrap.jsp"%>
</head>
<style>
</style>
<body>
	<section>
		<div class="container">
			<div class="row">
				<div class="col-md-8">
					<div class="card">
						<div class="card-content">
							<form action="login" method="post">
								<input type="text" placeholder="Enter Employee id"
									class="form-control" name="Emp_id"> <input type="text"
									placeholder="Enter Employee name" class="form-control"
									name="Emp_name"> <input type="text"
									placeholder="Employee salary" class="form-control"
									name="Emp_salary"> <input type="text"
									placeholder="Enter Employee age" class="form-control"
									name="Emp_age"> <input type="text"
									placeholder="Enter Mobile number" class="form-control"
									name="Emp_phno"> <input type="password"
									placeholder="Enter Employee email" class="form-control"
									name="Emp_email">
								<button class="btn btn-outline-primary">register</button>
							</form>
						</div>
					</div>
				</div>
			</div>
		</div>
	</section>
</body>
</html>