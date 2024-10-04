class Book{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Title of book: ");
        String name = sc.nextLine();

        System.out.print("Author of book: ");
        String author = sc.nextLine();

        System.out.println("Book Details:");
        System.out.println("Title: " + name);
        System.out.println("Author: " + author);
    }
}