using System;

namespace Project_1 {
    class MainClass {
        public static void Main (string[] args) {
            Console.WriteLine ("Hello World!");
            Console.ReadKey ();
        }
    }
}

// mcs -out:hello.exe hello.cs
// mono hello.exe