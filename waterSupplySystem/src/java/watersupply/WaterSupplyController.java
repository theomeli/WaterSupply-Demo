/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package watersupply;

import javax.inject.Named;
import javax.enterprise.context.SessionScoped;
import java.io.Serializable;
import javax.faces.model.DataModel;
import javax.faces.model.ListDataModel;

/**
 *
 * @author Totoros
 */
@Named(value = "waterSupplyController")
@SessionScoped
public class WaterSupplyController implements Serializable {

    /**
     * Creates a new instance of WaterSupplyController
     */
    int startId;
    int endId;
    DataModel municipalityPopulation;
    DataModel wszState;
    DataModel swsSupply;
    DataModel samplingValue;
    WaterSupplyHelper helper;
    private int recordCount = 1000;
    private int pageSize = 10;

    private Municipality currentMunicipality;
    private Wsz currentWsz;
    private Sws currentSws;
    private Sampling currentSampling;
    private int selectedItemIndex;
    
    public WaterSupplyController() {
        helper = new WaterSupplyHelper();
        startId = 1;
        endId = 10;
    } 

    public WaterSupplyController(int startId, int endId) {
        helper = new WaterSupplyHelper();
        this.startId = startId;
        this.endId = endId;
    }

    public Municipality getSelectedMunicipality() {
        if (currentMunicipality == null) {
            currentMunicipality = new Municipality();
            selectedItemIndex = -1;
        }
        return currentMunicipality;
    }
    
    public Wsz getSelectedWsz() {
        if (currentWsz == null) {
            currentWsz = new Wsz();
            selectedItemIndex = -1;
        }
        return currentWsz;
    }
    
    public Sws getSelectedSws() {
        if (currentSws == null) {
            currentSws = new Sws();
            selectedItemIndex = -1;
        }
        return currentSws;
    }
    
    public Sampling getSelectedSampling() {
        if (currentSampling == null) {
            currentSampling = new Sampling();
            selectedItemIndex = -1;
        }
        return currentSampling;
    }

    public DataModel getMunicipalityPopulation() {
        if (municipalityPopulation == null) {
            municipalityPopulation = new ListDataModel(helper.getMunicipalityPopulation(startId, endId));
        }
        return municipalityPopulation;
    }
    
    public DataModel getWszState() {
        if (wszState == null) {
            wszState = new ListDataModel(helper.getWszState(startId, endId));
        }
        return wszState;
    }
    
    public DataModel getSwsSupply() {
        if (swsSupply == null) {
            swsSupply = new ListDataModel(helper.getSwsSupply(startId, endId));
        }
        return swsSupply;
    }
    
    public DataModel getSamplingValue() {
        if (samplingValue == null) {
            samplingValue = new ListDataModel(helper.getSamplingValue(startId, endId));
        }
        return samplingValue;
    }

    void recreateModel() {
        municipalityPopulation = null;
        wszState = null;
        swsSupply = null;
        samplingValue = null;
    }
    
    public boolean isHasNextPage() {
        if (endId + pageSize <= recordCount) {
            return true;
        }
        return false;
    }

    public boolean isHasPreviousPage() {
        if (startId-pageSize > 0) {
            return true;
        }
        return false;
    }

    public String next() {
        startId = endId+1;
        endId = endId + pageSize;
        recreateModel();
        return "index";
    }

    public String previous() {
        startId = startId - pageSize;
        endId = endId - pageSize;
        recreateModel();
        return "index";
    }

    public int getPageSize() {
        return pageSize;
    }

    public String prepareViewMunicipality(){
        currentMunicipality = (Municipality) getMunicipalityPopulation().getRowData();
        return "browse";
    }
    
    public String prepareViewWsz(){
        currentWsz = (Wsz) getWszState().getRowData();
        return "browse";
    }
    
    public String prepareViewSws(){
        currentSws = (Sws) getSwsSupply().getRowData();
        return "browse";
    }
    
    public String prepareViewSampling(){
        currentSampling = (Sampling) getSamplingValue().getRowData();
        return "browse";
    }
    
    public String prepareList(){
        recreateModel();
        return "index";
    }
} 