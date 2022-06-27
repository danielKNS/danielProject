public class Triangle {
    public static void main(String[] args) {
        triangle();
    }
    private static void triangle(){
        Integer row = 4;
        String emptyString =  "";
        for(Integer i = 0; i < row ; ++i){
        emptyString =(i % 2 == 0 ? "0" : "1")+ emptyString;
        System.out.println(emptyString);
        }
    }
}
