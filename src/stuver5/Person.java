package stuver5;

import java.text.SimpleDateFormat;
import java.util.Date;

public abstract class Person implements IPerson {
    private String id;
    private String fullName;
    private Date dateOfBirth;
    private Date bookBorrowDate;
    private Date bookReturnDate;

    public Person(String id, String fullName, Date dateOfBirth, Date bookBorrowDate, Date bookReturnDate) {
        this.id = id;
        this.fullName = fullName;
        this.dateOfBirth = dateOfBirth;
        this.bookBorrowDate = bookBorrowDate;
        this.bookReturnDate = bookReturnDate;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }
    
    public Date getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(Date dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    // Formatting DateOfBirth as dd/MM/yyyy
    public String getFormattedDateOfBirth() {
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
        return dateFormat.format(dateOfBirth);
    }

    public boolean isBookOverdue() {
        long diffInMillies = Math.abs(bookReturnDate.getTime() - bookBorrowDate.getTime());
        long diffInDays = diffInMillies / (1000 * 60 * 60 * 24);        //Chuyển đổi từ mili giây sang ngày
        return diffInDays >= 30;
    }

    @Override
    public abstract void addPerson();
    @Override
    public abstract void updatePerson(String id);
    @Override
    public abstract void displayInfo();
}
