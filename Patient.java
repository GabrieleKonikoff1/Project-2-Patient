package abc;

/*
 * Class: CMSC203 
 * Instructor:
 * Description: This program creates a Patient class, objects, and methods
 * Due: 10/04/2024
 * Platform/compiler: Eclipse IDE, Command line
 * I pledge that I have completed the programming 
 * assignment independently. I have not copied the code 
 * from a student or any source. I have not given my code 
 * to any student.
   Print your Name here: _Gabriel Brock__
*/


// Create Patient class 
class Patient {
private String firstName;
private String middleName;
private String lastName;
private String streetAddress;
private String city;
private String state;
private String zipCode;
private String phoneNumber;
private String emergencyContactName;
private String emergencyContactPhone;

/*Three types of constructors
 *No-arg constructor
 **/
public Patient() {
	this.firstName = "Unknown";
    this.middleName = "Unknown";
    this.lastName = "Unknown";
    this.city = "Unknown";
    this.zipCode = "00000";	
}

/* 
 * Parametrized constructor for first, middle, and last name
 */
public Patient(String firstName, String middleName, String lastName) {
this.firstName = firstName;
this.middleName = middleName;
this.lastName = lastName;
}

/* 
 * Parametrized constructor for all attributes
 */
public Patient(String firstName, String middleName, String lastName,
String streetAddress, String city, String state, String zipCode,
String phoneNumber, String emergencyContactName, String emergencyContactPhone) {
this.firstName = firstName;
this.middleName = middleName;
this.lastName = lastName;
this.streetAddress = streetAddress;
this.city = city;
this.state = state;
this.zipCode = zipCode;
this.phoneNumber = phoneNumber;
this.emergencyContactName = emergencyContactName;
this.emergencyContactPhone = emergencyContactPhone;
}


/* 
 * Accessor Method to get first name
 */
public String getFirstName() {
return firstName;
}

/* 
 * Accessor Method to get middle name
 */
public String getMiddleName() {
return middleName;
}

/* 
 * Accessor Method to get last name
 */
public String getLastName() {
return lastName;
}

/* 
 * Accessor Method to get street address
 */
public String getStreetAddress() {
return streetAddress;
}

/* 
 * Accessor Method to get city
 */
public String getCity() {
return city;
}

/* 
 * Accessor Method to get state
 */
public String getState() {
return state;
}

/* 
 * Accessor Method to get zip code
 */
public String getZipCode() {
return zipCode;
}

/* 
 * Accessor Method to get phoneNumber
 */
public String getPhoneNumber() {
return phoneNumber;
}
/* 
 * Accessor Method to get emergency contact name
 */
public String getEmergencyContactName() {
return emergencyContactName;
}
/* 
 * Accessor Method to get emergency contact phone number
 */
public String getEmergencyContactPhone() {
return emergencyContactPhone;
}

// Mutators (setters)
/* 
 * Mutator Method to set first name
 */
public void setFirstName(String firstName) {
this.firstName = firstName;
}
/* 
 * Mutator Method to set middle name
 */
public void setMiddleName(String middleName) {
this.middleName = middleName;
}
/* 
 * Mutator Method to set last name
 */
public void setLastName(String lastName) {
this.lastName = lastName;
}
/* 
 * Mutator Method to set street address
 */
public void setStreetAddress(String streetAddress) {
this.streetAddress = streetAddress;
}
/* 
 * Mutator Method to set city
 */
public void setCity(String city) {
this.city = city;
}
/* 
 * Mutator Method to set state
 */
public void setState(String state) {
this.state = state;
}
/* 
 * Mutator Method to set zip code
 */
public void setZipCode(String zipCode) {
this.zipCode = zipCode;
}
/* 
 * Mutator Method to set phone number
 */
public void setPhoneNumber(String phoneNumber) {
this.phoneNumber = phoneNumber;
}
/* 
 * Mutator Method to set emergency contact name
 */
public void setEmergencyContactName(String emergencyContactName) {
this.emergencyContactName = emergencyContactName;
}
/* 
 * Mutator Method to set emergency phone
 */
public void setEmergencyContactPhone(String emergencyContactPhone) {
this.emergencyContactPhone = emergencyContactPhone;
}

/* Method to build full name
 * This method concatenates full name * 
 */
public String buildFullName() {
return firstName + " " + middleName + " " + lastName;
}

/* Method to build address
 * This method concatenates street, city, state, zip code 
 */
public String buildAddress() {
return streetAddress + " " + city + " " + state + " " + zipCode;
}

/* Method to build emergency contact
 * This method concatenates emergency contact info
 */
public String buildEmergencyContact() {
return emergencyContactName + " " + emergencyContactPhone;
}

/* toString method to display patient information
 * This method prints out the string: full name, address, and emergency contact
 */
@Override
public String toString() {
return "Patient Information:\n" +
"  Full Name: " + buildFullName() + "\n" +
"  Address: " + buildAddress() + "\n" +
"  Phone Number: " + phoneNumber + "\n" +
"  Emergency Contact: " + buildEmergencyContact();
}
}