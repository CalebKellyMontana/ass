import java.util.*;
class Book {
int id;
String name,author,publisher;
int quantity;
public Book(int id, String name, String author, String publisher, int quantity) {
	this.id = id;
	this.name = name;
	this.author = author;
	this.publisher = publisher;
	this.quantity = quantity;
}
}
class ArrayListExample20 {
public static void main(String[] args) {
	//Creating list of Books
	ArrayList<Book> list=new ArrayList<Book>();
	//Creating Books
	Book b1=new Book(101,"java","clement","tumba",8);
	Book b2=new Book(102,"netwk","shobi","kgl",4);
	Book b3=new Book(103,"mobile","gaby","bulinga",6);
	//Adding Books to list
	list.add(b1);
	list.add(b2);
	list.add(b3);
	list.remove(0);

	//Traversing list

	System.out.println("ID\tNAME\tAUTHOR\tPUBLISHER QUANTITY");
	System.out.println("======================================================");

	for(Book b:list){
		System.out.println(b.id+"\t"+b.name+"\t"+b.author+"\t"+b.publisher+"\t\t"+b.quantity);
	}

}
}
