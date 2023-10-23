package org.peaksoft;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {

        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                "applicationContext.xml");
//        TeachAble teachAble= context.getBean("javaScript", TeachAble.class);
//        teachAble.teach();


//        JavaTeacher javaTeacher=new JavaTeacher();
//        Course course=new Course(javaTeacher);
//        course.getJavaTeacher();

      Course course=context.getBean("course", Course.class);
      course.getJavaTeacher();
        System.out.println(course.getName());
        System.out.println(course.getPrice());

    }
}
