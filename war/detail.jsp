<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page import="javax.jdo.PersistenceManager" %>
<%@ page import="com.appenspot.cocokoko.data.SpotData" %>
<%@ page import="com.appenspot.cocokoko.data.CategoryData" %>
<%@ page import="com.appenspot.cocokoko.data.CommentData" %>
<%@ page import="com.appenspot.cocokoko.data.PMF" %>
<%@ page import="com.google.appengine.api.users.User" %>
<%@ page import="com.google.appengine.api.users.UserService" %>
<%@ page import="com.google.appengine.api.users.UserServiceFactory" %>
<%@ page import="java.util.List" %>

<!-- ヘッダー -->
<%@ include file="header.jsp" %>

<html>
  <head>
    <link rel="shortcut icon" href="../image/favicon.ico" >
    <link type="text/css" rel="stylesheet" href="/stylesheets/main.css" />
    <!-- スポットデータ取得 -->
    <%
      PersistenceManager pm = PMF.get().getPersistenceManager();
      Integer spotID = Integer.valueOf(request.getParameter("spotID"));
      SpotData spotdata = pm.getObjectById(SpotData.class,spotID);
      
    %>
    <title>CoCo! KoKo! - <%=spotdata.getSpotNm()%>の詳細情報 </title>
    
    <script src="http://maps.google.com/maps?file=api&amp;v=2&amp;sensor=true&amp;key=ABQIAAAA75pvos1A5mkhEVzv7aLzHRSh4Aqf95VtBgycL3FDgSU7LDmu1xQuU0vY8vugTCXF59KsPQsESFe_Mw" type="text/javascript"></script>
    <script type="text/javascript">

    function initialize() {
      if (GBrowserIsCompatible()) {
        var map = new GMap2(document.getElementById("map_canvas"));
        
        // クリック時、中心座標を表示（現在表示部コメントアウト）
        GEvent.addListener(map, "click", function() {
        	var center = map.getCenter();
  			document.getElementById("message").innerHTML = center.toString();
        });
        
        // MAP生成 //
        map.setCenter(new GLatLng(<%=spotdata.getLAT()%>, <%=spotdata.getLNG()%>), 8);
        
        // 地図/航空写真/地図＋写真　切り替えボタン：表示
		map.addControl(new GMapTypeControl());
		// ズームバー：表示
		map.addControl(new GLargeMapControl());
		// ホイールスクロールで拡大・縮小：可
		map.enableScrollWheelZoom();
		// スポット表示
		var point = new GLatLng(<%=spotdata.getLAT()%>, <%=spotdata.getLNG()%>);
		map.addOverlay(new GMarker(point));
      }
    }
    </script>
  </head>
  
  <body onload="initialize()" onunload="GUnload()">
	<div id="index_contents">
    	<!-- サイドバー -->
	    <div id="index_sideBar">
	    	<h1>カテゴリ</h1>
	    	<a href="" alt="">トイレ</a><br />
	    	<a href="" alt="">喫煙所</a><br />
	    	<a href="" alt="">授乳室</a><br />
	    	<a href="" alt="">多目的トイレ</a><br />
	    	<h1>地域</h1>
	    	<a href="" alt="">広島市中区</a><br />
	    	<a href="" alt="">広島市西区　東部</a><br />
	    	<a href="" alt="">広島市西区　西部</a><br />
	    	<a href="" alt="">広島市南区</a><br />
	    	<a href="" alt="">広島市　その他</a><br />    	
	    </div>
	    <!-- マップ -->
	    <div id="index_map">
	    	<div id="map_canvas" style="width: 400px; height: 300px"></div>
	    	<!-- <div id="message"></div>  -->
	    </div>
	</div>
	<!-- フッター -->
    <div id="index_footer">
    	<hr>
    	こぴーらいと　おーるらいつ　りざーぶど
    </div>
  </body>
</html>