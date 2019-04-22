package myWebProject;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

public class MyThreadTest {

	public static void main(String[] args) throws InterruptedException, ExecutionException {
		CallableImpl call = new CallableImpl();
		FutureTask<Integer> future = new FutureTask<>(call);
		Thread t = new Thread(future);
		t.start();
		System.out.println("main主线程开始正常执行.............开始");
//		System.out.println("获取子线程的结果为："+future.get());
		System.out.println("main主线程开始正常执行..............结束");
		
		
	}
}
