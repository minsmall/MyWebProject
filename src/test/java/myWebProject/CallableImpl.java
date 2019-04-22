package myWebProject;

import java.util.concurrent.Callable;

public class CallableImpl implements Callable<Integer> {

	@Override
	public Integer call() throws Exception {
		System.out.println("开始进行多线程的计算-----------start");
		Thread.sleep(60*1000);
		System.out.println("完成进行多线程的计算-----------end");
		return 100;
	}

}
