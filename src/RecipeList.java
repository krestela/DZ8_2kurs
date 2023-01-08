import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class RecipeList {
    private HashMap<Recipe, Objects> recipes;

    public void addRecipe(Recipe recipe) {
        if (recipes.containsKey(recipe)) {
            throw new IllegalArgumentException("Такой рецепт уже есть");
        }
        recipes.get(recipe);
    }

    public void remove(Recipe recipe) {
        recipes.remove(recipe);
    }
}
