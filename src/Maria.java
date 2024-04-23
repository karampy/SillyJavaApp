import java.util.ArrayList;
import java.util.Random;

public class Maria{
    ArrayList<People> peopleWhoLoveMimi = new ArrayList<>();
    String name = "maria";
    int age = 20;
    String mood = "Neutral";
    Random rnd = new Random();
    Karam roomi = new Karam();
    String[] moods = new String[6];

    public Maria(){
        moods[0] = "period 😭";
        moods[1] = "feeling happy 🥺 (her family aren't being dickheads)";
        moods[2] = "feeling angry 😡 (uni people and studies are really getting on her nerve)";
        moods[3] = "feeling super cute and sexy 💅🏻";
        moods[4] = "feeling horny 😈";
        moods[5] = "feeling smart ☝️🤓 (she has 2 months of studying to catch up to in 5 days)";
    }

    public void joinMimi(People people){
        peopleWhoLoveMimi.add(people);
    }

    public String moodChanger(){
        String x = null;
        switch(rnd.nextInt(6)){
            case 0:
                for(People p : peopleWhoLoveMimi){
                    x = roomi.updateMood(moods[0]);
                }
                break;
            case 1:
                for(People p : peopleWhoLoveMimi){
                    x = roomi.updateMood(moods[1]);
                }
                break;
            case 2:
                for(People p : peopleWhoLoveMimi){
                    x = roomi.updateMood(moods[2]);
                }
            case 3:
                for(People p : peopleWhoLoveMimi){
                    x = roomi.updateMood(moods[3]);
                }
                break;
            case 4:
                for(People p : peopleWhoLoveMimi){
                    x = roomi.updateMood(moods[4]);
                }
                break;
            case 5:
                for(People p : peopleWhoLoveMimi){
                    x = roomi.updateMood(moods[5]);
                }
                break;
        }

        return x;
    }
}
