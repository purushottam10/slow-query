package com.ap.slowquery.sro;

import com.ap.slowquery.entity.Book;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@Data
public class BookSro {
    private Integer id;
    private String name;
    private Double price;
    private DemoUserSro demoUser;

    public BookSro(Book book) {
        id=book.getId();
        name=book.getName();
        price=book.getPrice();
       try{
           Thread.sleep(5000);
       }catch (Exception ex){

       }
        demoUser=book.getDemoUser()==null?null:new DemoUserSro(book.getDemoUser());
      //  System.out.println(book.getDemoUser()==null?null:book.getDemoUser().getId());
        //demoUser=book.getDemoUser();
    }
}
