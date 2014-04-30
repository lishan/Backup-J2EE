<%@ taglib prefix="s" uri="/struts-tags" %>
<%@ taglib prefix="tiles" uri="http://tiles.apache.org/tags-tiles" %>
<html>
<head>
    <link rel="stylesheet" type="text/css" href="/impetus/js/bower_components/uikit/dist/css/uikit.min.css"/>
    <script type="text/javascript" src="/impetus/js/bower_components/jquery/jquery.min.js"></script>
    <script type="text/javascript" src="/impetus/js/bower_components/uikit/dist/js/uikit.min.js"></script>
    <tiles:insertAttribute name="script"/>
    <title><tiles:getAsString name="title"/></title>
</head>
<body>
    <tiles:insertAttribute name="nav"/>
    <tiles:insertAttribute name="body"/>
    <tiles:insertAttribute name="footer"/>
</body>
</html>
