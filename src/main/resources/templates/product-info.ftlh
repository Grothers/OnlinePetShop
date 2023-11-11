<!DOCTYPE html>
<html>
<head>
    <title>Online Shop</title>
</head>
<body>
<h1>OnlineShop</h1>
<hr>

<h4>Детальна інформація про товар</h4>
<b>Назва товару:</b>${product.title}<br>
<b>Опис товару:</b>${product.description}<br>
<b>Ціна товару:</b>${product.price}<br>
<b>Місто:</b>${product.city}<br>
<b>Автор оголошення:</b>${product.author}<br>
<hr>
<form action="/product/delete/${product.id}" method="post">
    <input type="submit" value="Видалити товар"/>

</form>
</body>
</html>