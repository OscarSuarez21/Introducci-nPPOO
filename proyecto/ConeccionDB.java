/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto;

import com.db4o.Db4o;
import com.db4o.ObjectContainer;



/**
 *
 * @author Oscar
 */
public class ConeccionDB {
    
   
    
      ObjectContainer ConectionDB(String dataBase){
        ObjectContainer db = Db4o.openFile(dataBase);
        
        return db ;
        
    }
      
    
    
}
