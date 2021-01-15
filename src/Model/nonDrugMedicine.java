/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;
import Repository.Medicines;
/**
 *
 * @author hazemsalah
 */
public class nonDrugMedicine implements Medicines {
    private int MedicineId;
    private String MedicineType;
    private String MedicineDesc;
    private String MedicineName;
    private float price;
    private int MedQuantity;

    public void setMedicineType(String MedicineType) {
        this.MedicineType = MedicineType;
    }
    

    public void setMedicineName(String MedicineName) {
        this.MedicineName = MedicineName;
    }

    public void setMedicineId(int MedicineId) {
        this.MedicineId = MedicineId;
    }

    public void setMedicineDesc(String MedicineDesc) {
        this.MedicineDesc = MedicineDesc;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public void setMedQuantity(int MedQuantity) {
        this.MedQuantity = MedQuantity;
    }

    public int getMedicineId() {
        return MedicineId;
    }

    public String getMedicineName() {
        return MedicineName;
    }

    public String getMedicineDesc() {
        return MedicineDesc;
    }

    public float getPrice() {
        return price;
    }

    public int getMedQuantity() {
        return MedQuantity;
    }

    public String getMedicineType() {
        return MedicineType;
    }

    public nonDrugMedicine(int MedicineId, String MedicineType, String MedicineDesc, String MedicineName, float price, int MedQuantity) {
        this.MedicineId = MedicineId;
        this.MedicineType = MedicineType;
        this.MedicineDesc = MedicineDesc;
        this.MedicineName = MedicineName;
        this.price = price;
        this.MedQuantity = MedQuantity;
    }
    



    

    @Override
    public void AddMedicine() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void RemoveMedicine() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
