# A Quick Overview of Web Development.
Learning HTML is the first step to becoming a web developer. But it is just one of several languages you will need to know to create websites and web applications. In this lesson, you will learn where HTML fits in the ecosystem of web development.

## HTML is Part of a Team.
Before you get started writing HTML code, it’s important to understand where HTML fits in the ecosystem of web development. Let’s first consider what happens when you visit a website. When you type in a URL in the location bar of your browser (e.g., https://www.runners-home.com/), the browser makes a request from the web server for a web page. If you don’t specify the name of the file you want (e.g., contact.html or about.html), the web server will send a default page, which is most likely called index.html, index.php, index.cfm, or something similar. The web server returns that web page to the browser for display. The web page may include references to other files:

* Images to display on the page.
* Style sheets to add formatting to the page.
* Scripts to add interactivity to the page.

The browser will download these referenced files as well. To get a better feel for this, do the following in Google Chrome:

1. As illustrated below…
A. Click the three-vertical-dot icon in the upper right of Google Chrome:
B. Then select More tools.
C. Then select Developer tools. This will open Chrome’s Developer tools.

![alt text](https://static.webucator.com/materials/manuals/courseware-html/overview-chrome-developer-tools.png)

2. In Developer Tools, select the Network tab:

![alt text](https://static.webucator.com/materials/manuals/courseware-html/overview-chrome-developer-network-tab.png)

3. If Developer tools isn’t docked on the bottom of the browser, move it to the bottom to make it easier to see the Network tab information:

![alt text](https://static.webucator.com/materials/manuals/courseware-html/overview-chrome-developer-dock-bottom.png)

Developer tools should now be at the bottom of the browser:

![alt text](https://static.webucator.com/materials/manuals/courseware-html/overview-chrome-dev-tools-bottom-docked.png)

4. Now, in the location bar of your browser, enter https://www.runners-home.com/ and press `Enter`:

![alt text](https://static.webucator.com/materials/manuals/courseware-html/overview-chrome-location-bar-runners-home.png)

5. After the page loads, take a look at the Network tab. You should see something like this:

![alt text](https://static.webucator.com/materials/manuals/courseware-html/overview-chrome-network-runners-home.png)

A. www.runners-home.com – Although it doesn’t specify the page, this represents the main page you requested: the HTML page (usually called index).
B. toggle.js – A JavaScript page used for adding interactivity to the HTML page. Notice in the fourth column that the initiator for this page is (index). That means that the HTML code instructed the browser to download this page.
C. Style sheets ending with .css – CSS pages used for adding style and formatting to the HTML page. Like the JavaScript page, these pages were also requested by the HTML code.
D. Images ending with .png and .jpg – Images to display on the page. The images were also requested by the HTML code.
E. Font files ending with .woff2 – Web fonts for adding custom fonts to your web page.
F. Though not shown in the first screenshot of the location bar, you may also see favicon.ico – An icon used to identify the website on the browser tab:

![alt text](https://static.webucator.com/materials/manuals/courseware-html/overview-chrome-runners-home-favicon.png)

Note that favicon.ico only gets delivered when pages are sent from a web server. When you open files in a browser directly from your file system, the favicon will not show up.

As you can see, HTML, while essential, is just a piece of the puzzle. Web development involves a combination of client-side-programming and server-side-programming languages. We will now introduce the most common languages, but don’t worry if you don’t fully understand the role of each one. At this point, the most important takeaway is that HTML is just one of many languages used in web development.