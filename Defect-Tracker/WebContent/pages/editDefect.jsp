<%@taglib prefix="s" uri="/struts-tags" %>
<html>
    <head><title></title></head>
    <body>
        
        <div style="background-color:Gainsboro;height:30px;font-weight:bold;">
            <h2><s:label key="defect.heading"/></h2>
        </div>
        
        <br/>
        <font color="red"><b><s:fielderror/></b></font>
        <br/>
        <s:form action="action_save" method="post"  >
            <s:hidden name="defect.id" value="%{defect.id}" />
            <s:textfield label="%{getText('defect.description')}" name="defect.description" value="%{defect.description}"  size="100" maxlength="200" required="true" />
            <s:select label="%{getText('defect.priority')}" name="defect.priority" value="%{defect.priority}" list="#{'1':'1','2':'2','3':'3','4':'4'}" />
            <br/>
            <s:if test="defect.id > 0">
                <s:textfield label="%{getText('defect.resolution')}" name="defect.resolution" value="%{defect.resolution}"  size="100" maxlength="200" />
            </s:if>
            <br/>
            <s:submit value="%{getText('defect.editrecord')} " />
            <s:submit value="%{getText('defect.cancel')}" action="list" />
        </s:form>        
        
    </body>
</html>


