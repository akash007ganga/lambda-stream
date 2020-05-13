1) What are lambda expresssion

Labda expressions are anonymous inner class. Normally a function has four things
-Name
-Parameter List
-Body
-Return Type
In case of lambda, two most importat of above is used
-Parameter List
-Body
Because name is not required for anonymous and return type can be inferred. See LambdaExample1.java
Interfaces which have single abstract method(FunctionalInterface) like Runnable/Callable/FileFilter can readily
be used as Lambdas. Lambdas doesn't get replaced by Anonymous inner classes. It simply becomes invoke 
dynamic of java 7. Check that anonymous inner class files are not created here.


2) What are method references
method reference is useful when receive the parameter and pass through to an method as argument. 
No operation is done on the argument.
method reference
in case of instance method = object :: method Name
in case of static method = class name:: method name
in case of target = Class Name :: method name