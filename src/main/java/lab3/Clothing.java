package lab3;

public class Clothing {
    /**
     * Type/name of clothing
     */
    private String name;

    /**
     * Brand of clothing
     */
    private String brand;

    /**
     * Price of clothing
     */
    private double price;

    /**
     * Size of clothing
     */
    private String size;

    /**
     * Color of clothing
     */
    private String color;

    /**
     * Class constructor for getting sample data
     * @param name receive and set name of clothing
     * @param brand receive and set brand of clothing
     * @param price receive and set how much a sample cost
     * @param size receive size of object
     * @param color receive color of product
     */
    public Clothing(String name,
                    String brand,
                    double price,
                    String size,
                    String color){
            this.name = name;
            this.brand = brand;
            this.price = price;
            this.size = size;
            this.color = color;
    }

    /**
     * Standard toString method override
     * @return better for this class String representation
     */
    @Override
    public String toString(){
        return "Name: "+ this.name + ";\n" +
        "Brand: "+ this.brand + ";\n" +
        "Price: " + this.price + ";\n" +
        "Size: "+ this.size + ";\n" +
        "Color: "+ this.color + ";\n";
    }

    /**
     * Override standard equals method
     * @param obj needed Object type variable for comparison objects
     * @return true if object equals to another
     */
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;
        if (!(obj instanceof Clothing other)) return false;

        return price == other.price
                && name.equals(other.name)
                && brand.equals(other.brand)
                && size.equals(other.size)
                && color.equals(other.color);
    }

    /**
     * Getter for name
     * @return name of sample
     */
    public String getName(){
        return this.name;
    }

    /**
     * Setter for name
     * @param name receive new name for object
     */
    public void setName(String name){
        this.name = name;
    }

    /**
     * Getter for brand
     * @return brand of sample
     */
    public String getBrand(){
        return this.brand;
    }

    /**
     * Setter for brand
     * @param brand receive new brand for object
     */
    public void setBrand(String brand){
        this.brand = brand;
    }

    /**
     * Getter for price
     * @return price of sample
     */
    public double getPrice(){
        return this.price;
    }

    /**
     * Setter for price
     * @param price receive new price for object
     */
    public void setPrice(double price){
        this.price = price;
    }

    /**
     * Getter for size
     * @return size of sample
     */
    public String getSize(){
        return this.size;
    }

    /**
     * Setter for size
     * @param size receive new size for object
     */
    public void setSize(String size){
        this.size = size;
    }

    /**
     * Getter for color
     * @return color of sample
     */
    public String getColor(){
        return this.color;
    }

    /**
     * Setter for color
     * @param color receive new color for object
     */
    public void setColor(String color){
        this.color = color;
    }
}