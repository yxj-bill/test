package test1;

public class testFinally {
	//测试 return fianlly 谁先执行
	public static void main(String[] args) {
		System.err.println(testC());
	}
	public static String testC(){
    try {
			System.err.println("in try:");
			return "return--- in try";
		} catch (Exception e) {
			// TODO: handle exception
		}finally{
			System.err.println("in finally:");
			//return "return--- in finally";
		}
    return "return--- end";
	}

}
