package model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Random;

public class TextGenerator  implements Serializable{

    //Declaring, initializing and instanciating variables. 
    ArrayList<String> itemLookupText = new ArrayList();
    ArrayList<String> bossTauntText = new ArrayList();
    ArrayList<String> minionTauntText = new ArrayList();
    Random rand = new Random();
    String playerName;

    /**
     * Constructor for the TextGenerator class.
     */
    public TextGenerator(String playerName) {
        
        this.playerName = playerName;

        itemLookupText.add("You see ");
        itemLookupText.add("You stumble upon a corpse, in his bags you see ");
        itemLookupText.add("You notice ");
        itemLookupText.add("You see an old chest, in it you see ");
        itemLookupText.add("Behind a crooked pillar you see ");
        itemLookupText.add("As you take a step into the room, the floor under you gives in and a large crack shows ");
        
        bossTauntText.add("and shouts \"Naughty Secrets! I'll rip the secrets from your flesh " + playerName + "!\"");
        bossTauntText.add("and says \"We're gonna bury you here "+ playerName +"...\"");
        bossTauntText.add("and yells \"Interloper! Mortal who dare to interfere with my sport will pay.\"");
        bossTauntText.add("and says \"Who knows what secrets hide in the dark? Ah, yes. I do.\"");
        bossTauntText.add("and yells \"I am a god..!\"");
        bossTauntText.add("and shouts \"I will destroy you "+ playerName+"!\"");
        bossTauntText.add("and says in a slithering voice \"Fear..so exhilarating... Despair...so delicious...\"");
        bossTauntText.add("and shouts \"Let the coils of death unfurl!\"");

    }

    /**
     * Method used to generate a random item lookup text.
     *
     * @return Returns a string with a random text.
     */
    public String generateItemLookupText() {

        return itemLookupText.get(rand.nextInt(itemLookupText.size()));

    }

    /**
     * Method used to generate a taunt message.
     * @param type What kind of taunt is needed. 
     * @return Returns a taunt in a String.
     */
    public String generateTaunt(String type) {

        if (type.equalsIgnoreCase("Boss")) {

            return bossTauntText.get(rand.nextInt(bossTauntText.size()));

        } else if (type.equalsIgnoreCase("Minion")) {

            return minionTauntText.get(rand.nextInt(minionTauntText.size()));

        }

        return "#ERROR# No monstertype associated!";

    }

}
