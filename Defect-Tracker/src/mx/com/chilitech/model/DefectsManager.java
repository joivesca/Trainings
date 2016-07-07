package mx.com.chilitech.model;

import java.util.List;

/**
 * Exposes business methods for Defect Tracker application.
 */
public interface DefectsManager {
    public List getDefects();
    public Defect getDefect(long defectId);
    public void saveDefect(Defect defect);
    public void removeDefect(long defectId);
}

