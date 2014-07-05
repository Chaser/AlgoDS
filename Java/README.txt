src 	  	  	  	 
 +-- main 	  	  	 
     +-- java 	  	Main Java source directory. Under version control.
     +-- resources   	General resources. Under version control.
         +-- database 		Embedded databases such as Cloudscape.
         +-- scripts 		Shell or batch files.
         +-- images 		Optional: images and icons.
         +-- sounds 		Optional
         +-- xml 		XML and XSLT files.
     +-- config 	Configuration files. Under version control
     +-- help 	  	JavaHelp files. Under version control.
  	  	  	  	 
  	  	  	  	 
     +-- site 	  	Maven settings for the documentation site. Under version control.
  	  	  	 	 
     +-- test 	  	Test source files. Under version control
         +-- java 	  	 
         +-- resources 	Any resources needed by the tests.
  	  	  	  	   	  	  	  	 
docs 	  	  	General document repository. Under version control.	  	 
     +-- library		Any general documents, articles of interest or relevance 	  	  	 
     +-- project       		A project plan
     +-- design	       		Design documents  
     +-- apis			Javadocs
  	  	  	  	 
libs 	  	  	Third party JARs. Under version control for now, but these could be externalised at some point.
  	  	  	  	 
installer 	  	BuildDesk or InstallAnywhere project files. Under version control.
  	  	  	  	 
target 	  	  	The target directory is used to house all output of the build.  	  	  	  	 
  	  	  	  	 
distrib 	  	Created and deleted by the build file. Not under version control.
     +-- libs 	  	  	 
     +-- docs 	  	  	 

build 	  	  	Build output. Created and deleted by the build file. Not under version control.
     +-- libs 	  	  	 
     +-- classes 	  	  	 
     +-- test


Build Notes
  Compiling Command Line
    -In project root directory call javac ./src/main/java/*.classes -d ./build/classes
    *Build/classes has to exist!

  Running Command Line
    -In project root directory call java -classpath ./build/classes (PackageName)/(entrypoint)
    *Example java -classpath ./build/classes Strategy.MiniDuckSimulator
