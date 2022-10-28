package com.bsit4.learnbot;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;

import java.util.ArrayList;

public class CSS extends AppCompatActivity {

    ArrayList<ModelClass> arrayList;
    RecyclerView recyclerView;
    Adapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportActionBar().setBackgroundDrawable(new ColorDrawable(getResources().getColor(R.color.teal_700)));
        setContentView(R.layout.activity_css);
        recyclerView=findViewById(R.id.recycler_view);
        arrayList=new ArrayList<>();

        arrayList.add(new ModelClass("Introduction", "\uD835\uDDEA\uD835\uDDF5\uD835\uDDEE\uD835\uDE01 \uD835\uDDF6\uD835\uDE00 \uD835\uDDD6\uD835\uDDE6\uD835\uDDE6? \n\n" +
                "Cascading Style Sheets, fondly referred to as CSS, is a simple design language intended to simplify the process of making web pages presentable.\n\n" +
                "CSS handles the look and feel part of a web page. Using CSS, you can control the color of the text, the style of fonts, the spacing between paragraphs, how columns are sized and laid out, what background images or colors are used, as well as a variety of other effects. \n\n" +
                "CSS is easy to learn and understand but it provides a powerful control over the presentation of an HTML document. Most commonly, CSS is combined with the markup languages HTML or XHTML.\n\n\n" +
                "\uD835\uDDEA\uD835\uDDF5\uD835\uDE06 \uD835\uDDDF\uD835\uDDF2\uD835\uDDEE\uD835\uDDFF\uD835\uDDFB \uD835\uDDD6\uD835\uDDE6\uD835\uDDE6? \n\n" +
                "Without CSS, every web page would be drab plain text and images that flowed straight down the page. With CSS, you can add color and background images and change the layout of your page. Your web pages can feel like works of art.", false));

        arrayList.add(new ModelClass("History of CSS", "CSS came first into existence in 1994. CSS evolved all these years and W3C maintained the standards with CSS1, CSS2 and CSS3.\n\n" +
                "• \uD835\uDDD6\uD835\uDDE6\uD835\uDDE6 \uD835\uDFED\n\n" +
                " -CSS 1 was adapted in 1996. It was difficult and less adapted by then recent browsers such as Internet Explorer 3, Internet Explorer 4 and Netscape 4.\n" +
                " -CSS 1 had font properties and specification for typeface and emphasis. The text attributes were supported such as spacing of letters and line of text.\n" +
                " -Alignment of text, positioning and tables were also added. Margin, padding, border and positioning for elements was also implemented. This recommendation was not maintained by W3C.\n\n" +

                "• \uD835\uDDD6\uD835\uDDE6\uD835\uDDE6 \uD835\uDFEE\n\n" +
                " -CSS2 is the improvement of CSS1. It removed the not fully interoperable features. It also included the browser extensions.\n" +
                " -It had many new features such as absolute, relative and fixed positioning of elements. It supported different media types. It also included new font properties such as shadow.\n\n" +

                "• \uD835\uDDD6\uD835\uDDE6\uD835\uDDE6 \uD835\uDFEF\n\n" +
                " -CSS3 is the most recent and currently used. It has XHTML specification. CSS3 has its major focus on modularisation and separation of concerns.\n" +
                " -Different modules now go through different stages of the recommendation process. CSS3 has support for almost all recent web browsers.\n" +
                " -It has even included new selectors along with new combinator and new pseudo-elements.\n" +
                " -CSS3 has several new CSS properties. It supports animation which is not a part of earlier recommendations.\n" +
                " -There were various properties added such as transforms, gradients, animation and transition for animation effect in the website.\n" +
                " -Recent add-ons are like border-radius, box-shadow, flex-box and CSS grid.", false));

        arrayList.add(new ModelClass("Take-Away Skills", " -You will learn many aspects of styling web pages, You’ll be able to set up the correct file structure, edit text and colors, and create attractive layouts. With these skills, you’ll be able to customize the appearance of your web pages to suit your every need.\n" +
                " -CSS allows you to format an entire webpage (or an entire website!) in one document. This keeps the HTML code from becoming too confusing.\n" +
                " -There are 3 kinds of style sheets: external, internal, and inline.", false));

        arrayList.add(new ModelClass("Advantages of CSS", "• \uD835\uDDD6\uD835\uDDE6\uD835\uDDE6 \uD835\uDE00\uD835\uDDEE\uD835\uDE03\uD835\uDDF2\uD835\uDE00 \uD835\uDE01\uD835\uDDF6\uD835\uDDFA\uD835\uDDF2 - You can write CSS once and then reuse the same sheet in multiple HTML pages. You can define a style for each HTML element and apply it to as many web pages as you want. \n" +
                "• \uD835\uDDE3\uD835\uDDEE\uD835\uDDF4\uD835\uDDF2\uD835\uDE00 \uD835\uDDF9\uD835\uDDFC\uD835\uDDEE\uD835\uDDF1 \uD835\uDDF3\uD835\uDDEE\uD835\uDE00\uD835\uDE01\uD835\uDDF2\uD835\uDDFF - If you are using CSS, you do not need to write HTML tag attributes every time. Just write one CSS rule of a tag and apply it to all the occurrences of that tag. So, less code means faster download times. \n" +
                "• \uD835\uDDD8\uD835\uDDEE\uD835\uDE00\uD835\uDE06 \uD835\uDDFA\uD835\uDDEE\uD835\uDDF6\uD835\uDDFB\uD835\uDE01\uD835\uDDF2\uD835\uDDFB\uD835\uDDEE\uD835\uDDFB\uD835\uDDF0\uD835\uDDF2 - To make a global change, simply change the style, and all the elements in all the web pages will be updated automatically. \n" +
                "• \uD835\uDDE6\uD835\uDE02\uD835\uDDFD\uD835\uDDF2\uD835\uDDFF\uD835\uDDF6\uD835\uDDFC\uD835\uDDFF \uD835\uDE00\uD835\uDE01\uD835\uDE06\uD835\uDDF9\uD835\uDDF2\uD835\uDE00 \uD835\uDE01\uD835\uDDFC \uD835\uDDDB\uD835\uDDE7\uD835\uDDE0\uD835\uDDDF - CSS has a much wider array of attributes than HTML, so you can give a far better look to your HTML page in comparison to HTML attributes.\n" +
                "• \uD835\uDDE0\uD835\uDE02\uD835\uDDF9\uD835\uDE01\uD835\uDDF6\uD835\uDDFD\uD835\uDDF9\uD835\uDDF2 \uD835\uDDD7\uD835\uDDF2\uD835\uDE03\uD835\uDDF6\uD835\uDDF0\uD835\uDDF2 \uD835\uDDD6\uD835\uDDFC\uD835\uDDFA\uD835\uDDFD\uD835\uDDEE\uD835\uDE01\uD835\uDDF6\uD835\uDDEF\uD835\uDDF6\uD835\uDDF9\uD835\uDDF6\uD835\uDE01\uD835\uDE06 - Style sheets allow content to be optimized for more than one type of device. By using the same HTML document, different versions of a website can be presented for handheld devices such as PDAs and cellphones or for printing. \n" +
                "• \uD835\uDDDA\uD835\uDDF9\uD835\uDDFC\uD835\uDDEF\uD835\uDDEE\uD835\uDDF9 \uD835\uDE04\uD835\uDDF2\uD835\uDDEF \uD835\uDE00\uD835\uDE01\uD835\uDDEE\uD835\uDDFB\uD835\uDDF1\uD835\uDDEE\uD835\uDDFF\uD835\uDDF1\uD835\uDE00 – Now HTML attributes are being deprecated and it is being recommended to use CSS. So it’s a good idea to start using CSS in all the HTML pages to make them compatible with future browsers.\n", false));
        arrayList.add(new ModelClass("Style Sheets",
                "\uD835\uDDDC\uD835\uDDFB\uD835\uDDF9\uD835\uDDF6\uD835\uDDFB\uD835\uDDF2 \uD835\uDDD6\uD835\uDDE6\uD835\uDDE6\n\n" +
                        "Inline CSS is used to apply CSS on a single line or element.\n\n" +
                        "For example:\n" +
                        "<p style=\"color:blue\">Hello CSS</p>\n\n\n" +

                        "\uD835\uDDDC\uD835\uDDFB\uD835\uDE01\uD835\uDDF2\uD835\uDDFF\uD835\uDDFB\uD835\uDDEE\uD835\uDDF9 \uD835\uDDD6\uD835\uDDE6\uD835\uDDE6\n\n" +
                        "Internal CSS is used to apply CSS on a single document or page. It can affect all the elements of the page. It is written inside the style tag within head section of html.\n\n" +
                        "For example:\n" +
                        "<!DOCTYPE html>\n" +
                        "<html>\n" +
                        "<head>\n" +
                        "<style>\n" +
                        "body {\n" +
                        "    background-color: linen;  \n" +
                        "} \n" +
                        "h1 {  \n" +
                        "    color: red;  \n" +
                        "    margin-left: 80px;  \n" +
                        "}   \n" +
                        "</style>  \n" +
                        "</head>  \n" +
                        "<body>  \n" +
                        "<h1>The internal style sheet is applied on this heading.</h1>  \n" +
                        "<p>This paragraph will not be affected.</p>  \n" +
                        "</body>  \n" +
                        "</html>\n\n\n" +

                        "\uD835\uDDD8\uD835\uDE05\uD835\uDE01\uD835\uDDF2\uD835\uDDFF\uD835\uDDFB\uD835\uDDEE\uD835\uDDF9 \uD835\uDDD6\uD835\uDDE6\uD835\uDDE6\n\n" +
                        "External CSS is used to apply CSS on multiple pages or all pages. Here, we write all the CSS code in a css file. Its extension must be .css for example style.css.\n\n" +
                        "For example:\n" +
                        "<head>  \n" +
                        "<link rel=\"stylesheet\" type=\"text/css\" href=\"mystyle.css\">  \n" +
                        "</head>", false));

        arrayList.add(new ModelClass("Syntax", "selector { property: value; }\n" +
                "• Selector = the section of HTML that you wish to format \n" +
                "• Declarations = the format commands. Made of a property and a value \n" +
                "   o Property: style element that you want to change \n" +
                "   o Value: what you want to change it to \n" +
                "   o Each declaration ends in a semicolon ; \n\n" +
                "• Example: #header { \n" +
                "background-color: blue; \n" +
                "font: Verdana, Helvetica, sans-serif;\n" +
                " height: 100px; width: 700px; \n" +
                "}\n", false));

        arrayList.add(new ModelClass("Selectors",
                "\uD835\uDDD8\uD835\uDDF9\uD835\uDDF2\uD835\uDDFA\uD835\uDDF2\uD835\uDDFB\uD835\uDE01 \uD835\uDDE6\uD835\uDDF2\uD835\uDDF9\uD835\uDDF2\uD835\uDDF0\uD835\uDE01\uD835\uDDFC\uD835\uDDFF\n\n" +
                        "The element selector of CSS is used to select the element of HTML by the name.\n\n" +
                        "The example of element selector is as follows:\n\n" +
                        "<!DOCTYPE>\n" +
                        " <html>\n" +
                        " <head>\n" +
                        " <title> Element Selector of CSS </title>\n" +
                        " <style>\n" +
                        " p {\n" +
                        " color: grey;\n" +
                        " text-align: center; \n" +
                        " }\n" +
                        " </style>\n" +
                        " </head>\n" +
                        " <body>\n" +
                        " <p> This is an example of Element Selector </p>\n" +
                        " <p> hellow! </p> \n" +
                        " </body>\n" +
                        " </html>\n\n\n" +

                        "\uD835\uDDDC\uD835\uDDF1 \uD835\uDDE6\uD835\uDDF2\uD835\uDDF9\uD835\uDDF2\uD835\uDDF0\uD835\uDE01\uD835\uDDFC\uD835\uDDFF\n\n" +
                        "This selector of CSS selects the HTML element’s attribute id to choose a particular element. The id is always considered special inside the page. Thus, it is selected to choose a unique and single element. The id is defined with a hash character (#), pursued by the element’s id.\n\n" +
                        "The example of id selector is as follows which is defined with id “p”:\n\n" +
                        "<!DOCTYPE>\n" +
                        " <html>\n" +
                        " <head>\n" +
                        " <title> ID Selector of CSS </title>\n" +
                        " <style>\n" +
                        " #p { \n" +
                        " color: blue;\n" +
                        " text-align: center;\n" +
                        " }\n" +
                        " </style>\n" +
                        " </head>\n" +
                        " <body>\n" +
                        " <p id=\"p\"> ID Selector </p> \n" +
                        " <p> This is not troubled via the style </p>\n" +
                        " </body>\n" +
                        " </html>\n\n\n" +

                        "\uD835\uDDD6\uD835\uDDF9\uD835\uDDEE\uD835\uDE00\uD835\uDE00 \uD835\uDDE6\uD835\uDDF2\uD835\uDDF9\uD835\uDDF2\uD835\uDDF0\uD835\uDE01\uD835\uDDFC\uD835\uDDFF\n\n" +
                        "Choose the elements of HTML along with a particular attribute of class. A class selector can be used with the period character (Full stop). It is pursued by the name of the class. Usually, a class must not be begin with the number.\n\n" +
                        "The example of the class selector is shown below:\n\n" +
                        "In this, a class is represented by “class1”:\n" +
                        "• For example, a class that center-aligns text would look like:\n" +
                        "center {\n" +
                        "text-align:center;\n" +
                        "}\n\n" +
                        "<!DOCTYPE>\n" +
                        " <html>\n" +
                        " <head>\n" +
                        " <title> Class Selector of CSS </title>\n" +
                        " <style>\n" +
                        " .class1 { \n" +
                        " color: red;\n" +
                        " text-align: center;\n" +
                        " }\n" +
                        " </style>\n" +
                        " </head>\n" +
                        " <body> \n" +
                        " <h1 class=\"class1\"> Class Selector </h1>\n" +
                        " <h2 class=\"class1\"> This is an example of Class Selector </h2>\n" +
                        " </body>\n" +
                        " </html>\n\n\n" +

                        "\uD835\uDDE8\uD835\uDDFB\uD835\uDDF6\uD835\uDE03\uD835\uDDF2\uD835\uDDFF\uD835\uDE00\uD835\uDDEE\uD835\uDDF9 \uD835\uDDE6\uD835\uDDF2\uD835\uDDF9\uD835\uDDF2\uD835\uDDF0\uD835\uDE01\uD835\uDDFC\uD835\uDDFF\n\n" +
                        "CSS has a unique kind of selector i.e., universal selector. It is applied on the elements as the wildcard character. These selectors select every element which is displayed over the page.\n\n" +
                        "The example of universal selector is as written as below:\n\n" +
                        "<!DOCTYPE>\n" +
                        " <html>\n" +
                        " <head>\n" +
                        " <title> Universal Selector</title>\n" +
                        " <style>\n" +
                        " * {\n" +
                        " color: red; \n" +
                        " font-size: 20px;\n" +
                        " }\n" +
                        " </style>\n" +
                        " </head>\n" +
                        " <body>\n" +
                        " <h1> Universal Selector </h1>\n" +
                        " <p> This is an example for selecting all the elements available on the page </p> \n" +
                        " <p id=\"class1\">This is a paragraph which will be blue, center-aligned, and written in a large font-size. </p>\n" +
                        " <p>hello!</p>\n" +
                        " </body>\n" +
                        " </html>\n\n\n" +

                        "\uD835\uDDDA\uD835\uDDFF\uD835\uDDFC\uD835\uDE02\uD835\uDDFD \uD835\uDDE6\uD835\uDDF2\uD835\uDDF9\uD835\uDDF2\uD835\uDDF0\uD835\uDE01\uD835\uDDFC\uD835\uDDFF\n\n" +
                        "Various group selectors of CSS are applied to select every element including similar style definitions. A lengthy code can be reduced by the use of the group selectors. Commas can be used to isolate all the selectors in the grouping.\n\n" +
                        "Take a look on the following code i.e., written without the use of group selector:\n\n" +
                        "h1 {\n" +
                        " color: red;\n" +
                        " text-align: center;\n" +
                        " }n" +
                        " h2 {\n" +
                        " color: red; \n" +
                        " text-align: center;\n" +
                        " }\n" +
                        " p {\n" +
                        " color: red;\n" +
                        " text-align: center;\n" +
                        " }", false));

        arrayList.add(new ModelClass("Comments", "You can include comments to help explain your code. Think of it as writing a little note to yourself. Comments are ignored by the browser and donʼt show up in your actual website- theyʼre just for explaining certain bits of code.\n\n" +
                "Comments begin with /* and end with */\n" +
                "\n" +
                "For example:\n" +
                "/* This is a comment */\n" +
                "The stars are closest to your comment.", false));

        arrayList.add(new ModelClass("Colors",
                "\uD835\uDDD5\uD835\uDE02\uD835\uDDF6\uD835\uDDF9\uD835\uDE01-\uD835\uDDDC\uD835\uDDFB \uD835\uDDD6\uD835\uDDFC\uD835\uDDF9\uD835\uDDFC\uD835\uDDFF\n\n" +
                        "These are a set of predefined colors which are used by its name.\n" +
                        "For example: red, blue, green etc.\n\n" +
                        "h1 {\n" +
                        "    color: color-name;\n" +
                        "}\n\n\n" +

                        "\uD835\uDDE5\uD835\uDDDA\uD835\uDDD5 \uD835\uDDD9\uD835\uDDFC\uD835\uDDFF\uD835\uDDFA\uD835\uDDEE\uD835\uDE01\n\n" +
                        "The RGB(Red, Green, Blue) format is used to define the color of an HTML element by specifying the R, G, B values range between 0 to 255.\n\n" +
                        "For example: RGB value of Red color is (255, 0, 0), Green color is (0, 255, 0), Blue color is (0, 0, 255) etc.\n\n" +
                        "h1 {\n" +
                        "    color: rgb(R, G, B);\n" +
                        "}\n\n\n" +

                        "\uD835\uDDE5\uD835\uDDDA\uD835\uDDD5\uD835\uDDD4 \uD835\uDDD9\uD835\uDDFC\uD835\uDDFF\uD835\uDDFA\uD835\uDDEE\uD835\uDE01\n\n" +
                        "The RGBA format is similar to the RGB, but the difference is RGBA contains A (Alpha) which specify the transparency of elements.\n" +
                        "The value of alpha lies between 0.0 to 1.0 where 0.0. represents fully transparent and 1.0 represents not transparent.\n\n" +
                        "h1 {\n" +
                        "    color:rgba(R, G, B, A);\n" +
                        "}\n\n\n" +

                        "\uD835\uDDDB\uD835\uDDF2\uD835\uDE05\uD835\uDDEE\uD835\uDDF1\uD835\uDDF2\uD835\uDDF0\uD835\uDDF6\uD835\uDDFA\uD835\uDDEE\uD835\uDDF9 \uD835\uDDE1\uD835\uDDFC\uD835\uDE01\uD835\uDDEE\uD835\uDE01\uD835\uDDF6\uD835\uDDFC\uD835\uDDFB\n\n" +
                        "The hexadecimal notation begins with # symbol followed by 6 characters each range from 0 to F.\n\n" +
                        " For example: Red #FF0000, Green #00FF00, Blue #0000FF etc.\n\n" +
                        "h1 {\n" +
                        "    color:#(0-F)(0-F)(0-F)(0-F)(0-F)(0-F);\n" +
                        "}\n\n\n"+

                        "\uD835\uDDE7\uD835\uDDF2\uD835\uDE05\uD835\uDE01 \uD835\uDDD6\uD835\uDDFC\uD835\uDDF9\uD835\uDDFC\uD835\uDDFF\n\n" +
                        "It is used to set the color of the text.\n\n" +
                        "h1 {\n" +
                        "    color:color_name;\n" +
                        "}\n\n\n" +

                        "\uD835\uDDD5\uD835\uDDEE\uD835\uDDF0\uD835\uDDF8\uD835\uDDF4\uD835\uDDFF\uD835\uDDFC\uD835\uDE02\uD835\uDDFB\uD835\uDDF1 \uD835\uDDD6\uD835\uDDFC\uD835\uDDF9\uD835\uDDFC\uD835\uDDFF\n\n" +
                        "It is used to set the background color of an HTML element.\n\n" +
                        "h1 {\n" +
                        "    background-color:color_name;\n" +
                        "}\n\n\n" +

                        "\uD835\uDDD5\uD835\uDDFC\uD835\uDDFF\uD835\uDDF1\uD835\uDDF2\uD835\uDDFF \uD835\uDDD6\uD835\uDDFC\uD835\uDDF9\uD835\uDDFC\uD835\uDDFF\n\n" +
                        "It is used to set the border color of an element. Border-style is used to set the border type.\n\n" +
                        "h1 {\n" +
                        "    border-style:solid/dashed/dotted\n" +
                        "    border-color:color_name;\n" +
                        "}", false));

        arrayList.add(new ModelClass("Background",
                "\uD835\uDDD5\uD835\uDDEE\uD835\uDDF0\uD835\uDDF8\uD835\uDDF4\uD835\uDDFF\uD835\uDDFC\uD835\uDE02\uD835\uDDFB\uD835\uDDF1 \uD835\uDDF0\uD835\uDDFC\uD835\uDDF9\uD835\uDDFC\uD835\uDDFF \uD835\uDDE3\uD835\uDDFF\uD835\uDDFC\uD835\uDDFD\uD835\uDDF2\uD835\uDDFF\uD835\uDE01\uD835\uDE06\n\n" +
                        "This property specifies the background color of an element. A color name can also be given as : “green”, a HEX value as “#5570f0”, an RGB value as “rgb(25, 255, 2)”.\n\n" +
                        "body {\n" +
                        "   background-color:color name\n" +
                        "}\n\n\n" +

                        "\uD835\uDDD5\uD835\uDDEE\uD835\uDDF0\uD835\uDDF8\uD835\uDDF4\uD835\uDDFF\uD835\uDDFC\uD835\uDE02\uD835\uDDFB\uD835\uDDF1 \uD835\uDDDC\uD835\uDDFA\uD835\uDDEE\uD835\uDDF4\uD835\uDDF2 \uD835\uDDE3\uD835\uDDFF\uD835\uDDFC\uD835\uDDFD\uD835\uDDF2\uD835\uDDFF\uD835\uDE01\uD835\uDE06\n\n" +
                        "This property specify an image to use as the background of an element. By default, the image is repeated so it covers the entire element. \n\n" +
                        "body {\n" +
                        "   background-image : link;\n" +
                        "}\n\n\n" +

                        "\uD835\uDDD5\uD835\uDDEE\uD835\uDDF0\uD835\uDDF8\uD835\uDDF4\uD835\uDDFF\uD835\uDDFC\uD835\uDE02\uD835\uDDFB\uD835\uDDF1 \uD835\uDDFF\uD835\uDDF2\uD835\uDDFD\uD835\uDDF2\uD835\uDDEE\uD835\uDE01 \uD835\uDDE3\uD835\uDDFF\uD835\uDDFC\uD835\uDDFD\uD835\uDDF2\uD835\uDDFF\uD835\uDE01\uD835\uDE06\n\n" +
                        "By default the background image property repeats the image both horizontally and vertically.\n" +
                        "To repeat an image horizontally\n\n" +
                        "body {\n" +
                        "   background-image:link;\n" +
                        "   background-repeat: repeat:x;\n" +
                        "}\n\n\n" +

                        "\uD835\uDDD5\uD835\uDDEE\uD835\uDDF0\uD835\uDDF8\uD835\uDDF4\uD835\uDDFF\uD835\uDDFC\uD835\uDE02\uD835\uDDFB\uD835\uDDF1-\uD835\uDDEE\uD835\uDE01\uD835\uDE01\uD835\uDDEE\uD835\uDDF0\uD835\uDDF5\uD835\uDDFA\uD835\uDDF2\uD835\uDDFB\uD835\uDE01 \uD835\uDDE3\uD835\uDDFF\uD835\uDDFC\uD835\uDDFD\uD835\uDDF2\uD835\uDDFF\uD835\uDE01\uD835\uDE06\n\n" +
                        " This property is used to fix the background ground image.The image will not scroll with the page.\n\n" +
                        "body {\n" +
                        "   background-attachment: fixed;\n" +
                        "}\n\n\n" +

                        "\uD835\uDDD5\uD835\uDDEE\uD835\uDDF0\uD835\uDDF8\uD835\uDDF4\uD835\uDDFF\uD835\uDDFC\uD835\uDE02\uD835\uDDFB\uD835\uDDF1-\uD835\uDDFD\uD835\uDDFC\uD835\uDE00\uD835\uDDF6\uD835\uDE01\uD835\uDDF6\uD835\uDDFC\uD835\uDDFB \uD835\uDDE3\uD835\uDDFF\uD835\uDDFC\uD835\uDDFD\uD835\uDDF2\uD835\uDDFF\uD835\uDE01\uD835\uDE06\n\n" +
                        "This property is used to set the image to a particular position.\n\n" +
                        "body {\n" +
                        "   background-repeat:no repeat;\n" +
                        "   background-position:left top;\n" +
                        "}", false));

        arrayList.add(new ModelClass("Margins and Padding",
                "\uD835\uDDE0\uD835\uDDEE\uD835\uDDFF\uD835\uDDF4\uD835\uDDF6\uD835\uDDFB\uD835\uDE00\n\n" +
                        "CSS margins are used to create space around the element. We can set the different sizes of margins for individual sides(top, right, bottom, left).\n\n" +
                        "Margin properties can have the following values:\n" +
                        "Length in cm, px, pt, etc.\n" +
                        "Width % of the element.\n" +
                        "Margin calculated by the browser: auto.\n\n" +
                        "body\n" +
                        "{\n" +
                        "    margin: size;\n" +
                        "}\n\n\n" +

                        "\uD835\uDDE3\uD835\uDDEE\uD835\uDDF1\uD835\uDDF1\uD835\uDDF6\uD835\uDDFB\uD835\uDDF4\n\n" +
                        "CSS paddings are used to create space around the element, inside any defined border. We can set different paddings for individual sides(top, right, bottom, left). It is important to add border properties to implement padding properties.\n\n" +
                        "Padding properties can have the following values: \n" +
                        "Length in cm, px, pt, etc.\n" +
                        "Width % of the element.\n\n" +
                        "body\n" +
                        "{\n" +
                        "    padding: size;\n" +
                        "}", false));

        arrayList.add(new ModelClass("Height and Width", "Height and Width in CSS are used to set the height and width of boxes. It’s value can be set using length, percentage or auto.\n\n" +
                "<!DOCTYPE html>\n" +
                "<html>\n" +
                "   <head>\n" +
                "      <title>width and height</title>\n" +
                "      <style>\n" +
                "         .G{\n" +
                "         height: 120px;\n" +
                "         width: 50%;\n" +
                "         border: 5px solid black;\n" +
                "         padding-left: 50px;\n" +
                "         padding-top: 50px;\n" +
                "         font-size:42px;\n" +
                "         font-weight:bold;\n" +
                "         color:green;\n" +
                "         margin-left:50px;\n" +
                "         margin-top:50px;\n" +
                "         }\n" +
                "      </style>\n" +
                "   </head>\n" +
                "   <body>\n" +
                "      <div class = \"G\"> For example </div>\n" +
                "   </body>\n" +
                "</html>\n\n" +

                "\uD835\uDDDB\uD835\uDDF2\uD835\uDDF6\uD835\uDDF4\uD835\uDDF5\uD835\uDE01 \uD835\uDDEE\uD835\uDDFB\uD835\uDDF1 \uD835\uDE04\uD835\uDDF6\uD835\uDDF1\uD835\uDE01\uD835\uDDF5 \uD835\uDDFC\uD835\uDDF3 \uD835\uDDDC\uD835\uDDFA\uD835\uDDEE\uD835\uDDF4\uD835\uDDF2\n\n" +
                "It is used to set the height and width of an image. It’s value can be in px, cm, percent, … etc.\n\n " +
                "<!DOCTYPE html>\n" +
                "<html>\n" +
                "   <head>\n" +
                "      <title>Height and width of image</title>\n" +
                "      <style>\n" +
                "         .G {\n" +
                "         width:300px;\n" +
                "         height:200px;\n" +
                "         border:3px solid black;\n" +
                "         }\n" +
                "      </style>\n" +
                "   </head>\n" +
                "   <body>\n" +
                "      <h3>Set the width and height of an Image</h3>\n" +
                "      <img class=\"G\" src=\"4.jpg\">\n" +
                "   </body>\n" +
                "</html>", false));

        arrayList.add(new ModelClass("Text Formatting",
                "\uD835\uDDE7\uD835\uDDF2\uD835\uDE05\uD835\uDE01 \uD835\uDDD6\uD835\uDDFC\uD835\uDDF9\uD835\uDDFC\uD835\uDDFF\n\n" +
                        "It is used to set the color of the text.\n" +
                        "Text-color can be set by using the name “red”, hex value “#ff0000” or by its RGB value“rgb(255, 0, 0).\n\n" +
                        "body\n" +
                        "{\n" +
                        "color:color name;\n" +
                        "}\n\n\n" +

                        "\uD835\uDDE7\uD835\uDDF2\uD835\uDE05\uD835\uDE01 \uD835\uDDD4\uD835\uDDF9\uD835\uDDF6\uD835\uDDF4\uD835\uDDFB\uD835\uDDFA\uD835\uDDF2\uD835\uDDFB\uD835\uDE01\n\n" +
                        "It is used to set the horizontal alignment of the text. The text can be set to left, right, centered and justified alignment. In justified alignment, line is stretched such that left and right margins are straight.\n\n" +
                        "body\n" +
                        "{\n" +
                        "text-align:alignment type;\n" +
                        "}\n\n\n" +

                        "\uD835\uDDE7\uD835\uDDF2\uD835\uDE05\uD835\uDE01 \uD835\uDDD7\uD835\uDDF2\uD835\uDDF0\uD835\uDDFC\uD835\uDDFF\uD835\uDDEE\uD835\uDE01\uD835\uDDF6\uD835\uDDFC\uD835\uDDFB\n\n" +
                        "It is used to add or remove decorations from the text.\n" +
                        "Text decoration can be underline, overline, line-through or none.\n\n" +
                        "body\n" +
                        "{\n" +
                        "text-decoration:decoration type;\n" +
                        "}\n\n\n" +

                        "\uD835\uDDE7\uD835\uDDF2\uD835\uDE05\uD835\uDE01 \uD835\uDDD7\uD835\uDDF6\uD835\uDDFF\uD835\uDDF2\uD835\uDDF0\uD835\uDE01\uD835\uDDF6\uD835\uDDFC\uD835\uDDFB\n\n" +
                        "It is used to set the direction of the text. The direction can be set by using rtl : right to left .\n" +
                        "Left to right is the default direction of the text.\n\n" +
                        "body\n" +
                        "{\n" +
                        "direction:rtl;\n" +
                        "}", false));

        arrayList.add(new ModelClass("Fonts",
                "\uD835\uDDD9\uD835\uDDFC\uD835\uDDFB\uD835\uDE01-\uD835\uDDD9\uD835\uDDEE\uD835\uDDFA\uD835\uDDF6\uD835\uDDF9\uD835\uDE06\n\n" +
                        "It is used to set the font type of an HTML element. It holds several font names as a fallback system. \n\n" +
                        "font-family: \"font family name\";\n\n\n" +

                        "\uD835\uDDD9\uD835\uDDFC\uD835\uDDFB\uD835\uDE01-\uD835\uDDE6\uD835\uDE01\uD835\uDE06\uD835\uDDF9\uD835\uDDF2\n\n" +
                        "It is used to specify the font style of an HTML element. It can be “normal, italic or oblique”.\n\n" +
                        "font-style: style name;\n\n\n" +

                        "\uD835\uDDD9\uD835\uDDFC\uD835\uDDFB\uD835\uDE01-\uD835\uDDEA\uD835\uDDF2\uD835\uDDF6\uD835\uDDF4\uD835\uDDF5\uD835\uDE01\n\n" +
                        "It is used to set the boldness of the font. Its value can be “normal, bold, lighter, bolder”.\n\n" +
                        "font-weight: font weight value;\n\n\n" +

                        "\uD835\uDDD9\uD835\uDDFC\uD835\uDDFB\uD835\uDE01-\uD835\uDDE9\uD835\uDDEE\uD835\uDDFF\uD835\uDDF6\uD835\uDDEE\uD835\uDDFB\uD835\uDE01\n\n" +
                        "It is used to create the small-caps effect. It can be “normal or small-caps”. \n\n" +
                        "font-variant: font variant value;\n\n\n" +

                        "\uD835\uDDD9\uD835\uDDFC\uD835\uDDFB\uD835\uDE01-\uD835\uDDE6\uD835\uDDF6\uD835\uDE07\uD835\uDDF2\n\n" +
                        "It is used to set the font size of an HTML element. The font-size can be set in different ways like in “pixels, percentage, em or we can set values like small, large” etc. \n\n" +
                        "font-size: font size value;" , false));

        arrayList.add(new ModelClass("Links", "\uD835\uDDDF\uD835\uDDF6\uD835\uDDFB\uD835\uDDF8 is a connection from one web page to another web pages.\n"+
                "CSS property can be used to style the links in various different ways.\n\n" +
                "States of Link: Before discussing CSS properties, it is important to know the states of a link. Links can exist in different states and they can be styled using pseudo classes.\n\n" +
                "There are four state of links given below: \n" +
                "\uD835\uDDEE:\uD835\uDDF9\uD835\uDDF6\uD835\uDDFB\uD835\uDDF8 => This is a normal, unvisited link.\n" +
                "\uD835\uDDEE:\uD835\uDE03\uD835\uDDF6\uD835\uDE00\uD835\uDDF6\uD835\uDE01\uD835\uDDF2\uD835\uDDF1 => This is a link visited by user at least once\n" +
                "\uD835\uDDEE:\uD835\uDDF5\uD835\uDDFC\uD835\uDE03\uD835\uDDF2\uD835\uDDFF => This is a link when mouse hovers over it\n" +
                "\uD835\uDDEE:\uD835\uDDEE\uD835\uDDF0\uD835\uDE01\uD835\uDDF6\uD835\uDE03\uD835\uDDF2 => This is a link which is just clicked.\n\n" +
                "a:link {\n" +
                "    color:color_name;\n" +
                "}\n\n" +
                "color_name can be given in any format like color name (green), HEX value (#5570f0) or RGB value rgb(25, 255, 2). There is another state ‘a:focus’ which is used to focused when a user uses tab key to navigate through the links. \n\n" +
                "Default value of links: \n" +
                "• By default the links created are underlined.\n" +
                "• When mouse is hovered above a link, it changes to a hand icon.\n" +
                "• Normal/unvisited links are blue.\n" +
                "• Visited links a colored purple.\n" +
                "• Active links are colored red.\n" +
                "• When a link is focused, it has an outline around it.\n\n" +
                "Example:\n" +
                "<!DOCTYPE html>\n" +
                "<html>\n" +
                "    <head>\n" +
                "        <title>CSS links</title>\n" +
                "        <style>\n" +
                "            p {\n" +
                "                font-size: 25px;\n" +
                "                text-align: center;\n" +
                "            }\n" +
                "        </style>\n" +
                "    </head>\n" +
                "    <body>\n" +
                "    <p><a href=\"https:simplelink.org/\">Simple Link</a></p>\n" +
                "    </body>   \n" +
                "</html>", false));

        arrayList.add(new ModelClass("Lists",
                "The List in CSS specifies the listing of the contents or items in a particular manner i.e., it can either be organized orderly or unorder way, which helps to make a clean webpage. It can be used to arrange the huge with a variety of content as they are flexible and easy to manage. The default style for the list is borderless.\n\n" +
                        "The list can be categorized into 2 types:\n" +
                        "• \uD835\uDDE8\uD835\uDDFB\uD835\uDDFC\uD835\uDDFF\uD835\uDDF1\uD835\uDDF2\uD835\uDDFF\uD835\uDDF2\uD835\uDDF1 \uD835\uDDDF\uD835\uDDF6\uD835\uDE00\uD835\uDE01: In unordered lists, the list items are marked with bullets i.e small black circles by default.\n" +
                        "• \uD835\uDDE2\uD835\uDDFF\uD835\uDDF1\uD835\uDDF2\uD835\uDDFF\uD835\uDDF2\uD835\uDDF1 \uD835\uDDDF\uD835\uDDF6\uD835\uDE00\uD835\uDE01: In ordered lists, the list items are marked with numbers and an alphabet.\n\n\n" +

                        "\uD835\uDDDF\uD835\uDDF6\uD835\uDE00\uD835\uDE01 \uD835\uDDDC\uD835\uDE01\uD835\uDDF2\uD835\uDDFA \uD835\uDDE0\uD835\uDDEE\uD835\uDDFF\uD835\uDDF8\uD835\uDDF2\uD835\uDDFF\n\n" +
                        "This property specifies the type of item marker i.e. unordered list or ordered. The list-style-type property specifies the appearance of the list item marker (such as a disc, character, or custom counter style) of a list item element. Its default value is a disc.\n\n" +
                        "list-style-type:value;\n\n\n" +

                        "\uD835\uDDDF\uD835\uDDF6\uD835\uDE00\uD835\uDE01 \uD835\uDDE0\uD835\uDDEE\uD835\uDDFF\uD835\uDDF8\uD835\uDDF2\uD835\uDDFF \uD835\uDDE3\uD835\uDDFC\uD835\uDE00\uD835\uDDF6\uD835\uDE01\uD835\uDDF6\uD835\uDDFC\uD835\uDDFB\n\n" +
                        "This property specifies the position of the list item marker. The list-style-position property is used to sets the position of the marker relative to a list item. Its default value is “outside”.\n\n" +
                        "There are 2 types of position markers:\n" +
                        "• \uD835\uDDF9\uD835\uDDF6\uD835\uDE00\uD835\uDE01-\uD835\uDE00\uD835\uDE01\uD835\uDE06\uD835\uDDF9\uD835\uDDF2-\uD835\uDDFD\uD835\uDDFC\uD835\uDE00\uD835\uDDF6\uD835\uDE01\uD835\uDDF6\uD835\uDDFC\uD835\uDDFB: \uD835\uDDFC\uD835\uDE02\uD835\uDE01\uD835\uDE00\uD835\uDDF6\uD835\uDDF1\uD835\uDDF2; In this, the bullet points will be outside the list item. The start of each line of the list will be aligned vertically.\n\n" +
                        "list-style-position: outside;\n\n" +
                        "• \uD835\uDDF9\uD835\uDDF6\uD835\uDE00\uD835\uDE01-\uD835\uDE00\uD835\uDE01\uD835\uDE06\uD835\uDDF9\uD835\uDDF2-\uD835\uDDFD\uD835\uDDFC\uD835\uDE00\uD835\uDDF6\uD835\uDE01\uD835\uDDF6\uD835\uDDFC\uD835\uDDFB: \uD835\uDDF6\uD835\uDDFB\uD835\uDE00\uD835\uDDF6\uD835\uDDF1\uD835\uDDF2; In this, the bullet points will be inside the list. The line along with the bullet points will be aligned vertically.\n\n" +
                        "list-style-position: inside;\n\n\n" +

                        "\uD835\uDDE6\uD835\uDDF5\uD835\uDDFC\uD835\uDDFF\uD835\uDE01\uD835\uDDF5\uD835\uDDEE\uD835\uDDFB\uD835\uDDF1 \uD835\uDDE3\uD835\uDDFF\uD835\uDDFC\uD835\uDDFD\uD835\uDDF2\uD835\uDDFF\uD835\uDE01\uD835\uDE06\n\n" +
                        "This property allows us to set all the list properties in one command. The order of property is a type, position, and image. If any of the properties is missing, the default value is inserted. \n\n" +
                        "Example: This example describes the CSS List using the shorthand property.\n\n" +
                        "<!DOCTYPE html>\n" +
                        "<html>\n\n" +
                        "<head>\n" +
                        "    <style>\n" +
                        "    ul.a {\n" +
                        "        list-style: square inside;\n" +
                        "    }\n" +
                        "    </style>\n" +
                        "</head>\n\n" +
                        "<body>\n" +
                        "    <h2>\n" +
                        "         List example\n" +
                        "      </h2>\n\n" +
                        "<p> Unordered lists </p>\n\n" +
                        "    <ul class=\"a\">\n" +
                        "        <li>one</li>\n" +
                        "        <li>two</li>\n" +
                        "        <li>three</li>\n" +
                        "    </ul>\n" +
                        "</body>\n" +
                        "</html>\n\n\n" +

                        "\uD835\uDDE6\uD835\uDE01\uD835\uDE06\uD835\uDDF9\uD835\uDDF6\uD835\uDDFB\uD835\uDDF4 \uD835\uDDDF\uD835\uDDF6\uD835\uDE00\uD835\uDE01\n\n" +
                        "The list can be formatted in CSS. Different colors, borders, backgrounds, and paddings can be set for the lists. \n\n" +
                        "Example: This example describes the CSS List where the various styling properties are applied to the element.\n\n" +
                        "<!DOCTYPE html>\n" +
                        "<html>\n" +
                        "<head>\n" +
                        "    <style>\n" +
                        "    ul.a {\n" +
                        "        list-style: square;\n" +
                        "        background: pink;\n" +
                        "        padding: 20px;\n" +
                        "    }\n" +
                        "    </style>\n" +
                        "</head>\n\n" +
                        "<body>\n" +
                        "    <h2>\n" +
                        "         List example\n" +
                        "      </h2>\n\n" +
                        "<p> Unordered lists </p>\n\n" +
                        "    <ul class=\"a\">\n" +
                        "        <li>one</li>\n" +
                        "        <li>two</li>\n" +
                        "        <li>three</li>\n" +
                        "    </ul>\n" +
                        "</body>\n" +
                        "</html>\n\n\n" +

                        "\uD835\uDDE1\uD835\uDDF2\uD835\uDE00\uD835\uDE01\uD835\uDDF2\uD835\uDDF1 \uD835\uDDDF\uD835\uDDF6\uD835\uDE00\uD835\uDE01\n\n" +
                        "Lists can also be nested. We have sub-sections for sections, so we need the nesting of lists. \n\n" +
                        "Example: This example describes the CSS List having a list declared inside another list.\n\n" +
                        "<!DOCTYPE html>\n" +
                        "<html>\n" +
                        "  \n" +
                        "<head></head>\n" +
                        "  \n" +
                        "<body>\n" +
                        "    <h2>\n" +
                        "          List example\n" +
                        "      </h2>\n" +
                        "    <ul>\n" +
                        "        <li> one\n" +
                        "            <ul>\n" +
                        "                <li>sub one</li>\n" +
                        "            </ul>\n" +
                        "        </li>\n" +
                        "        <li> two\n" +
                        "            <ul>\n" +
                        "                <li>sub one</li>\n" +
                        "                <li>sub two</li>\n" +
                        "            </ul>\n" +
                        "        </li>\n" +
                        "        <li> three\n" +
                        "            <ul>\n" +
                        "                <li>sub one</li>\n" +
                        "                <li>sub two</li>\n" +
                        "            </ul>\n" +
                        "        </li>\n" +
                        "    </ul>\n" +
                        "</body>\n" +
                        "  \n" +
                        "</html>", false));

        adapter=new Adapter(arrayList,CSS.this);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(adapter);
        adapter.notifyDataSetChanged();


    }
}