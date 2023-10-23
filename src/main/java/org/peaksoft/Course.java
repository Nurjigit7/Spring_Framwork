package org.peaksoft;


import org.springframework.stereotype.Component;

//@Component -> бул аноттасия бизге bean ди даяр тузуп берет
public class Course {
    private String name;
    private int price;

    private JavaTeacher javaTeacher;

//    public Course(JavaTeacher javaTeacher) {
//        this.javaTeacher = javaTeacher;
//    }
    public void getJavaTeacher(){
        System.out.println("JavaTeacher");
        javaTeacher.teach();
    }
//    @Autowired
    public void setJavaTeacher (JavaTeacher javaTeacher){
        this.javaTeacher=javaTeacher;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}
