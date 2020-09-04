package uk.co.swlines.cifreader.cif;

import org.apache.commons.configuration.ConfigurationException;
import uk.co.swlines.cifreader.cif.data.CIFAssociation;
import uk.co.swlines.cifreader.cif.data.CIFSchedule;
import uk.co.swlines.cifreader.cif.data.CIFTiploc;
import uk.co.swlines.cifreader.exceptions.LogicException;

import java.sql.SQLException;
import java.util.ArrayList;

public class SystemOutDatabase implements Database {

    public void init() throws SQLException, InstantiationException, IllegalAccessException, ClassNotFoundException, ConfigurationException {

    }

    public void createTemporaryTables(boolean truncate) throws SQLException {

    }

    public void disableKeys() throws SQLException {

    }

    public void enableKeys() throws SQLException {

    }

    public void finalise() throws SQLException {

    }

    public void deleteTiploc(String tiploc) {
        System.out.println("## deleteTiploc");
        System.out.println(tiploc);
    }

    public void insertTiploc(CIFTiploc r) {
        System.out.println("## insertTiploc");
        System.out.println(r);
    }

    public void deleteAssociationSTPCancellation(CIFAssociation r) {
        System.out.println("## deleteAssociationSTPCancellation");
        System.out.println(r);
    }

    public void deleteAssociation(CIFAssociation r) {
        System.out.println("## deleteAssociation");
        System.out.println(r);
    }

    public void insertAssociationSTPCancellationsBulk(ArrayList<CIFAssociation> associationInsertCancellations) {
        System.out.println("## insertAssociationSTPCancellationsBulk");
        System.out.println(associationInsertCancellations);
    }

    public void insertAssociationBulk(ArrayList<CIFAssociation> associationInsert) {
        System.out.println("## insertAssociationBulk");
        System.out.println(associationInsert);
    }

    public void deleteScheduleSTPCancellation(CIFSchedule r) {
        System.out.println("## deleteScheduleSTPCancellation");
        System.out.println(r);
    }

    public void deleteSchedule(CIFSchedule r) {
        System.out.println("## deleteSchedule");
        System.out.println(r);
    }

    public void scheduleInsertSTPCancellation(CIFSchedule r) {
        System.out.println("## scheduleInsertSTPCancellation");
        System.out.println(r);
    }

    public void insertScheduleBulk(ArrayList<CIFSchedule> r) throws LogicException {
        System.out.println("## insertScheduleBulk");
        System.out.println(r);
    }

    public void removeOld(String date) {

    }
}
