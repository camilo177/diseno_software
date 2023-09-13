package restraurantPkg;

public class MercedarioRecipesApp {

    private static User admin;

    public static void main(String[] args) {
        admin = new User();

        // Create a new ingredient
        Ingredient flour = new Ingredient();
        flour.setName("Flour");
        flour.setValuePerUnit(10);
        flour.setCaloriesPerUnit(364);
        flour.setUnit(UNIT.KG);
        flour.setPurchasePlace("Local Market");

        // Create a RecipeIngredient from the previous ingredient to use in a recipe
        RecipeIngredient flourForBread = new RecipeIngredient();
        flourForBread.quantity = 0.5f;

        // Create a recipe
        Recipe bread = new Recipe();
        bread.setName("Bread");
        bread.setPreparationTime(3);
        bread.setServes(4);
        bread.getIngredientList().add(flourForBread);
        bread.setPreparationDescription("1. Mix flour...\n2. Bake...");

        // Display recipe information
        System.out.println("Recipe: " + bread.getName());
        System.out.println("Preparation Time: " + bread.getPreparationTime() + " hours");
        System.out.println("Ingredients:");
        for (RecipeIngredient ingredient : bread.getIngredientList()) {
            System.out.println("- " + ingredient.getName() + ": " + ingredient.quantity + " " + ingredient.getUnit());
        }
        System.out.println("Steps:");
        System.out.println(bread.getPreparationDescription());


        ///INGREDIENTS
        Ingredient tomato = new Ingredient("Tomato", UNIT.PIECE, 0.5f, "Grocery Store", 25.0f);
        Ingredient onion = new Ingredient("Onion", UNIT.PIECE, 0.3f, "Farmers' Market", 40.0f);

        Ingredient.addIngredient(tomato);
        Ingredient.addIngredient(onion);

        List<Ingredient> allIngredients = Ingredient.getAllIngredients();
    }
}
