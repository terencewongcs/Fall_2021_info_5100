package edu.northeastern.yanxuan;

public class Reference extends  Book implements iBorrowable {
    int borrowDay = 0;
    int returnDay = 0;
    String category;

    public Reference(String title, double price, String publishYear,String category) {
        super(title, price, publishYear);
        this.category=category;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    @Override
    public String description() {
        return this.title+" all information is real.";
    }

    @Override
    public void setBorrowDate(int day) {
        this.borrowDay=day;
    }

    @Override
    public void setReturnDate(int day) {
        this.returnDay=day;
    }

    @Override
    public boolean isAvailable(int day) {
        if(day>=this.borrowDay&&day<=this.returnDay){
            return true;
        }
        else return false;
    }
}
