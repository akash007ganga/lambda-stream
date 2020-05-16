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
        
5) how does Streams work

There are two types of stream operations: intermediate operations, which return another stream, 
and terminal operations, which return something other than a stream. Intermediate operations are lazy, 
meaning they aren't actually executed until and unless a terminal stream operation is performed on their 
results. Consequently if the result of an intermediate stream operation is not fed to a terminal operation, 
it serves no purpose, which is almost certainly an error.


Streams are lazy. There are two sets of operations. Intermediate operations and terminal operations. 
Intermediate operations are postponed for evaluation. It builds pipeline of functions but doesn't do any work.
_7_StreamPerformance : here all the sequence of computations are applied one one element from the collection 
at a time. Like 
Computatioon 1: element: 1, is it greater than 3 : no, go ahead
Computatioon 2: element: 2, is it greater than 3 : no, go ahead
Computatioon 3: element: 3, is it greater than 3 : no, go ahead
Computatioon 4: element: 5, is it greater than 3 : yes, is it even: no, go ahead
Computatioon 5: element: 4, is it greater than 3 : yes, is it even: yes, double it. this is our element

Evaluation doesn't perform if terminal operations are not called.

6) Properties of Stream

Sized or Unsized
Ordered or Unordered
Distinct or Non Distrinct
Sorted or Unsorted

7) Infinte Stream
Stream.iterate(10, e-> e+1) //unbouned lazy stream start from 10

8) Terminal operations
sum: 
min:
max: 
count: 
findFirst: returns an Optional for the first entry in the stream; the Optional can, of course, be empty:  
reduce, 
collect, 
forEach() : it loops over the stream elements, calling the supplied function on each element
average()

allMatch
anyMatch
noneMatch

9) Intermediate/Lazy operation
map(): map() produces a new stream after applying a function to each element of the original stream. 
       The new stream could be of different type.

collect():  performs mutable fold operations (repackaging elements to some data structures and 
            applying some additional logic, concatenating them, etc.) on data elements held 
            in the Stream instance.
            
filter: This produces a new stream that contains elements of the original stream that pass a 
        given test (specified by a Predicate)
        

toArray: get an array out of the stream

flatMap: 

range() : returns a sequential ordered IntStream/LongStream

peek: sometimes we need to perform multiple operations on each element of the stream before any 
      terminal operation is applied. This method exists mainly to support debugging

peek():  can be useful in situations like this. Simply put, it performs the specified operation on each 
         element of the stream and returns a new stream which can be used further
         
skip:  short-circuiting operations. Short-circuiting operations allow computations on infinite streams 
       to complete in finite time:Returns a stream consisting of the remaining elements of the stream after 
       discarding the first n elements of the stream.

limit: Returns a stream consisting of the elements of this stream, truncatedto be no longer than maxSize in length

collect:

sorted:

distinct:



10)

IntStream, LongStream, and DoubleStream 

11) Reduction Operations
reduce


12) Advanced collect
joining
toSet
toCollection
summarizingDouble() 
summaryStatistics() 
partitioningBy
groupingBy
mapping
reducing



13)
A1) Imagine that I have a list of certain objects say List<Student>. And I need to generate another 
   list including the ids of Students in the above list:
   
A2) Lets say there is two collection of students. 
    List studentFromDB
    List studentFromExcel

    if same user present in both the collection, then change the id of that user in List studentFromDb as 0