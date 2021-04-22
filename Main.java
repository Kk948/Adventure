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
        if (datapadGenerator.equals("H")) 
        {
            int datapadGenerator = (int) (Math.random() * 2);
            if (datapadGenerator == 1) 
          {
            System.out.println("Congrats on hacking it! \n I didn't actually think you could do it \n You find out that you were assigned to smuggle weapons from the planet Devas to Solas ");
          }else{
          System.out.println("Aw shucks sorry but you failed");
            }
          if (datapadGenerator.equals("B"))
          {
          System.out.println("You continue around the ship till you find a door seeming leading to outside \n You kick it down \n The blazing hot desert air hit you like the chancla from your mother. \n no escpae in sight you might be here a while. \n End of Adventure");
          }
   }
  if (spaceship.equals("B"))
  {
    System.out.println("You come across an old pipe. \n great for wacking people with \n You continue around the ship till you find a door seeming leading to outside \n You kick it down \n The blazing hot desert air hit you like the chancla from your mother. \n no escpae in sight you might be here a while. \n End of Adventure");
  }
    
  }
}
}