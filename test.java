public class test{
	
	public static void main (String[] args){
		ArrayList c = new ArrayList();
		//System.out.println("El area del circulo es: "+c.calcularArea());
		for (int i=0;i<8;i++){
			System.out.println(i);
			c.add(i);
			}
		System.out.println(c.getSize());
		c.insert(666,5);
		System.out.println(c.find(666));
		System.out.println(c.find(6));
		System.out.println(c.getSize());
		System.out.println(c.getElemento(8));
		System.out.println(c.getMax_size());
		}
	
	
	}

