package task3;

import task3.tool.Print;

public class HelloWorld {
    public static void main(String[] args) {
        Test.test();
        for(String arg:args){
            Print.print(arg);
        }
    }
}

class Test {
    public static void test() {
        Print.print("Hello World");
    }
}
