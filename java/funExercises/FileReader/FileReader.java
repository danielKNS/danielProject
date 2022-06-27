import java.io.File;  // Import the File class
import java.io.FileInputStream;
import java.io.FileNotFoundException;  // Import this class to handle errors
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.Scanner; // Import the Scanner class to read text files

public class FileReader{
  // private static  final String filepath1 ="C:\\danielProject\\java\\funExercises\\FileReader\\MyDataFile.txt";
  public static void main(String[] args) throws Exception{
    // FileReader object = new FileReader();
    // // File filepath2 = new File("MyDataFile.txt");

    // User user = (User) object.ReadObjectFromFile(filepath2.toString());
    // System.out.println(user);
    try {
      User user1 = new User("Mickey","Mouse",35,"Arizona");
      File myObj = new File("MyDataFile.txt");
      Scanner myReader = new Scanner(myObj);
      while (myReader.hasNextLine()) {//while there is an next line (so lets say computer is at line 1 out of 3, it will continue until all 3 lines are read
        String data = myReader.nextLine();// So while there is a next line, Read the line,Save it in data
        System.out.println(data);//Print it, So it will just read the textfile until theres an end (no next line)
        System.out.println("------------");}
    } catch (FileNotFoundException e) {
      System.out.println("An error occurred.");
      e.printStackTrace();
    }
  // try{ 
  //   FileInputStream fis = new FileInputStream("MyDataFile.txt");
  //   ObjectInputStream ois = new ObjectInputStream(fis);
  //   User user = (User) ois.readObject();
  //   ois.close();
  //   fis.close();
  //   System.out.println("User name: " + user.getFirstName());
  // }catch (IOException ex ){
  // ex.printStackTrace();
  // }
  }
  // public Object ReadObjectFromFile(String filepath){
  //   try{
  //     FileInputStream fileIn = new FileInputStream(filepath);
  //     ObjectInputStream objectIn = new ObjectInputStream(fileIn);

  //     Object obj = objectIn.readObject();
  //     objectIn.close();
  //     return obj;
  //   }catch (Exception ex){
  //     ex.printStackTrace();
  //     return null;
  //   }
  // }

}
//FileInputStream class is useful to read data from a file in the form of sequence of bytes. FileInputStream is meant for reading streams of raw bytes such as image data. For reading streams of characters, consider using FileReader.
// To SERIALIZE an object means to convert its state to a byte stream so that the byte stream can be reverted back into a copy of the object
// Basically, the ObjectOutputStream converts Java objects into corresponding streams. This is known as serialization. Those converted streams can be stored in files or transferred through networks.
// The method readObject() is used to read an object from the stream