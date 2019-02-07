/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercises;

/**
 *
 * @author johnp
 */
public class ClassesEx3 {
    public static void main(String [] args){
        Author author = new Author();
        author.setName("John");
        author.setGender('M');
        author.setEmail("johnprok@hotmail.com");
        Book book = new Book();
        book.setName("Java for Beginners");
        book.setPrize(10.5);
        book.setQty(2);
        book.setAuthor(author);
        System.out.println(book);
    }
    
}
