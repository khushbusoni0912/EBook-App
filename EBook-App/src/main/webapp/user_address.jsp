<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Edit Address</title>
<%@include file="All_Component/AllCss.jsp"%>
</head>
<body style="background-color: #f8bbd0;">
	<%@include file="All_Component/navbar.jsp"%>

	<div class="container">
		<div class="row p-5">
			<div class="col-md-6 offset-md-3">
				<div class="card">
					<div class="card-body">
						<h5 class="text-center text-dark p-1">Add Address</h5>

						<form action="">
							<div class="form-row">

								<div class="form-group col-md-6">
									<label for="inputPassword4">Address</label> <input type="text"
										class="form-control" id="inputPassword4">
								</div>

								<div class="form-group col-md-6">
									<label for="inputPassword4">Landmark</label> <input type="text"
										class="form-control" id="inputPassword4">
								</div>
							</div>

							<div class="form-row">

								<div class="form-group col-md-4">
									<label for="inputPassword4">City</label> <input type="text"
										class="form-control" id="inputPassword4">
								</div>

								<div class="form-group col-md-4">
									<label for="inputPassword4">State</label> <input type="text"
										class="form-control" id="inputPassword4">
								</div>

								<div class="form-group col-md-4">
									<label for="inputPassword4">Pin Code</label> <input type="text"
										class="form-control" id="inputPassword4">
								</div>

							</div>

                          <div class="text-center">
                          <button class="btn btn-warning text-white">Add</button>
                          </div>
						</form>
					</div>
				</div>
			</div>
		</div>
	</div>

</body>
</html>