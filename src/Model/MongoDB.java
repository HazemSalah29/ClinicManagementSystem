/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import com.mongodb.MongoClient;
import com.mongodb.MongoClientURI;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import org.bson.Document;

/**
 *
 * @author hazemsalah
 */
public class MongoDB {
    public void DBConnection(){
    MongoClient mongoClient = new MongoClient(new MongoClientURI("mongodb://localhost:27017/clinic"));
    MongoDatabase Clinic = mongoClient.getDatabase("clinic");
    Clinic.createCollection("Doctor");
    Clinic.createCollection("Patient");
    Clinic.createCollection("User");
    Clinic.createCollection("drugMedicine");
    Clinic.createCollection("nonDrugMedicine");
    Clinic.createCollection("assistant");
    MongoCollection Doctor = Clinic.getCollection("Doctor");
    MongoCollection Patient = Clinic.getCollection("Patient");
    MongoCollection User = Clinic.getCollection("User");
    MongoCollection drugMedicine = Clinic.getCollection("drugMedicine");
    MongoCollection nonDrugMedicine = Clinic.getCollection("nonDrugMedicine");
    MongoCollection assistant = Clinic.getCollection("assistant");
    
    Document Doc1 = new Document("DoctorName","Ahmed").append("DoctorId","123").append("DoctorSpeciality","Children");
    Document Doc2 = new Document("DoctorName","Emad").append("DoctorId","1234").append("DoctorSpeciality","Bones");
    Document Doc3 = new Document("DoctorName","Amr").append("DoctorId","12345").append("DoctorSpeciality","Eyes");
    Document Doc4 = new Document("assistingDoctor","Ahmed").append("assistantName","Noha").append("assistantId","1123");
    Document Doc5 = new Document("assistingDoctor","Emad").append("assistantName","Samira").append("assistantId","11234");
    Document Doc6 = new Document("assistingDoctor","Amr").append("assistantName","Seham").append("assistantId","112345");
    Document Doc7 = new Document("patientId","1223").append("patientName","Ziad").append("patientEmail","Ziad@gmail.com").append("patientPhoneNum","01234554439").append("patientSSN","");
    Document Doc8 = new Document("patientId","12234").append("patientName","Mohamed").append("patientEmail","Mohamed@gmail.com").append("patientPhoneNum","01234554439").append("patientSSN","");
    Document Doc9 = new Document("patientId","122345").append("patientName","Zeina").append("patientEmail","Zeina@gmail.com").append("patientPhoneNum","01234554439").append("patientSSN","");
    Document Doc10 = new Document("UserName","Ahmed").append("UserId","123").append("UserType","Doctor").append("UserPass","Ahmed123").append("email","Ahmed@gmail.com");
    Document Doc11 = new Document("UserName","Emad").append("UserId","1234").append("UserType","Doctor").append("UserPass","Emad123").append("email","Emad@gmail.com");
    Document Doc12 = new Document("UserName","Noha").append("UserId","1123").append("UserType","Assistant").append("UserPass","Noha123").append("email","Noha@gmail.com");
    Document Doc13 = new Document("MedicineId","987").append("MedicineType","drug").append("MedicineName","Doxycycline").append("MedicineDesc","Doxycycline ia a tetracycline antibiotic that fights bacteria in the body").append("price","17.5").append("MedQuantity","30");
    Document Doc14 = new Document("MedicineId","9877").append("MedicineType","drug").append("MedicineName","Entyvio").append("MedicineDesc","Entyvio reduces the effects of substance in the body that can cause inflammation").append("price","20.5").append("MedQuantity","30");
    Document Doc15 = new Document("MedicineId","98778").append("MedicineType","drug").append("MedicineName","Lexapro").append("MedicineDesc","Lexapro is an antidepressent belonging to a group of drugs calles selective serotonin reuptake inhibitors").append("price","50.0").append("MedQuantity","30");
    Document Doc16 = new Document("MedicineId","897").append("MedicineType","non-Drug").append("MedicineName","Flexeril").append("MedicineDesc","a medication used for muscle spasms from condition of sudden onset").append("price","200.0").append("MedQuantity","30");
    Document Doc17 = new Document("MedicineId","8967").append("MedicineType","non-Drug").append("MedicineName","Allzital").append("MedicineDesc","used to treat tension headaches").append("price","20.0").append("MedQuantity","30");
    Document Doc18 = new Document("MedicineId","8876").append("MedicineType","non-Drug").append("MedicineName","Avidoxy").append("MedicineDesc","used to treat bacteria infections").append("price","45.5").append("MedQuantity","30");
    
    
    Doctor.insertOne(Doc1);
    Doctor.insertOne(Doc2);
    Doctor.insertOne(Doc3);
    assistant.insertOne(Doc4);
    assistant.insertOne(Doc5);
    assistant.insertOne(Doc6);
    Patient.insertOne(Doc7);
    Patient.insertOne(Doc8);
    Patient.insertOne(Doc9);
    User.insertOne(Doc10);
    User.insertOne(Doc11);
    User.insertOne(Doc12);
    drugMedicine.insertOne(Doc13);
    drugMedicine.insertOne(Doc14);
    drugMedicine.insertOne(Doc15);
    nonDrugMedicine.insertOne(Doc16);
    nonDrugMedicine.insertOne(Doc17);
    nonDrugMedicine.insertOne(Doc18);
    }
    
}
