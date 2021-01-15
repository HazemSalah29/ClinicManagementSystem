/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 *
 * @author hazemsalah
 */
public class Patient {
    private int patientId;
    private String patientName;
    private String patientEmail;
    private int patientPhoneNum;
    private int patientSSN;

    public int getPatientId() {
        return patientId;
    }

    public String getPatientName() {
        return patientName;
    }

    public String getPatientEmail() {
        return patientEmail;
    }

    public int getPatientPhoneNum() {
        return patientPhoneNum;
    }

    public int getPatientSSN() {
        return patientSSN;
    }
    

    public void setPatientId(int patientId) {
        this.patientId = patientId;
    }

    public void setPatientName(String patientName) {
        this.patientName = patientName;
    }

    public void setPatientEmail(String patientEmail) {
        this.patientEmail = patientEmail;
    }

    public void setPatientPhoneNum(int patientPhoneNum) {
        this.patientPhoneNum = patientPhoneNum;
    }

    public void setPatientSSN(int patientSSN) {
        this.patientSSN = patientSSN;
    }

    public Patient(int patientId, String patientName, String patientEmail, int patientPhoneNum, int patientSSN) {
        this.patientId = patientId;
        this.patientName = patientName;
        this.patientEmail = patientEmail;
        this.patientPhoneNum = patientPhoneNum;
        this.patientSSN = patientSSN;
    }
    
    
    private void medicalHistory(){
        
    }
    
}
