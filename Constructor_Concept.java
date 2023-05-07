
    public class MyClass {
        private int myInt;
        private String myString;

        public MyClass(int myInt) {
            this.myInt = myInt;
            this.myString = "default string";
        }

        public MyClass(int myInt, String myString) {
            this.myInt = myInt;
            this.myString = myString;
        }

        public MyClass() {
            // call the other constructor with default values
            MyClass temp = new MyClass(0);
            this.myInt = temp.myInt;
            this.myString = temp.myString;
        }

        // other class methods
        public static void main(String[] args) {
            MyClass myObject = new MyClass();
            System.out.println(myObject.myInt);
            System.out.println(myObject.myString);
        }
    }






