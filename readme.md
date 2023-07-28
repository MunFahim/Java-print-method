# Replacing the Java print statement

- Insert the two methods into your class

```java
public static void print(Object... args){
    int last = args.length;
    for(Object input : args){
        if (last > 1){
            System.out.print(input+" ");
        }else {
            System.out.print(input);
        }
        last--;
    }
}
public static void println(Object... args){
    int last = args.length;
    for(Object input : args){
        if (last > 1){
            System.out.print(input+" ");
        }else {
            System.out.println(input);
        }
        last--;
    }
}
```

- Done, now you can use print() and println()
