package mx.com.chilitech.form;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionMapping;

public class DefectsListForm  extends ActionForm {
    
    private List defects;
    
    public List getDefects() {
        return defects;
    }
    
    public void setDefects(List defects) {
        this.defects = defects;
    }
    
    public void reset(ActionMapping arg0, HttpServletRequest arg1) {
        defects = new ArrayList();
    }
}
