<%@taglib prefix="s" uri="/struts-tags" %>
<html>
    <body>
        <div style="background-color:Gainsboro;height:30px;font-weight:bold;">
            <h2><s:label key="defect.heading"/></h2>
        </div>
        <br/>
        
        <table border="0" width="90%">
            <tbody>
                <tr>
                    <td  align="right" colspan="10">
                        <s:url id="addLink" action="action_input" />
                        <s:a href="%{addLink}">
                            <img src="images/add.gif" border="0"/>
                        </s:a>
                    </td>
                </tr>
                
                <%-- Recommend a style sheet is used --%>
                <tr style="background-color:Gainsboro;font-weight:bold;">
                    <td>&nbsp;</td>
                    <td>&nbsp;</td>
                    <td><s:label key="defect.shortDescription" value="%{getText('defect.description')}" theme="simple" /></td>
                    <td><s:label key="defect.priority" value="%{getText('defect.priority')}" theme="simple" /></td>
                    <td><s:label key="defect.submittedby" value="%{getText('defect.submittedby')}" theme="simple" /></td>
                    <td><s:label key="defect.submittedon" value="%{getText('defect.submittedon')}" theme="simple" /></td>
                    <td><s:label key="defect.isresolved" value="%{getText('defect.isresolved')}" theme="simple" /></td>
                    <td><s:label key="defect.shortResolution" value="%{getText('defect.resolution')}" theme="simple" /></td>
                    <td><s:label key="defect.resolvedby" value="%{getText('defect.resolvedby')}" theme="simple" /></td>
                    <td><s:label key="defect.resolvedon" value="%{getText('defect.resolvedon')}" theme="simple" /></td>
                </tr>
                <s:iterator value="defects">
                    <tr>
                        <td>
                            <s:url id="editLink" action="action_input">
                                <s:param name="id" value="%{id}" />
                            </s:url>
                            <s:a href="%{editLink}" >
                                <img src="images/edit.gif" border="0"/>
                            </s:a>
                        </td>
                        <td>
                            <s:url id="deleteLink" action="action_delete">
                                <s:param name="id" value="%{id}" />
                            </s:url>
                            <s:a href="%{deleteLink}" >
                                <img src="images/delete.gif" border="0"/>
                            </s:a>
                        </td>
                        <td><s:property value="shortDescription" /></td>
                        <td><s:property value="priority" /></td>
                        <td><s:property value="submittedBy" /></td>
                        <td><s:date name="submittedOn" format="yyyy-MM-dd hh:mm" /></td>  
                        <td><s:checkbox name="chkResolved" value="isResolved" disabled="true" theme="simple"/></td>
                        <td><s:property value="shortResolution"  /></td>
                        <td><s:property value="resolvedBy" /></td>
                        <td><s:date name="resolvedOn" format="yyyy-MM-dd hh:mm" /></td>                            
                    </tr>
                </s:iterator>
            </tbody>
        </table>        
        
        
    </body>
</html> 

