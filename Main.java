import java.util.Scanner;
class Main {
  public static void main(String[] args) {
     Scanner scan = new Scanner(System.in);
    System.out.println("\n\n You wake to the beeping sounds of a spacecraft.\n As you open your eyes, you find yourself inside a statis pod. \n It opens and you fall to the floor \n What should you do next? \n Explore the area (E)\n Try to find a weapon(W)  ");

     String spaceship = scan.next();
    if (spaceship.equals("E")) 
    {
        System.out.println("As you explore the spaceship you find a datapad.\n What should you do? \n Hack it open (H) \n Leave it b (B)");
         String datapad = scan.next();
        if (datapadGenerator.equals("B")) 
        {
            int datapadGenerator = (int) (Math.random() * 2);
            if (datapadGenerator == 1) 
          {
            System.out.println("Congrats on hacking it! \n I didn't actually think you could do it \n You find out that you were assigned to smuggle weapons from the planet Devas to Solas ");
          }else{
          System.out.println("Aw shucks sorry but you failed");
            }
        }else{
          System.out.println("You continue around the ship till you find a door seeming leading to outside \n What do you do ?? \n Kick it down");
        }

    }
  }
}