/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ClinicController;

import Model.UserType;
import Model.User;
import com.mongodb.MongoClient;
import com.mongodb.MongoClientURI;
import com.mongodb.client.MongoDatabase;
import org.bson.Document;
import com.mongodb.client.MongoCollection;
import static com.mongodb.client.model.Filters.eq;

/**
 *
 * @author hazemsalah
 */
public class UserController {



    MongoClient mongoClient = new MongoClient(new MongoClientURI("mongodb+srv://Hazem123:Hazem123@cluster0.6ny3n.mongodb.net/clinic?retryWrites=true&w=majority"));
    MongoDatabase database = mongoClient.getDatabase("clinic");
    MongoCollection userDb = database.getCollection("User");
  
    public String addDoctor(User user){
        database.createCollection("User");
        MongoCollection User = database.getCollection("User");
        Document Doc1 = new Document("DoctorName",user.getName()).append("UserType",UserType.DOCTOR.name()).append("Age",user.getAge()).append("email",user.getEmail()).append("password",user.getPassword());
        User.insertOne(Doc1);
        return "sucess";
    }
    public String addPatient(User user){
        MongoCollection User = database.getCollection("User");
        Document Doc2 = new Document("Patient",user.getName()).append("UserType",UserType.PATIENT.name()).append("Age",user.getAge()).append("email",user.getEmail()).append("password",user.getPassword());
        User.insertOne(Doc2);
        return "sucess";
    }
    public String addAssistant(User user){
      
        Document Doc2 = new Document("Assistant",user.getName()).append("UserType",UserType.ASSISTANT.name()).append("Age",user.getAge()).append("email",user.getEmail()).append("password",user.getPassword());
        userDb.insertOne(Doc2);
        return "sucess";
    }
    
    public String updateAssistant(User user){
    
      Document oldUser =  (Document) userDb.find(eq("id",user.getId())).first();
      
      oldUser.append("name",user.getName());
      oldUser.append("email",user.getEmail());
      oldUser.append("password",user.getPassword());
       userDb.insertOne(oldUser);
       return "sucess";
    }
    public String updateDoctor(User user){
    
      Document oldUser = (Document) userDb.find(eq("id",user.getId())).first();
      
      oldUser.append("name",user.getName());
      oldUser.append("email",user.getEmail());
      oldUser.append("password",user.getPassword());
       userDb.insertOne(oldUser);
       return "sucess";
    }
    public String updatePatient(User user){
    
      Document oldUser =  (Document) userDb.find(eq("id",user.getId())).first();
      
      oldUser.append("name",user.getName());
      oldUser.append("email",user.getEmail());
      oldUser.append("password",user.getPassword());
       userDb.insertOne(oldUser);
       return "sucess";
    }
    
    public String DeleteAssistant(User user){
    
       userDb.deleteOne(eq("id",user.getId()));
       return "sucess";
    }
    public String DeleteDoctor(User user){
    
       userDb.deleteOne(eq("id",user.getId()));
       return "sucess";
    }
    public String DeletePatient(User user){
    
       userDb.deleteOne(eq("id",user.getId()));
       return "sucess";
    }
    
    
}
