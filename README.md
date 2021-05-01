# Android

- Mobile OS maintained by Google 

- Originally purchased from Android, Inc. in 2005

- Runs on phones, tablets, watches, and TVs

- Based on Kotlin/Java (dev languages) and Linux Kernel 

- The #1 mobile OS worldwide, and now #1 overall OS worldwide

- Has over 1 million apps published by the play store. 

- code is released as open-source. Easier to customize. license, pirate than IOS. 

## Why develop for Android?

- Why not just write a web site. Android has a browser after all. 

- Better, snappier UI with a more consistent user experience.

- Able to use different kinds of widgets/controlls than in a web page. 

- More direct access to any device's hardware (camera, GPS, and many more)

- Users highly prefer apps overmobile web browsing. 


## Android Architecture 

- Android OS provides libraries for many system features like contacts, phone dialing, notification, , 2D/3D graphics, databases access, security/encryption, camera, audio, input/output,...

- Android code os compiled into a special dalvik binary format.


## Softwares 

1- IDE. Android studio. 


## Project Structures

- AndroidManifest.xml 
    - Overall project config and settings 

- src/...

    - source code for your kotlin/java classes


- res/... = resource files (mnay are xml)
    - drawables/ = imwges
    - layout/ = descriptions of GUI layout
    - strings/ = localization data
    - styles/ = general appearance stylin

- Gradle 

    - a build/compile management system 


## Android terminology 


- Activity: A single screen of UI in app
    1- The fundemental unit of GUI

- View: Visible onscreen items.

 - Widget: Gui control such as a button 

 - layout: invisible container to position/size widgets

 - event: action that occurs when user interacts with widgets

    1- Example: clicks, typing, timer expiring, scrolling, recording,...


- action bar: top menu of common actions 

- notification area: top system menu 


## Aside 

### Displaying Toast 

- Toast: a pop-up message that appears for a short time. 

- useful for displaying short updates in response to events. 

- should not be reliaed upon extensively for important info. 

- length can also be Toast,LENGTH_LONG 

## Layout 

How does the programmer specify where each component appears, how big each componnet should be, etc? 

###  Absoulte positioning (C++, C#, others)

    - Programmers specify exactly where each pixel should be.
   
### Layout managers (java, kotlin, Android, CSS flex and more, ios layouts) 

-  Objects that decide where ti position each component basd on some general rules or criteria. 


- "put these four buttons into a 2x2 gridand put these text boxes in a horizontal flow in the south part of the app.
    
- More flexible and general; works better with a variety of devices. 

### ViewGroup as layout 

- ViewGroup superclass represents containers of views. 
    1- layouts are described in XML and mirrored in java/kotlin code 
    2- Android provides several pre-existing layout managers; you can define your own custom layout if needed.


- In kotlin/java code and XML 

    1- an activity is a viewGroup 
    2- various layouts classes are also viewGroups
    3- widgets can be added toa  ViewGroup, which will then manage that widget's position/size behaveor 



### XML 

A language for describing hierarchical text data. 

- Uses tags that consist of elements and attributes. Tags cab be nested. 

- Some tags are opened and closde, others self-close.


Example: (case-sensitive)

### Types of Layouts 


#### - LinearLayout.
    - Lays out widgets/views in a single line. 

    - orientation of horizontal or vertical 

    - items do not wrap if they reach edge of screen. 

- Important properties.

1- orientation: vertical/horizontal 

2- gravity: "center|right|left|bottom|top"

used for poistioning all items inside a specific layout. 

3- laout_gravity: "center|right|left|bottom|top"

used for poistioning a specific items inside a layout. 

4- Weight: relative element sizes by integers. 
    - widget with weight k fets 



5- Widget box 

1- Content: Size of widget itself

2- padding: artifical increase to widget size outsize of content

3- border: outside padding, a line around edge of widget

4- margin: invisible seperation from neighboring widgets. 

#### - GridLayout

lays out widgets/views in lines of rows and columns. 

