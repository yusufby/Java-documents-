package day02datatypes;

public class String {

    /*Strings
A String is an object and it's a sequence of characters.
But much like the wrapper classes,
the String class provides a lot of helpful methods for dealing with them.*/


    //get the very first element of the String, you can do a charAt(0).
    /*There's also this one, contains(), which is really useful.
     This will allow you to see if a String contains a certain sequence of characters.
     equals() we've used before, as well as equalsIgnoresCase().*/


    //endsWith is a good one if you want to know if something is at the end of a String. There's also startsWith().

    //And then this format() one we've talked about a little bit in previous chapters,
    // where you can use placeholders and then add items back into the String.
    //There's indexOf() where you can pass in some substring of the String and it'll tell you what position it is within the String.

    /*isEmpty() can be used if you want to know if this String has data in it or not.*/

    //length() lets us know how many characters are in the String and we can use this just like we use on the arrays.

    /*There's also this matches() one where you can pass in a regular expression and see
     if the String matches that regular expression.*/

    /*replace() and replaceAll() are useful if there's something within a String that you want to change
    to something else. You can use these replace methods.

        split() is also a good one where you have a String and you want to divide it by some delimiter.

        Here's substring() where you can get part of the String — you can give it a beginning and ending index,
        and just get that portion of the String.

        There's a toLowerCase() which is really useful and toUpperCase() as well.

        trim() is used to get off the white spaces at the beginning or the end of a String.

        valueOf() lets you pass in any data type and get the String value of it.*/
}
