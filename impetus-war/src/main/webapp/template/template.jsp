<%@ taglib prefix="s" uri="/struts-tags" %>
<%@ taglib prefix="tiles" uri="http://tiles.apache.org/tags-tiles" %>
<html>
<head>
    <link rel="stylesheet" type="text/css" href="/js/foundation/css/foundation.min.css"/>
    <script type="text/javascript" src="/js/jquery/jquery-1.10.2.min.js"></script>
    <script type="text/javascript" src="/js/foundation/js/foundation.min.js"></script>
    <tiles:insertAttribute name="script"/>
    <title><tiles:getAsString name="title"/></title>
</head>
<body>
    <tiles:insertAttribute name="body"/>
</body>
</html>
