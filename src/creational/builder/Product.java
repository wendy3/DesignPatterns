package creational.builder;

/**
 * 产品
 */
public class Product {
    // 第一部分
    private String partOne;
    // 第二部分
    private String partTwo;

    public String getPartOne() {
        return partOne;
    }

    public void setPartOne(String partOne) {
        this.partOne = partOne;
    }

    public String getPartTwo() {
        return partTwo;
    }

    public void setPartTwo(String partTwo) {
        this.partTwo = partTwo;
    }

    @Override
    public String toString() {
        return "Product{" +
                "partOne='" + partOne + '\'' +
                ", partTwo='" + partTwo + '\'' +
                '}';
    }
}
