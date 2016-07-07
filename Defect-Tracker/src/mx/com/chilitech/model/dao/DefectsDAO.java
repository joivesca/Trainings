package mx.com.chilitech.model.dao;
import java.util.List;

import mx.com.chilitech.model.Defect;

/**
 * Exposes Data Access Object (DAO) methods for retreiving and manipulating defects. */

public interface DefectsDAO {
    public List getDefects();
    public Defect getDefect(long defectId);
    public void saveDefect(Defect defect);
    public void removeDefect(long defectId);
}