package mx.com.chilitech.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;
import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.struts.ActionSupport;

import mx.com.chilitech.form.DefectsListForm;
import mx.com.chilitech.model.DefectsManager;

public class DefectsList  extends ActionSupport {
    
    public ActionForward execute(
            ActionMapping mapping,
            ActionForm form,
            HttpServletRequest request,
            HttpServletResponse response) {
        DefectsListForm defectsListForm = (DefectsListForm) form;
        
        //Engage business layer...
        WebApplicationContext ctx = getWebApplicationContext();
        DefectsManager mgr = (DefectsManager) ctx.getBean("defectsManager");
        defectsListForm.setDefects(mgr.getDefects());
        
        return mapping.findForward("list");
    }
}
