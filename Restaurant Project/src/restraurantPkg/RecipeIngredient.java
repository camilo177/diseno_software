package restraurantPkg;

public class RecipeIngredient {
    private Ingredient ingredient;
    private float quantity;

    public RecipeIngredient(Ingredient ingredient, float quantity) {
        this.ingredient = ingredient;
        this.quantity = quantity;
    }

    public float calculateCost() {
        return ingredient.getValuePerUnit() * quantity;
    }

    public float calculateCalories() {
        return ingredient.getCaloriesPerUnit() * quantity;
    }

    public Ingredient getIngredient() {
        return ingredient;
    }

    public void setIngredient(Ingredient ingredient) {
        this.ingredient = ingredient;
    }

    public float getQuantity() {
        return quantity;
    }

    public void setQuantity(float quantity) {
        this.quantity = quantity;
    }
}
