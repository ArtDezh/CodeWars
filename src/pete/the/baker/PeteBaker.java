package pete.the.baker;

import java.util.Map;

public class PeteBaker {
    public static void main(String[] args) {
        Map<String, Integer> recipe = Map.of(
                "flour", 500,
                "sugar", 200,
                "eggs", 1);
        Map<String, Integer> available = Map.of(
                "flour", 1200,
                "sugar", 1200,
                "eggs", 5,
                "milk", 200);
        System.out.println(cakes(recipe, available));
    }

    public static int cakes(Map<String, Integer> recipe, Map<String, Integer> available) {
        int maxCakes = Integer.MAX_VALUE;

        for (Map.Entry<String, Integer> ingredient: recipe.entrySet()) {
            String ingredientName = ingredient.getKey();
            int requiredAmount = ingredient.getValue();

            if (available.containsKey(ingredientName)) {
                int availableAmount = available.get(ingredientName);
                maxCakes = Math.min(maxCakes, availableAmount / requiredAmount);
            } else return 0;
        }
        return maxCakes;
    }
}
