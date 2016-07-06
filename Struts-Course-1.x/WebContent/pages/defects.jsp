<%@ taglib uri="http://struts.apache.org/tags-bean" prefix="bean" %>
<%@ taglib uri="http://struts.apache.org/tags-html" prefix="html" %>
<%@ taglib uri="http://struts.apache.org/tags-logic" prefix="logic" %>

<html:html>
    <body>
        <div style="background-color:Gainsboro;height:30px;font-weight:bold;">
            <h2><bean:message key="defect.heading"/></h2>
        </div>
        <br/>
        
        <table border="0" width="90%">
            <tbody>
                <tr>
                    <td  align="right" colspan="10">
                        <html:link action="action.do?method=add">
                            <img src="images/add.gif" border="0"/>
                        </html:link>
                    </td>
                </tr>
                <tr style="background-color:Gainsboro;font-weight:bold;">
                    <td>&nbsp;</td>
                    <td>&nbsp;</td>
                    <td><bean:message key="defect.description"/></td>
                    <td><bean:message key="defect.priority"/></td>
                    <td><bean:message key="defect.submittedby"/></td>
                    <td><bean:message key="defect.submittedon"/></td>
                    <td><bean:message key="defect.isresolved"/></td>
                    <td><bean:message key="defect.resolution"/></td>
                    <td><bean:message key="defect.resolvedby"/></td>
                    <td><bean:message key="defect.resolvedon"/></td>
                </tr>
                <logic:iterate name="listForm" id="defect" property="defects">
                    <tr>
                        <td><html:link action="action.do?method=edit" paramName="defect"
                            paramProperty="id" paramId="id"><img src="images/edit.gif" border="0"/></html:link></td>
                        <td><html:link action="action.do?method=delete" paramName="defect"
                            paramProperty="id" paramId="id"><img src="images/delete.gif" border="0"/></html:link></td>
                        <td><bean:write name="defect" property="shortDescription" /></td>
                        <td><bean:write name="defect" property="priority" /></td>
                        <td><bean:write name="defect" property="submittedBy" /></td>
                        <td><bean:write name="defect" property="submittedOn" format="MM/dd/yyyy hh:mm"/></td>
                        <td><html:checkbox name="defect" property="isResolved" disabled="true"/></td>
                        <td><bean:write name="defect" property="shortResolution"  /></td>
                        <td><bean:write name="defect" property="resolvedBy" /></td>
                        <td><bean:write name="defect" property="resolvedOn" format="MM/dd/yyyy hh:mm" /></td>                            
                    </tr>
                </logic:iterate>
            </tbody>
        </table>
        
        
    </body>
</html:html>
