package uk.co.swlines.cifreader.cif;

import org.apache.commons.configuration.ConfigurationException;
import uk.co.swlines.cifreader.cif.data.*;
import uk.co.swlines.cifreader.exceptions.LogicException;

import java.sql.SQLException;
import java.util.ArrayList;

public interface Database {

    void init() throws SQLException, InstantiationException, IllegalAccessException, ClassNotFoundException, ConfigurationException;

    void createTemporaryTables(boolean truncate) throws SQLException;

    void disableKeys() throws SQLException;

    void enableKeys() throws SQLException;

    void finalise() throws SQLException;

    void deleteTiploc(String tiploc);

    void insertTiploc(CIFTiploc r);

    void deleteAssociationSTPCancellation(CIFAssociation r);

    void deleteAssociation(CIFAssociation r);

    void insertAssociationSTPCancellationsBulk(ArrayList<CIFAssociation> associationInsertCancellations);

    void insertAssociationBulk(ArrayList<CIFAssociation> associationInsert);

    void deleteScheduleSTPCancellation(CIFSchedule r);

    void deleteSchedule(CIFSchedule r);

    void scheduleInsertSTPCancellation(CIFSchedule r);

    void insertScheduleBulk(ArrayList<CIFSchedule> r) throws LogicException;

    void removeOld(String date);
}
