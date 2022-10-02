class Print{
    public String delimiter;
    public void a() {
        System.out.println(this.delimiter);
        System.out.println("a");
        System.out.println("a");
    }
    public void b() {
        System.out.println(this.delimiter);
        System.out.println("b");
        System.out.println("b");
         
    }
    public static void c(String delimiter) {
        System.out.println(delimiter);
        System.out.println("b");
        System.out.println("b");
    }
}