<%@ page contentType="text/html;charset=UTF-8"%>
<%@ page import="java.util.List,in.ad.model.Item"%>
<!DOCTYPE html>
<html>
<head>
<title>Food Court Menu</title>
</head>
<body>
	<h2>Food Court Menu</h2>
	<ul>
		<%
		List<Item> menu = (List<Item>) request.getAttribute("menu");
		if (menu != null && !menu.isEmpty()) {
			for (Item item : menu) {
		%>
		<li><%=item.getName()%> - <%=item.getPrice()%> <a
			href="addToCart?id=<%=item.getId()%>">Add to Cart</a></li>
		<%
		}
		} else {
		%>
		<li>No items available in the menu.</li>
		<%
		}
		%>
	</ul>
	<br />
	<a href="cart">View Cart</a>
</body>
</html>
