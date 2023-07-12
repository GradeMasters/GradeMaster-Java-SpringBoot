# GradeMaster-Java-SpringBoot

## Starting/Replicating this Repository
1. Create a repository on Github where you will be connecting your web application and where you will be managing all of your awesome code!!
2. Next, head on over to ([Spring Initializr] (https://start.spring.io/)) to initialize your Spring Project
   - Select a Maven project
   - Choose a Language (we chose Java)
   - Select a Spring Boot Version (we are using 3.1.1)
   - Under project metadata:
     - com.<"insert cool name here">
     - description should be specific/creative
     - Package name will change on its own, leave as is
     - Packaging: Jar
     - Java 17+
     - Add Dependencies:
       - Spring Web
       - Spring Boot DevTools
3. The project will generate as a .zip folder in your downloads.
4. In your favorite IDE (we're using IntelliJ), add the following line to your .gitignore:
   - src/main/resources/application.properties
   - This will ignore all of the sensitive information regarding our application
5. Add a file src/main/resources/example.properties and add it to Git. Structure this so that anyone who checks out the example.properties can mimic their application.properties based off of the example
6. Connect your repository to your project (always check to make sure anything you have .gitignore is not tracked and remain untracked for any commit/push)
7. Happy Coding!!!!
