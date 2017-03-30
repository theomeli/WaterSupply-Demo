package watersupply;
// Generated Mar 23, 2017 10:27:58 PM by Hibernate Tools 4.3.1



/**
 * Wsz generated by hbm2java
 */
public class Wsz  implements java.io.Serializable {


    //it may need an extra private member called servedPopulation in the java class and a column in the database table wsz
    //withouout this we define the "state" according to municipalityPopulation
    private Integer wszid;
    private int fkMunicipalityId;
    private String description;
    private String state;
    private double coordinateX;
    private double coordinateY;

    public Wsz() {
    }

    public Wsz(int fkMunicipalityId, String description, double coordinateX, double coordinateY) {
       this.fkMunicipalityId = fkMunicipalityId;
       this.description = description;
       this.state = (new WaterSupplyHelper().getMunicipalityByID(fkMunicipalityId).getPopulation() > 5000 ? "normal" : "small");
       this.coordinateX = coordinateX;
       this.coordinateY = coordinateY;
    }
   
    public Integer getWszid() {
        return this.wszid;
    }
    
    public void setWszid(Integer wszid) {
        this.wszid = wszid;
    }
    public int getFkMunicipalityId() {
        return this.fkMunicipalityId;
    }
    
    public void setFkMunicipalityId(int fkMunicipalityId) {
        this.fkMunicipalityId = fkMunicipalityId;
    }
    public String getDescription() {
        return this.description;
    }
    
    public void setDescription(String description) {
        this.description = description;
    }
    public String getState() {
        return this.state;
    }
    
    public void setState(String state) {
        this.state = state;
    }
    public double getCoordinateX() {
        return this.coordinateX;
    }
    
    public void setCoordinateX(double coordinateX) {
        this.coordinateX = coordinateX;
    }
    public double getCoordinateY() {
        return this.coordinateY;
    }
    
    public void setCoordinateY(double coordinateY) {
        this.coordinateY = coordinateY;
    }




}


