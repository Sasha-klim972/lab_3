package lab3;

import java.util.Objects;

public class Clothing {
    private String name;
    private String brand;
    private double price;
    private String size;
    private String color;

    public Clothing(String name, String brand, double price, String size, String color) {
        this.name = name;
        this.brand = brand;
        this.price = price;
        this.size = size;
        this.color = color;
    }

    @Override
    public String toString() {
        return "Name: " + name + "; Brand: " + brand + "; Price: " + price +
                "; Size: " + size + "; Color: " + color + ";";
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Clothing other = (Clothing) obj;
        return Double.compare(other.price, price) == 0 &&
                Objects.equals(name, other.name) &&
                Objects.equals(brand, other.brand) &&
                Objects.equals(size, other.size) &&
                Objects.equals(color, other.color);
    }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public String getBrand() { return brand; }
    public void setBrand(String brand) { this.brand = brand; }

    public double getPrice() { return price; }
    public void setPrice(double price) { this.price = price; }

    public String getSize() { return size; }
    public void setSize(String size) { this.size = size; }

    public String getColor() { return color; }
    public void setColor(String color) { this.color = color; }
}