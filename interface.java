interface camera{
    void Photo();
 }
interface music{
    void playMusic();
}
class mobile implements camera,music {
    public void Photo(){
        System.out.println("Photo Taken");
    }
    public void playMusic(){
        System.out.println("music Playing");
    }
}
public class Main{
    public static void main (String []args) {
        mobile m = new mobile();
        m.Photo();
        m.playMusic();
}
}
