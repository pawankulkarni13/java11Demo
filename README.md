## Java 11

### Java 11 LTS
2nd LTS after Java8
Since J11 it will no longer be free for commercial use. Need a buy a license.

Per Oracle, it will not be providing free long-term support (LTS) for any single Java version since Java 11.
While Oracle JDK is no longer free, you can always download the Open JDK builds from Oracle or other providers such as AdoptOpenJDK, Azul, IBM, Red Hat, etc.
This can help you for developmental activities and not for Enterprise level usage. 
Oracle continues to provide Open JDK releases, which we can download and use without charge.

What if I stay on old versions which is free ?
Its fine. !! Support ends. You will not be provided with any updates/builds/patches.
This can bring in security loopholes.

### String Methods
String class: isBlank, lines, strip, stripLeading, stripTrailing, and repeat.

### Files New Method
We can now write and read String directly into Files using static methods.
Files.readString
Files.writeString
Files.isSameFile

### Collection to Array
toArray() is introduced in Collection interface.

### Predicate Interface
Predicate as a negation method - not()
This can be used with method references also.

### Local Variable Syntax for Lambda
Local variables in lambda parameters and stream processing is possible now.

### HTTP Client Introduced in Java 9
This was introduced in Java9 but is made standard feature in J11.
New HTTP API provides overall performance and supports http/1.1 and http/2

### Nest Based Access Controls
https://www.baeldung.com/java-nest-based-access-control

### Single File Source Code
we don't need to compile the Java source files with javac explicitly anymore
`java HelloWorld.java
Hello from Java 11!`

### Thread methods removal
thread functions: stop(Throwable obj) and destroy() objects have been removed from the JDK 11 
because they only throw UnSupportedOperation and NoSuchMethodError respectively. 
Other than that, they were of no use.

### Addition of new method
asMatchPredicate() in Predicate

### Performance Enhancements
#### Flight Recorder
Java Flight Recorder(JFR) 
is now open-source in Open JDK. 
JFR is a profiling tool that we can use to gather diagnostics and profiling data from a running Java application

To start a 200 seconds JFR recording, we can use the following parameter:
-XX:StartFlightRecording=duration=200s,settings=profile,filename=java-demo-app.jfr
What happens now ? Once the app is launced for the next 200 seconds. all the activities and data are logged into the jfr file mentioned.
Once the time elapses, we can access the recorded data saved in a JFR file.
To analyze and visualize the data, we need to make use of another tool called JDK Mission Control (JMC).
We can use JFR in production since its performance overhead is usually below 1%. 
Link - https://openjdk.java.net/jeps/328

#### Epsilon Garbage Collector:
This handles memory allocation but does not have actual memory reclamation mechanism. Once the available Java heap is exhausted, JVM will shut down.
Its goals are:-     
     Performance testing
     Memory pressure testing
     last drop latency improvements

### Removed/Deprecared Modules
https://openjdk.java.net/projects/jdk/11/


### Links
https://openjdk.java.net/projects/jdk/11/