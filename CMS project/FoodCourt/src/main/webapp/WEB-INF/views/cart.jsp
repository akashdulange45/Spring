<%@ page contentType="text/html;charset=UTF-8"%>
<%@ page import="in.ad.model.Cart,in.ad.model.Item"%>
<!DOCTYPE html>
<html>
<head>
<title>Cart</title>
</head>
<body>
	<h2>Your Cart</h2>
	<ul>
		<%
		Cart cart = (Cart) request.getAttribute("cart");
		if (cart != null) {
			for (Item item : cart.getItems()) {
		%>
		<li><%=item.getName()%> - <%=item.getPrice()%></li>
		<%
		}
		%>
	</ul>
	<p>
		Total: ₹<%=cart.getTotal()%></p>
	<%
	} else {
	%>
	<p>Your cart is empty.</p>
	<%
	}
	%>
	<a href="menu">Back to Menu</a> |
	<a href="checkout">Checkout</a>
</body>
</html>
