
// Classes have a unique default constructor. We will see that we can create extra constructors for some exceptional cases, but keep in mind that most situations only require a single constructor. Parameters are written just after the name. Braces are not required if the class is empty:
class Person(name: String, surname: String) 

// Where is the body of the constructor then? You can declare an init block:

 class Person(name: String, surname: String) {
     init {
        //...
     }
 }



/*
### Class inheritance
By default, a class always extends from Any (similar to Java Object), but we can extend any other classes. Classes are closed by default (final), so we can only extend a class if it is explicitly declared as open or abstract:

* Note that when using the single constructor structure, we need to specify the parameters we are using for the parent constructor. That is equivalent to calling super() in Java.

 */

 open class Animal(name: String)

 class Person(firstName: String, lastName: String) : Animal(firstName)


/*
    Functions in Kotlin always return a value. If you skip the return value, the function is indeed returning Unit. 
 */

 fun onCreate(savedInstanceState: Bundle?) {

 }

// Unit is similar to void in Java, though this is, in fact, an object. You can, of course, specify any type as a return value:
 fun add(x: Int, y: Int): Int {
     return x + y
 }

// One line function without brackets
fun add(x: Int, y: Int) : Int = x + y


 // . Constructor and functions parameters

 // A handy thing about parameters is that we can make them optional by specifying a "default value". Here is an example of a function you could create in an activity, which uses a toast to show a message:

 fun toast(message: String, length: Int = Toast.LENGTH_SHORT) {
     Toast.makeText(this, message, length).show()
 }

// ...This feature prevents the need for function overloading:
 toast("Hello")
 toast("Hello", Toast.LENGTH_LONG)


// And this can be as complex as you want. Check this other example:
 fun niceToast(message: String,
               tag: String = MainActivity::class.java.simpleName,
               length: Int = Toast.LENGTH_SHORT) {
     Toast.makeText(this, "[$tag] $message", length).show()
 } 


 niceToast("Hello")
 niceToast("Hello", "MyTag")
 niceToast("Hello", "MyTag", Toast.LENGTH_SHORT)


// There is even another option, because you can use named arguments, which means you can write the name of the argument preceding the value to specify which one you want:
 niceToast(message = "Hello", length = Toast.LENGTH_SHORT)

// String templates

"[$className] $message". 

"Your name is ${user.name}".


