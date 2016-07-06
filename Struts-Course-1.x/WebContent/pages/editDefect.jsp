<%@ taglib uri="http://struts.apache.org/tags-bean" prefix="bean" %>
<%@ taglib uri="http://struts.apache.org/tags-html" prefix="html" %>
<%@ taglib uri="http://struts.apache.org/tags-logic" prefix="logic" %>

<html:html>
    <body>
        <div style="background-color:Gainsboro;height:30px;font-weight:bold;">
            <h2><bean:message key="defect.heading"/></h2>
        </div>
        <br/>
        
        <font color="red"><b><html:errors/></b></font>
        
        <html:form action="action">
            <html:hidden property="defect.id" />
            <html:hidden property="method" value="save" />	
            <html:hidden property="defect.submittedOn" />
            <html:hidden property="defect.submittedBy" />            
            <html:hidden property="defect.resolvedOn" />
            <html:hidden property="defect.resolvedBy" />            
            
            <table border="0" width="900px;">
                <tr>
                    <td><bean:message key="defect.description"/></td>
                    <td><html:text property="defect.description"  size="100" maxlength="200" /></td>
                </tr>
                <tr>
                    <td><bean:message key="defect.priority"/></td>
                    <td>
                        <html:select property="defect.priority">
                            <html:option value="1">1</html:option>
                            <html:option value="2">2</html:option>
                            <html:option value="3">3</html:option>
                            <html:option value="4">4</html:option>
                        </html:select>
                    </td>
                </tr>
                <tr>
                    <td>&nbsp;</td>
                </tr>
                <tr>
                    <td><bean:message key="defect.resolution"/></td>
                    <td><html:text property="defect.resolution" size="100" maxlength="200"/></td>
                </tr>
                <tr>
                    <td>&nbsp;</td> 
                </tr>
                <tr>
                    <td>&nbsp;</td>
                </tr>
                <tr>
                    <td>
                        <html:submit><bean:message key="defect.editrecord"/></html:submit>
                    </td>
                    <td>
                        <html:cancel/>
                    </td>
                </tr>
            </table>
        </html:form>
    </body>
</html:html>
