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

3) Parallel Stream
use it when
1) problem is parallelizable
2) willing to spent lot more resource
3) datasize is big enough
4) task of computation is big enough

4) What is Stream
Stream is a abstruction. It doesn't have any data. Stream doesn't mutate data. It does transform 
from one to next.

Functions:
filter : no member or every member or anything between
map: Transform values. Number of output = number of input. Input type and output type can be very different
reduce: take input, take the first element, perform operation, push the result-> result will be input...
        It can change a stream to single value.