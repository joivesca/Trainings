package mx.com.chilitech.dao;

import org.springframework.orm.ObjectRetrievalFailureException;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import mx.com.chilitech.model.Defect;

import java.util.List;

public class DefectsDAOHibernate extends HibernateDaoSupport implements DefectsDAO {
    
    public List getDefects() {
        return getHibernateTemplate().find("from Defect");
    }
    
    public Defect getDefect(long id) {
        Defect defect = (Defect) getHibernateTemplate().get(Defect.class, new Long(id));
        if (defect == null) {
            throw new ObjectRetrievalFailureException(Defect.class, new Long(id));
        }
        return defect;
    }
    
    public void saveDefect(Defect defect) {
        getHibernateTemplate().saveOrUpdate(defect);
    }
    
    public void removeDefect(long id) {
        getHibernateTemplate().delete(getDefect(id));
    }
    
}
