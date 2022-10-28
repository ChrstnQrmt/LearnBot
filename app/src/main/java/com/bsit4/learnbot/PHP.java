package com.bsit4.learnbot;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;

import java.util.ArrayList;

public class PHP extends AppCompatActivity {

    ArrayList<ModelClass> arrayList;
    RecyclerView recyclerView;
    Adapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_php);
        getSupportActionBar().setBackgroundDrawable(new ColorDrawable(getResources().getColor(R.color.teal_700)));
        recyclerView = findViewById(R.id.recycler_view);
        arrayList = new ArrayList<>();


        arrayList.add(new ModelClass("Introduction",
                "\uD835\uDDEA\uD835\uDDF5\uD835\uDDEE\uD835\uDE01 \uD835\uDDF6\uD835\uDE00 \uD835\uDDE3\uD835\uDDDB\uD835\uDDE3?" +
                        "\n•PHP is a server side scripting language. that is used to develop Static websites or Dynamic websites or Web applications. " +
                        "\n•PHP stands for Hypertext Pre-processor, that earlier stood for Personal Home Pages." +
                        "\n•PHP scripts can only be interpreted on a server that has PHP installed." +
                        "\n•The client computers accessing the PHP scripts require a web browser only." +
                        "\n•A PHP file contains PHP tags and ends with the extension “.php”." +
                        "\n" +

                        "\n\uD835\uDDEA\uD835\uDDF5\uD835\uDDEE\uD835\uDE01 \uD835\uDDF1\uD835\uDDFC\uD835\uDDF2\uD835\uDE00 \uD835\uDDE3\uD835\uDDDB\uD835\uDDE3 \uD835\uDE00\uD835\uDE01\uD835\uDDEE\uD835\uDDFB\uD835\uDDF1 \uD835\uDDF3\uD835\uDDFC\uD835\uDDFF?" +
                        "\n•PHP means – \uD835\uDC77\uD835\uDC86\uD835\uDC93\uD835\uDC94\uD835\uDC90\uD835\uDC8F\uD835\uDC82\uD835\uDC8D \uD835\uDC6F\uD835\uDC90\uD835\uDC8E\uD835\uDC86 \uD835\uDC77\uD835\uDC82\uD835\uDC88\uD835\uDC86, but it now stands for the recursive backronym PHP: Hypertext Preprocessor." +
                        "\n•PHP code may be embedded into HTML code, or it can be used in combination with various web template systems, web content management system and web frameworks." +
                        "\n" +
                        "\nPHP Syntax" +
                        "\n\t<?\uD835\uDE99\uD835\uDE91\uD835\uDE99\n" +
                        "\t\uD835\uDE8E\uD835\uDE8C\uD835\uDE91\uD835\uDE98 ‘\uD835\uDE77\uD835\uDE8E\uD835\uDE95\uD835\uDE95\uD835\uDE98 \uD835\uDE86\uD835\uDE98\uD835\uDE9B\uD835\uDE95\uD835\uDE8D’ ;\n" +
                        "?>" +
                        "\n" +

                        "\nA PHP file can also contain tags such as HTML and client side scripts such as JavaScript." +
                        "\n•\uD835\uDC07\uD835\uDC13\uD835\uDC0C\uD835\uDC0B \uD835\uDC22\uD835\uDC2C \uD835\uDC1A\uD835\uDC27 \uD835\uDC1A\uD835\uDC1D\uD835\uDC1D\uD835\uDC1E\uD835\uDC1D \uD835\uDC1A\uD835\uDC1D\uD835\uDC2F\uD835\uDC1A\uD835\uDC27\uD835\uDC2D\uD835\uDC1A\uD835\uDC20\uD835\uDC1E when learning PHP Language. You can even learn PHP without knowing HTML but it’s recommended you at least know the basics of HTML." +
                        "\n•\uD835\uDC03\uD835\uDC1A\uD835\uDC2D\uD835\uDC1A\uD835\uDC1B\uD835\uDC1A\uD835\uDC2C\uD835\uDC1E \uD835\uDC26\uD835\uDC1A\uD835\uDC27\uD835\uDC1A\uD835\uDC20\uD835\uDC1E\uD835\uDC26\uD835\uDC1E\uD835\uDC27\uD835\uDC2D \uD835\uDC2C\uD835\uDC32\uD835\uDC2C\uD835\uDC2D\uD835\uDC1E\uD835\uDC26\uD835\uDC2C DBMS for database powered applications." +
                        "\n•For more advanced topics such as interactive applications and web services, you will need \uD835\uDC09\uD835\uDC1A\uD835\uDC2F\uD835\uDC1A\uD835\uDC12\uD835\uDC1C\uD835\uDC2B\uD835\uDC22\uD835\uDC29\uD835\uDC2D \uD835\uDC1A\uD835\uDC27\uD835\uDC1D \uD835\uDC17\uD835\uDC0C\uD835\uDC0B." +
                        "\n" +

                        "\n\uD835\uDDEA\uD835\uDDF5\uD835\uDE06 \uD835\uDE02\uD835\uDE00\uD835\uDDF2 \uD835\uDDE3\uD835\uDDDB\uD835\uDDE3?" +
                        "\n•PHP is open source and free." +
                        "\n•Short learning curve compared to other languages such as JSP, ASP etc." +
                        "\n•Large community document" +
                        "\n•Most web hosting servers support PHP by default unlike other languages such as ASP that need IIS. This makes PHP a cost effective choice." +
                        "\n•PHP is regular updated to keep abreast with the latest technology trends." +
                        "\n•Other benefit that you get with PHP is that it’s a \uD835\uDC94\uD835\uDC86\uD835\uDC93\uD835\uDC97\uD835\uDC86\uD835\uDC93 \uD835\uDC94\uD835\uDC8A\uD835\uDC85\uD835\uDC86 \uD835\uDC94\uD835\uDC84\uD835\uDC93\uD835\uDC8A\uD835\uDC91\uD835\uDC95\uD835\uDC8A\uD835\uDC8F\uD835\uDC88 \uD835\uDC8D\uD835\uDC82\uD835\uDC8F\uD835\uDC88\uD835\uDC96\uD835\uDC82\uD835\uDC88\uD835\uDC86; this means you only need to install it on the server and client computers requesting for resources from the server do not need to have PHP installed; only a web browser would be enough." +
                        "\n•PHP has in built support for working hand in hand with MySQL; this doesn’t mean you can’t use PHP with other database management systems. You can still use PHP with" +
                        "\n\t - Postgres" +
                        "\n\t - Oracle" +
                        "\n\t - MS SQL Server" +
                        "\n\t - ODBC etc." +
                        "\n•PHP is \uD835\uDC84\uD835\uDC93\uD835\uDC90\uD835\uDC94\uD835\uDC94 \uD835\uDC91\uD835\uDC8D\uD835\uDC82\uD835\uDC95\uD835\uDC87\uD835\uDC90\uD835\uDC93\uD835\uDC8E; this means you can deploy your application on a number of different operating systems such as windows, Linux, Mac OS etc." +
                        "\n" +

                        "\n\uD835\uDDE3\uD835\uDDDB\uD835\uDDE3 \uD835\uDDD9\uD835\uDDF6\uD835\uDDF9\uD835\uDDF2 \uD835\uDDD8\uD835\uDE05\uD835\uDE01\uD835\uDDF2\uD835\uDDFB\uD835\uDE00\uD835\uDDF6\uD835\uDDFC\uD835\uDDFB\uD835\uDE00" +
                        "\nFile extension and Tags In order for the server to identify our PHP files and scripts, we must save the file with the “.php” extension. Older PHP file extensions include\n" +
                        "\n\t•.phtml" +
                        "\n\t•.php3" +
                        "\n\t•.php4" +
                        "\n\t•.php5" +
                        "\n\t•.phps" +
                        "\n" +

                        "\n\uD835\uDDE3\uD835\uDDDB\uD835\uDDE3 \uD835\uDDDB\uD835\uDDF2\uD835\uDDF9\uD835\uDDF9\uD835\uDDFC \uD835\uDE04\uD835\uDDFC\uD835\uDDFF\uD835\uDDF9\uD835\uDDF1" +
                        "\nThe program shown below is a basic PHP application that outputs the words “Hello World!” When viewed in a web browser." +
                        "\n<?\uD835\uDE99\uD835\uDE91\uD835\uDE99\n" +
                        "       \uD835\uDE8E\uD835\uDE8C\uD835\uDE91\uD835\uDE98 \"\uD835\uDE77\uD835\uDE8E\uD835\uDE95\uD835\uDE95\uD835\uDE98 \uD835\uDEA0\uD835\uDE98\uD835\uDE9B\uD835\uDE95\uD835\uDE8D\";\n" +
                        "?>" +
                        "\nOutput:" +
                        "\n\uD835\uDE77\uD835\uDE8E\uD835\uDE95\uD835\uDE95\uD835\uDE98 \uD835\uDEA0\uD835\uDE98\uD835\uDE9B\uD835\uDE95\uD835\uDE8D" +
                        "\n"


                , false));

        arrayList.add(new ModelClass("Data Types, Variables, Constant",
                "\uD835\uDDE3\uD835\uDDDB\uD835\uDDE3 \uD835\uDDD7\uD835\uDDEE\uD835\uDE01\uD835\uDDEE \uD835\uDDE7\uD835\uDE06\uD835\uDDFD\uD835\uDDF2\uD835\uDE00" +
                        "\nA Data type is the classification of data into a category according to its attributes;" +
                        "\n\t•Alphanumeric characters are classified as strings" +
                        "\n\t•Whole numbers are classified integers" +
                        "\n\t•Numbers with decimal points are classified as floating points." +
                        "\n\t•True or false values are classified as Boolean." +
                        "\n" +
                        "\nPHP is a loosely typed language; it does not have explicit defined data types. " +
                        "\nPHP determines the data types by analyzing the attributes of data supplied." +
                        "\n" +

                        "\nPHP implicitly supports the following data types:" +

                        "\n\uD835\uDFED. \uD835\uDDE3\uD835\uDDDB\uD835\uDDE3 \uD835\uDDE6\uD835\uDE01\uD835\uDDFF\uD835\uDDF6\uD835\uDDFB\uD835\uDDF4" +
                        "\n - A string is a sequence of characters, like \"Hello world!\"." +
                        "\n - A string can be any text inside quotes. You can use single or double quotes:" +
                        "\nExample:" +
                        "\n<?\uD835\uDE99\uD835\uDE91\uD835\uDE99\n" +
                        "$\uD835\uDEA1 = \"\uD835\uDE77\uD835\uDE8E\uD835\uDE95\uD835\uDE95\uD835\uDE98 \uD835\uDEA0\uD835\uDE98\uD835\uDE9B\uD835\uDE95\uD835\uDE8D!\";\n" +
                        "$\uD835\uDEA2 = '\uD835\uDE77\uD835\uDE8E\uD835\uDE95\uD835\uDE95\uD835\uDE98 \uD835\uDEA0\uD835\uDE98\uD835\uDE9B\uD835\uDE95\uD835\uDE8D!';\n" +
                        "\n" +
                        "\uD835\uDE8E\uD835\uDE8C\uD835\uDE91\uD835\uDE98 $\uD835\uDEA1;\n" +
                        "\uD835\uDE8E\uD835\uDE8C\uD835\uDE91\uD835\uDE98 \"<\uD835\uDE8B\uD835\uDE9B>\";\n" +
                        "\uD835\uDE8E\uD835\uDE8C\uD835\uDE91\uD835\uDE98 $\uD835\uDEA2;\n" +
                        "?>" +
                        "\n" +

                        "\n\uD835\uDFEE. \uD835\uDDE3\uD835\uDDDB\uD835\uDDE3 \uD835\uDDDC\uD835\uDDFB\uD835\uDE01\uD835\uDDF2\uD835\uDDF4\uD835\uDDF2\uD835\uDDFF" +
                        "\n - An integer data type is a non-decimal number between -2,147,483,648 and 2,147,483,647." +
                        "\nRules for integers:" +
                        "\n•An integer must have at least one digit" +
                        "\n•An integer must not have a decimal point" +
                        "\n•An integer can be either positive or negative" +
                        "\n•Integers can be specified in: decimal (base 10), hexadecimal (base 16), octal (base 8), or binary (base 2) notation" +
                        "\nIn the following example $x is an integer. The PHP \uD835\uDE9F\uD835\uDE8A\uD835\uDE9B_\uD835\uDE8D\uD835\uDE9E\uD835\uDE96\uD835\uDE99() function returns the data type and value:" +
                        "\nExample:" +
                        "\n<?\uD835\uDE99\uD835\uDE91\uD835\uDE99\n" +
                        "$\uD835\uDEA1 = \uD835\uDFFB\uD835\uDFFF\uD835\uDFFE\uD835\uDFFB;\n" +
                        "\uD835\uDE9F\uD835\uDE8A\uD835\uDE9B_\uD835\uDE8D\uD835\uDE9E\uD835\uDE96\uD835\uDE99($\uD835\uDEA1);\n" +
                        "?>" +
                        "\n" +

                        "\n\uD835\uDFEF. \uD835\uDDE3\uD835\uDDDB\uD835\uDDE3 \uD835\uDDD9\uD835\uDDF9\uD835\uDDFC\uD835\uDDEE\uD835\uDE01" +
                        "\n - A float (floating point number) is a number with a decimal point or a number in exponential form." +
                        "\n - In the following example $x is a float. The PHP \uD835\uDE9F\uD835\uDE8A\uD835\uDE9B_\uD835\uDE8D\uD835\uDE9E\uD835\uDE96\uD835\uDE99() function returns the data type and value:" +
                        "\nExample:" +
                        "\n<?\uD835\uDE99\uD835\uDE91\uD835\uDE99\n" +
                        "$\uD835\uDEA1 = \uD835\uDFF7\uD835\uDFF6.\uD835\uDFF9\uD835\uDFFC\uD835\uDFFB;\n" +
                        "\uD835\uDE9F\uD835\uDE8A\uD835\uDE9B_\uD835\uDE8D\uD835\uDE9E\uD835\uDE96\uD835\uDE99($\uD835\uDEA1);\n" +
                        "?>" +
                        "\n" +

                        "\n\uD835\uDFF0. \uD835\uDDE3\uD835\uDDDB\uD835\uDDE3 \uD835\uDDD5\uD835\uDDFC\uD835\uDDFC\uD835\uDDF9\uD835\uDDF2\uD835\uDDEE\uD835\uDDFB" +
                        "\n - A Boolean represents two possible states: TRUE or FALSE." +
                        "\n$\uD835\uDEA1 = \uD835\uDE9D\uD835\uDE9B\uD835\uDE9E\uD835\uDE8E;" +
                        "\n$\uD835\uDEA2 = \uD835\uDE8F\uD835\uDE8A\uD835\uDE95\uD835\uDE9C\uD835\uDE8E;" +
                        "\n - Booleans are often used in conditional testing." +
                        "\n" +

                        "\n\uD835\uDFF1. \uD835\uDDE3\uD835\uDDDB\uD835\uDDE3 \uD835\uDDD4\uD835\uDDFF\uD835\uDDFF\uD835\uDDEE\uD835\uDE06" +
                        "\n - An array stores multiple values in one single variable." +
                        "\n - In the following example $cars is an array. The PHP \uD835\uDE9F\uD835\uDE8A\uD835\uDE9B_\uD835\uDE8D\uD835\uDE9E\uD835\uDE96\uD835\uDE99() function returns the data type and value:" +
                        "\nExample:" +
                        "\n<?\uD835\uDE99\uD835\uDE91\uD835\uDE99\n" +
                        "$\uD835\uDE8C\uD835\uDE8A\uD835\uDE9B\uD835\uDE9C = \uD835\uDE8A\uD835\uDE9B\uD835\uDE9B\uD835\uDE8A\uD835\uDEA2(\"\uD835\uDE85\uD835\uDE98\uD835\uDE95\uD835\uDE9F\uD835\uDE98\",\"\uD835\uDE71\uD835\uDE7C\uD835\uDE86\",\"\uD835\uDE83\uD835\uDE98\uD835\uDEA2\uD835\uDE98\uD835\uDE9D\uD835\uDE8A\");\n" +
                        "\uD835\uDE9F\uD835\uDE8A\uD835\uDE9B_\uD835\uDE8D\uD835\uDE9E\uD835\uDE96\uD835\uDE99($\uD835\uDE8C\uD835\uDE8A\uD835\uDE9B\uD835\uDE9C);\n" +
                        "?>" +
                        "\n" +

                        "\n\uD835\uDFF2. \uD835\uDDE3\uD835\uDDDB\uD835\uDDE3 \uD835\uDDE1\uD835\uDDE8\uD835\uDDDF\uD835\uDDDF \uD835\uDDE9\uD835\uDDEE\uD835\uDDF9\uD835\uDE02\uD835\uDDF2" +
                        "\nNull is a special data type which can have only one value: NULL." +
                        "\nA variable of data type NULL is a variable that has no value assigned to it." +
                        "\nTip: If a variable is created without a value, it is automatically assigned a value of NULL." +
                        "\nVariables can also be emptied by setting the value to NULL:" +
                        "\nExample:" +
                        "\n<?\uD835\uDE99\uD835\uDE91\uD835\uDE99\n" +
                        "$\uD835\uDEA1 = \"\uD835\uDE77\uD835\uDE8E\uD835\uDE95\uD835\uDE95\uD835\uDE98 \uD835\uDEA0\uD835\uDE98\uD835\uDE9B\uD835\uDE95\uD835\uDE8D!\";\n" +
                        "$\uD835\uDEA1 = \uD835\uDE97\uD835\uDE9E\uD835\uDE95\uD835\uDE95;\n" +
                        "\uD835\uDE9F\uD835\uDE8A\uD835\uDE9B_\uD835\uDE8D\uD835\uDE9E\uD835\uDE96\uD835\uDE99($\uD835\uDEA1);\n" +
                        "?>" +
                        "\n" +

                        "\n\uD835\uDDE3\uD835\uDDDB\uD835\uDDE3 \uD835\uDDE9\uD835\uDDEE\uD835\uDDFF\uD835\uDDF6\uD835\uDDEE\uD835\uDDEF\uD835\uDDF9\uD835\uDDF2\uD835\uDE00" +
                        "\n - A variable can have a short name (like x and y) or a more descriptive name (age, carname, total_volume)." +
                        "\n" +
                        "\nRules for PHP variables:" +
                        "\n" +
                        "\n•A variable starts with the $ sign, followed by the name of the variable" +
                        "\n•A variable name must start with a letter or the underscore character" +
                        "\n•A variable name cannot start with a number" +
                        "\n•A variable name can only contain alpha-numeric characters and underscores (A-z, 0-9, and _ )" +
                        "\n•Variable names are case-sensitive ($age and $AGE are two different variables)" +
                        "\n" +

                        "\n\uD835\uDDE3\uD835\uDDDB\uD835\uDDE3 \uD835\uDDD6\uD835\uDDFC\uD835\uDDFB\uD835\uDE00\uD835\uDE01\uD835\uDDEE\uD835\uDDFB\uD835\uDE01\uD835\uDE00" +
                        "\n - A constant is an identifier (name) for a simple value. The value cannot be changed during the script." +
                        "\n - A valid constant name starts with a letter or underscore (no $ sign before the constant name)." +
                        "\nNote: Unlike variables, constants are automatically global across the entire script." +
                        "\nCreate a PHP Constant" +
                        "\nTo create a constant, use the \uD835\uDE8D\uD835\uDE8E\uD835\uDE8F\uD835\uDE92\uD835\uDE97\uD835\uDE8E() function." +
                        "\nSyntax" +
                        "\n\tdefine(name, value, case-insensitive)" +
                        "\nParameters:\n" +
                        "\n•name: Specifies the name of the constant" +
                        "\n•value: Specifies the value of the constant" +
                        "\n•case-insensitive: Specifies whether the constant name should be case-insensitive. Default is false" +
                        "\nExample:" +
                        "\nCreate a constant with a \uD835\uDDF0\uD835\uDDEE\uD835\uDE00\uD835\uDDF2-\uD835\uDE00\uD835\uDDF2\uD835\uDDFB\uD835\uDE00\uD835\uDDF6\uD835\uDE01\uD835\uDDF6\uD835\uDE03\uD835\uDDF2 name:" +
                        "\n<?\uD835\uDE99\uD835\uDE91\uD835\uDE99\n" +
                        "\uD835\uDE8D\uD835\uDE8E\uD835\uDE8F\uD835\uDE92\uD835\uDE97\uD835\uDE8E(\"\uD835\uDE76\uD835\uDE81\uD835\uDE74\uD835\uDE74\uD835\uDE83\uD835\uDE78\uD835\uDE7D\uD835\uDE76\", \"\uD835\uDE86\uD835\uDE8E\uD835\uDE95\uD835\uDE8C\uD835\uDE98\uD835\uDE96\uD835\uDE8E \uD835\uDE9D\uD835\uDE98 \uD835\uDE74\uD835\uDE8A\uD835\uDE9B\uD835\uDE9D\uD835\uDE91!\");\n" +
                        "\uD835\uDE8E\uD835\uDE8C\uD835\uDE91\uD835\uDE98 \uD835\uDE76\uD835\uDE81\uD835\uDE74\uD835\uDE74\uD835\uDE83\uD835\uDE78\uD835\uDE7D\uD835\uDE76;\n" +
                        "?>" +
                        "\n" +
                        "\nExample:" +
                        "\nCreate a constant with a \uD835\uDDF0\uD835\uDDEE\uD835\uDE00\uD835\uDDF2-\uD835\uDDF6\uD835\uDDFB\uD835\uDE00\uD835\uDDF2\uD835\uDDFB\uD835\uDE00\uD835\uDDF6\uD835\uDE01\uD835\uDDF6\uD835\uDE03\uD835\uDDF2 name:" +
                        "\n<?\uD835\uDE99\uD835\uDE91\uD835\uDE99\n" +
                        "\uD835\uDE8D\uD835\uDE8E\uD835\uDE8F\uD835\uDE92\uD835\uDE97\uD835\uDE8E(\"\uD835\uDE76\uD835\uDE81\uD835\uDE74\uD835\uDE74\uD835\uDE83\uD835\uDE78\uD835\uDE7D\uD835\uDE76\", \"\uD835\uDE86\uD835\uDE8E\uD835\uDE95\uD835\uDE8C\uD835\uDE98\uD835\uDE96\uD835\uDE8E \uD835\uDE9D\uD835\uDE98 \uD835\uDE74\uD835\uDE8A\uD835\uDE9B\uD835\uDE9D\uD835\uDE91!\", \uD835\uDE9D\uD835\uDE9B\uD835\uDE9E\uD835\uDE8E);\n" +
                        "\uD835\uDE8E\uD835\uDE8C\uD835\uDE91\uD835\uDE98 \uD835\uDE90\uD835\uDE9B\uD835\uDE8E\uD835\uDE8E\uD835\uDE9D\uD835\uDE92\uD835\uDE97\uD835\uDE90;\n" +
                        "?>" +
                        "\n"

                , false));

        arrayList.add(new ModelClass("Comments",
                "\uD835\uDDD6\uD835\uDDFC\uD835\uDDFA\uD835\uDDFA\uD835\uDDF2\uD835\uDDFB\uD835\uDE01\uD835\uDE00 \uD835\uDDF6\uD835\uDDFB \uD835\uDDE3\uD835\uDDDB\uD835\uDDE3" +
                        "\n - A comment in PHP code is a line that is not executed as a part of the program.  - Its only purpose is to be read by someone who is looking at the code." +
                        "\nComments can be used to:" +
                        "\n•Let others understand your code." +
                        "\n•Remind yourself of what you did - Most programmers have experienced coming back to their own work a year or two later and having to re-figure out what they did. Comments can remind you of what you were thinking when you wrote the code." +
                        "\n" +

                        "\nPHP supports several ways of commenting:" +
                        "\n" +
                        "\nExample" +
                        "\nSyntax for single-line comments:" +
                        "\n<!\uD835\uDE73\uD835\uDE7E\uD835\uDE72\uD835\uDE83\uD835\uDE88\uD835\uDE7F\uD835\uDE74 \uD835\uDE91\uD835\uDE9D\uD835\uDE96\uD835\uDE95>\n" +
                        "<\uD835\uDE91\uD835\uDE9D\uD835\uDE96\uD835\uDE95>\n" +
                        "<\uD835\uDE8B\uD835\uDE98\uD835\uDE8D\uD835\uDEA2>\n" +
                        "\n" +
                        "<?\uD835\uDE99\uD835\uDE91\uD835\uDE99\n" +
                        "// \uD835\uDE83\uD835\uDE91\uD835\uDE92\uD835\uDE9C \uD835\uDE92\uD835\uDE9C \uD835\uDE8A \uD835\uDE9C\uD835\uDE92\uD835\uDE97\uD835\uDE90\uD835\uDE95\uD835\uDE8E-\uD835\uDE95\uD835\uDE92\uD835\uDE97\uD835\uDE8E \uD835\uDE8C\uD835\uDE98\uD835\uDE96\uD835\uDE96\uD835\uDE8E\uD835\uDE97\uD835\uDE9D\n" +
                        "\n" +
                        "# \uD835\uDE83\uD835\uDE91\uD835\uDE92\uD835\uDE9C \uD835\uDE92\uD835\uDE9C \uD835\uDE8A\uD835\uDE95\uD835\uDE9C\uD835\uDE98 \uD835\uDE8A \uD835\uDE9C\uD835\uDE92\uD835\uDE97\uD835\uDE90\uD835\uDE95\uD835\uDE8E-\uD835\uDE95\uD835\uDE92\uD835\uDE97\uD835\uDE8E \uD835\uDE8C\uD835\uDE98\uD835\uDE96\uD835\uDE96\uD835\uDE8E\uD835\uDE97\uD835\uDE9D\n" +
                        "?>\n" +
                        "\n" +
                        "</\uD835\uDE8B\uD835\uDE98\uD835\uDE8D\uD835\uDEA2>\n" +
                        "</\uD835\uDE91\uD835\uDE9D\uD835\uDE96\uD835\uDE95>" +
                        "\n" +
                        "\nExample" +
                        "\nSyntax for multiple-line comments:" +
                        "\n<!\uD835\uDE73\uD835\uDE7E\uD835\uDE72\uD835\uDE83\uD835\uDE88\uD835\uDE7F\uD835\uDE74 \uD835\uDE91\uD835\uDE9D\uD835\uDE96\uD835\uDE95>\n" +
                        "<\uD835\uDE91\uD835\uDE9D\uD835\uDE96\uD835\uDE95>\n" +
                        "<\uD835\uDE8B\uD835\uDE98\uD835\uDE8D\uD835\uDEA2>\n" +
                        "\n" +
                        "<?\uD835\uDE99\uD835\uDE91\uD835\uDE99\n" +
                        "/*\n" +
                        "\uD835\uDE83\uD835\uDE91\uD835\uDE92\uD835\uDE9C \uD835\uDE92\uD835\uDE9C \uD835\uDE8A \uD835\uDE96\uD835\uDE9E\uD835\uDE95\uD835\uDE9D\uD835\uDE92\uD835\uDE99\uD835\uDE95\uD835\uDE8E-\uD835\uDE95\uD835\uDE92\uD835\uDE97\uD835\uDE8E\uD835\uDE9C \uD835\uDE8C\uD835\uDE98\uD835\uDE96\uD835\uDE96\uD835\uDE8E\uD835\uDE97\uD835\uDE9D \uD835\uDE8B\uD835\uDE95\uD835\uDE98\uD835\uDE8C\uD835\uDE94\n" +
                        "\uD835\uDE9D\uD835\uDE91\uD835\uDE8A\uD835\uDE9D \uD835\uDE9C\uD835\uDE99\uD835\uDE8A\uD835\uDE97\uD835\uDE9C \uD835\uDE98\uD835\uDE9F\uD835\uDE8E\uD835\uDE9B \uD835\uDE96\uD835\uDE9E\uD835\uDE95\uD835\uDE9D\uD835\uDE92\uD835\uDE99\uD835\uDE95\uD835\uDE8E\n" +
                        "\uD835\uDE95\uD835\uDE92\uD835\uDE97\uD835\uDE8E\uD835\uDE9C\n" +
                        "*/\n" +
                        "?>\n" +
                        "\n" +
                        "</\uD835\uDE8B\uD835\uDE98\uD835\uDE8D\uD835\uDEA2>\n" +
                        "</\uD835\uDE91\uD835\uDE9D\uD835\uDE96\uD835\uDE95>" +
                        "\n" +

                        "\nExample" +
                        "\nUsing comments to leave out parts of the code:" +
                        "\n<!\uD835\uDE73\uD835\uDE7E\uD835\uDE72\uD835\uDE83\uD835\uDE88\uD835\uDE7F\uD835\uDE74 \uD835\uDE91\uD835\uDE9D\uD835\uDE96\uD835\uDE95>\n" +
                        "<\uD835\uDE91\uD835\uDE9D\uD835\uDE96\uD835\uDE95>\n" +
                        "<\uD835\uDE8B\uD835\uDE98\uD835\uDE8D\uD835\uDEA2>\n" +
                        "\n" +
                        "<?\uD835\uDE99\uD835\uDE91\uD835\uDE99\n" +
                        "// \uD835\uDE88\uD835\uDE98\uD835\uDE9E \uD835\uDE8C\uD835\uDE8A\uD835\uDE97 \uD835\uDE8A\uD835\uDE95\uD835\uDE9C\uD835\uDE98 \uD835\uDE9E\uD835\uDE9C\uD835\uDE8E \uD835\uDE8C\uD835\uDE98\uD835\uDE96\uD835\uDE96\uD835\uDE8E\uD835\uDE97\uD835\uDE9D\uD835\uDE9C \uD835\uDE9D\uD835\uDE98 \uD835\uDE95\uD835\uDE8E\uD835\uDE8A\uD835\uDE9F\uD835\uDE8E \uD835\uDE98\uD835\uDE9E\uD835\uDE9D \uD835\uDE99\uD835\uDE8A\uD835\uDE9B\uD835\uDE9D\uD835\uDE9C \uD835\uDE98\uD835\uDE8F \uD835\uDE8A \uD835\uDE8C\uD835\uDE98\uD835\uDE8D\uD835\uDE8E \uD835\uDE95\uD835\uDE92\uD835\uDE97\uD835\uDE8E\n" +
                        "$\uD835\uDEA1 = \uD835\uDFFB /* + \uD835\uDFF7\uD835\uDFFB */ + \uD835\uDFFB;\n" +
                        "\uD835\uDE8E\uD835\uDE8C\uD835\uDE91\uD835\uDE98 $\uD835\uDEA1;\n" +
                        "?>\n" +
                        "\n" +
                        "</\uD835\uDE8B\uD835\uDE98\uD835\uDE8D\uD835\uDEA2>\n" +
                        "</\uD835\uDE91\uD835\uDE9D\uD835\uDE96\uD835\uDE95>" +
                        "\n"

                , false));

        arrayList.add(new ModelClass("Conditional Statements",
                "\uD835\uDDE3\uD835\uDDDB\uD835\uDDE3 \uD835\uDDD6\uD835\uDDFC\uD835\uDDFB\uD835\uDDF1\uD835\uDDF6\uD835\uDE01\uD835\uDDF6\uD835\uDDFC\uD835\uDDFB\uD835\uDDEE\uD835\uDDF9 \uD835\uDDE6\uD835\uDE01\uD835\uDDEE\uD835\uDE01\uD835\uDDF2\uD835\uDDFA\uD835\uDDF2\uD835\uDDFB\uD835\uDE01\uD835\uDE00" +
                        "\n - Very often when you write code, you want to perform different actions for different conditions." +
                        "\nIn PHP we have the following conditional statements:" +

                        "\n\uD835\uDFED. \uD835\uDDE7\uD835\uDDF5\uD835\uDDF2 \uD835\uDDF6\uD835\uDDF3 \uD835\uDDE6\uD835\uDE01\uD835\uDDEE\uD835\uDE01\uD835\uDDF2\uD835\uDDFA\uD835\uDDF2\uD835\uDDFB\uD835\uDE01" +
                        "\n - The if statement executes some code if one condition is true." +
                        "\nSyntax:" +
                        "\n\uD835\uDE92\uD835\uDE8F (\uD835\uDE8C\uD835\uDE98\uD835\uDE97\uD835\uDE8D\uD835\uDE92\uD835\uDE9D\uD835\uDE92\uD835\uDE98\uD835\uDE97) {\n" +
                        "  \uD835\uDE8C\uD835\uDE98\uD835\uDE8D\uD835\uDE8E \uD835\uDE9D\uD835\uDE98 \uD835\uDE8B\uD835\uDE8E \uD835\uDE8E\uD835\uDEA1\uD835\uDE8E\uD835\uDE8C\uD835\uDE9E\uD835\uDE9D\uD835\uDE8E\uD835\uDE8D \uD835\uDE92\uD835\uDE8F \uD835\uDE8C\uD835\uDE98\uD835\uDE97\uD835\uDE8D\uD835\uDE92\uD835\uDE9D\uD835\uDE92\uD835\uDE98\uD835\uDE97 \uD835\uDE92\uD835\uDE9C \uD835\uDE9D\uD835\uDE9B\uD835\uDE9E\uD835\uDE8E;\n" +
                        "}" +
                        "\n" +
                        "\nExample:" +
                        "\nOutput \"Have a good day!\" if the current time (HOUR) is less than 20:" +
                        "\n<?\uD835\uDE99\uD835\uDE91\uD835\uDE99\n" +
                        "$\uD835\uDE9D = \uD835\uDE8D\uD835\uDE8A\uD835\uDE9D\uD835\uDE8E(\"\uD835\uDE77\");\n" +
                        "\n" +
                        "\uD835\uDE92\uD835\uDE8F ($\uD835\uDE9D < \"\uD835\uDFF8\uD835\uDFF6\") {\n" +
                        "  \uD835\uDE8E\uD835\uDE8C\uD835\uDE91\uD835\uDE98 \"\uD835\uDE77\uD835\uDE8A\uD835\uDE9F\uD835\uDE8E \uD835\uDE8A \uD835\uDE90\uD835\uDE98\uD835\uDE98\uD835\uDE8D \uD835\uDE8D\uD835\uDE8A\uD835\uDEA2!\";\n" +
                        "}\n" +
                        "?>" +
                        "\n" +

                        "\n\uD835\uDFEE. \uD835\uDDE7\uD835\uDDF5\uD835\uDDF2 \uD835\uDDF6\uD835\uDDF3...\uD835\uDDF2\uD835\uDDF9\uD835\uDE00\uD835\uDDF2 \uD835\uDDE6\uD835\uDE01\uD835\uDDEE\uD835\uDE01\uD835\uDDF2\uD835\uDDFA\uD835\uDDF2\uD835\uDDFB\uD835\uDE01" +
                        "\n - The if...else statement executes some code if a condition is true and another code if that condition is false." +
                        "\nSyntax:" +
                        "\n\uD835\uDE92\uD835\uDE8F (\uD835\uDE8C\uD835\uDE98\uD835\uDE97\uD835\uDE8D\uD835\uDE92\uD835\uDE9D\uD835\uDE92\uD835\uDE98\uD835\uDE97) {\n" +
                        "  \uD835\uDE8C\uD835\uDE98\uD835\uDE8D\uD835\uDE8E \uD835\uDE9D\uD835\uDE98 \uD835\uDE8B\uD835\uDE8E \uD835\uDE8E\uD835\uDEA1\uD835\uDE8E\uD835\uDE8C\uD835\uDE9E\uD835\uDE9D\uD835\uDE8E\uD835\uDE8D \uD835\uDE92\uD835\uDE8F \uD835\uDE8C\uD835\uDE98\uD835\uDE97\uD835\uDE8D\uD835\uDE92\uD835\uDE9D\uD835\uDE92\uD835\uDE98\uD835\uDE97 \uD835\uDE92\uD835\uDE9C \uD835\uDE9D\uD835\uDE9B\uD835\uDE9E\uD835\uDE8E;\n" +
                        "} \uD835\uDE8E\uD835\uDE95\uD835\uDE9C\uD835\uDE8E {\n" +
                        "  \uD835\uDE8C\uD835\uDE98\uD835\uDE8D\uD835\uDE8E \uD835\uDE9D\uD835\uDE98 \uD835\uDE8B\uD835\uDE8E \uD835\uDE8E\uD835\uDEA1\uD835\uDE8E\uD835\uDE8C\uD835\uDE9E\uD835\uDE9D\uD835\uDE8E\uD835\uDE8D \uD835\uDE92\uD835\uDE8F \uD835\uDE8C\uD835\uDE98\uD835\uDE97\uD835\uDE8D\uD835\uDE92\uD835\uDE9D\uD835\uDE92\uD835\uDE98\uD835\uDE97 \uD835\uDE92\uD835\uDE9C \uD835\uDE8F\uD835\uDE8A\uD835\uDE95\uD835\uDE9C\uD835\uDE8E;\n" +
                        "}" +
                        "\n" +
                        "\nExample" +
                        "\nOutput \"Have a good day!\" if the current time is less than 20, and \"Have a good night!\" otherwise:" +
                        "\n<?\uD835\uDE99\uD835\uDE91\uD835\uDE99\n" +
                        "$\uD835\uDE9D = \uD835\uDE8D\uD835\uDE8A\uD835\uDE9D\uD835\uDE8E(\"\uD835\uDE77\");\n" +
                        "\n" +
                        "\uD835\uDE92\uD835\uDE8F ($\uD835\uDE9D < \"\uD835\uDFF8\uD835\uDFF6\") {\n" +
                        "  \uD835\uDE8E\uD835\uDE8C\uD835\uDE91\uD835\uDE98 \"\uD835\uDE77\uD835\uDE8A\uD835\uDE9F\uD835\uDE8E \uD835\uDE8A \uD835\uDE90\uD835\uDE98\uD835\uDE98\uD835\uDE8D \uD835\uDE8D\uD835\uDE8A\uD835\uDEA2!\";\n" +
                        "} \uD835\uDE8E\uD835\uDE95\uD835\uDE9C\uD835\uDE8E {\n" +
                        "  \uD835\uDE8E\uD835\uDE8C\uD835\uDE91\uD835\uDE98 \"\uD835\uDE77\uD835\uDE8A\uD835\uDE9F\uD835\uDE8E \uD835\uDE8A \uD835\uDE90\uD835\uDE98\uD835\uDE98\uD835\uDE8D \uD835\uDE97\uD835\uDE92\uD835\uDE90\uD835\uDE91\uD835\uDE9D!\";\n" +
                        "}\n" +
                        "?>" +
                        "\n" +

                        "\n\uD835\uDFEF. \uD835\uDDE7\uD835\uDDF5\uD835\uDDF2 \uD835\uDDF6\uD835\uDDF3...\uD835\uDDF2\uD835\uDDF9\uD835\uDE00\uD835\uDDF2\uD835\uDDF6\uD835\uDDF3...\uD835\uDDF2\uD835\uDDF9\uD835\uDE00\uD835\uDDF2 \uD835\uDDE6\uD835\uDE01\uD835\uDDEE\uD835\uDE01\uD835\uDDF2\uD835\uDDFA\uD835\uDDF2\uD835\uDDFB\uD835\uDE01" +
                        "\n - The if...elseif...else statement executes different codes for more than two conditions." +
                        "\nSyntax:" +
                        "\n\uD835\uDE92\uD835\uDE8F (\uD835\uDE8C\uD835\uDE98\uD835\uDE97\uD835\uDE8D\uD835\uDE92\uD835\uDE9D\uD835\uDE92\uD835\uDE98\uD835\uDE97) {\n" +
                        "  \uD835\uDE8C\uD835\uDE98\uD835\uDE8D\uD835\uDE8E \uD835\uDE9D\uD835\uDE98 \uD835\uDE8B\uD835\uDE8E \uD835\uDE8E\uD835\uDEA1\uD835\uDE8E\uD835\uDE8C\uD835\uDE9E\uD835\uDE9D\uD835\uDE8E\uD835\uDE8D \uD835\uDE92\uD835\uDE8F \uD835\uDE9D\uD835\uDE91\uD835\uDE92\uD835\uDE9C \uD835\uDE8C\uD835\uDE98\uD835\uDE97\uD835\uDE8D\uD835\uDE92\uD835\uDE9D\uD835\uDE92\uD835\uDE98\uD835\uDE97 \uD835\uDE92\uD835\uDE9C \uD835\uDE9D\uD835\uDE9B\uD835\uDE9E\uD835\uDE8E;\n" +
                        "} \uD835\uDE8E\uD835\uDE95\uD835\uDE9C\uD835\uDE8E\uD835\uDE92\uD835\uDE8F (\uD835\uDE8C\uD835\uDE98\uD835\uDE97\uD835\uDE8D\uD835\uDE92\uD835\uDE9D\uD835\uDE92\uD835\uDE98\uD835\uDE97) {\n" +
                        "  \uD835\uDE8C\uD835\uDE98\uD835\uDE8D\uD835\uDE8E \uD835\uDE9D\uD835\uDE98 \uD835\uDE8B\uD835\uDE8E \uD835\uDE8E\uD835\uDEA1\uD835\uDE8E\uD835\uDE8C\uD835\uDE9E\uD835\uDE9D\uD835\uDE8E\uD835\uDE8D \uD835\uDE92\uD835\uDE8F \uD835\uDE8F\uD835\uDE92\uD835\uDE9B\uD835\uDE9C\uD835\uDE9D \uD835\uDE8C\uD835\uDE98\uD835\uDE97\uD835\uDE8D\uD835\uDE92\uD835\uDE9D\uD835\uDE92\uD835\uDE98\uD835\uDE97 \uD835\uDE92\uD835\uDE9C \uD835\uDE8F\uD835\uDE8A\uD835\uDE95\uD835\uDE9C\uD835\uDE8E \uD835\uDE8A\uD835\uDE97\uD835\uDE8D \uD835\uDE9D\uD835\uDE91\uD835\uDE92\uD835\uDE9C \uD835\uDE8C\uD835\uDE98\uD835\uDE97\uD835\uDE8D\uD835\uDE92\uD835\uDE9D\uD835\uDE92\uD835\uDE98\uD835\uDE97 \uD835\uDE92\uD835\uDE9C \uD835\uDE9D\uD835\uDE9B\uD835\uDE9E\uD835\uDE8E;\n" +
                        "} \uD835\uDE8E\uD835\uDE95\uD835\uDE9C\uD835\uDE8E {\n" +
                        "  \uD835\uDE8C\uD835\uDE98\uD835\uDE8D\uD835\uDE8E \uD835\uDE9D\uD835\uDE98 \uD835\uDE8B\uD835\uDE8E \uD835\uDE8E\uD835\uDEA1\uD835\uDE8E\uD835\uDE8C\uD835\uDE9E\uD835\uDE9D\uD835\uDE8E\uD835\uDE8D \uD835\uDE92\uD835\uDE8F \uD835\uDE8A\uD835\uDE95\uD835\uDE95 \uD835\uDE8C\uD835\uDE98\uD835\uDE97\uD835\uDE8D\uD835\uDE92\uD835\uDE9D\uD835\uDE92\uD835\uDE98\uD835\uDE97\uD835\uDE9C \uD835\uDE8A\uD835\uDE9B\uD835\uDE8E \uD835\uDE8F\uD835\uDE8A\uD835\uDE95\uD835\uDE9C\uD835\uDE8E;\n" +
                        "}" +
                        "\n" +
                        "\nExample:" +
                        "\nOutput \"Have a good morning!\" if the current time is less than 10, and \"Have a good day!\" if the current time is less than 20. Otherwise it will output \"Have a good night!\":" +
                        "\n<?\uD835\uDE99\uD835\uDE91\uD835\uDE99\n" +
                        "$\uD835\uDE9D = \uD835\uDE8D\uD835\uDE8A\uD835\uDE9D\uD835\uDE8E(\"\uD835\uDE77\");\n" +
                        "\n" +
                        "\uD835\uDE92\uD835\uDE8F ($\uD835\uDE9D < \"\uD835\uDFF7\uD835\uDFF6\") {\n" +
                        "  \uD835\uDE8E\uD835\uDE8C\uD835\uDE91\uD835\uDE98 \"\uD835\uDE77\uD835\uDE8A\uD835\uDE9F\uD835\uDE8E \uD835\uDE8A \uD835\uDE90\uD835\uDE98\uD835\uDE98\uD835\uDE8D \uD835\uDE96\uD835\uDE98\uD835\uDE9B\uD835\uDE97\uD835\uDE92\uD835\uDE97\uD835\uDE90!\";\n" +
                        "} \uD835\uDE8E\uD835\uDE95\uD835\uDE9C\uD835\uDE8E\uD835\uDE92\uD835\uDE8F ($\uD835\uDE9D < \"\uD835\uDFF8\uD835\uDFF6\") {\n" +
                        "  \uD835\uDE8E\uD835\uDE8C\uD835\uDE91\uD835\uDE98 \"\uD835\uDE77\uD835\uDE8A\uD835\uDE9F\uD835\uDE8E \uD835\uDE8A \uD835\uDE90\uD835\uDE98\uD835\uDE98\uD835\uDE8D \uD835\uDE8D\uD835\uDE8A\uD835\uDEA2!\";\n" +
                        "} \uD835\uDE8E\uD835\uDE95\uD835\uDE9C\uD835\uDE8E {\n" +
                        "  \uD835\uDE8E\uD835\uDE8C\uD835\uDE91\uD835\uDE98 \"\uD835\uDE77\uD835\uDE8A\uD835\uDE9F\uD835\uDE8E \uD835\uDE8A \uD835\uDE90\uD835\uDE98\uD835\uDE98\uD835\uDE8D \uD835\uDE97\uD835\uDE92\uD835\uDE90\uD835\uDE91\uD835\uDE9D!\";\n" +
                        "}\n" +
                        "?>" +
                        "\n"

                , false));

        arrayList.add(new ModelClass("Array",
                "\uD835\uDDEA\uD835\uDDF5\uD835\uDDEE\uD835\uDE01 \uD835\uDDF6\uD835\uDE00 \uD835\uDDEE \uD835\uDDE3\uD835\uDDDB\uD835\uDDE3 \uD835\uDDD4\uD835\uDDFF\uD835\uDDFF\uD835\uDDEE\uD835\uDE06?" +
                        "\n - A PHP array is a variable that stores more than one piece of related data in a single variable." +
                        "\n - Think of an array as a box of chocolates with slots inside." +
                        "\n - The box represents the array itself while the spaces containing chocolates  -represent the values stored in the arrays." +
                        "\n" +
                        "\n•\uD835\uDDE3\uD835\uDDDB\uD835\uDDE3 \uD835\uDDDC\uD835\uDDFB\uD835\uDDF1\uD835\uDDF2\uD835\uDE05\uD835\uDDF2\uD835\uDDF1 \uD835\uDDD4\uD835\uDDFF\uD835\uDDFF\uD835\uDDEE\uD835\uDE06\uD835\uDE00" +
                        "\nThere are two ways to create indexed arrays:" +
                        "\n - The index can be assigned automatically (index always starts at 0), like this:" +
                        "\n" +
                        "\n$\uD835\uDE8C\uD835\uDE8A\uD835\uDE9B\uD835\uDE9C = \uD835\uDE8A\uD835\uDE9B\uD835\uDE9B\uD835\uDE8A\uD835\uDEA2(\"\uD835\uDE85\uD835\uDE98\uD835\uDE95\uD835\uDE9F\uD835\uDE98\", \"\uD835\uDE71\uD835\uDE7C\uD835\uDE86\", \"\uD835\uDE83\uD835\uDE98\uD835\uDEA2\uD835\uDE98\uD835\uDE9D\uD835\uDE8A\");" +
                        "\n" +
                        "\nor the index can be assigned manually:" +
                        "\n" +
                        "\n$\uD835\uDE8C\uD835\uDE8A\uD835\uDE9B\uD835\uDE9C[\uD835\uDFF6] = \"\uD835\uDE85\uD835\uDE98\uD835\uDE95\uD835\uDE9F\uD835\uDE98\";\n" +
                        "$\uD835\uDE8C\uD835\uDE8A\uD835\uDE9B\uD835\uDE9C[\uD835\uDFF7] = \"\uD835\uDE71\uD835\uDE7C\uD835\uDE86\";\n" +
                        "$\uD835\uDE8C\uD835\uDE8A\uD835\uDE9B\uD835\uDE9C[\uD835\uDFF8] = \"\uD835\uDE83\uD835\uDE98\uD835\uDEA2\uD835\uDE98\uD835\uDE9D\uD835\uDE8A\";" +
                        "\n" +
                        "\nThe following example creates an indexed array named $cars, assigns three elements to it, and then prints a text containing the array values:" +
                        "\nExample:" +
                        "\n<?\uD835\uDE99\uD835\uDE91\uD835\uDE99\n" +
                        "$\uD835\uDE8C\uD835\uDE8A\uD835\uDE9B\uD835\uDE9C = \uD835\uDE8A\uD835\uDE9B\uD835\uDE9B\uD835\uDE8A\uD835\uDEA2(\"\uD835\uDE85\uD835\uDE98\uD835\uDE95\uD835\uDE9F\uD835\uDE98\", \"\uD835\uDE71\uD835\uDE7C\uD835\uDE86\", \"\uD835\uDE83\uD835\uDE98\uD835\uDEA2\uD835\uDE98\uD835\uDE9D\uD835\uDE8A\");\n" +
                        "\uD835\uDE8E\uD835\uDE8C\uD835\uDE91\uD835\uDE98 \"\uD835\uDE78 \uD835\uDE95\uD835\uDE92\uD835\uDE94\uD835\uDE8E \" . $\uD835\uDE8C\uD835\uDE8A\uD835\uDE9B\uD835\uDE9C[\uD835\uDFF6] . \", \" . $\uD835\uDE8C\uD835\uDE8A\uD835\uDE9B\uD835\uDE9C[\uD835\uDFF7] . \" \uD835\uDE8A\uD835\uDE97\uD835\uDE8D \" . $\uD835\uDE8C\uD835\uDE8A\uD835\uDE9B\uD835\uDE9C[\uD835\uDFF8] . \".\";\n" +
                        "?>" +
                        "\n" +

                        "\n•\uD835\uDDE3\uD835\uDDDB\uD835\uDDE3 \uD835\uDDD4\uD835\uDE00\uD835\uDE00\uD835\uDDFC\uD835\uDDF0\uD835\uDDF6\uD835\uDDEE\uD835\uDE01\uD835\uDDF6\uD835\uDE03\uD835\uDDF2 \uD835\uDDD4\uD835\uDDFF\uD835\uDDFF\uD835\uDDEE\uD835\uDE06\uD835\uDE00" +
                        "\n - Associative arrays are arrays that use named keys that you assign to them." +
                        "\nThere are two ways to create an associative array: " +
                        "\n" +
                        "\n$\uD835\uDE8A\uD835\uDE90\uD835\uDE8E = \uD835\uDE8A\uD835\uDE9B\uD835\uDE9B\uD835\uDE8A\uD835\uDEA2(\"\uD835\uDE7F\uD835\uDE8E\uD835\uDE9D\uD835\uDE8E\uD835\uDE9B\"=>\"\uD835\uDFF9\uD835\uDFFB\", \"\uD835\uDE71\uD835\uDE8E\uD835\uDE97\"=>\"\uD835\uDFF9\uD835\uDFFD\", \"\uD835\uDE79\uD835\uDE98\uD835\uDE8E\"=>\"\uD835\uDFFA\uD835\uDFF9\");" +
                        "\n" +
                        "\nor:" +
                        "\n" +
                        "\n$\uD835\uDE8A\uD835\uDE90\uD835\uDE8E['\uD835\uDE7F\uD835\uDE8E\uD835\uDE9D\uD835\uDE8E\uD835\uDE9B'] = \"\uD835\uDFF9\uD835\uDFFB\";\n" +
                        "$\uD835\uDE8A\uD835\uDE90\uD835\uDE8E['\uD835\uDE71\uD835\uDE8E\uD835\uDE97'] = \"\uD835\uDFF9\uD835\uDFFD\";\n" +
                        "$\uD835\uDE8A\uD835\uDE90\uD835\uDE8E['\uD835\uDE79\uD835\uDE98\uD835\uDE8E'] = \"\uD835\uDFFA\uD835\uDFF9\";" +
                        "\n" +
                        "\nThe named keys can then be used in a script:" +
                        "\nExample:" +
                        "\n<?\uD835\uDE99\uD835\uDE91\uD835\uDE99\n" +
                        "$\uD835\uDE8A\uD835\uDE90\uD835\uDE8E = \uD835\uDE8A\uD835\uDE9B\uD835\uDE9B\uD835\uDE8A\uD835\uDEA2(\"\uD835\uDE7F\uD835\uDE8E\uD835\uDE9D\uD835\uDE8E\uD835\uDE9B\"=>\"\uD835\uDFF9\uD835\uDFFB\", \"\uD835\uDE71\uD835\uDE8E\uD835\uDE97\"=>\"\uD835\uDFF9\uD835\uDFFD\", \"\uD835\uDE79\uD835\uDE98\uD835\uDE8E\"=>\"\uD835\uDFFA\uD835\uDFF9\");\n" +
                        "\uD835\uDE8E\uD835\uDE8C\uD835\uDE91\uD835\uDE98 \"\uD835\uDE7F\uD835\uDE8E\uD835\uDE9D\uD835\uDE8E\uD835\uDE9B \uD835\uDE92\uD835\uDE9C \" . $\uD835\uDE8A\uD835\uDE90\uD835\uDE8E['\uD835\uDE7F\uD835\uDE8E\uD835\uDE9D\uD835\uDE8E\uD835\uDE9B'] . \" \uD835\uDEA2\uD835\uDE8E\uD835\uDE8A\uD835\uDE9B\uD835\uDE9C \uD835\uDE98\uD835\uDE95\uD835\uDE8D.\";\n" +
                        "?>"
                , false));

        adapter = new Adapter(arrayList, PHP.this);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(adapter);
        adapter.notifyDataSetChanged();


    }
}