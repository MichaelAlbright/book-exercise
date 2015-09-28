/**
 * A class that maintains information on a book.
 * This might form part of a larger application such
 * as a library system, for instance.
 *
 * @author (Insert your name here.)
 * @version (Insert today's date here.)
 */
class Book
{
    // The fields.
    private String author;
    private String title;
    private int pages;
    private String refNumber;

    /**
     * Set the author and title fields when this object
     * is constructed.
     */
   public Book(String bookAuthor, String bookTitle)
    {
        author = bookAuthor;
        title = bookTitle;
    }
    
   public void setRefNumber(String ref)
    {
       refNumber = ref;
    }

   public String getAuthor()
    {
       return author;
    }
    
   public String getTitle()
    {
       return title;
    }
    
   public int getPages()
    {
       return pages;
    }
    
   public String getRefNumber()
    {
       return refNumber;
    } 
    
   public void printAuthor()
    {
        System.out.println(author);
    }
    
   public void printTitle()
    {
        System.out.println(title);
    }
    
   public void printDetails()
    {
        System.out.println("Title: " + title + ", Author: " + author + ", Pages: " + pages);
    }
}
