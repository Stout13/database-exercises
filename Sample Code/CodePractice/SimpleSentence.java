
/*
  The last verse of a well-known nursery rhyme:

    This is the farmer sowing his corn
    That kept the rooster that crowed in the morn
    That waked the judge all shaven and shorn
    That married the man all tattered and torn
    That kissed the maiden all forlorn
    That milked the cow with the crumpled horn
    That tossed the dog 
    That worried the cat
    That chased the rat
    That ate the cheese
    That lay in the house that Jack built. 
    
  Some rules that capture the syntax of this verse:
    
    <sentence> ::= <simple_sentence> [ and <sentence> ]

    <simple_sentence> ::=  this is [ <noun_phrase> ] the house that Jack built
    
    <noun_phrase> ::= the <noun> [ <modifier> ] that <verb> [ <noun_phrase> ]    
    <noun> ::= farmer | rooster | judge | man | maiden | cow | dog | cat | cheese
    
    <verb> ::= kept | waked | married | milked | tossed | chased | lay in
    
    <modifier> ::= that crowed in the morn | all shaven and shorn |
                    all tattered and torn | all forlorn | with the crumpled horn
    
  This program implements these rules to generate random sentences.  All the
  verses of the rhyme can be generated, plus a lot of sentences that make no
  sense (but still follow the syntax).   Note that an optional item like
  [ <modifier> ] has a chance of being used, depending on the value of some
  randomly generated number.
  
  The program generates and outputs one random sentence every three seconds until
  it is halted (for example, by typing Control-C in the terminal window where it is
  running).
*/


public class SimpleSentence {

    public static void main(String[] args) {
        System.out.println(sentence(conjunction, proper_noun, common_noun, determiner, adjective, intransitive_verb, transitive_verb));
    }

    public static String sentence(String[] conjunction, String[] intransitive, String[] transitive, String[] proper, String[] determine, String[] adj, String[] common) {
        String sentence = simpleSentence(intransitive, transitive, proper, determine, adj, common);
        if (Math.random()>.8) {
            sentence = sentence + " " + conjunction[(int) Math.floor(Math.random() * (conjunction.length - 1))] + " " + sentence;
        }
        return sentence;
    }

    public static String simpleSentence(String[] intransitive, String[] transitive, String[] proper, String[] determine, String[] adj, String[] common) {
        String sentence = nounPhrase(intransitive, transitive, proper, determine, adj, common);
        if (Math.random() > .4) {
            sentence = sentence + " " + verbPhrase(intransitive, transitive, proper, determine, adj, common);
        }
        return sentence;
    }

    public static String nounPhrase(String[] intransitive, String[] transitive, String[] proper, String[] determine, String[] adj, String[] common) {


        String nounPhrase = proper[(int) Math.floor(Math.random() * (proper.length - 1))] + " " + determine[(int) Math.floor(Math.random() * (determine.length - 1))] + " " + adj[(int) Math.floor(Math.random() * (adj.length - 1))] + ". ";
        if (Math.random() > .6) {
            nounPhrase = nounPhrase + " " + common[(int) Math.floor(Math.random() * (common.length - 1))] + " who " + (verbPhrase(intransitive, transitive, proper, determine, adj, common));
        }
        return nounPhrase;
    }

    public static String verbPhrase(String[] intransitive, String[] transitive, String[] proper, String[] determine, String[] adj, String[] common) {
        String verbPhrase = intransitive[(int) Math.floor(Math.random() * (intransitive.length - 1))] + " " + transitive[(int) Math.floor(Math.random() * (transitive.length - 1))];
        if (Math.random() > .8) {
            verbPhrase = verbPhrase + " " + (nounPhrase(intransitive, transitive, proper, determine, adj, common) + " is " + adj[(int) Math.floor(Math.random() * (adj.length - 1))]);
        }
        if (Math.random() > .8) {
            verbPhrase = verbPhrase + " " + (" believes that " + (simpleSentence(intransitive, transitive, proper, determine, adj, common)));
        }
        return verbPhrase;
    }

    static final String[] conjunction = {"and", "or", "but", "because"};

    static final String[] proper_noun = {"Fred", "Jane", "Richard Nixon", "Miss America"};

    static final String[] common_noun = {"man", "woman", "fish", "elephant", "unicorn"};

    static final String[] determiner = {"a", "the", "every", "some"};

    static final String[] adjective = {"big", "tiny", "pretty", "bald"};

    static final String[] intransitive_verb = {"run", "jump", "talks", "sleeps"};

    static final String[] transitive_verb = {"loves", "hates", "sees", "knows", "looks for", "find"};
}


//
//    static final String[] nouns = {"farmer", "rooster", "judge", "man", "maiden",
//            "cow", "dog", "cat", "cheese"};
//
//    static final String[] verbs = {"kept", "waked", "married",
//            "milked", "tossed", "chased", "lay in"};
//
//    static final String[] modifiers = {"that crowed in the morn", "sowing his corn",
//            "all shaven and shorn",
//            "all forlorn", "with the crumpled horn"};
//
//    public static void main(String[] args) {
//        while (true) {
//            randomSentence();
//            System.out.println(".\n\n");
//            try {
//                Thread.sleep(3000);
//            } catch (InterruptedException e) {
//            }
//        }
//    }
//
//    static void randomSentence() {
//        System.out.print("this is ");
//        if (Math.random() > 0.2)
//            randomNounPhrase();
//        System.out.print("the house that Jack built");
//        if (Math.random() > 0.75) {
//            System.out.print(" and ");
//            randomSentence();
//        }
//    }

//    static void randomNounPhrase() {
//        int n = (int) (Math.random() * nouns.length);
//        int v = (int) (Math.random() * verbs.length);
//        int m = (int) (Math.random() * modifiers.length);
//        System.out.print("the " + nouns[n]);
//        if (Math.random() > 0.75)
//            System.out.print(" " + modifiers[m]);
//        System.out.print(" that " + verbs[v] + " ");
//        if (Math.random() > 0.5)
//            randomNounPhrase();
//    }

//    For the first exercise of the lab, you should write a similar program that implements the following rules:

//    static void randomSentence() {
//        System.out.print("this is ");
//        if (Math.random() > 0.2)
//            randomNounPhrase();
//        System.out.print("the house that Jack built");
//        if (Math.random() > 0.75) {
//            System.out.print(" and ");
//            randomSentence();
//        }
//    }

//    static void randomSentence() {
//        System.out.print("this is ");
//        if (Math.random() > 0.2)
//            randomNounPhrase();
//        System.out.print("the house that Jack built");
//        if (Math.random() > 0.75) {
//            System.out.print(" and ");
//            randomSentence();
//        }
//    }

//<sentence> ::= <simple_sentence> [ <conjunction> <sentence> ]
//



//<simple_sentence> ::= <noun_phrase> <verb_phrase>
//



    //<noun_phrase> ::= <proper_noun> |
//<determiner> [ <adjective> ]. <common_noun> [ who <verb_phrase> ]
//


//<verb_phrase> ::= <intransitive_verb> |
//<transitive_verb> <noun_phrase> |
//    is <adjective> |
//    believes that <simple_sentence>
//
//<conjunction> ::= and | or | but | because





//
//            <proper_noun> ::= Fred | Jane | Richard Nixon | Miss America



//<common_noun> ::= man | woman | fish | elephant | unicorn
//
//            <determiner> ::= a | the | every | some
//
//            <adjective> ::= big | tiny | pretty | bald
//
//            <intransitive_verb> ::= runs | jumps | talks | sleeps
//
//            <transitive_verb> ::= loves | hates | sees | knows | looks for | finds


//    As in SimpleRandomSentences.java, you can use arrays to implement the last seven
//    rules in this list. (You might improve on that program by writing a single method
//    "void String randomItem(String[] listOfStrings)" for picking a random item from
//    an array of strings.) You are welcome to add to or modify the items in the lists given here.

//    For each of the first three rules, you should write a subroutine to represent that rule. Note that a
//    choice of alternatives (represented in the rules by "|") can be implemented using a switch or if..else
//        statement; the various choices don't necessarily have to have the same probability. An optional element
//        (represented by brackets, "[ xxx ]") can be implemented by a simple if. And a repeated optional element
//            (represented by brackets with dots, "[ xxx ]...") can be represented by a while loop. You should implement
//    the first four rules exactly as stated here. The main routine should call the <sentence> subroutine to generate
//    random sentences.

//    You have to be careful in this program to avoid infinite recursion in this program. Since it will use random choices,
//    there is no guarantee that the recursion will ever end. If your probabilities of doing recursion and continuing loops
//    are too high, it is possible for the program to get lost in recursive calls forever -- or to produce some finite but
//    ridiculously long sentences. You should adjust your probabilities to make sure that this doesn't happen, but that you
//    still get some interesting sentences.


//}