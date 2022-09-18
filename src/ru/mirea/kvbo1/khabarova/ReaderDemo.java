package ru.mirea.kvbo1.khabarova;

public class ReaderDemo {
    public static void main(String[] args) {
        Reader reader1 = new Reader("Петров В.В.", 1, "", "21.10.1999", "+89173021415");
        Reader reader2 = new Reader("Хабарова А.В.", 2, "", "25.10.2003", "+89176762380");
        Reader reader3 = new Reader("Клепикова С.Д.", 3, "", "05.02.2003", "+89785461325");
        Reader[] readers = {reader1, reader2, reader3};

        Book book1 = new Book("Мёртвые души", "Н.В. Гоголь");
        Book book2 = new Book("Гордость и предубеждение", "Джейн Остен");
        Book book3 = new Book("12 стульев", "Ильф и Петров");
        Book[] books = {book1, book2, book3};

        printReaders(readers);
        printBooks(books);

        reader1.takeBook(5);
        reader2.takeBook("Бедная Лиза, Карамзин", "Эмма, Джейн Остен");
        reader3.takeBook(book1, book2,book3);

        reader1.returnBook(1);
        reader2.returnBook("Эмма, Джейн Остен");
        reader3.returnBook(book3);
    }

    private static void printBooks(Book[] books) {
        System.out.println("Список книг:");
        for (Book book : books) {
            System.out.println(book.getInfo());
        }
        System.out.println();
    }

    private static void printReaders(Reader[] readers) {
        System.out.println("Список читателей:");
        for (Reader reader : readers) {
            System.out.println( reader.getInfo());
        }
        System.out.println();
    }
}
