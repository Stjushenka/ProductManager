import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import ru.netology.repo.ProductRepository;
import ru.netology.products.Book;
import ru.netology.products.Product;
import ru.netology.products.Smartphone;


import static org.junit.jupiter.api.Assertions.*;

public class ProductManagerTest {
    private ProductRepository repository = new ProductRepository();
    ProductManager manager = new ProductManager(repository);

    private Product first = new Book(1, "Мастер и Маргарита", 250, "Булгаков");
    private Product second = new Smartphone(2, "Samsung galaxy", 56000, "Samsung");
    private Product third = new Book(3, "Удушье", 200, "Чак Паланик");
    private Product fourth = new Smartphone(4, "iPhone9", 21000, "Apple");
    private Product fifth = new Book(5, "Понедельник начинается в субботу", 450, "Стругацкие");
    private Product sixth = new Book(3, "Проклятые", 200, "Чак Паланик");


    @BeforeEach
    void setUp() {
        manager.add(first);
        manager.add(second);
        manager.add(third);
        manager.add(fourth);
        manager.add(fifth);
        manager.add(sixth);
    }

    @Test
    public void shouldFindAuthor() {
        Product[] expected = {fifth};
        Product[] actual = manager.searchBy("Стругацкие");
        assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldFindNameBook() {
        Product[] expected = {third};
        Product[] actual = manager.searchBy("Удушье");
        assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldFindPhone() {
        Product[] expected = {second};
        Product[] actual = manager.searchBy("Samsung");
        assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldFindPhone1() {
        Product[] expected = {fourth};
        Product[] actual = manager.searchBy("iPhone9");
        assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldNotFindAuthor() {
        Product[] expected = {};
        Product[] actual = manager.searchBy("Фет");
        assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldFindTwoBooks() {
        Product[] expected = {third, sixth};
        Product[] actual = manager.searchBy("Чак Паланик");
        assertArrayEquals(expected, actual);
    }

}