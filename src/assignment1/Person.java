
package assignment1;

import java.time.LocalDate;
import java.time.Period;

/**
 *
 * @author Nick
 */
public class Person {
    private String firstName, lastName, streetAddress, city, province, postalCode;
    private LocalDate birthday;
    
    public Person(String fName, String lName, String streetAddress, String city, String province, String postalCode, LocalDate birthday)
    {
        firstName = fName;
        lastName = lName;
        this.streetAddress = streetAddress;
        this.city = city;
        this.province = province;
        this.birthday = birthday;
        
    }
    /**
     * This method checks to see if the postal code is 6 characters long and
     * if not it throws an error
     * @param postalCode 
     */
    public void setPostalCode(String postalCode)
    {
        if(postalCode.length() > 6 || postalCode.length() < 0)
            this.postalCode = postalCode;
        else
            throw new IllegalArgumentException("Postal code must be 6 characters long");
    }

    /**
     * This method returns the street, city and province as a full address
     * @param streetAddress
     * @param city
     * @param province
     * @return 
     */
    public String getFullAddress(String streetAddress, String city, String province)
    {
        String fullAddress = streetAddress + " " + city + " " + province;
        return fullAddress;
    }
    public int getAge(LocalDate birthday)
    {
        LocalDate today = LocalDate.now();
        int age = Period.between(birthday, today).getYears();
        return age;
    }
    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getStreetAddress() {
        return streetAddress;
    }

    public String getCity() {
        return city;
    }

    public String getProvince() {
        return province;
    }

    public String getPostalCode() {
        return postalCode;
    }

    public LocalDate getBirthday() {
        return birthday;
    }
    
}
