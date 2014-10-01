<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html >
<html>
<head>
<html:javascript formName="indexActionForm_serch"/>
<meta charset="UTF-8">
<title>書籍検索</title>
</head>
<body>

<h1>BrainnetBooks - 書籍検索</h1>



<p align=right>ユーザID：ただのテキスト</p>

<a href="http://localhost:8080/brainnetBooks/">書籍検索</a>
<a href="http://localhost:8080/brainnetBooks/">ショッピングカート</a>
<a href="http://localhost:8080/brainnetBooks/">注文履歴</a>
<a href="http://localhost:8080/brainnetBooks/">ログイン / ログアウト</a>

<hr>

<h3>■ 検索キーワード</h3>
<s:form>
<html:errors/>
	<table>
		<tr>
			<td>書籍名</td>
			<td><html:text property="book_name" errorStyleClass="err"/></td>
		</tr>
		<tr>
			<td>著者名</td>
			<td><html:text property="author_name" errorStyleClass="err"/></td>
		</tr>
<%-- 		<tr>
			<td>出版社</td>
			<td><html:text property="publisher_name" errorStyleClass="err"/></td>
		</tr>
		<tr>
			<td>カテゴリ</td>
			<td><html:text property="categoryList" errorStyleClass="err"/></td>
		</tr> --%>
	</table>
	<s:submit property="serch" clientValidate="true">検索</s:submit>
	<!-- <input type="submit" name="serch" value="検索"/> -->
</s:form>

<h3>■ 検索結果一覧</h3>

	<table border="1">
		<tr>
			<th>書籍情報</th>
			<th>著者名</th>
			<th>出版社名</th>
			<th>税抜価格<br>
					(税込価格)</th>
			<th>購入希望</th>
		</tr>
		<c:forEach var="bn" items="${xz}">
					 <s:form action="cartInput">
		<tr>
			<%-- <td>${f:h(result_bn)}</td> --%>
			<td>${(bn.book_name)}<br>
					${(bn.isbn)}<br>
					${(bn.release_date)}</td>
			<%-- <td>${f:h(result_an)}</td> --%>
			<td>${(bn.author_name)}</td>
			<td>${(bn.publisher_name)}</td>
			<td align=right>${(bn.price)}円<br>
					 (${(bn.priceIntax)}円)</td>
			<td align=center>
			<input type="hidden" name="isbn" value="${f:h(bn.isbn)} "/>
			<s:submit property="index" value="追加"></s:submit>
			</td>
			</tr>
			</s:form>
		</c:forEach>
	</table>

</body>
</html>