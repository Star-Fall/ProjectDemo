package com.starfall.designpattern.singletonpattern;

/**
 * @author StarFall
 * @project ProjectDemo
 * @package com.starfall.designpattern.singletonpattern
 * @className TestClient
 * @date 2019/8/28 15:46
 * @description 单例模式测试
 */
public class TestClient {

	private static final Integer length = 10;

	/**
	 * 测试多线程下饿汉式
	 */
	public void testHungrySingleton() {
		Thread[] threads = new Thread[length];
		for (int i = 0; i < threads.length; i++) {
			threads[i] = new Thread(new Runnable() {
				@Override
				public void run() {
					System.out.println(
							Thread.currentThread().getName() + "\t：" + HungrySingleton.getInstance().hashCode());
				}
			});
			threads[i].start();
		}
	}

	/**
	 * 多线程测试懒汉模式
	 */
	public void testLazySingleton() {
		Thread[] threads = new Thread[length];
		for (int i = 0; i < threads.length; i++) {
			threads[i] = new Thread(new Runnable() {
				@Override
				public void run() {
					System.out
							.println(Thread.currentThread().getName() + "\t：" + LazySingleton.getInstance().hashCode());
				}
			});
			threads[i].start();
		}
	}

	/**
	 * 多线程测试懒汉模式——线程安全
	 */
	public void testLazySingletonThreadSafe() {
		Thread[] threads = new Thread[length];
		for (int i = 0; i < threads.length; i++) {
			threads[i] = new Thread(new Runnable() {
				@Override
				public void run() {
					System.out.println(Thread.currentThread().getName() + "\t："
							+ LazySingletonThreadSafe.getInstance().hashCode());
				}
			});
			threads[i].start();
		}
	}

	/**
	 * 多线程测试懒汉模式——双检锁
	 */
	public void testLazySingletonDCL() {
		Thread[] threads = new Thread[length];
		for (int i = 0; i < threads.length; i++) {
			threads[i] = new Thread(new Runnable() {
				@Override
				public void run() {
					System.out.println(
							Thread.currentThread().getName() + "\t：" + LazySingletonDCL.getInstance().hashCode());
				}
			});
			threads[i].start();
		}
	}

	/**
	 * 多线程测试静态内部类模式
	 */
	public void testStaticInnerClassSingleton() {
		Thread[] threads = new Thread[length];
		for (int i = 0; i < threads.length; i++) {
			threads[i] = new Thread(new Runnable() {
				@Override
				public void run() {
					// System.out.println(Thread.currentThread().getName() + "\t："
					// + StaticInnerClassSingleton.getInstance().hashCode());

					System.out.println(Thread.currentThread().getName() + "\t："
							+ System.identityHashCode(StaticInnerClassSingleton.getInstance()));

				}
			});
			threads[i].start();
		}
	}

	public static void main(String[] args) {
		TestClient test = new TestClient();
		// test.testHungrySingleton();
		// test.testLazySingleton();
		test.testLazySingletonThreadSafe();
		// test.testLazySingletonDCL();
		// test.testStaticInnerClassSingleton();
	}
}