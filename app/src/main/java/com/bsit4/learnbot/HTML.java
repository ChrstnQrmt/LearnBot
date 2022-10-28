package com.bsit4.learnbot;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;

import java.util.ArrayList;

public class HTML extends AppCompatActivity {

    ArrayList<ModelClass> arrayList;
    RecyclerView recyclerView;
    Adapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_html);
        getSupportActionBar().setBackgroundDrawable(new ColorDrawable(getResources().getColor(R.color.teal_700)));
        recyclerView=findViewById(R.id.recycler_view);
        arrayList=new ArrayList<>();

        arrayList.add(new ModelClass("Introduction", "\uD835\uDDEA\uD835\uDDF5\uD835\uDDEE\uD835\uDE01 \uD835\uDDF6\uD835\uDE00 \uD835\uDDDB\uD835\uDDE7\uD835\uDDE0\uD835\uDDDF?\n" +
                "\n• HTML stands for Hyper Text Markup Language." +
                "\n• HTML is the standard markup language for creating Web pages." +
                "\n• HTML describes the structure of a Web page." +
                "\n• HTML consists of a series of elements." +
                "\n• HTML elements tell the browser how to display the content." +
                "\n• HTML elements label pieces of content such as \"this is a heading\", \"this is a paragraph\", \"this is a link\", etc." +
                "\n\n" +
                "\uD835\uDDDB\uD835\uDDF6\uD835\uDE00\uD835\uDE01\uD835\uDDFC\uD835\uDDFF\uD835\uDE06 \uD835\uDDFC\uD835\uDDF3 \uD835\uDDDB\uD835\uDDE7\uD835\uDDE0\uD835\uDDDF \n" +
                "\nHTML is an evolving language. It doesn’t stay the same for long before a revised set of standards and specifications are brought in to allow easier creation of prettier and more efficient sites." +
                "\n\nHTML 1.0" +
                "\nThe Hyper Text Markup Language was the brainchild of Sir Tim Berners-Lee. In 1991 he wrote a document called “HTML Tags” in which he proposed fewer than two dozen elements that could be used for writing web pages." +
                "\n\nHTML 2.0" +
                "\nHTML 2.0 included everything from the original 1.0 specification but added a few new features to the mix. HTML 2.0 was the standard for website design until January 1997 and defined many core HTML features for the first time." +
                "\n\nHTML 3.2" +
                "\nHTML 4.0 was recommended by the W3C in December ’97 and became the official standard in April 1998. Browser support was undertaken surprisingly earnestly by Microsoft in their Internet Explorer browser. HTML 4.0 was a large evolution of the HTML standards, and the last iteration of classic HTML." +
                "\n\nXHTML 1.0" +
                "\nThis is the successor to HTML. The \"X\" stands for Extensible. This is a reformulation of HTML 4.01 within XML (Extensible Markup Language), which is far more rigorous, and is intended to start moving the creation of Web pages away from HTML" +
                "\n\nHTML5" +
                "\nHTML5 was finalized, and published, on 28 October 2014 by the World Wide Web Consortium (W3C). This is the fifth revision of the HTML standard since the inception of the World Wide Web." +
                "\n\n" +
                "\uD835\uDDD4\uD835\uDDF1\uD835\uDE03\uD835\uDDEE\uD835\uDDFB\uD835\uDE01\uD835\uDDEE\uD835\uDDF4\uD835\uDDF2\uD835\uDE00 \n" +
                "\n• Easy to use." +
                "\n• Loose syntax (although, being too flexible will not comply with standards)." +
                "\n• Supported on almost every browser." +
                "\n• Widely used; established on almost every website." +
                "\n• Very similar to XML syntax, which is increasingly used for data storage." +
                "\n• Free - You need not buy any software" +
                "\n• Easy to learn & code even for novice programmers." +
                "\n\n" +
                "\uD835\uDDD7\uD835\uDDF6\uD835\uDE00\uD835\uDDEE\uD835\uDDF1\uD835\uDE03\uD835\uDDEE\uD835\uDDFB\uD835\uDE01\uD835\uDDEE\uD835\uDDF4\uD835\uDDF2\uD835\uDE00 \n" +
                "\n• It cannot produce dynamic output alone, since it is a static language." +
                "\n• Security features offered by HTML are limited." +
                "\n• Sometimes, the structuring of HTML documents is hard to grasp." +
                "\n", false));
        arrayList.add(new ModelClass("HTML Editors (IDE)", "There are many choices on the market. Here are a handful of the most popular:\n" +
                "\n \uD835\uDDE6\uD835\uDE02\uD835\uDDEF\uD835\uDDF9\uD835\uDDF6\uD835\uDDFA\uD835\uDDF2 \uD835\uDDE7\uD835\uDDF2\uD835\uDE05\uD835\uDE01 \uD835\uDFF0" +
                "\n\n" +
                "Pros\n" +
                "• Easily customizable." +
                "\n• Beginner-friendly." +
                "\n• Pleasant color schemes to choose from." +
                "\n\n" +
                "Cons\n" +
                "• Can’t print documents or code." +
                "\n• No toolbar or dashboard available." +
                "\n\n" +
                "\n\uD835\uDDE1\uD835\uDDFC\uD835\uDE01\uD835\uDDF2\uD835\uDDFD\uD835\uDDEE\uD835\uDDF1++" +
                "\n\n" +
                "Pros\n" +
                "• Distraction-free interface." +
                "\n• Auto-completion feature." +
                "\n• Plugin options for extended functionalities." +
                "\n\n" +
                "Cons\n" +
                "• Can be difficult to get used to for beginners." +
                "\n• No support for Mac.", false));
        arrayList.add(new ModelClass("Tags, Elements & Attributes", "\uD835\uDDE7\uD835\uDDEE\uD835\uDDF4\uD835\uDE00 \n" +
                "\nThe basic structure of an HTML document includes tags, which surround content and apply meaning to it.\n" +
                "\nChange your document so that it looks like this:" +
                "\n\n" +
                "<!DOCTYPE html>\n" +
                "<html>" +
                "\n<body>" +
                "\n  This is my first web page" +
                "\n</body>" +
                "\n</html>" +
                "\n\nNow save the document again, go back to the web browser and reload the page." +
                "\n\nThe appearance of the page will not have changed at all, but the purpose of HTML is to apply meaning, not presentation, and this example has now defined some fundamental elements of a web page." +
                "\n\nThe first line on the top, <!DOCTYPE html>, is a document type declaration and it lets the browser know which flavor of HTML you’re using (HTML5, in this case). It’s very important to stick this in - If you don’t, browsers will assume you don’t really know what you’re doing and act in a very peculiar way." +
                "\n\nTo get back to the point, <html> is the opening tag that kicks things off and tells the browser that everything between that and the </html> closing tag is an HTML document. The stuff between <body> and </body> is the main content of the document that will appear in the browser window." +
                "\n\nThe </body> and </html> put a close to their respective elements (more on elements in a moment)." +
                "\n\nNot all tags have closing tags like this (<html></html>) some tags, which do not wrap around content will close themselves. The line-break tag for example, looks like this : <br> - a line break doesn’t hold any content so the tag merrily sits by its lonely self. We will come across these examples later. All you need to remember is that all tags with content between them should be closed, in the format of opening tag → content → closing tag. It isn’t, strictly speaking, always a requirement, but it’s a convention we’re using in these tutorials because it’s good practice that results in cleaner, easier to understand code." +
                "\n\nYou might come across “self-closing” tags, whereby a br tag, for example, will look like “<br />” instead of simply “<br>”. This is a remnant of XHTML, a form of HTML based on another markup language called XML. HTML5 is much more chilled out than XHTML and will be happy with either format. Some developers prefer one way, some prefer the other. We tossed a coin and decided to stick with the simpler version." +
                "\n\n\uD835\uDDD8\uD835\uDDF9\uD835\uDDF2\uD835\uDDFA\uD835\uDDF2\uD835\uDDFB\uD835\uDE01\uD835\uDE00" +
                "\n\nTags tend not to do much more than mark the beginning and end of an element. Elements are the bits that make up web pages. You would say, for example, that everything that is in between (and includes) the <body> and </body> tags is the body element. As another example, whereas “<title>” and “</title>” are tags, “<title>Rumple Stiltskin</title>” is a title element." +
                "\n\n\uD835\uDDD4\uD835\uDE01\uD835\uDE01\uD835\uDDFF\uD835\uDDF6\uD835\uDDEF\uD835\uDE02\uD835\uDE01\uD835\uDDF2\uD835\uDE00" +
                "\n\nTags can also have attributes, which are extra bits of information. Attributes appear inside the opening tag and their values sit inside quotation marks." +
                "\n\n\uD835\uDDD8\uD835\uDE05\uD835\uDDEE\uD835\uDDFA\uD835\uDDFD\uD835\uDDF9\uD835\uDDF2 \uD835\uDDFC\uD835\uDDF3 \uD835\uDDD4\uD835\uDE01\uD835\uDE01\uD835\uDDFF\uD835\uDDF6\uD835\uDDEF\uD835\uDE02\uD835\uDE01\uD835\uDDF2\uD835\uDE00" +
                "\n\n\uD835\uDE4F\uD835\uDE5D\uD835\uDE5A \uD835\uDE5D\uD835\uDE67\uD835\uDE5A\uD835\uDE5B \uD835\uDE3C\uD835\uDE69\uD835\uDE69\uD835\uDE67\uD835\uDE5E\uD835\uDE57\uD835\uDE6A\uD835\uDE69\uD835\uDE5A" +
                "\n\nThe <a> tag defines a hyperlink. The href attribute specifies the URL of the page the link goes to:" +
                "\n\n<a href=\"https://www.learnbot.com\">Learnbot</a>" +
                "\n\n\uD835\uDE4F\uD835\uDE5D\uD835\uDE5A \uD835\uDE68\uD835\uDE67\uD835\uDE58 \uD835\uDE3C\uD835\uDE69\uD835\uDE69\uD835\uDE67\uD835\uDE5E\uD835\uDE57\uD835\uDE6A\uD835\uDE69\uD835\uDE5A" +
                "\n\nThe <img> tag is used to embed an image in an HTML page. The src attribute specifies the path to the image to be displayed:" +
                "\n\n<img src=\"img_girl.jpg\">" +
                "\n\n\uD835\uDE4F\uD835\uDE5D\uD835\uDE5A \uD835\uDE68\uD835\uDE69\uD835\uDE6E\uD835\uDE61\uD835\uDE5A \uD835\uDE3C\uD835\uDE69\uD835\uDE69\uD835\uDE67\uD835\uDE5E\uD835\uDE57\uD835\uDE6A\uD835\uDE69\uD835\uDE5A" +
                "\n\nThe style attribute is used to add styles to an element, such as color, font, size, and more." +
                "\n\n<p style=\"color:red;\">This is a red paragraph.</p>" +
                "\n\n and many more attributes.", false));
        arrayList.add(new ModelClass("Page Titles", "All HTML pages should have a page title." +
                "\n\nTo add a title to your page, change your code so that it looks like this:\n" +
                "\n<!DOCTYPE html>\n" +
                "<html>" +
                "\n<\uD835\uDDF5\uD835\uDDF2\uD835\uDDEE\uD835\uDDF1>" +
                "\n<\uD835\uDE01\uD835\uDDF6\uD835\uDE01\uD835\uDDF9\uD835\uDDF2> \uD835\uDDE0\uD835\uDE06 \uD835\uDDF3\uD835\uDDF6\uD835\uDDFF\uD835\uDE00\uD835\uDE01 \uD835\uDE04\uD835\uDDF2\uD835\uDDEF \uD835\uDDFD\uD835\uDDEE\uD835\uDDF4\uD835\uDDF2 </\uD835\uDE01\uD835\uDDF6\uD835\uDE01\uD835\uDDF9\uD835\uDDF2>" +
                "\n</\uD835\uDDF5\uD835\uDDF2\uD835\uDDEE\uD835\uDDF1>" +
                "\n<body>" +
                "\n  This is my first web page" +
                "\n</body>" +
                "\n</html>" +
                "\n\nWe have added two new elements here, that start with the head tag and the title tag (and see how both of these close)." +
                "\n\nThe head element (that which starts with the <head> opening tag and ends with the </head> closing tag) appears before the body element (starting with <body> and ending with </body>) and contains information about the page. The information in the head element does not appear in the browser window." +
                "\n\nWe will see later on that other elements can appear inside the head element, but the most important of them is the title element." +
                "\nIf you look at this document in the browser (save and reload as before), you will see that “My first web page” will appear on a tab or the title bar of the window (not the actual canvas area). The text that you put in between the title tags has become the title of the document (surprise!). If you were to add this page to your “favorites” (or “bookmarks”, depending on your browser), you would see that the title is also used there.", false));
        arrayList.add(new ModelClass("Paragraphs", "Now that you have the basic structure of an HTML document, you can mess around with the content a bit." +
                "\n\nGo back to your text editor and add another line to your page: " +
                "\n\n" +
                "<!DOCTYPE html>" +
                "\n<html>" +
                "\n<head>" +
                "\n<title>My first web page</title>" +
                "\n</head>" +
                "\n<body>" +
                "\n  This is my first web page" +
                "\n  How exciting" +
                "\n</body>" +
                "\n</html>" +
                "\n\nLook at the document in your browser." +
                "\n\nYou might have expected your document to appear as you typed it, on two lines, but instead you should see something like this: " +
                "\n\n\uD835\uDDE7\uD835\uDDF5\uD835\uDDF6\uD835\uDE00 \uD835\uDDF6\uD835\uDE00 \uD835\uDDFA\uD835\uDE06 \uD835\uDDF3\uD835\uDDF6\uD835\uDDFF\uD835\uDE00\uD835\uDE01 \uD835\uDE04\uD835\uDDF2\uD835\uDDEF \uD835\uDDFD\uD835\uDDEE\uD835\uDDF4\uD835\uDDF2 \uD835\uDDDB\uD835\uDDFC\uD835\uDE04 \uD835\uDDF2\uD835\uDE05\uD835\uDDF0\uD835\uDDF6\uD835\uDE01\uD835\uDDF6\uD835\uDDFB\uD835\uDDF4." +
                "\n\nThis is because web browsers don’t usually take any notice of what line your code is on. It also doesn’t take any notice of spaces (you would get the same result if you typed “This is my first web page       How exciting”)." +
                "\n\nIf you want text to appear on different lines or, rather, if you intend there to be two distinct blocks of text (because, remember, HTML is about meaning, not presentation), you need to explicitly state that." +
                "\n\nChange your two lines of content so that they look like this: " +
                "\n\n" +
                "<\uD835\uDDFD>This is my first web page</\uD835\uDDFD>" +
                "\n<\uD835\uDDFD>How exciting</\uD835\uDDFD>" +
                "\n\nThe \uD835\uDDFD tag is used for paragraphs." +
                "\n\nLook at the results of this. The two lines will now appear on two lines because the browser recognizes them as separate paragraphs." +
                "\n\nThink of the HTML content as if it were a book - with paragraphs where appropriate." +
                "\n\n\uD835\uDDD8\uD835\uDDFA\uD835\uDDFD\uD835\uDDF5\uD835\uDDEE\uD835\uDE00\uD835\uDDF6\uD835\uDE00" +
                "\n\nYou can emphasize text in a paragraph using \uD835\uDDF2\uD835\uDDFA (emphasis) and \uD835\uDE00\uD835\uDE01\uD835\uDDFF\uD835\uDDFC\uD835\uDDFB\uD835\uDDF4 (strong importance)." +
                "\n\n<p>Yes, that really <\uD835\uDDF2\uD835\uDDFA>\uD835\uDDF6\uD835\uDE00</\uD835\uDDF2\uD835\uDDFA> exciting. <\uD835\uDE00\uD835\uDE01\uD835\uDDFF\uD835\uDDFC\uD835\uDDFB\uD835\uDDF4>\uD835\uDDEA\uD835\uDDEE\uD835\uDDFF\uD835\uDDFB\uD835\uDDF6\uD835\uDDFB\uD835\uDDF4: </\uD835\uDE00\uD835\uDE01\uD835\uDDFF\uD835\uDDFC\uD835\uDDFB\uD835\uDDF4> level of excitement may cause head to explode.</p>" +
                "\n\nTraditionally, browsers will display em in italics and strong in bold by default but they are not the same as i and b tags which (although they have been tenuously redefined in HTML5) have their origins in italic and bold - remember - HTML isn’t for presentation. If you want to emphasize something visually (making something italic, for example), you almost certainly want to give it general emphasis. You can’t speak in italics." +
                "\n\n\uD835\uDDDF\uD835\uDDF6\uD835\uDDFB\uD835\uDDF2 \uD835\uDDEF\uD835\uDDFF\uD835\uDDF2\uD835\uDDEE\uD835\uDDF8\uD835\uDE00" +
                "\n\nThe line-break tag can also be used to separate lines like this:" +
                "\n\nThis is my first web page<\uD835\uDDEF\uD835\uDDFF>" +
                "\nHow exciting" +
                "\n\nThere’s no content involved in breaking lines so there is no closing tag." +
                "\n\nIt could be tempting to over-use line breaks and br shouldn’t be used if two blocks of text are intended to be separate from one another (because if that’s what you want to do you probably want the p tag).", false));
        arrayList.add(new ModelClass("Headings", "The \uD835\uDDFD tag is just the start of text formatting." +
                "\n\nIf you have documents with genuine \uD835\uDDF5\uD835\uDDF2\uD835\uDDEE\uD835\uDDF1\uD835\uDDF6\uD835\uDDFB\uD835\uDDF4\uD835\uDE00, then there are HTML tags specifically designed just for them." +
                "\n\nThey are \uD835\uDDF5\uD835\uDFED, \uD835\uDDF5\uD835\uDFEE, \uD835\uDDF5\uD835\uDFEF, \uD835\uDDF5\uD835\uDFF0, \uD835\uDDF5\uD835\uDFF1 and \uD835\uDDF5\uD835\uDFF2, \uD835\uDDF5\uD835\uDFED being the almighty emperor of headings and \uD835\uDDF5\uD835\uDFF2 being the lowest pleb." +
                "\n\nChange your code to the following:" +
                "\n\n<!DOCTYPE html>" +
                "\n<html>" +
                "\n<head>" +
                "\n<title>My first web page</title>" +
                "\n</head>" +
                "\n<body>" +
                "\n   <\uD835\uDDF5\uD835\uDFED>\uD835\uDDE0\uD835\uDE06 \uD835\uDDF3\uD835\uDDF6\uD835\uDDFF\uD835\uDE00\uD835\uDE01 \uD835\uDE04\uD835\uDDF2\uD835\uDDEF \uD835\uDDFD\uD835\uDDEE\uD835\uDDF4\uD835\uDDF2</\uD835\uDDF5\uD835\uDFED>" +
                "\n\n  <\uD835\uDDF5\uD835\uDFEE>\uD835\uDDEA\uD835\uDDF5\uD835\uDDEE\uD835\uDE01 \uD835\uDE01\uD835\uDDF5\uD835\uDDF6\uD835\uDE00 \uD835\uDDF6\uD835\uDE00</\uD835\uDDF5\uD835\uDFEE>" +
                "\n   <\uD835\uDDFD>\uD835\uDDD4 \uD835\uDE00\uD835\uDDF6\uD835\uDDFA\uD835\uDDFD\uD835\uDDF9\uD835\uDDF2 \uD835\uDDFD\uD835\uDDEE\uD835\uDDF4\uD835\uDDF2 \uD835\uDDFD\uD835\uDE02\uD835\uDE01 \uD835\uDE01\uD835\uDDFC\uD835\uDDF4\uD835\uDDF2\uD835\uDE01\uD835\uDDF5\uD835\uDDF2\uD835\uDDFF \uD835\uDE02\uD835\uDE00\uD835\uDDF6\uD835\uDDFB\uD835\uDDF4 \uD835\uDDDB\uD835\uDDE7\uD835\uDDE0\uD835\uDDDF</\uD835\uDDFD>" +
                "\n\n  <\uD835\uDDF5\uD835\uDFEE>\uD835\uDDEA\uD835\uDDF5\uD835\uDE06 \uD835\uDE01\uD835\uDDF5\uD835\uDDF6\uD835\uDE00 \uD835\uDDF6\uD835\uDE00</\uD835\uDDF5\uD835\uDFEE>" +
                "\n   <\uD835\uDDFD>\uD835\uDDE7\uD835\uDDFC \uD835\uDDF9\uD835\uDDF2\uD835\uDDEE\uD835\uDDFF\uD835\uDDFB \uD835\uDDDB\uD835\uDDE7\uD835\uDDE0\uD835\uDDDF</\uD835\uDDFD>" +
                "\n\n</body>" +
                "\n</html>" +
                "\n\nNote that the h1 tag is only used once, as the main heading of the page. h2 to h6, however, can be used as often as desired, but they should always be used in order, as they were intended. For example, an h4 should be a sub-heading of an h3, which should be a sub-heading of an h2." , false));
        arrayList.add(new ModelClass("Lists", "There are three types of list; \uD835\uDE02\uD835\uDDFB\uD835\uDDFC\uD835\uDDFF\uD835\uDDF1\uD835\uDDF2\uD835\uDDFF\uD835\uDDF2\uD835\uDDF1 \uD835\uDDF9\uD835\uDDF6\uD835\uDE00\uD835\uDE01\uD835\uDE00, \uD835\uDDFC\uD835\uDDFF\uD835\uDDF1\uD835\uDDF2\uD835\uDDFF\uD835\uDDF2\uD835\uDDF1 \uD835\uDDF9\uD835\uDDF6\uD835\uDE00\uD835\uDE01\uD835\uDE00 and \uD835\uDDF1\uD835\uDDF2\uD835\uDDF3\uD835\uDDF6\uD835\uDDFB\uD835\uDDF6\uD835\uDE01\uD835\uDDF6\uD835\uDDFC\uD835\uDDFB \uD835\uDDF9\uD835\uDDF6\uD835\uDE00\uD835\uDE01\uD835\uDE00. We will look at the first two here, and description lists in the HTML Intermediate Tutorial." +
                "\n\nUnordered lists and ordered lists work the same way, except that the former is used for non-sequential lists with list items usually preceded by bullets and the latter is for sequential lists, which are normally represented by incremental numbers." +
                "\n\nThe \uD835\uDE02\uD835\uDDF9 tag is used to define unordered lists and the \uD835\uDDFC\uD835\uDDF9 tag is used to define ordered lists. Inside the lists, the \uD835\uDDF9\uD835\uDDF6 tag is used to define each list item." +
                "\n\nChange your code to the following:" +
                "\n\n<!DOCTYPE html>" +
                "\n<html>" +
                "\n<head>" +
                "\n<title>My first web page</title>" +
                "\n</head>" +
                "\n<body>" +
                "\n   <h1>My first web page</h1>" +
                "\n\n  <h2>What this is</h2>" +
                "\n   <p>A simple page put together using HTML</p>" +
                "\n\n  <h2>Why this is</h2>" +
                "\n    <\uD835\uDE02\uD835\uDDF9>" +
                "\n        <\uD835\uDDF9\uD835\uDDF6>\uD835\uDDE7\uD835\uDDFC \uD835\uDDF9\uD835\uDDF2\uD835\uDDEE\uD835\uDDFF\uD835\uDDFB \uD835\uDDDB\uD835\uDDE7\uD835\uDDE0\uD835\uDDDF</\uD835\uDDF9\uD835\uDDF6>" +
                "\n        <\uD835\uDDF9\uD835\uDDF6>\uD835\uDDE7\uD835\uDDFC \uD835\uDE00\uD835\uDDF5\uD835\uDDFC\uD835\uDE04 \uD835\uDDFC\uD835\uDDF3\uD835\uDDF3</\uD835\uDDF9\uD835\uDDF6>" +
                "\n        <\uD835\uDDF9\uD835\uDDF6>\uD835\uDDD5\uD835\uDDF2\uD835\uDDF0\uD835\uDDEE\uD835\uDE02\uD835\uDE00\uD835\uDDF2 \uD835\uDDDC'\uD835\uDE03\uD835\uDDF2 \uD835\uDDF3\uD835\uDDEE\uD835\uDDF9\uD835\uDDF9\uD835\uDDF2\uD835\uDDFB \uD835\uDDF6\uD835\uDDFB \uD835\uDDF9\uD835\uDDFC\uD835\uDE03\uD835\uDDF2 \uD835\uDE04\uD835\uDDF6\uD835\uDE01\uD835\uDDF5 \uD835\uDDFA\uD835\uDE06 \uD835\uDDF0\uD835\uDDFC\uD835\uDDFA\uD835\uDDFD\uD835\uDE02\uD835\uDE01\uD835\uDDF2\uD835\uDDFF \uD835\uDDEE\uD835\uDDFB\uD835\uDDF1 \uD835\uDE04\uD835\uDDEE\uD835\uDDFB\uD835\uDE01 \uD835\uDE01\uD835\uDDFC \uD835\uDDF4\uD835\uDDF6\uD835\uDE03\uD835\uDDF2 \uD835\uDDF5\uD835\uDDF2\uD835\uDDFF \uD835\uDE00\uD835\uDDFC\uD835\uDDFA\uD835\uDDF2 \uD835\uDDDB\uD835\uDDE7\uD835\uDDE0\uD835\uDDDF \uD835\uDDF9\uD835\uDDFC\uD835\uDE03\uD835\uDDF6\uD835\uDDFB\uD835\uDDF4.</\uD835\uDDF9\uD835\uDDF6>" +
                "\n   </\uD835\uDE02\uD835\uDDF9>" +
                "\n\n</body>" +
                "\n</html>" +
                "\n\nIf you look at this in your browser, you will see a bulleted list. Simply change the ul tags to ol and you will see that the list will become numbered." +
                "\n\nLists can also be included in lists to form a structured hierarchy of items." +
                "\n\nReplace the above list code with the following:" +
                "\n\n<ul>" +
                "\n    <li>To learn HTML</li>" +
                "\n    <li>" +
                "\n        To show off" +
                "\n        <\uD835\uDDFC\uD835\uDDF9>" +
                "\n            <\uD835\uDDF9\uD835\uDDF6>\uD835\uDDE7\uD835\uDDFC \uD835\uDDFA\uD835\uDE06 \uD835\uDDEF\uD835\uDDFC\uD835\uDE00\uD835\uDE00</\uD835\uDDF9\uD835\uDDF6>" +
                "\n            <\uD835\uDDF9\uD835\uDDF6>\uD835\uDDE7\uD835\uDDFC \uD835\uDDFA\uD835\uDE06 \uD835\uDDF3\uD835\uDDFF\uD835\uDDF6\uD835\uDDF2\uD835\uDDFB\uD835\uDDF1\uD835\uDE00</\uD835\uDDF9\uD835\uDDF6>" +
                "\n            <\uD835\uDDF9\uD835\uDDF6>\uD835\uDDE7\uD835\uDDFC \uD835\uDDFA\uD835\uDE06 \uD835\uDDF0\uD835\uDDEE\uD835\uDE01</\uD835\uDDF9\uD835\uDDF6>" +
                "\n            <\uD835\uDDF9\uD835\uDDF6>\uD835\uDDE7\uD835\uDDFC \uD835\uDE01\uD835\uDDF5\uD835\uDDF2 \uD835\uDDF9\uD835\uDDF6\uD835\uDE01\uD835\uDE01\uD835\uDDF9\uD835\uDDF2 \uD835\uDE01\uD835\uDDEE\uD835\uDDF9\uD835\uDDF8\uD835\uDDF6\uD835\uDDFB\uD835\uDDF4 \uD835\uDDF1\uD835\uDE02\uD835\uDDF0\uD835\uDDF8 \uD835\uDDF6\uD835\uDDFB \uD835\uDDFA\uD835\uDE06 \uD835\uDDEF\uD835\uDDFF\uD835\uDDEE\uD835\uDDF6\uD835\uDDFB</\uD835\uDDF9\uD835\uDDF6>" +
                "\n        </\uD835\uDDFC\uD835\uDDF9>" +
                "\n    </li>" +
                "\n    <li>Because I've fallen in love with my computer and want to give her some HTML loving.</li>" +
                "\n</ul>" +
                "\n\nA list within a list. And you could put another list within that. And another within that. And so on and so forth.", false));
        arrayList.add(new ModelClass("Links", "So far you’ve been making a stand-alone web page, which is all very well and nice, but what makes the Internet so special is that it all \uD835\uDDF9\uD835\uDDF6\uD835\uDDFB\uD835\uDDF8\uD835\uDE00 together." +
                "\n\nThe “H” and “T” in “HTML” stand for “hypertext”, which basically means a system of linked text." +
                "\n\nAn \uD835\uDDEE\uD835\uDDFB\uD835\uDDF0\uD835\uDDF5\uD835\uDDFC\uD835\uDDFF tag (a) is used to define a link, but you also need to add something to the anchor tag — the \uD835\uDDF1\uD835\uDDF2\uD835\uDE00\uD835\uDE01\uD835\uDDF6\uD835\uDDFB\uD835\uDDEE\uD835\uDE01\uD835\uDDF6\uD835\uDDFC\uD835\uDDFB of the link." +
                "\n\nAdd this to your document:" +
                "\n\n<!DOCTYPE html>" +
                "\n<html>" +
                "\n<head>" +
                "\n<title>My first web page</title>" +
                "\n</head>" +
                "\n<body>" +
                "\n   <h1>My first web page</h1>" +
                "\n\n  <h2>What this is</h2>" +
                "\n   <p>A simple page put together using HTML</p>" +
                "\n\n  <h2>Why this is</h2>" +
                "\n   <p>To learn HTML</p>" +
                "\n\n  <\uD835\uDDF5\uD835\uDFEE>\uD835\uDDEA\uD835\uDDF5\uD835\uDDF2\uD835\uDDFF\uD835\uDDF2 \uD835\uDE01\uD835\uDDFC \uD835\uDDF3\uD835\uDDF6\uD835\uDDFB\uD835\uDDF1 \uD835\uDE01\uD835\uDDF5\uD835\uDDF2 \uD835\uDE01\uD835\uDE02\uD835\uDE01\uD835\uDDFC\uD835\uDDFF\uD835\uDDF6\uD835\uDDEE\uD835\uDDF9</\uD835\uDDF5\uD835\uDFEE>" +
                "\n   <\uD835\uDDFD><\uD835\uDDEE \uD835\uDDF5\uD835\uDDFF\uD835\uDDF2\uD835\uDDF3=\"\uD835\uDDF5\uD835\uDE01\uD835\uDE01\uD835\uDDFD://\uD835\uDE04\uD835\uDE04\uD835\uDE04.\uD835\uDDF9\uD835\uDDF2\uD835\uDDEE\uD835\uDDFF\uD835\uDDFB.\uD835\uDDF0\uD835\uDDFC\uD835\uDDFA\">\uD835\uDDDF\uD835\uDDF2\uD835\uDDEE\uD835\uDDFF\uD835\uDDFB\uD835\uDDD5\uD835\uDDFC\uD835\uDE01</\uD835\uDDEE></\uD835\uDDFD>" +
                "\n\n</body>" +
                "\n</html>" +
                "\n\nThe destination of the link is defined in the href attribute of the tag. The link can be absolute, such as “http://www.facebook.com”, or it can be relative to the current page." +
                "\n\nSo if, for example, you had another file called “flyingmoss.html” in the same directory then the line of code would simply be <a href=\"flyingmoss.html\">The miracle of moss in flight</a> or something like this." +
                "\n\nA link does not have to link to another HTML file, it can link to any file anywhere on the web." +
                "\n\nA link can also send a user to another part of the same page they are on. You can add an id attribute to just about any tag, for example <h2 id=\"moss\">Moss</h2>, and then link to it by using something like this: <a href=\"#moss\">Go to moss</a>. Selecting this link will scroll the page straight to the element with that ID." , false));
        arrayList.add(new ModelClass("Images", "Things might seem a little bland and boring with all of this text formatting. Of course, the web is not just about text, it is a multi-media extravaganza and the most common form of sparkle is the \uD835\uDDF6\uD835\uDDFA\uD835\uDDEE\uD835\uDDF4\uD835\uDDF2." +
                "\n\nThe img tag is used to put an image in an HTML document and it looks like this:" +
                "\n\n<\uD835\uDDF6\uD835\uDDFA\uD835\uDDF4 \uD835\uDE00\uD835\uDDFF\uD835\uDDF0=\"\uD835\uDDF5\uD835\uDE01\uD835\uDE01\uD835\uDDFD://\uD835\uDE04\uD835\uDE04\uD835\uDE04.\uD835\uDDF9\uD835\uDDF2\uD835\uDDEE\uD835\uDDFF\uD835\uDDFB\uD835\uDDEF\uD835\uDDFC\uD835\uDE01.\uD835\uDDF0\uD835\uDDFC\uD835\uDDFA/\uD835\uDDEF\uD835\uDDEE\uD835\uDDF1\uD835\uDDF4\uD835\uDDF2\uD835\uDFED.\uD835\uDDF4\uD835\uDDF6\uD835\uDDF3\" \uD835\uDE04\uD835\uDDF6\uD835\uDDF1\uD835\uDE01\uD835\uDDF5=\"\uD835\uDFED\uD835\uDFEE\uD835\uDFEC\" \uD835\uDDF5\uD835\uDDF2\uD835\uDDF6\uD835\uDDF4\uD835\uDDF5\uD835\uDE01=\"\uD835\uDFF5\uD835\uDFEC\" \uD835\uDDEE\uD835\uDDF9\uD835\uDE01=\"\uD835\uDDDF\uD835\uDDF2\uD835\uDDEE\uD835\uDDFF\uD835\uDDFB\uD835\uDDD5\uD835\uDDFC\uD835\uDE01\">" +
                "\n\nThe src attribute tells the browser where to find the image. Like the a tag, this can be absolute, as the above example demonstrates, but is usually relative. For example, if you create your own image and save it as “alienpie.jpg” in a directory called “images” then the code would be <img src=\"images/alienpie.jpg\"..." +
                "\n\nThe width and height attributes are necessary because if they are excluded, the browser will tend to calculate the size as the image loads, instead of when the page loads, which means that the layout of the document may jump around while the page is loading." +
                "\n\nThe alt attribute is the alternative description. This is an accessibility consideration, providing meaningful information for users who are unable to see the image (if they are visually impaired, for example)." +
                "\n\nNote that, like the br tag, because the img element does not enclose any content, no closing tag is required." +
                "\n\nThe construction of images for the web is a little outside of the remit of this website, but it is worth noting a few things…" +
                "\n\nThe most commonly used file formats used for images are JPEGs, GIFs, and PNGs. They are compressed formats, and have very different uses." +
                "\n\n\uD835\uDDDD\uD835\uDDE3\uD835\uDDD8\uD835\uDDDA\uD835\uDE00 \uD835\uDDEE\uD835\uDDFF\uD835\uDDF2 \uD835\uDE01\uD835\uDE06\uD835\uDDFD\uD835\uDDF6\uD835\uDDF0\uD835\uDDEE\uD835\uDDF9\uD835\uDDF9\uD835\uDE06 \uD835\uDE02\uD835\uDE00\uD835\uDDF2\uD835\uDDF1 \uD835\uDDF3\uD835\uDDFC\uD835\uDDFF \uD835\uDDF6\uD835\uDDFA\uD835\uDDEE\uD835\uDDF4\uD835\uDDF2\uD835\uDE00 \uD835\uDE00\uD835\uDE02\uD835\uDDF0\uD835\uDDF5 \uD835\uDDEE\uD835\uDE00 \uD835\uDDFD\uD835\uDDF5\uD835\uDDFC\uD835\uDE01\uD835\uDDFC\uD835\uDDF4\uD835\uDDFF\uD835\uDDEE\uD835\uDDFD\uD835\uDDF5\uD835\uDE00." +
                "\n\nA JPEG (pronounced “jay-peg”) uses a mathematical algorithm to compress the image and will distort the original slightly. The lower the compression, the higher the file size, but the clearer the image." +
                "\n\n\uD835\uDDDA\uD835\uDDDC\uD835\uDDD9\uD835\uDE00 \uD835\uDDEE\uD835\uDDFF\uD835\uDDF2 \uD835\uDE01\uD835\uDE06\uD835\uDDFD\uD835\uDDF6\uD835\uDDF0\uD835\uDDEE\uD835\uDDF9\uD835\uDDF9\uD835\uDE06 \uD835\uDE02\uD835\uDE00\uD835\uDDF2\uD835\uDDF1 \uD835\uDDF3\uD835\uDDFC\uD835\uDDFF \uD835\uDDF6\uD835\uDDFA\uD835\uDDEE\uD835\uDDF4\uD835\uDDF2\uD835\uDE00 \uD835\uDE04\uD835\uDDF6\uD835\uDE01\uD835\uDDF5 \uD835\uDE00\uD835\uDDFC\uD835\uDDF9\uD835\uDDF6\uD835\uDDF1 \uD835\uDDF0\uD835\uDDFC\uD835\uDDF9\uD835\uDDFC\uD835\uDDFF\uD835\uDE00, \uD835\uDE00\uD835\uDE02\uD835\uDDF0\uD835\uDDF5 \uD835\uDDEE\uD835\uDE00 \uD835\uDDF6\uD835\uDDF0\uD835\uDDFC\uD835\uDDFB\uD835\uDE00 \uD835\uDDFC\uD835\uDDFF \uD835\uDDF9\uD835\uDDFC\uD835\uDDF4\uD835\uDDFC\uD835\uDE00." +
                "\n\nA GIF (pronounced “jif”) can have no more than 256 colors, but they maintain the colors of the original image. The lower the number of colors you have in the image, the lower the file size will be. GIFs also allow any pixel in the image to be transparent." +
                "\n\n\uD835\uDDE3\uD835\uDDE1\uD835\uDDDA\uD835\uDE00 \uD835\uDDEE\uD835\uDDFF\uD835\uDDF2 \uD835\uDE01\uD835\uDE06\uD835\uDDFD\uD835\uDDF6\uD835\uDDF0\uD835\uDDEE\uD835\uDDF9\uD835\uDDF9\uD835\uDE06 \uD835\uDE02\uD835\uDE00\uD835\uDDF2\uD835\uDDF1 \uD835\uDDF3\uD835\uDDFC\uD835\uDDFF \uD835\uDE03\uD835\uDDF2\uD835\uDDFF\uD835\uDE00\uD835\uDDEE\uD835\uDE01\uD835\uDDF6\uD835\uDDF9\uD835\uDDF2 \uD835\uDDF6\uD835\uDDFA\uD835\uDDEE\uD835\uDDF4\uD835\uDDF2\uD835\uDE00 \uD835\uDDF6\uD835\uDDFB \uD835\uDDFA\uD835\uDDFC\uD835\uDDFF\uD835\uDDF2 \uD835\uDDF0\uD835\uDDFC\uD835\uDDFA\uD835\uDDFD\uD835\uDDF9\uD835\uDDF2\uD835\uDE05 \uD835\uDDF1\uD835\uDDF2\uD835\uDE00\uD835\uDDF6\uD835\uDDF4\uD835\uDDFB\uD835\uDE00 \uD835\uDDD5\uD835\uDDE8\uD835\uDDE7 \uD835\uDE01\uD835\uDDF5\uD835\uDDF2\uD835\uDE06 \uD835\uDDEE\uD835\uDDFF\uD835\uDDF2 \uD835\uDDFB\uD835\uDDFC\uD835\uDE01 \uD835\uDDF3\uD835\uDE02\uD835\uDDF9\uD835\uDDF9\uD835\uDE06 \uD835\uDE00\uD835\uDE02\uD835\uDDFD\uD835\uDDFD\uD835\uDDFC\uD835\uDDFF\uD835\uDE01\uD835\uDDF2\uD835\uDDF1 \uD835\uDDEF\uD835\uDE06 \uD835\uDE00\uD835\uDDFC\uD835\uDDFA\uD835\uDDF2 \uD835\uDDFC\uD835\uDDF9\uD835\uDDF1\uD835\uDDF2\uD835\uDDFF \uD835\uDDEF\uD835\uDDFF\uD835\uDDFC\uD835\uDE04\uD835\uDE00\uD835\uDDF2\uD835\uDDFF\uD835\uDE00." +
                "\n\nA PNG (pronounced “ping”) replicates colors, much like a GIF, but allows 16 million colors as well as alpha transparency (that is, an area could be 50% transparent)." +
                "\n\nThe web is forever getting faster and faster but you obviously want your web pages to download as quickly as possible. Using super-high resolution images isn’t doing your or your user’s bandwidth (or patience) any favors. Image compression is a great tool and you need to strike a balance between image quality and image size. Most modern image manipulation programs allow you to compress images and the best way to figure out what is best suited for yourself is trial and error.", false));
        arrayList.add(new ModelClass("Tables", "HTML tables are still best known for being used and abused to lay out pages. We will come across how to layout a page without tables, in the CSS Intermediate Tutorial. The correct use for tables is to do exactly what you would expect a table to do — to structure tabular data." +
                "\n\nThere are a number of tags used in tables, and to fully get to grips with how they work is probably the most difficult area of this HTML Beginner Tutorial." +
                "\n\nCopy the following code into the body of your document and then we will go through what each tag is doing:" +
                "\n\n<table>" +
                "\n   <tr>" +
                "\n        <td>Row 1, cell 1</td>" +
                "\n        <td>Row 1, cell 2</td>" +
                "\n        <td>Row 1, cell 3</td>" +
                "\n    </tr>" +
                "\n    <tr>" +
                "\n        <td>Row 2, cell 1</td>" +
                "\n        <td>Row 2, cell 2</td>" +
                "\n        <td>Row 2, cell 3</td>" +
                "\n    </tr>" +
                "\n    <tr>" +
                "\n        <td>Row 3, cell 1</td>" +
                "\n        <td>Row 3, cell 2</td>" +
                "\n        <td>Row 3, cell 3</td>" +
                "\n    </tr>" +
                "\n    <tr>" +
                "\n        <td>Row 4, cell 1</td>" +
                "\n        <td>Row 4, cell 2</td>" +
                "\n        <td>Row 4, cell 3</td>" +
                "\n    </tr>" +
                "\n</table>" +
                "\n\nThe table element defines the table." +
                "\n\nThe tr element defines a table row." +
                "\n\nThe td element defines a data cell. These must be enclosed in tr tags, as shown above." +
                "\n\nIf you imagine a 3x4 table, which is 12 cells, there should be four tr elements to define the rows and three td elements within each of the rows, making a total of 12 td elements.", false));
        arrayList.add(new ModelClass("Putting It All Together", "If you have gone through all of the pages in this HTML Beginner Tutorial then you should be a competent HTMLer. In fact, you should be better than most." +
                "\n\nThe following code incorporates all of the methods that have been explained in the previous pages:" +
                "\n\n<!DOCTYPE html>" +
                "\n\n<html>" +
                "\n\n<head>" +
                "\n    <title>My first web page</title>" +
                "\n    <!-- This is a comment, by the way -->" +
                "\n</head>" +
                "\n\n<body>" +
                "\n\n<h1>My first web page</h1>" +
                "\n<h2>What this is</h2>" +
                "\n<p>A simple page put together using HTML. <em>I said a simple page put together using HTML.</em> A simple page put together using HTML. A simple page put together using HTML. A simple page put together using HTML. A simple page put together using HTML. A simple page put together using HTML. A simple page put together using HTML. A simple page put together using HTML.</p>" +
                "\n\n<h2>Why this is</h2>" +
                "\n<ul>" +
                "\n    <li>To learn HTML</li>" +
                "\n   <li>" +
                "\n        To show off" +
                "\n        <ol>" +
                "\n            <li>To my boss</li>" +
                "\n            <li>To my friends</li>" +
                "\n            <li>To my cat</li>" +
                "\n            <li>To the little talking duck in my brain</li>" +
                "\n        </ol>" +
                "\n    </li>" +
                "\n    <li>Because I have fallen in love with my computer and want to give her some HTML loving.</li>" +
                "\n</ul>" +
                "\n\n<h2>Where to find the tutorial</h2>" +
                "\n<p><a href=\"http://www.learnbot.com\"><img src=\"http://www.learnbot.com/badge1.gif\" width=\"120\" height=\"90\" alt=\"LearnBot\"></a></p>" +
                "\n\n<h3>Some random table</h3>" +
                "\n<table>" +
                "\n    <tr>" +
                "\n        <td>Row 1, cell 1</td>" +
                "\n        <td>Row 1, cell 2</td>" +
                "\n        <td>Row 1, cell 3</td>" +
                "\n    </tr>" +
                "\n    <tr>" +
                "\n        <td>Row 2, cell 1</td>" +
                "\n        <td>Row 2, cell 2</td>" +
                "\n        <td>Row 2, cell 3</td>" +
                "\n    </tr>" +
                "\n    <tr>" +
                "\n        <td>Row 3, cell 1</td>" +
                "\n        <td>Row 3, cell 2</td>" +
                "\n        <td>Row 3, cell 3</td>" +
                "\n    </tr>" +
                "\n    <tr>" +
                "\n        <td>Row 4, cell 1</td>" +
                "\n        <td>Row 4, cell 2</td>" +
                "\n        <td>Row 4, cell 3</td>" +
                "\n    </tr>" +
                "\n</table>" +
                "\n\n</body>" +
                "\n\n</html>" +
                "\n\nThere you have it. Save the file and play around with it — this is the best way to understand how everything works. Go on. Tinker." +
                "\n\nWhen you’re happy, make the CSS Basics your next step. There, you will learn the basics of how to make all of this HTML look pretty", false));


        adapter = new Adapter(arrayList,HTML.this);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(adapter);
        adapter.notifyDataSetChanged();







    }
}