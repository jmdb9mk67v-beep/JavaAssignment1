/**
 * Block 1
 * Animal class and Private fields 
 */
public class Animal {
  private String name;
  private String color;
  private int age;
  private String favFood;


/**
 * Block 2
 * Constructor
 */
  public Animal(String name, String color, int age, String favFood) {
    this.name = name;
    this.color = color;
    this.age = age;
    this.favFood = favFood;
} // constructor

/**
 * Block 3
 * Getters
 */
  public String getName() {
    return this.color;
} // getColor

  public int getAge() {
    return this.age;
} // getAge

  public String getFavFood() {
    return this.favFood;
} // getFavFood

/**
 * Block 4
 * Setters
 */
  public void setName(String name) {
    this.name = name;
} // setName

  public void setColor(String color) {
    this.color = color;
} // setColor

  public void setAge(int age) {
    this.age = age;
} // setAge

  public void setFavFood(String favFood) {
    this.favFood = favFood;
} // setFavFood

/**
 * Block 5
 * Logic
 */
  public void printDetails() {
    System.out.printf("Name: %s%n", this.name);
    System.out.printf("Color: %s%n", this.color);
    System.out.printf("Age: %d%n", this.age);
    System.out.printf("Favorite Food: %s%n", this.favFood);
  } // printDetails
  
} // Animal class()

