package lidian.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class OptionalDemo {
    public static void main(String[] args) {

        testMap();
//        testIsPresent();
//        testFilter();

//        Author author = getAuthor();
//        Optional<Author> authorOptional = Optional.ofNullable(author);
//        authorOptional.ifPresent(author1 -> System.out.println(author1.getName()));


//        Optional<Author> authorOptional = getAuthorOptional();
//        try {
//            Author author = authorOptional.orElseThrow(() -> new RuntimeException("数据为null"));
//            System.out.println(author);
//        } catch (Throwable throwable) {
//            throwable.printStackTrace();
//        }


//        Author author = authorOptional.orElseGet(() -> new Author(2L,"三更",15,"一个从菜刀中明悟哲理的祖安人",null));
//        System.out.println(author.getName());

//        authorOptional.ifPresent(author -> System.out.println(author.getName()));

//        Author author = getAuthor();
//        Optional<Author> authorOptional = Optional.of(author);
//        authorOptional.ifPresent(author1 -> System.out.println(author.getName()));
    }

    private static void testMap() {
        Optional<Author> authorOptional = getAuthorOptional();
        Optional<List<Book>> optionalBooks = authorOptional.map(author -> author.getBooks());
        optionalBooks.ifPresent(books -> System.out.println(books));
    }

    private static void testIsPresent() {
        Optional<Author> authorOptional = getAuthorOptional();
        if (authorOptional.isPresent()) {
            System.out.println(authorOptional.get().getName());
            System.out.println(authorOptional.get().getAge());
            System.out.println(authorOptional.get().getAge());
        }
    }

    private static void testFilter() {
        Optional<Author> authorOptional = getAuthorOptional();
        authorOptional.filter(author -> author.getAge() > 88).ifPresent(author -> System.out.println(author.getName()));

    }

    public static Optional<Author> getAuthorOptional(){
        Author author = new Author(1L,"蒙多",33,"一个从菜刀中明悟哲理的祖安人",null);
        //书籍列表
        List<Book> books1 = new ArrayList<>();
        books1.add(new Book(1L,"刀的两侧是光明与黑暗","哲学,爱情",88,"用一把刀划分了爱恨"));
        books1.add(new Book(2L,"一个人不能死在同一把刀下","个人成长,爱情",99,"讲述如何从失败中明悟真理"));
        author.setBooks(books1);
        return Optional.ofNullable(author);
    }


    public static Author getAuthor(){
        Author author = new Author(1L,"蒙多",33,"一个从菜刀中明悟哲理的祖安人",null);
        return author;
    }
}
