import java.util.List;

public class Object{

   private List<Owner> owners;

    public Object(List<Owner> owners){
        this.owners = owners;
    }

    public String toString(){ // toString Method.
        return  "Owner" + owners;
    };


}

