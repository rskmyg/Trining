<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html >
<html>
<head>
<meta charset="UTF-8">
<title>購入完了</title>
</head>
<body>

<h1>BrainnetBooks - 購入完了</h1>
<html:errors/>
<p align=right>ユーザID：ただのテキスト</p>

<a href="http://localhost:8080/brainnetBooks/">書籍検索</a>
<a href="http://localhost:8080/brainnetBooks/">ショッピングカート</a>
<a href="http://localhost:8080/brainnetBooks/">注文履歴</a>
<a href="http://localhost:8080/brainnetBooks/">ログイン / ログアウト</a>

<hr>

<h3>ご購入の手続きが完了いたしました。</h3>
<h3>【注文番号：${f:h(resultOrderNo)}】</h3>

</body>
</html>