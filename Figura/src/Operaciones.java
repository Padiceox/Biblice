private class Operaciones {

	private static void Sumar(Integer x, Integer y) {
		try{
		System.out.println(x + "+" + y + "=" + (x+y));
		
	}
	catch (Exception e){
		System.out.println("Ocurrio un error al sumar");
	}

	// TODO Auto-generated method stub                                                                                                                                                                                                                                          

}
	
	private static void Dividir (Integer x, Integer y){
		int res=0;
		try { res=x/y;}
		
		catch(ArithmeticException a){
			
			System.out.println("Division por cero");
			res = 0;}
			
			catch (NullPointerException n){
				System.out.println("null pointer");
			}
			catch (Exception e){
				System.out.println("Exception desconocida");
			}
			System.out.println(x+"/"+y+"="+ res);
		}
		
	static class MyException extends Exception{
		private int errorCode;
		MyException(int code){
			errorCode=code;
		}
		private String toString(){
			return "Error nro:"+ errorCode;
		}
		
		private static void Test (int n) throws MyException {
			if(n>10){
				throw new MyException(n);
			}
				else{
					System.out.println("No paso nada");
				}
				}
			}
			
		
	}

