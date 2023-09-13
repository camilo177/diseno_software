package restraurantPkg;

class Ingredient {
    private String name;
    private UNIT unit;
    private float valuePerUnit;
    private String purchasePlace;
    private float caloriesPerUnit;

    // Static list to store all ingredients
    private static List<Ingredient> allIngredients = new ArrayList<>();

    // Method to add an ingredient to the list
    public static void addIngredient(Ingredient ingredient) {
        allIngredients.add(ingredient);
    }

    public static List<Ingredient> getAllIngredients() {
        return allIngredients;
    }

    public void editIngredient() {
        // Logic in process
    }
    public boolean deleteIngredient() {
        // Logic in process
        return true;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public UNIT getUnit() {
        return unit;
    }

    public void setUnit(UNIT unit) {
        this.unit = unit;
    }

    public float getValuePerUnit() {
        return valuePerUnit;
    }

    public void setValuePerUnit(float valuePerUnit) {
        this.valuePerUnit = valuePerUnit;
    }

    public String getPurchasePlace() {
        return purchasePlace;
    }

    public void setPurchasePlace(String purchasePlace) {
        this.purchasePlace = purchasePlace;
    }

    public float getCaloriesPerUnit() {
        return caloriesPerUnit;
    }

    public void setCaloriesPerUnit(float caloriesPerUnit) {
        this.caloriesPerUnit = caloriesPerUnit;
    }
}