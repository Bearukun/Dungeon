package model;

import java.util.ArrayList;
import java.util.Random;

public class TextGenerator {

    //Initializing and instanciating variables. 
    ArrayList<String> itemLookupText = new ArrayList();
    Random rand = new Random();

    /**
     * Constructor for the TextGenerator class.
     */
    public TextGenerator() {

        itemLookupText.add("You see ");
        itemLookupText.add("Behind a crooked pillar you see ");
        itemLookupText.add("As you take a step into the room, the floor under you gives in and a large crack shows ");

    }

    /**
     * Method used to generate a random item lookup text.
     *
     * @return Returns a string with a random text.
     */
    public String generateItemLookupText() {

        return itemLookupText.get(rand.nextInt(itemLookupText.size()));

    }

    public String generateTaunt(String type) {

        if (type.equalsIgnoreCase("Boss")) {

            return bossTaunt();

        } else if (type.equalsIgnoreCase("Minion")) {

            return minionTaunt();

        }

        return "#ERROR# No monstertype associated!";

    }

    /**
     * This will generate a random sentence ##This is not complete yet!
     *
     * @return returns a randomly generated sentence.
     */
    public String bossTaunt() {

        return "big baws";
    }

    /**
     * This will generate a random sentence 
     * ##This is not complete yet!
     * @return returns a randomly generated sentence.
     */
    public String minionTaunt() {

        return "minionTaunt";

    }

}
