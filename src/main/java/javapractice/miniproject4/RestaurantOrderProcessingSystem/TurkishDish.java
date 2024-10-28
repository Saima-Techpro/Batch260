package javapractice.miniproject4.RestaurantOrderProcessingSystem;

public enum TurkishDish {

    KEBAB("Kebab", 50.0, "Spicy, Non-Veg"),
    BAKLAVA("Baklava", 20.0, "Sweet, Veg"),
    AYRAN("Ayran", 5.0, "Savory, Veg"),
    LAHMACUN("Lahmacun", 30.0, "Savory, Non-Veg"),
    SUTLAC("Sütlaç", 15.0, "Sweet, Veg"),
    DOLMA("Dolma", 25.0, "Savory, Veg"),
    BOREK("Börek", 20.0, "Savory, Veg"),
    MENEMEN("Menemen", 18.0, "Spicy, Veg"),
    PIDE("Pide", 35.0, "Savory, Non-Veg"),
    MERCIMEK_CORBASI("Mercimek Çorbası", 12.0, "Savory, Veg"),
    KARNIYARIK("Karnıyarık", 40.0, "Savory, Non-Veg"),
    SIGARA_BOREGI("Sigara Böreği", 10.0, "Savory, Veg"),
    GULLAC("Güllaç", 22.0, "Sweet, Veg"),
    KUMPIR("Kumpir", 28.0, "Savory, Veg"),
    KOFTES("Köftes", 45.0, "Spicy, Non-Veg"),
    ISKENDER("İskender", 55.0, "Spicy, Non-Veg"),
    MANTI("Mantı", 30.0, "Savory, Non-Veg"),
    SIMIT("Simit", 8.0, "Savory, Veg"),
    HUNKAR_BEGENDI("Hünkar Beğendi", 60.0, "Savory, Non-Veg"),
    TAVUK_SIS("Tavuk Şiş", 35.0, "Savory, Non-Veg"),
    KISIR("Kısır", 20.0, "Spicy, Veg"),
    CIG_KOFTE("Çiğ Köfte", 18.0, "Spicy, Veg"),
    ALINAZIK("Ali Nazik", 48.0, "Savory, Non-Veg"),
    TANTUNI("Tantuni", 32.0, "Spicy, Non-Veg"),
    ACILI_EZME("Acılı Ezme", 10.0, "Spicy, Veg"),
    KADAYIF("Kadayıf", 25.0, "Sweet, Veg"),
    REVANI("Revani", 15.0, "Sweet, Veg"),
    KAZANDIBI("Kazandibi", 18.0, "Sweet, Veg"),
    SAKSUKA("Şakşuka", 14.0, "Spicy, Veg"),
    MEZE_TABAGI("Meze Tabağı", 30.0, "Savory, Veg");

    private final String name;
    private final double price;
    private final String description;

    TurkishDish(String name, double price, String description) {
        this.name = name;
        this.price = price;
        this.description = description;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public String getDescription() {
        return description;
    }
}
