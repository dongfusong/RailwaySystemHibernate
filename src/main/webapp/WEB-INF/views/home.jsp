<!DOCTYPE html>
<html>
<head>
    <title>RailwaySystem</title>
    <%--<script src="https://ajax.googleapis.com/ajax/libs/jquery/1.10.2/jquery.min.js"></script>--%>
    <%--<script type="text/javascript">--%>
        <%--$("#submit").click()--%>
        <%--{--%>
            <%--$.get("addEdge/${#srcName}/${#dstname}/${#distance}",--%>
            <%--{},--%>
            <%--function(data) {--%>
                <%--$.("#resutlInfo").htmlText(data);--%>
            <%--})--%>
        <%--};--%>

    <%--</script>--%>
</head>
<body>
        welcom to railwaysystem homepage!

  <form action="addEdge" >
    起始点<input type= "text" name = "srcName" id = "srcName">
    终点<input type= "text" name = "dstName" id = "dstName">
    长度<input type= "text" name = "distance" id = "distance">
    <input id = "submit" type="button" value="submit">
  </form>
    <p>
        <span id = "resultInfo">

        </span>
    </p>
</body>
</html>
