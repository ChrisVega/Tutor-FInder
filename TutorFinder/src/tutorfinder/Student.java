package tutorfinder;

/**
 *
 * @author ntorr054
 */
public class Student extends User{
    
    private String course;
    
    public Student(String displayName) {
        super(displayName);
    }
    
    @Override
    public boolean isTutor() {
        return false;
    }
}
