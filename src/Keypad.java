import java.util.*;
//Multi-tap Keypad Text Entry on an Old Mobile Phone
/**
 * Created by davidmgarcia6 on 18/06/2019.
 */
public class Keypad {

    public static void main(String[] args) {
        Keypad.presses("HOW R U");
    }

    private Map<String, Key> keyMap;

    public Keypad(){
        this.keyMap = new HashMap<>();
        InitializeKeys();
    }

    private void InitializeKeys(){
        addKeys(new Key("1"));
        addKeys(new Key("ABC2"));
        addKeys(new Key("DEF3"));
        addKeys(new Key("GHI4"));
        addKeys(new Key("JKL5"));
        addKeys(new Key("MNO6"));
        addKeys(new Key("PQRS7"));
        addKeys(new Key("TUV8"));
        addKeys(new Key("WXYZ9"));
        addKeys(new Key("*"));
        addKeys(new Key(" 0"));
        addKeys(new Key("#"));
    }

    private void addKeys(Key key) {
        for (String s: key.getCharacters()){
            this.keyMap.put(s, key);
        }
    }

    public static int presses(String textToTap){
        Keypad keypad = new Keypad();
        int count = 0;

        for (int i=0; i<textToTap.length(); i++){
            String theCharacter = textToTap.substring(i, i+1).toUpperCase();
            Key key = keypad.getValueKey(theCharacter);
            if (key !=null) {
                do {
                    count++;
                } while (!key.touch().equals(theCharacter));
                key.theLock();
            }
        }
        return count;
    }

    private Key getValueKey(String theCharacter) {
        return keyMap.get(theCharacter);
    }
}

class Key {
    private final List<String> characters;
    private Iterator<String> charactersIterator;

    public Key(String label) {
        characters = new ArrayList<>(label.length());
        for (int i = 0; i < label.length(); i++) {
            characters.add(label.substring(i, i + 1));
        }
    }

    public String touch() {
        if (charactersIterator == null) {
            charactersIterator = characters.iterator();
        }
        return charactersIterator.next();
    }

    public List<String> getCharacters() {
        return characters;
    }

    public void theLock() {
        charactersIterator = null;
    }
}
