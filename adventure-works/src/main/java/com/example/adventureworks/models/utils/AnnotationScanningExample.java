package com.example.adventureworks.models.utils;

public class AnnotationScanningExample
{
//    public static void main(String[] args)
//    {
//        for (Class<?> eachClass : getSuperClasses(A.class))
//        {
//            for (Method method : eachClass.getDeclaredMethods())
//            {
//                addToAnnotationLists(new MethodMember(method),
//                        methodsForAnnotations);
//            }
//            for (Field field : eachClass.getDeclaredFields())
//            {
//                addToAnnotationLists(new FieldMember(field),
//                        fieldsForAnnotations);
//            }
//        }
//        System.out.println("__________________________________________________________");
//        methodsForAnnotations.forEach((k, v) -> {
//            System.out.println(k + "->");
//            v.forEach(System.out::println);
//        });
//        System.out.println("__________________________________________________________");
//        fieldsForAnnotations.forEach((k, v) -> {
//            System.out.println(k + "->");
//            v.forEach(System.out::println);
//        });
//    }

//    private static <T extends AbstractMethodOrField<T>> void addToAnnotationLists(
//            T methodOrField, Map<Class<?>, List<T>> memberAnnotationMap)
//    {
//        for (Annotation annotation : methodOrField.getAnnotations())
//        {
//            Class<? extends Annotation> type = annotation.annotationType();
//            List<T> methodOrFieldList = getAnnotatedMembers(
//                    memberAnnotationMap, type);
//            if (methodOrField.isOverridenBy(methodOrFieldList))
//            {
//                return;
//            }
//            methodOrFieldList.add(methodOrField);
//        }
//    }
//
//    private static List<Class<?>> getSuperClasses(Class<?> testClass)
//    {
//        ArrayList<Class<?>> results = new ArrayList<Class<?>>();
//        Class<?> current = testClass;
//        while (current != null)
//        {
//            results.add(current);
//            current = current.getSuperclass();
//        }
//        return results;
//    }
//
//    private static <T> List<T> getAnnotatedMembers(Map<Class<?>, List<T>> map,
//                                                   Class<? extends Annotation> type)
//    {
//        if (!map.containsKey(type))
//        {
//            map.put(type, new ArrayList<T>());
//        }
//        return map.get(type);
//    }
//
//    static final Map<Class<?>, List<MethodMember>> methodsForAnnotations = new HashMap<Class<?>, List<MethodMember>>();
//    static final Map<Class<?>, List<FieldMember>> fieldsForAnnotations = new HashMap<Class<?>, List<FieldMember>>();
}