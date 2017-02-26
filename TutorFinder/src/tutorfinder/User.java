package tutorfinder;

/**
 *
 * @author ntorr054
 */
public abstract class User {
    
    private String displayName;
    private String location;
    
    public User(String displayName) {
        this.displayName = displayName;
    }
    
    public String getName () {
        return displayName;
    }
 
    public String getLocation() {
        return location;
    }
    
    public abstract boolean isTutor(); 
}
