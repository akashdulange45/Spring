<%@ page contentType="text/html;charset=UTF-8" %>
<!DOCTYPE html>
<html>
<head><title>Checkout</title></head>
<body>
<h2>Order Confirmed!</h2>
<p>Your total bill was <%= request.getAttribute("total") %>. 
Thank you for ordering from Food Court!</p>

<%
    in.ad.model.Cart cart = (in.ad.model.Cart) request.getAttribute("cart");
    if (cart != null) {
        for (in.ad.model.Item item : cart.getItems()) {
%>
    <p><%= item.getName() %> - <%= item.getPrice() %></p>
<%
        }
    }
%>

<a href="menu">Order Again</a>
</body>
</html>
