/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ClinicController;

import Model.Medicine;
import com.mongodb.MongoClient;
import com.mongodb.MongoClientURI;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import static com.mongodb.client.model.Filters.eq;
import org.bson.Document;

/**
 *
 * @author hazemsalah
 */
public class MedicineController {
    MongoClient mongoClient = new MongoClient(new MongoClientURI("mongodb+srv://Hazem123:Hazem123@cluster0.6ny3n.mongodb.net/clinic?retryWrites=true&w=majority"));
    MongoDatabase database = mongoClient.getDatabase("clinic");
    MongoCollection Medicinedb = database.getCollection("Medicine");
  
    public String addMedicine(Medicine medicine){
        Document Doc1 = new Document("MedicineName",medicine.getMedicineName()).append("MedicineType",medicine.getMedicineType()).append("Quantity",medicine.getMedQuantity()).append("Describtion",medicine.getMedicineDesc());
        Medicinedb.insertOne(Doc1);
        return "sucess";
    }
    
    public String updateMedicine(Medicine medicine){
    
      Document oldMedicine =   (Document) Medicinedb.find(eq("id",medicine.getId())).first();
      
      oldMedicine.append("MedicineName",medicine.getMedicineName());
      oldMedicine.append("MedicineType",medicine.getMedicineType());
      oldMedicine.append("Quantity",medicine.getMedQuantity());
      oldMedicine.append("Describtion",medicine.getMedicineDesc());
       Medicinedb.insertOne(oldMedicine);
       return "sucess";
    }
   
    
    public String DeleteAssistant(Medicine medicine){
    
       Medicinedb.deleteOne(eq("id",medicine.getId()));
       return "sucess";
    }
    
    
}
