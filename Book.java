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
    private int borrowed;
    private boolean courseText;

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
       if(refNumber.length() >= 3)
        {
            refNumber = ref;
        }
        else
        {
            System.out.println("Error: refNumber must be at least 3 characters long");
        }
    }
    
   public void setBorrowed (int borrow)
    {
        borrowed = borrow + 1;
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
    
   public int getBorrowed()
    {
       return borrowed;
    } 
    
   public boolean isCourseText()
    {
       return courseText;
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
        if(refNumber.length() > 0)
        {
            System.out.println("Title: " + title + ", Author: " + author + ", Pages: " + pages + ", Reference Number: " + refNumber + ", Times Book Was Borrowed: " + borrowed);
        }
        else
        {
            System.out.println("Title: " + title + ", Author: " + author + ", Pages: " + pages + ", Reference Number: ZZZ" + ", Times Book Was Borrowed: " + borrowed);
        }
    }
}
