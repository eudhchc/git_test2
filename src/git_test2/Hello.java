package git_test2;

public class Hello {
	
<<<<<<< HEAD
	String message = "안녕하세요";

	public String say() {
		return message;
=======
	String message;
	
	public Hello() {
		this("안녕하세요");
	}
	
	public Hello(String message) {
		this.message = message;
	}
	
	public void say() {
		System.out.println(message);
>>>>>>> e3aa7f141fd2035aacb18d21f27d54d814ccab7e
	}
}
