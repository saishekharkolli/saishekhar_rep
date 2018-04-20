package objectfactroy;

public class Sai {
	
	public  Person shekhar(){
		return new Person();
	}

	public static void main(String[] args) {

		
       Sai sai = new Sai();
       sai.shekhar();
	
	System.out.println(sai);
	}

}
