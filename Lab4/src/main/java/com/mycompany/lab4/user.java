
package com.mycompany.lab4;


public abstract class user {
    protected String Id;
    public user(String Id) {
        this.Id = Id;
         
    }

     public String getSearchKey() {
      return this.Id;
    }
     
    
    public abstract String lineRepresesntation();
    
}
