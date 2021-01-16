/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clinicmanagementsysten;
import ClinicController.UserController;
import Model.User;
import com.mongodb.MongoClient;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import org.bson.Document;

/**
 *
 * @author hazemsalah
 */
public class ClinicManagementSysten {
    
    

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        User user = new User();
        user.setName("hazem");
        user.setEmail("hazem");
        user.setPassword("hazem123");
        UserController test = new UserController();
        test.addDoctor(user);
    }
    
    
}
