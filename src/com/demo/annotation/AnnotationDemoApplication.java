package com.demo.annotation;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;

public class AnnotationDemoApplication {

	public static void main(String[] args) throws Exception, Exception {
		singleAnnotation();
		doubleAnnotation();
		repeatableAnnotation();
	}

	private static void repeatableAnnotation() throws Exception, Exception {
		System.out.println("***** Repeatable Value Demo *****");
		Game[] game = RepeatableAnnotation.class.getAnnotationsByType(Game.class);
		for (Game g : game) {
			System.out.println(g.name() + " on " + g.day());
		}
	}

	private static void singleAnnotation() throws Exception, Exception {
		System.out.println("***** Single Value Demo For Class *****");
		SingleValue value = new SingleValue();
		Annotation[] annotations = value.getClass().getAnnotations();
		for (Annotation annotation : annotations) {
			if (annotation instanceof SingleValueAnnotation) {
				SingleValueAnnotation info = (SingleValueAnnotation) annotation;
				System.out.println("User:" + info.user());
			}
		}

		System.out.println("***** Single Value Demo For Method *****");
		Method method = value.getClass().getMethod("singleValueAnnotation");
		SingleValueAnnotation values = method.getAnnotation(SingleValueAnnotation.class);
		System.out.println(values);
	}

	private static void doubleAnnotation() throws Exception, Exception {
		System.out.println("***** Double Value Demo For Class *****");
		FullValue value = new FullValue();
		Annotation[] annotations = value.getClass().getAnnotations();
		for (Annotation annotation : annotations) {
			if (annotation instanceof FullValueAnnotation) {
				FullValueAnnotation info = (FullValueAnnotation) annotation;
				System.out.println("Name:" + info.name());
				System.out.println("Password:" + info.password());
			}
		}

		System.out.println("***** Double Value Demo For Method *****");
		Method method = value.getClass().getMethod("doubleValueAnnotation");
		FullValueAnnotation values = method.getAnnotation(FullValueAnnotation.class);
		System.out.println(values);

	}

}
