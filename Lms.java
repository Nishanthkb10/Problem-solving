import java.util.*;
class Book{
    String name;
    int id;
    Book(String name,int id){
        this.name=name;
        this.id=id;
    }
}

class Library{
    ArrayList<Book> books;
    ArrayList<Member> mem;
    Library(){
        books=new ArrayList<>();
        mem=new ArrayList<>();
    }
    void add(String name,int id){
        books.add(new Book(name,id));
        System.out.println("Book "+name+" "+id+" added");
    }
    Book Track_avail(int id){
        for(Book x:books){
            if(id==x.id)
            return x;
        }
        return null;
    }
    void display(){
        System.out.println("Books Available are: ");
        for(Book x:books){
            System.out.println("Book "+x.id+" "+x.name);
        }
    }
    Member addMem(String name){
        Member n=new Member(name);
        mem.add(n);
        return n;
    }
}

class Member{
    ArrayList<Book>borrow;
    String name;
    Member(String name){
        this.name=name;
        borrow=new ArrayList<>();
    }
    public void borrow(Library lib,int id){
        Book x=lib.Track_avail(id);
        if(x!=null){
            lib.books.remove(x);
            borrow.add(x);
            System.out.print("Book Borrowed ");
        }
        else{
            System.out.println("Book not available");
        }
    }
    void Borrowed_Books(){
        for(Book x:borrow){
            System.out.println(x.name+" "+x.id);
        }
    }
    public void Book_return(Library lib,int id){
        for(Book x:borrow){
            if(x.id==id){
                borrow.remove(x);
                lib.books.add(x);
                break;
            }
        }
    }
}
public class Lms{
    public static void main(String args[]){
        Library lib=new Library();
        lib.add("MATH",1);
        lib.add("Sci",2);
        lib.add("phy",3);
        lib.add("eng",4);
        lib.add("soc",5);
        lib.display();
        Member mem=lib.addMem("Nish");
        mem.borrow(lib,3);
        mem.Borrowed_Books();
        lib.display();
        mem.Book_return(lib,3);
        lib.display();
    }
}
