// IBookManager.aidl
package com.example.aidlapplication;

// Declare any non-default types here with import statements
import com.example.aidlapplication.Book;
interface IBookManager {
   List<Book> getBookList();
void addBook(in Book book);
}
