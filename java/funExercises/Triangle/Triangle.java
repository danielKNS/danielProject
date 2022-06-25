public class Triangle {
    public static void main(String[] args) {
            int row = 4;
            String s =  "";
            for(int i = 0; i < row ; ++i){
            s =(i % 2 == 0 ? "1" : "0")+ s;
            System.out.println(s);
        }
    }
}
