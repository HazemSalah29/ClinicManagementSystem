/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ClinicController;

import Model.Reservation;
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
public class ReservationController {
    MongoClient mongoClient = new MongoClient(new MongoClientURI("mongodb+srv://Hazem123:Hazem123@cluster0.6ny3n.mongodb.net/clinic?retryWrites=true&w=majority"));
    MongoDatabase database = mongoClient.getDatabase("clinic");
    MongoCollection Reservedb = database.getCollection("User");
    
     public String addReservation(Reservation reservation){
     database.createCollection("User");
        MongoCollection User = database.getCollection("User");
        Document Doc1 = new Document("Doctor",reservation.getDoctor()).append("Patient",reservation.getPatient()).append("CreatedBy",reservation.getCreatedBy()).append("MedicalInfo",reservation.getMedicalInfo());
        User.insertOne(Doc1);
        return "sucess";
    }
     public String updateAssistant(Reservation reservation){
    
      Document oldReservation = (Document) Reservedb.find(eq("id",reservation.getId()));
      
      oldReservation.append("Doctor",reservation.getDoctor());
      oldReservation.append("Patient",reservation.getPatient());
      oldReservation.append("CreatedBy",reservation.getCreatedBy());
      oldReservation.append("MedicalInfo",reservation.getMedicalInfo());
       Reservedb.insertOne(oldReservation);
       return "sucess";
    }
     public String DeleteReservation(Reservation reservation){
    
       Reservedb.deleteOne(eq("id",reservation.getId()));
       return "sucess";
    }
}
