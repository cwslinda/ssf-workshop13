package vttp2022.ssf.ssfworkshop13.models;

public class Contact {
    private String name;
    private String email;
    private int phoneNumber;
    private String id;


    // two classes calling the same method, it will be one at a time.
    // synchronized don't allow for concurrent calls
    private synchronized String generateId(){
       

    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public int getPhoneNumber() {
        return phoneNumber;
    }
    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }



}
