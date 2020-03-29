package lession15;


public class TestBook {
    public static void main(String[] args) {
        Author codelean = new Author("Code Lean", "codeleanvn@mail.com", "f");
        System.out.println(codelean);

        Book dummyBook = new Book("Java for dummies",codelean,19.95,99);
        System.out.println(dummyBook);

        dummyBook.setPrice(29.95);
        dummyBook.setQty(28);
        System.out.println("name is: " + dummyBook.getName());
        System.out.println("price is : " + dummyBook.getPrice());
        System.out.println("qty is: "+ dummyBook.getQty());

        System.out.println("author is: " + dummyBook.getAuthor());
        System.out.println(" author's name is: " + dummyBook.getAuthor().getName() );
        System.out.println(" author's email is: " + dummyBook.getAuthor().getEmail() );
        System.out.println(" author's gender is: " + dummyBook.getAuthor().getGender() );
        Book anotherBook = new Book("more Java",
                new Author("Dang Kim Thi ","dangkimthi@gmail.com", "f") ,29.95);
        System.out.println( anotherBook);

    }
}
