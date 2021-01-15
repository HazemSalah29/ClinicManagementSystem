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
public class Assistant {
    private String assistingDoctor;
    private String assistantName;
    private int assistantId;

    public void setAssistingDoctor(String assistingDoctor) {
        this.assistingDoctor = assistingDoctor;
    }

    public void setAssistantName(String assistantName) {
        this.assistantName = assistantName;
    }

    public void setAssistantId(int assistantId) {
        this.assistantId = assistantId;
    }

    public String getAssistingDoctor() {
        return assistingDoctor;
    }

    public String getAssistantName() {
        return assistantName;
    }

    public int getAssistantId() {
        return assistantId;
    }

    public Assistant(String assistingDoctor, String assistantName, int assistantId) {
        this.assistingDoctor = assistingDoctor;
        this.assistantName = assistantName;
        this.assistantId = assistantId;
    }
    
    public void AddReceptionist(){
    
    }
    
    public void RemoveReceptionist(){
        
    }
    
    public void RecordMedications(){
        
    }
    
    public void FillPatientMedicalInfo(){
        
    }
    
    public void printMedicalHistory(){
        
    }
    
    
}
