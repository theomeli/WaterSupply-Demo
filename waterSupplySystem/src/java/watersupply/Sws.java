package watersupply;
// Generated Mar 23, 2017 10:27:58 PM by Hibernate Tools 4.3.1



/**
 * Sws generated by hbm2java
 */
public class Sws  implements java.io.Serializable {


     private Integer swsid;
     private int fkWszid;
     private double supply;
     private double coordinateX;
     private double coordinateY;

    public Sws() {
    }

    public Sws(int fkWszid, double supply, double coordinateX, double coordinateY) {
       this.fkWszid = fkWszid;
       this.supply = supply;
       this.coordinateX = coordinateX;
       this.coordinateY = coordinateY;
    }
   
    public Integer getSwsid() {
        return this.swsid;
    }
    
    public void setSwsid(Integer swsid) {
        this.swsid = swsid;
    }
    public int getFkWszid() {
        return this.fkWszid;
    }
    
    public void setFkWszid(int fkWszid) {
        this.fkWszid = fkWszid;
    }
    public double getSupply() {
        return this.supply;
    }
    
    public void setSupply(double supply) {
        this.supply = supply;
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


