package designpatterns.decorator;

public abstract class Pizza {
    String description = "Just a Pizza!";

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    abstract int getCost();
}
