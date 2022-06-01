import java.util.List;

public class Owner {
    private List<Owner> owners; 

    public Owner(List<String> owners){
        this.owners = owners;
     }

    public List<Owner> getOwners(){
        return owners;
    }

    public void setOwners(List<Owner> owners){
        this.owners = owners;
     }
}
