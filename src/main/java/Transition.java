import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Transition {

    // Fields
    Map<State, Map<Character, Set<State>>> transition;

    // Helper Methods

    public void add(State source, char input, State target) {

        // If no transitions exist for the source state, create a new map
        if(!transition.containsKey(source)) {
            transition.put(source, new HashMap<>());
        }

        // Get the input-to-target map for the given source state
        Map<Character, Set<State>> inputMap = transition.get(source);

        // If no targets exist for the input symbol
        if(!inputMap.containsKey(input)) {
            inputMap.put(input, new HashSet<>());
        }

        Set<State> targets = inputMap.get(input);
        targets.add(target);

            }
        }



