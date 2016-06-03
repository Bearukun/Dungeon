package model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Random;

public class TextGenerator  implements Serializable{

    //Declaring, initializing and instanciating variables. 
    ArrayList<String> itemLookupText = new ArrayList();
    ArrayList<String> chestLookupText = new ArrayList();
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
        
        minionTauntText.add("and yells \"For the master!\"");
        minionTauntText.add("and shouts \"You take no candle!\"");
        minionTauntText.add("and shouts \"Bones! Need more bones!\"");
        minionTauntText.add("and yells \"Invaders! You! Shall! Go! No! Further\"");
        minionTauntText.add("and yells \"Your entrails will make a fine necklace!\"");
        minionTauntText.add("and shouts \"FLESH..IS..WEAK!!\" ");
        minionTauntText.add("and shouts \"MADNESS WILL CONSUME YOU!\"");
        minionTauntText.add("and shouts \"Your will... is not your own.\"");
        minionTauntText.add("and yells \"I'll paint my face with your blood!\"");
        minionTauntText.add("and yells \"Trifling " + playerName + "! Your arrogance will be your undoing!\" ");
        minionTauntText.add("and yells \"Men.. women... children... none were spared the master's wrath..\"");
        minionTauntText.add("and shouts \"You shouldn't have come " + playerName + "...now you will die!\"");
        minionTauntText.add("and says \"So much lost time... That you'll never get back! \"");
        minionTauntText.add("and says \"The menagerie is for guests only.\"");
        minionTauntText.add("and says \"You never know what skitters in the darkness.\"");
        minionTauntText.add("and says \"Death...Is...Close\"");
        minionTauntText.add("and yell \"I want this nightmare to be over!\"");
        minionTauntText.add("and yells \"BLOOD WILL FLOW!\"");
        minionTauntText.add("and says \"Despair, so delicious!\"");
        
        
        bossTauntText.add("and shouts \"Naughty Secrets! I'll rip the secrets from your flesh " + playerName + "!\"");
        bossTauntText.add("and says \"We're gonna bury you here "+ playerName +"...\"");
        bossTauntText.add("and yells \"Interloper! Mortal who dare to interfere with my sport will pay.\"");
        bossTauntText.add("and says \"Who knows what secrets hide in the dark? Ah, yes. I do.\"");
        bossTauntText.add("and yells \"I am a god..!\"");
        bossTauntText.add("and shouts \"I will destroy you "+ playerName+"!\"");
        bossTauntText.add("and says in a slithering voice \"Fear..so exhilarating... Despair...so delicious...\"");
        bossTauntText.add("and shouts \"Let the coils of death unfurl!\"");
        bossTauntText.add("and shouts \"You are not prepared!\"");
        bossTauntText.add("and yells \"This place will be your tomb!\"");
        bossTauntText.add("and says \"Death...good choice, not the best choice maybe...but better than fail and live.\"");
        bossTauntText.add("and shouts \"Proceed and I will banish your souls to oblivion\" ");
        bossTauntText.add("and says \"An epic battle, how exciting!\"");
        bossTauntText.add("and says \"I see dead people; you be dead people!\" ");
        bossTauntText.add("and yells \"You know what they say about curiosity.\"");
        
        chestLookupText.add("You also notice an old chest ");
        chestLookupText.add("You notice something else as well, a dusty chest ");
     
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
     * Method used to generate a random chest lookup text.
     *
     * @return Returns a string with a random text.
     */
    public String generateChestLookupText() {

        return chestLookupText.get(rand.nextInt(chestLookupText.size()));

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
