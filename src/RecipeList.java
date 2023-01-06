import java.util.HashSet;
import java.util.Set;

public class RecipeList {
    private Set<Recipe> recipes;

    public void addRecipe(Recipe recipe) {
        if (recipes.contains(recipe)) {
            throw new IllegalArgumentException("Такой рецепт уже есть");
        }
        recipes.add(recipe);
    }

    public void remove(Recipe recipe) {
        recipes.remove(recipe);
    }
}
