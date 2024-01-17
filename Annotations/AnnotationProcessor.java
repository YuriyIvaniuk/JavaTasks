public class AnnotationProcessor {
    public static void main(String[] args) {
        Class<AnnotatedClass> annotatedClass = AnnotatedClass.class;
        if (annotatedClass.isAnnotationPresent(MyAnnotation.class)) {
            MyAnnotation annotation = annotatedClass.getAnnotation(MyAnnotation.class);
            String value = annotation.value();
            System.out.println("Value: " + value);
        } else {
            System.out.println("Annotation not present on AnnotatedClass");
        }
    }
}
