public class book {
    private String name, isbn, category, publisher, totalpages;
    private int price;

    public book(String name1, String isbn1, String category1, String publisher1, String totalpages1, int price1) {
        name = name1;
        isbn = isbn1;
        category = category1;
        publisher = publisher1;
        totalpages = totalpages1;
        price = price1;
    }

    public void setName(String name) {this.name = name;}
    public void setIsbn(String isbn) {this.isbn = isbn;}
    public void setPrice(int price) {this.price = price;}
    public void setCategory(String category) {this.category = category;}
    public void setPublisher(String publisher) {this.publisher = publisher;}
    public void setTotalpages(String totalpages) {this.totalpages = totalpages;}

    public String getName() {return name;}
    public String getIsbn() {return isbn;}
    public int getPrice() {return price;}
    public String getCategory() {return category;}
    public String getPublisher() {return publisher;}
    public String getTotalpages() {return totalpages;}

    public void showInfo () {
        System.out.println("----------------------------------------------------------------------------------");
        System.out.println(getName()+","+getPublisher()+",(ISBN:"+getIsbn()+",$"+getPrice()+")");
        System.out.println("----------------------------------------------------------------------------------");
    }
}
