public class demo1 {


    public static void main(String[] args) {
        Person[] s=new Person[3];

        s[0]=new Students();
        s[1]=new Person();
        s[2]=new Person();
        for(int i=0;i<s.length;i++){
            System.out.println(s[i]);
        }

    }

}

class Students extends Person {

    public Students(){

    }
    private String className;


}

class Person{
    private String name;
    public Person(){

    }
}
