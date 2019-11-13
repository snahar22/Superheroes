package superheroes;
import java.util.ArrayList;
import java.util.Scanner;

    public class Superheroes{
            
            public static ArrayList<SuperHeroData> getData(){
        
        ArrayList<SuperHeroData> data = new ArrayList<SuperHeroData>();

    
        data.add(new SuperHeroData("Apocalypse", "En Sabah Nuh", 0 ,8 , 50, 16, 22, 80, "Born into slavery. He forged his way with his tools. War Plague. Pestilence. He aims to rule the world."));
        data.add(new SuperHeroData("Black Panther", "T’Challa"  , 180, 7, 29, 7, 17, 79, "King of Wakanda….."));
        data.add(new SuperHeroData("Black Widow", "Natasha Romanov", 168, 4, 26, 4, 14, 81, "Spy who came in from the cold"));
        data.add(new SuperHeroData("Blade", "Unknown" , 185, 3, 29, 5 , 14, 85, "Tortured warrior who survived against an army of immortal vampires"));
        data.add(new SuperHeroData("Captain America", "Steve Rogers", 186, 4, 29, 6 , 16 , 86, "The American Super Solider….."));
        data.add(new SuperHeroData("Dr Doom", "Victor Von Doom" , 186, 8 , 48, 4 , 13, 70, "Arrogant scientist was disfigured when experience went horribly awry."));
        data.add(new SuperHeroData("Dr Octopus", "Dr Otto Octavius", 173, 7, 23, 2, 12, 65, "He wants the power of the sun on his four arms"));
        data.add(new SuperHeroData("Dr Strange", "Dr Stephen Strange", 184, 5, 35, 4, 14, 85, "Former Surgeon, Now Master of the Mystic Arts." ));
        data.add(new SuperHeroData("Elektra", "Elektra Natchios", 173, 4, 15, 6, 16, 80, "Assassin, Lover, Enigma, Driven "));
        data.add(new SuperHeroData("Ghost Rider", "Johnny Blaze", 181, 3, 37, 8, 15,66,"Transformed into a skeletal fire demon thundering through the night on a mystical motorcycle of pure hellfire"));
        data.add(new SuperHeroData("Green Goblin", "Normal Osborn",178,6,35,10,18,55,"A professional criminal and former owner and president of Osborn Industries"));
        data.add(new SuperHeroData("Hawkeye", "Clint Barton", 188, 3, 26, 4, 16, 80,"Outlaw-turned-adventurer"));
        data.add(new SuperHeroData("Ice Man", "Bobby Drake", 170, 3, 28, 4, 12, 70,"A joker with amazing gifts, but lacking the ambition to tap his true potential"));
        data.add(new SuperHeroData("Invinsible Woman", "Susan Richards", 165, 3, 23, 2, 12, 70, "Once an aspiring actress, but found fame as a member of the Fantastic Four"));
        data.add(new SuperHeroData("Iron Man", "Tony Stark", 183, 6, 48, 2, 12, 85, "Billionaire genius who saved his own life by designing a life-sustaining shell...."));
        data.add(new SuperHeroData("Juggernaut", "Cain Marko", 205, 3, 48, 2, 10, 63,"A mystically empowered human"));
        data.add(new SuperHeroData("KingPin", "Wilson Fisk", 198, 7, 30, 4, 13, 75,"Using his immense size and strength, he reached the pinnacle of his profession relying on just one person;himself."));
        data.add(new SuperHeroData("Magneto", "Magnus", 185, 8, 46, 2, 12, 81,"Once a close friend of Charles Xavier, but now his deadliest foe."));
        data.add(new SuperHeroData("Mr Fantastic", "Reed Richards", 183, 9, 23, 2, 22, 65, "Having the ability to stretch, deform, expand or compress himself into any shape he wants."));
        data.add(new SuperHeroData("Mysterio", "Quentin Beck", 178, 3, 23, 3, 14, 70, "Beginning his career as a movie stuntman...."));
        data.add(new SuperHeroData("Nick Fury", "Nick Fury", 183, 3, 27, 4, 12, 86,"Worked his way up in the U.S intelligence ladder...."));
        data.add(new SuperHeroData("Professor X", "Charles Xavier", 180, 7, 24, 1, 12, 64, "The world's most powerful telepath...."));
        data.add(new SuperHeroData("Silver Surfer", "Norrin Radd", 190, 4, 46, 13, 18, 72,"Norrin Struck a deal wit the force of nature known as Galactus...." ));
        data.add(new SuperHeroData("Spider Man", "Peter Parker", 175, 7, 36, 11, 21, 66, "Being biten a spider gave him amazing spider like abilities"));
        data.add(new SuperHeroData("Storm", "Ororo Munroe", 178, 4, 27, 12, 14, 69,"Orphaned as a child, Ororo developed the power to command the forces of nature...." ));
        data.add(new SuperHeroData("The Beast", "Hank McCoy", 177, 5, 35, 10, 20, 72, "World-reowned Biochemist...."));
        data.add(new SuperHeroData("The Human Torch", "Johnny Storm", 175, 4, 26, 5, 14, 71, "Transformed by cosmic rays into the heroic Human Torch....." ));
        data.add(new SuperHeroData("The Thing", "Ben Grimm", 180, 3, 47, 8, 12, 85, "Once a experienced pilot...."));
        data.add(new SuperHeroData("Thor", "Jake Olson", 195, 4, 49, 9,19, 85,"Master of storm and lightning...."));
        data.add(new SuperHeroData("Venom", "Eddie Brock", 188, 3, 38, 10, 20, 64,"Eddie had a career as a reporter....."));
    
        
       return data;
      
     }
        
            
            
            
            
           public static void main(String[] args) {
            
             System.out.println("Please choose an option");
             System.out.println("0 = Exit");
             System.out.println("1 = First");
             System.out.println("2 = Next");
             System.out.println("3 = Previous");
              
             
               
            Scanner input = new Scanner(System.in);
            int choice = -1;
            int first = 0;
            int current = first;
            
            choice = input.nextInt();
            
            for(int i =0; i <=SuperHeroData.length() -1 ; i++)
                
            first = input.nextInt();
            current = input.nextInt();
            

            
            
            
}
            
            
          
            
            
            
            
    }
           
    }
        
            
