import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = true)
public class Book extends Product {
    private String author;

    public Book() {
    }

    public Book(int id, String nameProduct, int price, String author) {
        super(id, nameProduct, price);
        this.author = author;
    }