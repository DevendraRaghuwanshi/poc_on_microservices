<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
    "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Validate RAML file</title>
<link href="webjars/bootstrap/3.3.6/css/bootstrap.min.css"
	rel="stylesheet">

</head>

<body>
	<div class="container">
		<h2>Select raml file need to validate</h2>
		<form class="form-inline" action="/upload" method="post" enctype="multipart/form-data">
			<div class="form-group">
			<label class="sr-only" for="file">File:</label>
			<input class="form-control" type="file" name="file" /> 
			<button type="submit" class="btn btn-default">Submit</button>
			</div>
		</form>
	</div>
</body>
<script src="webjars/jquery/1.9.1/jquery.min.js"></script>
<script src="webjars/bootstrap/3.3.6/js/bootstrap.min.js"></script>
</html>