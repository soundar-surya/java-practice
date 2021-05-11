import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.Serializable;

public class EX2 {

    private static int total = 3; 
    public static void main(String[] args) throws Exception {
        
        String[] movies = {"Interstellar", "Dark knight", "Man of steel"};
        int[] ratings ={9, 8, 7};
        String[] musicians = {"Hans Zimmer", "Hans Zimmer", "Hans Zimmer"}; 
        
        MyFavFilm[] listOfFavMovies = new MyFavFilm[total];
        for(int i = 0; i < total; i++) {
            listOfFavMovies[i] = new MyFavFilm(movies[i], ratings[i], musicians[i]);
        }
        
        writeFileSync(listOfFavMovies);
        readFileSync();
    } 
    
    public static void writeFileSync(MyFavFilm[]  movies) throws Exception {
        try(FileOutputStream fos = new FileOutputStream("/home/surya/Documents/Oak/src/Streams/Serialization/Ex2.txt")){
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            DataOutputStream dos = new DataOutputStream(fos);
            
            int len = movies.length;
            dos.writeInt(len);

            for (MyFavFilm myFavFilm : movies) {
                oos.writeObject(myFavFilm);
            }
        }
    }

    public static void readFileSync() throws Exception {
        try(FileInputStream fis = new FileInputStream("/home/surya/Documents/Oak/src/Streams/Serialization/Ex2.txt")){
            ObjectInputStream ois = new ObjectInputStream(fis);
            DataInputStream dis = new DataInputStream(fis);
            
            int len = dis.readInt();
            for (int i = 0; i < len; i++) {
                System.out.println((MyFavFilm)ois.readObject());
            }
        }
    }
}




class MyFavFilm implements Serializable {
    static int count = 1;
    int movieId;
    String movieName;
    int movieRating;
    String musician;

    // http://burnignorance.com/java-web-development-tips/java-serialization-and-need-for-a-no-arg-constructor/ - reason why we should use no-arg constructor here
    MyFavFilm() {}

    MyFavFilm(String name, int rating, String music) {
        this.movieName = name;
        this.movieRating = rating;
        this.musician = music;
        this.movieId = count;

        count++;
    }

    @Override
    public String toString() {
        return movieId+"     | "+movieName+ "     | "+movieRating+"     | "+musician;
    }
}