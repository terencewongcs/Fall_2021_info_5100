package edu.northeastern.yanxuan;

public interface ISubscriber {
    void getGrades(Publisher publisher,String classname, String message);
    void subscribe();
}
