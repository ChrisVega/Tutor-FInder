package tutorfinder;

public class Tutor extends User {

    public Tutor(String displayName) {
        super(displayName);
    }

    @Override
    public boolean isTutor() {
        return true;
    }
    
}
