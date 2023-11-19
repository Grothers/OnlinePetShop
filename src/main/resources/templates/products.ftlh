<!DOCTYPE html>
<html>
<head>
    <title>Online Shop</title>
</head>
<body>
<h1>OnlineShop</h1>
<hr>

<h4> Товари зі всіх регіонів України </h4>

<form action="/" method="get">
    Пошук по назві: <input type="text" name="title">
    <br>
    <input type="submit" value="Пошук">
</form>

<#list products as product>
    <div>
        <p> <b> ${product.title}
            </b>${product.price} грн.
            | <a href = "/product/${product.id}"> Докладніше...</a>
        </p>
    </div>
    <#else>
    <h3>Товарів немає</h3>
</#list>
<hr>
<h3>Створити новий товар</h3>
<form action="/product/create" method="post">
    Назва оголошення: <input type="text" name = "title"/> <br><br>
    Опис оголошення: <input type="text" name = "description"/> <br><br>
    Ціна: <input type="number" name = "price"/> <br><br>
    Місто: <input type="text" name = "city"/> <br><br>
    Автор оголошення: <input type="text" name = "author"/> <br><br>
    <input type="submit" value="Додати товар"/>

</form>
</body>
</html>