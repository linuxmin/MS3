package at.ac.unive.hartmann.MS3.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="advertisements")
public class Advertisement {
    @Id
    @Column(name="aditemid", nullable = false)
    private String adItemId;
    @Column(name="aditemname")
    private String adItemName;
    @Column(name="aditemprice")
    private Double adItemPrice;



    public String GetAdItemid() {
        return adItemId;
    }

    public void setAdItemId(String adItemId) {
        this.adItemId = adItemId;
    }

    public String getAdItemname() {
        return adItemName;
    }

    public void setAdItemName(String adItemName) {
        this.adItemName = adItemName;
    }

    public Double getAdItemPrice() {
        return adItemPrice;
    }

    public void setAdItemPrice(Double adItemPrice) {
        this.adItemPrice = adItemPrice;
    }
}
