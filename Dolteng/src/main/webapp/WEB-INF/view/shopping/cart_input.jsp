<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html >
<html>
<head>
<meta charset="UTF-8">
<title>ショッピングカート</title>
</head>
<body>

<h1>BrainnetBooks - ショッピングカート</h1>

<p align=right>ユーザID：ただのテキスト</p>

<a href="http://localhost:8080/brainnetBooks/">書籍検索</a>
<a href="http://localhost:8080/brainnetBooks/">ショッピングカート</a>
<a href="http://localhost:8080/brainnetBooks/">注文履歴</a>
<a href="http://localhost:8080/brainnetBooks/">ログイン / ログアウト</a>

<hr>
<%-- ${cartInfo.books} --%>
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
<html:errors/>
<s:form action="/cartConfirm">
	<table>
		<tr>
			<td>郵便番号：</td>
			<td><html:text property="zipCode" errorStyleClass="err"/></td>
		</tr>
		<tr>
			<td>都道府県：</td>
			<td><html:select property="prefecture">
					<html:option value="" >都道府県を選択</html:option>
					<html:option value="北海道">北海道</html:option>
					<html:option value="青森県">青森県</html:option>
					<html:option value="岩手県">岩手県</html:option>
					<html:option value="宮城県">宮城県</html:option>
					<html:option value="秋田県">秋田県</html:option>
					<html:option value="山形県">山形県</html:option>
					<html:option value="福島県">福島県</html:option>
					<html:option value="茨城県">茨城県</html:option>
					<html:option value="栃木県">栃木県</html:option>
					<html:option value="群馬県">群馬県</html:option>
					<html:option value="埼玉県">埼玉県</html:option>
					<html:option value="千葉県">千葉県</html:option>
					<html:option value="東京都">東京都</html:option>
					<html:option value="神奈川県">神奈川県</html:option>
					<html:option value="新潟県">新潟県</html:option>
					<html:option value="富山県">富山県</html:option>
					<html:option value="石川県">石川県</html:option>
					<html:option value="福井県">福井県</html:option>
					<html:option value="山梨県">山梨県</html:option>
					<html:option value="長野県">長野県</html:option>
					<html:option value="岐阜県">岐阜県</html:option>
					<html:option value="静岡県">静岡県</html:option>
					<html:option value="愛知県">愛知県</html:option>
					<html:option value="三重県">三重県</html:option>
					<html:option value="滋賀県">滋賀県</html:option>
					<html:option value="京都府">京都府</html:option>
					<html:option value="大阪府">大阪府</html:option>
					<html:option value="兵庫県">兵庫県</html:option>
					<html:option value="奈良県">奈良県</html:option>
					<html:option value="和歌山県">和歌山県</html:option>
					<html:option value="鳥取県">鳥取県</html:option>
					<html:option value="島根県">島根県</html:option>
					<html:option value="岡山県">岡山県</html:option>
					<html:option value="広島県">広島県</html:option>
					<html:option value="山口県">山口県</html:option>
					<html:option value="徳島県">徳島県</html:option>
					<html:option value="香川県">香川県</html:option>
					<html:option value="愛媛県">愛媛県</html:option>
					<html:option value="高知県">高知県</html:option>
					<html:option value="福岡県">福岡県</html:option>
					<html:option value="佐賀県">佐賀県</html:option>
					<html:option value="長崎県">長崎県</html:option>
					<html:option value="熊本県">熊本県</html:option>
					<html:option value="大分県">大分県</html:option>
					<html:option value="宮崎県">宮崎県</html:option>
					<html:option value="鹿児島県">鹿児島県</html:option>
					<html:option value="沖縄県">沖縄県</html:option>
					</html:select></td>
		</tr>
		<tr>
			<td>以降の住所：</td>
			<td><html:text property="address" errorStyleClass="err"/></td>
		</tr>
	</table>
	<input type="submit" name="check" value="確認"/>
</s:form>
</body>
</html>