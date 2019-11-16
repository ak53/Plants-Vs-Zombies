package sample;

import java.util.HashMap;

public class User {
    public static HashMap<String, User> Users = new HashMap<String, User>();
    String Name;

    public static User getInstance(String s){
        if(!Users.containsKey(s)){
            Users.put(s, new User(s));
        }
        return Users.get(s);
    }
    private User(String n){
        Name = n;
    }
    public String getName(){
        return Name;
    }
}
