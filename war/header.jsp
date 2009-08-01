<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<!-- ログイン -->
<%@ include file="tmp_login.jsp" %>
<html>
	<head>
	    <meta http-equiv="content-type" content="text/html; charset=UTF-8">
	    <link type="text/css" rel="stylesheet" href="/stylesheets/header.css" />
	</head>
	<body>
		<!-- ヘッダ -->
		<div id="tmp_header">
			<!-- 綺麗に出ないので苦肉の策でテーブル使用 -->
			<Table border="0" summary="ヘッダ">
			<tr>
				<th>
					<img src="image/CoCoKoKo.bmp" alt="Title" width="200" height="100" border="1">
				</th>
				<td valign="bottom">
					<form action="/search" method="post">
			    		<select name="category">
			    			<option value="1">トイレ</option>
			    			<option value="2">喫煙所</option>
			    			<option value="3">授乳室</option>
			    			<option value="4">多目的トイレ</option>
			    		</select>
			    		<input type="text" size="30" name="address" />
			    		<input type="submit" value="これ何処？" />
		    		</form>
				</td>
			</tr>
			</Table>
		</div>
    	<hr>
    	<!-- ぱんくず -->
    	<div id="linkList">
    		<!-- ここは変数にした方が良いかも -->
    		TOP > トイレ
    	</div>
	</body>
</html>
