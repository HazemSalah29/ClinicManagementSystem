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
    private String MedicineDesc;
    private float price;
    private int MedQuantity;

    @Override
    public void AddMedicine() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void RemoveMedicine() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
