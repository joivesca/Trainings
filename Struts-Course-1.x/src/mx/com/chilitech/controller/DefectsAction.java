package mx.com.chilitech.controller;

import java.util.Date;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.apache.commons.beanutils.ConvertUtils;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.action.ActionMessages;
import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.struts.DispatchActionSupport;

import mx.com.chilitech.form.DefectsActionForm;
import mx.com.chilitech.model.Defect;
import mx.com.chilitech.model.DefectsManager;
import mx.com.chilitech.util.DateConverter;

public class DefectsAction extends DispatchActionSupport {
    
    //Needed in Struts1 to successfully pass date from UI to model:
    static
    {
        ConvertUtils.register(new DateConverter(),Date.class);
    }
    
    public ActionForward edit(
            ActionMapping mapping,
            ActionForm form,
            HttpServletRequest request,
            HttpServletResponse response) {
        DefectsActionForm defectsActionForm = (DefectsActionForm) form;
        
        long id = Long.parseLong(request.getParameter("id"));
        
        //Engage business layer...
        WebApplicationContext ctx = getWebApplicationContext();
        DefectsManager mgr = (DefectsManager) ctx.getBean("defectsManager");
        defectsActionForm.setDefect(mgr.getDefect(id));
        
        return mapping.findForward("edit");
    }
    
    public ActionForward delete(
            ActionMapping mapping,
            ActionForm form,
            HttpServletRequest request,
            HttpServletResponse response) {
        
        long id = Long.parseLong(request.getParameter("id"));
        
        WebApplicationContext ctx = getWebApplicationContext();
        DefectsManager mgr = (DefectsManager) ctx.getBean("defectsManager");
        mgr.removeDefect(id);
        
        return mapping.findForward("list");
    }
    
    public ActionForward add(
            ActionMapping mapping,
            ActionForm form,
            HttpServletRequest request,
            HttpServletResponse response) {
        
        return mapping.findForward("add");
    }
    
    public ActionForward save(
            ActionMapping mapping,
            ActionForm form,
            HttpServletRequest request,
            HttpServletResponse response) {
        DefectsActionForm defectsActionForm = (DefectsActionForm) form;
        
        //Validate form...
        ActionMessages errors = form.validate(mapping, request);
        if (!errors.isEmpty()) {
            saveErrors(request, errors);
            
            if (((DefectsActionForm) form).getDefect().getId() == 0) {
                return mapping.findForward("add");
            } else {
                return mapping.findForward("edit");
            }
        } else {
            Defect defect = (Defect)defectsActionForm.getDefect();
            
            WebApplicationContext ctx = getWebApplicationContext();
            DefectsManager mgr = (DefectsManager) ctx.getBean("defectsManager");
            mgr.saveDefect(defect);
        }
        
        return mapping.findForward("list");
    }
    
    /**Cancel the form*/
    public ActionForward cancelled(
            ActionMapping mapping,
            ActionForm form,
            HttpServletRequest request,
            HttpServletResponse response) {
        
        return mapping.findForward("list");
    }
    
}
