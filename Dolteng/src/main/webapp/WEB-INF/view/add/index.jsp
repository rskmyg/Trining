<%@page pageEncoding="UTF-8"%>
<html>
<head>
<title>足し算</title>
</head>
<body>
	<html:errors />
		<s:form>
			<html:text property="arg1"/> +
			<html:text property="arg2"/>
			= ${f:h(result)}<br />
			<input type="submit" name="submit" value="サブミット"/>
		</s:form>
</body>
</html>