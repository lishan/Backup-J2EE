<%@ taglib prefix="s" uri="/struts-tags" %>
<%@ taglib prefix="tiles" uri="http://tiles.apache.org/tags-tiles" %>
<tiles:insertTemplate template="/template/template.jsp">
    <tiles:putAttribute name="script" type="string">
        <script type="text/javascript">
            $(function(){
                var id = "<s:property value="name"/>";
                alert(id);
            });
        </script>
    </tiles:putAttribute>
    <tiles:putAttribute name="title" value="Markdown Home"/>
    <tiles:putAttribute name="body" type="string">
        <div>
            <h1>
                <s:property value="name"/>
            </h1>
        </div>
    </tiles:putAttribute>
</tiles:insertTemplate>