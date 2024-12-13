package CONEXION;

public class Usuarios {
    
    private String name;
    private String lastName;
    private String mail;
    private String user;
    private String password;
    
    public Usuarios(String user_name, String user_lastName, String user_mail, String user_user, String user_password) {
        this.name = user_name;
        this.lastName = user_lastName;
        this.mail = user_mail;
        this.user= user_user;
        this.password = user_password;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    
    public String getName() {
        return this.name;
    }
    
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    
        public String getLatName() {
        return this.lastName;
    }
        
    public void setMail(String mail) {
        this.mail = mail;
    }
    
        public String getMail() {
        return this.mail;
    }
    
        public void setUser(String user) {
        this.user = user;
    }
    
        public String getUser() {
        return this.user;
    } 
        
    public void setPassword(String pass) {
        this.password = pass;
    }
    
        public String getPassword() {
        return this.password;
    }
}
