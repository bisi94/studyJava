package spring.aop;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

import spring.aop.entity.BisiExam;
import spring.aop.entity.Exam;

public class Program {

	public static void main(String[] args) {

		Exam exam = new BisiExam(1, 1, 1, 1);
		
		Exam proxy = (Exam) java.lang.reflect.Proxy.newProxyInstance(BisiExam.class.getClassLoader(),
				new Class[] {Exam.class},
				new InvocationHandler() {
					
					@Override
					public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
						long start = System.currentTimeMillis();
						Object result = method.invoke(exam, args);
						long end = System.currentTimeMillis();
						
						String message = (end - start) + "ms 시간이 걸렸습니다.";
						System.out.println(message);
						
						return result;
					}
				}
		);
		
		System.out.printf("total is %d\n", proxy.total());
		System.out.printf("avg is %f\n", proxy.avg());
		
	}

}
