package isp.StoreApp;

public enum ProductCategory {
    ELECTRONICS("Electronics & Gadgets"),
    FASHION("Fashion"),
    HOME_AND_GARDEN("Home & Garden"),
    BEATUY("Beatuy"),
    TOYS("Toys");
    // todo: add the rest of the constants

    private String displayName;

    ProductCategory(String displayName) {
        this.displayName = displayName;
    }

    @Override
    public String toString() {
        return this.displayName;
    }
}
