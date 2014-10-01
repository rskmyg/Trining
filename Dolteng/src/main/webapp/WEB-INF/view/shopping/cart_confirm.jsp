<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html >
<html>
<head>
<meta charset="UTF-8">
<title>ショッピングカート(購入確認)</title>
</head>
<body>

<h1>BrainnetBooks - ショッピングカート(購入確認)</h1>
<html:errors/>
<p align=right>ユーザID：ただのテキスト</p>

<a href="http://localhost:8080/brainnetBooks/">書籍検索</a>
<a href="http://localhost:8080/brainnetBooks/">ショッピングカート</a>
<a href="http://localhost:8080/brainnetBooks/">注文履歴</a>
<a href="http://localhost:8080/brainnetBooks/">ログイン / ログアウト</a>

<hr>

<h3>■ 商品一覧</h3>
	<table border="1">
		<tr>
			<th>書籍情報</th>
			<th>著者名</th>
			<th>出版社名</th>
			<th>税抜価格<br>
					(税込価格)</th>
			<th>購入数</th>
			<th>小計</th>
		</tr>
			<c:forEach var="bn" items="${cartInfo.books}">
		<tr>
			<td>${(bn.book_name)}<br>
			${(bn.isbn)}<br>
			${(bn.release_date)}</td>
			<td>${(bn.author_name)}</td>
			<td>${(bn.publisher_name)}</td>
			<td align=right>${(bn.price)}円<br>
					 (${(bn.priceIntax)}円)</td>
			<td></td>
			<td align=right>${(bn.price)}円</td>
		</tr>
			</c:forEach>
		<tr>
			<td colspan="5" align=right>税抜合計</td>
			<td align=right>${cartInfo.totalPrice}円</td>
		</tr>
		<tr>
			<td colspan="5" align=right>送料</td>
			<td align=right>${cartInfo.postage}円</td>
		</tr>
		<tr>
			<td colspan="5" align=right>消費税</td>
			<td align=right>${cartInfo.taxTotal}円</td>
		</tr>
		<tr>
			<td colspan="5" align=right>支払合計</td>
			<td align=right>${cartInfo.allTotal}円</td>
		</tr>
	</table>

<h3>■ 配送先住所</h3>

<s:form action="/cartComplete">
	<table>
		<tr>
			<td>郵便番号：</td>
			<td>${f:h(resultZc)}</td>
		</tr>
		<tr>
			<td>都道府県：</td>
			<td>${f:h(resultPref)}</td>
		</tr>
		<tr>
			<td>以降の住所：</td>
			<td>${f:h(resultAdd)}</td>
		</tr>
	</table>
	<input type="hidden" name="zipCode" value="${f:h(resultZc)} "/>
	<input type="hidden" name="prefecture" value="${f:h(resultPref)} "/>
	<input type="hidden" name="address" value="${f:h(resultAdd)} "/>
	<input type="submit" name="index" value="購入"/>
</s:form>
</body>
</html>