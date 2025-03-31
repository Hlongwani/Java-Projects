
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

@ManagedBean(name="sekontiri")
@SessionScoped
public class answer {

    public answer() {
    }
    
    private String value;
    
    
    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        System.out.println("value has changed to "+value);
        this.value = value;
    }
    
    public String Araba(){
        return "suivantePage";
    }
    
    private int getail;

    public int getGetail() {
        return getail;
    }

    public void setGetail(int getail) {
        System.out.println("value has changed to "+getail);
        this.getail = getail;
    }
    
    public String jmpSame(){
        return "index";
    }
    
}
