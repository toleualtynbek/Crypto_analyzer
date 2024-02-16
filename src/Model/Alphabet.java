package Model;

import java.util.*;

public class Alphabet {
    public static final Character[] RUS_ALPHABET = {'а','б','в','г','д','е','ё','ж','з','и','й',
                                                    'к','л','м','н','о','п','р','с','т','у',
                                                    'ф','х','ц','ч','ш','щ','ъ','ы','ь','э',
                                                    'ю','я',' '};
    public static final Character[] ENG_ALPHABET = {'a','b','c','d','e','f','g','h','i','j',
                                                    'k','l','m','n','o','p','q','r','s','t',
                                                    'u','v','w','x','y','z'};

    public static final Character[] SYMBOL_ALPHABET = {'1','2','3','4','5','6','7','8','9','0',
                                                        ',','.','\\','!',':',';','-','(',')','<',
                                                        '>','@','$','%','&','?'};

    private final List<Character> alphabet;

    private final Map<Character, Integer> charIndexes;

    public Alphabet() {
        List<Character> basicAlphabet = new ArrayList<>();
        basicAlphabet.addAll(Arrays.asList(RUS_ALPHABET));
       // basicAlphabet.addAll(Arrays.asList(ENG_ALPHABET));
        basicAlphabet.addAll(Arrays.asList(SYMBOL_ALPHABET));
        alphabet = List.copyOf(basicAlphabet);
        charIndexes = new HashMap<>();
        for(int i=0; i < alphabet.size(); i++)
        {
            charIndexes.put(alphabet.get(i),i);
        }
    }
    public Character getCharByIndex(Integer index)
    {
        return alphabet.get(index);
    }
    public Integer getCharIndex(Character symbol)
    {
        return charIndexes.get(symbol);
    }
    public int getSize()
    {
        return alphabet.size();
    }
}
