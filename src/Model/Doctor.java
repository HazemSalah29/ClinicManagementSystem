/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;
import Repository.doctor;

/**
 *
 * @author hazemsalah
 */
public class Doctor implements doctor {
    private String DoctorName;
    private int DoctorId;
    private String DoctorSpeciality;

    public void setDoctorName(String DoctorName) {
        this.DoctorName = DoctorName;
    }

    public void setDoctorId(int DoctorId) {
        this.DoctorId = DoctorId;
    }

    public void setDoctorSpeciality(String DoctorSpeciality) {
        this.DoctorSpeciality = DoctorSpeciality;
    }

    public String getDoctorName() {
        return DoctorName;
    }

    public int getDoctorId() {
        return DoctorId;
    }

    public String getDoctorSpeciality() {
        return DoctorSpeciality;
    }

    public Doctor(String DoctorName, int DoctorId, String DoctorSpeciality) {
        this.DoctorName = DoctorName;
        this.DoctorId = DoctorId;
        this.DoctorSpeciality = DoctorSpeciality;
    }
    
    
    
    public void addAssistant(){
        
    }
    
    public void RemoveAssistant(){
        
    }
    
    public void fillAvailability(){
        
    }
    public void ViewSchedule(){
        
    }

    @Override
    public void addReceptionist() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void RemoveReceptionist() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void RecordMedications() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void fillMedicalInfo() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void printMedicalHistory() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
