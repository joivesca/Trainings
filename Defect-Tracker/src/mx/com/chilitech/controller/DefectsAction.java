package mx.com.chilitech.controller;


import com.opensymphony.xwork2.ActionSupport;

import mx.com.chilitech.model.Defect;
import mx.com.chilitech.model.DefectsManager;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts2.ServletActionContext;
import org.apache.struts2.interceptor.ServletRequestAware;
import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.context.support.WebApplicationContextUtils;


public class DefectsAction extends ActionSupport implements ServletRequestAware {
    
    private Defect defect;
    private DefectsManager defectsManager;
    private HttpServletRequest request;
    
    public Defect getDefect() {
        return defect;
    }
    
    public void setDefect(Defect defect) {
        this.defect = defect;
    }
    
    public void setDefectsManager(DefectsManager defectsManager) {
        this.defectsManager = defectsManager;
    }
    
    public void setServletRequest(HttpServletRequest httpServletRequest) {
        this.request = httpServletRequest;
    }
    
    public String input() {
    	//WebApplicationContext context =
    	//		WebApplicationContextUtils.getRequiredWebApplicationContext(
        //                                ServletActionContext.getServletContext());
    	System.out.println(request.getParameter("id"));
        if (request.getParameter("id") != null) {
            long id = Long.parseLong(request.getParameter("id"));
            //this.defect = ((DefectsManager)context.getBean("defectsManager")).getDefect(id);
            this.defect = this.defectsManager.getDefect(id);
        }
        return INPUT;
    }
    
    public String delete(){
    	//WebApplicationContext context =
    	//		WebApplicationContextUtils.getRequiredWebApplicationContext(
        //                                ServletActionContext.getServletContext());
    	System.out.println(request.getParameter("id") + "delete");
        long id = Long.parseLong(request.getParameter("id"));
        //((DefectsManager)context.getBean("defectsManager")).removeDefect(id);
        this.defectsManager.removeDefect(id);
        
        return SUCCESS;
    }
    
    
    public String save() {
    	WebApplicationContext context =
    			WebApplicationContextUtils.getRequiredWebApplicationContext(
                                        ServletActionContext.getServletContext());
    	System.out.println("save");
    	//((DefectsManager)context.getBean("defectsManager")).saveDefect(this.defect);
        this.defectsManager.saveDefect(this.defect);
        
        return SUCCESS;
    }
    
}
