package edu.northeastern.yanxuan;

public class NonFiction extends  Book implements iBorrowable{
    int borrowDay = 0;
    int returnDay = 0;
    public NonFiction(String title, double price, String publishYear) {
        super(title, price, publishYear);
    }

    @Override
    public String description() {
        return this.title+"all events are true and based on real facts";
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
