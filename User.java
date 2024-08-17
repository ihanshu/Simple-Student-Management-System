package Coursework;

public class User {
		private String Username;
		private String Password;
		
		//设定初始账号密码
		public User(){
			this.Username="123";
			this.Password="123";
		}
		
		//修改账号
		public void changeUsername(String Username) {
			this.Username=Username;
			System.out.println("Change username successfully, log out automatically");
			System.exit(0);
		}
		
		//修改密码
		public void changePassword(String Password) {
			this.Password=Password;
			System.out.println("Change password successfully, log out automatically");
		    System.exit(0);
		}
		
		//检查账号密码
		public void Check(String Username,String Password) {
			if(this.Password.equals(Password)&&this.Username.equals(Password)) {			
				System.out.println("Login successfully\n");
				
			}
			else {
				System.out.println("The information is wrong! The system will automatically shut down.");
			    System.exit(1);
			}
		}
		
		//登出账号
		public void exitSystem(User user) {
			System.out.println("Logged out successfully");
			System.exit(0);
		}


}
