package abc;

/*
 * Class: CMSC203 
 * Instructor:
 * Description: This program creates a Procedure class, objects, and methods
 * Due: 10/04/2024
 * Platform/compiler: Eclipse IDE, Command line
 * I pledge that I have completed the programming 
 * assignment independently. I have not copied the code 
 * from a student or any source. I have not given my code 
 * to any student.
   Print your Name here: _Gabriel Brock__
*/
class Procedure {
private String procedureName;
private String procedureDate;
private String practitionerName;
private double procedureCharges;

/*Three types of constructors
 *No-arg constructor
 **/
public Procedure() {
}

/* 
 * Parametrized constructor for name and date
 */
public Procedure(String procedureName, String procedureDate) {
this.procedureName = procedureName;
this.procedureDate = procedureDate;
}

/*
 * Parametrized constructor for all attributes
 */
public Procedure(String procedureName, String procedureDate, String practitionerName, double procedureCharges) {
this.procedureName = procedureName;
this.procedureDate = procedureDate;
this.practitionerName = practitionerName;
this.procedureCharges = procedureCharges;
}

// Accessors
/* 
 * Accessor Method to get procedure name
 */
public String getProcedureName() {
return procedureName;
}
/* 
 * Accessor Method to get procedure date
 */
public String getProcedureDate() {
return procedureDate;
}
/* 
 * Accessor Method to get practitioner name
 */
public String getPractitionerName() {
return practitionerName;
}
/* 
 * Accessor Method to get procedure charges
 */
public double getProcedureCharges() {
return procedureCharges;
}

// Mutators (setters)
/* 
 * Accessor Method to set procedure charges
 */
public void setProcedureName(String procedureName) {
this.procedureName = procedureName;
}
/* 
 * Accessor Method to set procedure date
 */
public void setProcedureDate(String procedureDate) {
this.procedureDate = procedureDate;
}
/* 
 * Accessor Method to set practitioner name
 */
public void setPractitionerName(String practitionerName) {
this.practitionerName = practitionerName;
}
/* 
 * Accessor Method to set practitioner charges
 */
public void setProcedureCharges(double procedureCharges) {
this.procedureCharges = procedureCharges;
}

// toString method to display procedure information
@Override
public String toString() {
return 
"\tProcedure Name: " + procedureName + "\n" +
"\tProcedure Date: " + procedureDate + "\n" +
"\tPractitioner Name: " + practitionerName + "\n" +
"\tProcedure Charges: $" + String.format("%.2f", procedureCharges);
}
}