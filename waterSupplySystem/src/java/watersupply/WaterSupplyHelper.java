/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package watersupply;

import java.util.List;
import org.hibernate.Query;
import org.hibernate.Session;

/**
 *
 * @author Totoros
 */
public class WaterSupplyHelper {
    Session session = null;

    public WaterSupplyHelper() {
        this.session = HibernateUtil.getSessionFactory().getCurrentSession();
    }
    
    public List getMunicipalityPopulation(int startID, int endID) {
        List<Municipality> municipalityList = null;
        try {
            org.hibernate.Transaction tx = session.beginTransaction();
            Query q = session.createQuery ("select population from municipality where municipality.MunicipalityID between '" + startID + "' and '" + endID + "'");
            municipalityList = (List<Municipality>) q.list();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return municipalityList;
    }
    
    public List getWszState(int startID, int endID) {
        List<Wsz> wszList = null;
        try {
            org.hibernate.Transaction tx = session.beginTransaction();
            Query q = session.createQuery ("select state from WSZ as wsz where wsz.WSZid between '" + startID + "' and '" + endID + "'");
            wszList = (List<Wsz>) q.list();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return wszList;
    }
    
    public List getSwsSupply(int startID, int endID) {
        List<Wsz> swsList = null;
        try {
            org.hibernate.Transaction tx = session.beginTransaction();
            Query q = session.createQuery ("select supply from sws where sws.WSZid between '" + startID + "' and '" + endID + "'");
            swsList = (List<Wsz>) q.list();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return swsList;
    }
    
    public List getSamplingValue(int startID, int endID) {
        List<Wsz> samplingList = null;
        try {
            org.hibernate.Transaction tx = session.beginTransaction();
            Query q = session.createQuery ("select value from sampling where sampling.samplingID between '" + startID + "' and '" + endID + "'");
            samplingList = (List<Wsz>) q.list();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return samplingList;
    }
    
    public Municipality getMunicipalityByID(int municipalityID){
        List<Municipality> municipalityList = null;
        try {
            org.hibernate.Transaction tx = session.beginTransaction();
            Query q = session.createQuery("from municipality where municipality.municipalityID ='" + municipalityID + "'");
            municipalityList = (List<Municipality>) q.list();

        } catch (Exception e) {
            e.printStackTrace();
        }   

        return municipalityList.get(0);
    }
    
    public Wsz getWszByID(int WSZid){
        List<Wsz> wszList = null;
        try {
            org.hibernate.Transaction tx = session.beginTransaction();
            Query q = session.createQuery("from wsz where wsz.WSZid ='" + WSZid + "'");
            wszList = (List<Wsz>) q.list();

        } catch (Exception e) {
            e.printStackTrace();
        }   

        return wszList.get(0);
    }
    
    public Sws getSwsByID(int SWSid){
        List<Sws> swsList = null;
        try {
            org.hibernate.Transaction tx = session.beginTransaction();
            Query q = session.createQuery("from sws where sws.SWSid ='" + SWSid + "'");
            swsList = (List<Sws>) q.list();

        } catch (Exception e) {
            e.printStackTrace();
        }   

        return swsList.get(0);
    }
    
    public Sampling getSamplingByID(int samplingID){
        List<Sampling> samplingList = null;
        try {
            org.hibernate.Transaction tx = session.beginTransaction();
            Query q = session.createQuery("from sampling where sampling.samplingID ='" + samplingID + "'");
            samplingList = (List<Sampling>) q.list();

        } catch (Exception e) {
            e.printStackTrace();
        }   

        return samplingList.get(0);
    }
}
