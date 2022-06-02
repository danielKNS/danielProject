import java.util.List;

public class Room {
    
    private String owners1;
    private Integer beds;
    private Integer desks;
    private Integer posters;
    private String walls;
    private String floors;
    private List<String> list; 
    private List<Owners> owners;

    public Room(String owners1,Integer beds,Integer desks,Integer posters,String walls,
    String floors){
        this.owners1 = owners1;
        this.beds = beds;
        this.desks = desks;
        this.posters = posters;
        this.walls = walls;
        this.floors = floors;

    }

    // -------------Rooms---------------//
    public String getOwner(){
        return owners1;
    }

    public void setOwner(String owners1){
        this.owners1 = owners1;
    }

    // -------------Beds---------------//
    public Integer getBeds(){
        return beds;
    }

    public void setBeds(Integer beds){
        this.beds = beds;
    }

    // -------------Desks---------------//
    public Integer getDesks(){
        return desks;
    }

    public void setDesks(Integer desks){
        this.desks = desks;
    }

    // -------------Posters---------------//
    public Integer getPosters(){
        return posters;
    }

    public void setPosters(Integer posters){
        this.posters = posters;
    } 

    // -------------Walls---------------//
    public String getWalls(){
        return walls;
    }

    public void setWalls(String walls){
        this.walls = walls;
    } 

    // -------------Floors---------------//
    public String getFloors(){
        return floors;
    }

    public void setFloors(String floors){
        this.floors = floors;
    } 

     // -------------List of Owners---------------//

     public Room(List<String> list){
        this.list = list;
     }

     public List<String> getOwnersList(){
        return list;
     }

     public void setOwnersList(List<String> list){
        this.list = list;
     }
}
