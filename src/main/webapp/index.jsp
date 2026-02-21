<html>
<body>
<%@ include file="menu.jsp"%>
<h2>Hello World!</h2>
<form action="<%= application.getContextPath()%>/thirdServlet" method="post">
    <input type="text" name="message" placeholder="Enter your Message">
    <button type="submit">Submit</button>
</form>
</body>
</html>
